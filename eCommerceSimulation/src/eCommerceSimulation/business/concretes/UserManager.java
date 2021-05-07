package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.core.abstracts.InputValidService;
import eCommerceSimulation.core.abstracts.ValidatorService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService {
	
	InputValidService userInformationValidation;
	UserDao userdao;
	ValidatorService validatorService;
	
	public UserManager(InputValidService userInformationValidation, UserDao userdao,
			ValidatorService validatorService) {
		this.userInformationValidation = userInformationValidation;
		this.userdao = userdao;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if(!userInformationValidation.isValid(user)) {
			System.out.println("Kullan�c� bilgileri yanl�� girilmi�tir!.Kay�t edilememi�tir!!!");
		}
		else if (!userdao.emailCheck(user)){
			System.out.println("Bu email'i daha �nce ba�kas� taraf�ndan al�nm�� " + user.getEmail() + "\n" + "Kay�t i�lemi ba�ar�s�z olmu�tur!");
		}
		else {
			userdao.add(user);
			validatorService.sendVerificationMail();
		}
	}

	@Override
	public void login(String email, String password) {
		if(userdao.loginByCheck(email, password)) {
			System.out.println("Sisteme giri� ba�ar�l� :)");
		}
		else {
			System.out.println("Sisteme giri� ba�ar�s�z!");
		}
	}

}

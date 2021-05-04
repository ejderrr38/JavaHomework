package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService= gamerCheckService;
	}
	
	
	@Override
	public void addGamer(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + 
					"  kullan�c�n�n kay�t� ba�ar�l� olmu�tur.Aram�za ho�geldin " + gamer.getFirstName().toUpperCase()+ " gamer!");
		}else {
			System.out.println(gamer.getFirstName() + gamer.getLastName() +
					"kullan�c�n�n kay�t� ba�ar�s�z olmu�tur :(");
		}
		
	}

	@Override
	public void removeGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adl� kullan�c� sistemimizden silimi�tir.");
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adl� oyuncunun bilgileri g�ncellenmi�tir.");
	}

}

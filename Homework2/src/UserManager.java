
public class UserManager {
	public void Add(User user) {
		System.out.println(user.firstName + " " + user.lastname + " isimli kullan�c� eklendi.");
	}
	public void Delete(User user) {
		System.out.println(user.firstName + " " + user.lastname + "isimli kullan�c� silinmi�tir.");
	}
	public void Update(User user) {
		System.out.println(user.firstName + " " + user.lastname + "isimli kullan�c� g�ncellenmi�tir");
	}
}

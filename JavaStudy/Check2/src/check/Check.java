package check;

import constants.Constants;

public class Check{
	
	private String firstName = "工藤";
	private String lastName = "真菜";
	
	private void printName(String firstName,String lastName) {
		
		System.out.println("printNameメソッド → "+ this.firstName + this.lastName);
		
	}
	
	public static void main(String[] args) {
		
		Check check = new Check();
		check.printName(check.firstName, check.lastName);
		Constants constants = new Constants();
		Pet pet = new Pet(constants.CHECK_CLASS_JAVA, constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotPet = new RobotPet(constants.CHECK_CLASS_R2D2, constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
		
	}
}
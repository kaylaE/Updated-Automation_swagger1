package AutoTest.Automation_Swagger1;

import swagger_interface.Wizman_intf;

public class Wizman implements Wizman_intf {
	public static void main(String[] args) {
		Wizman family = new Wizman();
	    family.wizwoman();
	    family.wizpinkin();
	    family.Famil_Number();
	}
	
	public void wizwoman(){
        System.out.println(MY_MADAM);
   }
	
	public void wizpinkin(){
		System.out.println(SHARP_CHILD);
	}
	
	public void Famil_Number(){
		System.out.println(NUMBER_ONE);
	}
}

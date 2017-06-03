package AutoTest.Automation_Swagger1;

import swagger_interface.Wizman_intf;

public class smart_family extends Common_area implements Wizman_intf {
     
	public static void main(String[] args) {
	Garage cars  = new Garage();
	smart_family our_fam = new smart_family();
	our_fam.super_clever_fam();
	our_fam.skybox();
	our_fam.our_tv();
	cars.lambo();
	cars.maclaren();
	
}
public void super_clever_fam(){
	System.out.println(MY_MADAM + SHARP_CHILD + NUMBER_ONE);
}

}


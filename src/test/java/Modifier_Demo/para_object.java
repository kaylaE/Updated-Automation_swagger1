package Modifier_Demo;

import swagger_interface.mobile_int;

// passing an object into your methods
public class para_object implements mobile_int {

	public static void main(String[] args) {
		para_object super_mobile = new para_object();
	   /*
		super_mobile.mobile(SAMSUNG_G1);
	    super_mobile.mobile(SAMSUNG_G2);
	    super_mobile.mobile(SAMSUNG_G3);
	    super_mobile.mobile(SAMSUNG_G4);
	    super_mobile.mobile(SAMSUNG_G5);
	    super_mobile.mobile(SAMSUNG_G6);
	    super_mobile.mobile(SAMSUNG_G7);
	    */
	    super_mobile.mobile(SAMSUNG_MOBILE, NUMBER_OF_SAMSUNG);
	    
	}
	
	   public void mobile(String text){
		   System.out.println(text);
		   
	   }
      public void mobile(String phone, int phone1 ){
    	 System.out.printf(phone,phone1);
    	 
     }
}


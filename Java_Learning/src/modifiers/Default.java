package modifiers;

 class Default {
	 
	 int a  ;

	 void carstart() {
		 a=10;
		 System.out.println(a);
		 System.out.println("started the car");
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Default d = new Default();
	
  
      d.carstart();
	}

}

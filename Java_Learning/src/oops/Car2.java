package oops;

public class Car2 {
	
	String Company;
	String model;
	String colour;
	int mileage ;
	int cost ;
	int wheels ;

	
	public void setCarDetails(String company, String model, String colour, int mileage ,int cost ,int wheels ) {
		this.Company = company;
		this.model = model;
		this.colour = colour;
		this.mileage = mileage;
		this.cost = cost;
		this.wheels = wheels;
				
		
		
	}
	
	public void startCar() {
		System.out.println(Company+" Car having model "+model+" has started");
	}
    public void stopCar()
    {
    	System.out.println(Company+" Car having model "+model+" has stopped");
    	
    }
public void cardetails() {
	System.out.println("company of car is "+Company);
	System.out.println("model of car is "+model);
	System.out.println("colour of car is "+colour);
	System.out.println("mileage of car is "+mileage);
	System.out.println("cost of car is "+cost);
	System.out.println("wheels of car is "+wheels);
	System.out.println("---------------");
	
}
}

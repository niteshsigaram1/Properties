package oops;

public class Car3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Car2 c1 = new Car2();
		c1.Company = "leo";
		c1.model ="800";
		c1.colour = "white";
		c1.mileage= 12; 
		c1.cost = 10000;
		c1.wheels = 4;
		c1.setCarDetails("BMw", "x1", "white", 15, 1600000, 45);
		c1.startCar();
		c1.stopCar();
		c1.cardetails();
		c1.setCarDetails("BM", "x", "whie", 10, 160000, 48);
		c1.startCar();
		c1.stopCar();
		c1.cardetails();

	}

}

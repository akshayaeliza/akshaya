package week1.day2;

public class car {
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	
	public  void applyGear() {
		
		System.out.println("Apply Gear");
	}
	
	public  void switchOnAc() {
		System.out.println("Switch on Airconditioner");
	}
    public void applyAcclerate(){
		
		System.out.println("Apply Acclerate");
	}


  public static void main(String[] args) {
	car car=new car();
	car.applyBreak();
	car.applyGear();
	car.switchOnAc();
	car.applyAcclerate();
}
}

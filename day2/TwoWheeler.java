package week1.day2;

public class TwoWheeler {
	String bikeName="VESPA";
	char noOfWheels='2';
	short noOfMirrors=2;
	long chassisNumber=1234565789067L;
	double runningKM=560;
	char fulecapacity='7';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TwoWheeler wheel=new TwoWheeler();
		
		System.out.println("bikeName: "+wheel.bikeName);
		System.out.println("chassisNumber: "+wheel.chassisNumber);
		System.out.println("noOfWheels: "+wheel.noOfWheels);
		System.out.println("runningKM: "+wheel.runningKM);
		System.out.println("noOfMirrors: "+wheel.noOfMirrors);
		System.out.println("fulecapacity:"+wheel.fulecapacity);
	}
}

		
		
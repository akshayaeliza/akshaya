package week1.day4;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,num,temp,total=0;
		num=n;
		while(num !=0) {
			temp=num %10;
			total=total+temp*temp*temp;
			num/=10;
		}
		if(total == n)
			System.out.println(n+ "is an Armstrong Number");
		else
			System.out.println(n+ "is not a Armstrong Number");
			

	}

}

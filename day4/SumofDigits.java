package week1.day4;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n=123;
			int sum=0;
			int rem;
			while(n>0) {
				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			System.out.println(sum);
		

	}

}

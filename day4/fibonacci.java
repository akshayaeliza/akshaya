package week1.day4;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
				
				
				

	}

}

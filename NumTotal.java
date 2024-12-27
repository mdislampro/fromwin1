package lastJava;

public class NumTotal {

	public static void main(String[] args) {
		
		int num=1234;
		int total =0;
		int rev=0;
		while(num!=0) {
			
			rev=num%10;
			num=num/10;
			total=total+rev;
		}
		System.out.println(total);

	}

}

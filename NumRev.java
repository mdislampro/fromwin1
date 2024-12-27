package lastJava;

public class NumRev {

	public static void main(String[] args) {
		
		int num = 122;
		int orNum=num;
		int rev=0;
		
		while(num!=0){
				rev= rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(rev==orNum) {
			System.out.println("is pelindrom    "+orNum);
		}else {
			System.out.println("is not Pelindrom    "+orNum);
		}
	}
}

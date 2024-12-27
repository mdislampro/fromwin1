package lastJava;

public class GreadC {
	public static void main(String[] args) {
		
		int graed=73;
		int x=graed%5;
		//System.out.println(x);
		
		//if(graed>=38 && x>=3)  or 
		
		if(!(graed<38) && !(x<3)) {
			graed=graed-x+5;
			
		}
		if(graed<38) {
			System.out.println("Fail   "+ graed);
		}else {
		System.out.println("Pass    "+graed);
	}}

}

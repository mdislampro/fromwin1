package lastJava;

public class CharCount {

	public static void main(String[] args) {
		
		/*String s= "absgdjfkgl";
		int count=0;
		
		String []a=s.split("");
		
		for(int i=0; i<a.length;i++) {
			count++;
		}*/

		String s="ahskfkfhkh";
		int a=s.length();
		
		int b=s.replace("h", "").length();
		System.out.println(a-b);
	}

}

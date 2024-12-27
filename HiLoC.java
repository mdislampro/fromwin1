package lastJava;

public class HiLoC {

	public static void main(String[] args) {
		
		int s []= {1,3,6,9,30,80};
		int hi=s[0];
		int lo=s[0];
		for(int i=0;i<s.length;i++) {
			
				if(hi<s[i]) {
					hi=s[i];
				}if(lo>s[i]) {
					lo=s[i];
				}
			}
		
		System.out.println(hi);
		System.out.println(lo);

	}

}

package lastJava;

public class AcenDecC {

	public static void main(String[] args) {
		
		int s[]= {1,3,6,7,9,4,8,5,2};
		
		int temp=0;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]<s[j]) {
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
				}	
		}
		for(int z:s) {
			
			System.out.print(" "+z);
			
		}
	}
}

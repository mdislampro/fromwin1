package lastJava;

import java.util.ArrayList;
import java.util.List;

public class RevPeliC {

	static String p ="Mon";
	static String d[]= {"tot","dod","mon","non","lon"};
	public static void main(String[] args) {
		
		RevPeliC n=new RevPeliC();
		
		
		String k=n.rev(p);
		
		
		if(k.equals(p)){
			System.out.println(p +"  is Peleimdrom");
		}else {
			System.out.println(p+"  IS not pelimdrom");
		}
		
		List<String> f=n.liOfnonP(d);
		
		System.out.println(f);
	}
	
	public String rev(String a) {

		String s ="";

		String[] rev =a.split("");	
		
		for(int i=rev.length-1;i>=0;i--) {
			s=s+rev[i];
			
		}
		System.out.println(s);
		return a;
		
	}
	
public List<String> liOfnonP(String[]s){
		
		List<String>li = new ArrayList<>();
		
		for(int i=0;i<s.length;i++) {
			if(!s[i].equals(rev(s[i]))){
				
				li.add(s[i]);
				
			}
		}
		return li;
		
	}
}

package lastJava;

public class SpeChar {

	public static void main(String[] args) {

		String s="J%a%v*&a$*&*2@#$2(";
		String a=s.replaceAll("[^A-Za-z0-9^]","");
		System.out.println(a);
	}

}

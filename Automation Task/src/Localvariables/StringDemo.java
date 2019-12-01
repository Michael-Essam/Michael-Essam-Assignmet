package Localvariables;

public class StringDemo {

	public static void main(String[] args) {
		String greeting = "Hellow World !";
		System.out.println(greeting);
		
		int len = greeting.length();
		System.out.println(len);
		
		String firstname = "Michael " ;
		String secondname = "Essam" ;
        System.out.println(firstname + secondname);
        
        String fullname = firstname.concat(secondname);
        System.out.println(fullname);

	}

}

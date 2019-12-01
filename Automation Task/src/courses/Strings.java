package courses;

public class Strings {

	public static void main(String[] args) {
		String greeting ="Hello Michael";
		int len= greeting.length();
		String firstname ="Michael ";
		String lastname = "Essam"; 
		String fullname =firstname.concat(lastname);
		System.out.println(greeting);
		System.out.println(len);
		System.out.println(firstname + lastname); 
		System.out.println(fullname);
		
	}

}

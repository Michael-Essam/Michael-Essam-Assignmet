package courses;

public class EnglishCourses {
    //Variables 
	
	int students;
	int Weeks;
	int Days;
	
	//Method
	public static void main(String[] args) {
		//Object
		EnglishCourses Eng101 = new EnglishCourses();
		int TotalDays;
		Eng101.students = 10 ;
		Eng101.Weeks = 4 ;
		Eng101.Days = 3 ;
		TotalDays = Eng101.Weeks * Eng101.Days ; 
		System.out.println("the english course is a total of " + TotalDays + " Days");
		

	}

}

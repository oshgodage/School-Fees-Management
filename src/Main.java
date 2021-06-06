import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher Oshadi = new Teacher(1,"Oshadi",100000);
		Teacher Salinda = new Teacher(1,"Salinda",200000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Oshadi);
		teacherList.add(Salinda);
		
		Student Avi = new Student(1,"Avi",6);
		Student Koml = new Student(1,"Komal",10);
		List<Student> StudentList = new ArrayList<>();
		StudentList.add(Avi);
		StudentList.add(Koml);
		
		School ghs =new School(teacherList,StudentList);
		//System.out.println("GHS has Earned"+" "+ghs.getTotalMoneyEarned());
		Avi.updateFeesPaid(5000);
		Koml.updateFeesPaid(5000);
		System.out.println("GHS has Earned"+" "+ghs.getTotalMoneyEarned());
		//System.out.println("Avi paid fees"+" "+)
	}

}

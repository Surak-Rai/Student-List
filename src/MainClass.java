import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	List<Student> studentDetails= new ArrayList<>();
	Student sto = new Student(3,"Sushant",24);
	Student sto2= new Student(9,"Anish",22);
	Student sto3= new Student(6,"Tulasha",19);
	Student sto4= new Student(10,"Meena",37);
	
	studentDetails.add(sto);
	studentDetails.add(sto2);
	studentDetails.add(sto3);
	studentDetails.add(sto4);
	//studentDetails.remove(sto3);
	System.out.println(studentDetails);
	Collections.sort(studentDetails);
System.out.println(studentDetails);


	// There are two way to make obj and add elements one like above and secondly
	// you can do this way as well
//	Student sto5 = new Student();
//	 sto.setRollNo(6);
//	 sto.setName("Tina");
//	 sto.setAge(33);

	
	
}
}

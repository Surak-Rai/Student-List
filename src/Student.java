
public class Student implements Comparable<Student> {
int rollNo;
String name;
int age;
public Student() {
	
}

public Student(int rollNo, String name, int age) {//<-----these are parameter because value of 
	//given variable has not been given yet
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
}

@Override
public int compareTo(Student o) {
	if (age==o.age) {
			return 0;	}
		else if(age>o.age) {
			return 1;
		}
		else {
			return -1;
		}
		}
	
}



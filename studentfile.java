package psn;
import java.util.Scanner;
  class Student{
	  String name;
	  int rollno;
	  String department;
	  Student(String name,int rollNumber, String department){
	     this.name=name;
	     this.rollno=rollno;
	     this.department=department;
	  
  }
	  public void printStudentInfo() {
		  System.out.println("name:"+name);
		  System.out.println("rollno:"+rollno);
		  System.out.println("department:"+department);
		  
	  }
  }
public class Studentclass {

	public static void main(String[] args) {
		Student student1 = new Student("aibel",1,"cse");
		student1.printStudentInfo();
		System.out.println();
		
	}

}

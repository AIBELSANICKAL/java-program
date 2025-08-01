class Student{
	String name;
	int rollnumber;
	static int Studentcount=0;	
    Student(String name,int rollnumber){
    	this.name=name;
    	this.rollnumber=rollnumber;
    	Studentcount++;
    }

    public static void displayStudentcount() {
    	System.out.println("Total numnber of students"+Studentcount);
    }
    public void displayinfo() {
    	System.out.println("name"+name);
    	System.out.println("rollnumber:"+rollnumber);
    }
}
    	public class Studentdetails{
    		public static void main(String[] args) {
    			Student s1= new Student("Test1",16);
    			s1.displayinfo();
    			Student.displayStudentcount();
    			Student s2= new Student("Test2",20);
    			s2.displayinfo();
    			Student.displayStudentcount();
    			Student s3= new Student("Test2",21);
    			s3.displayinfo();
    			
    		}
    		
    	}
    
    
    

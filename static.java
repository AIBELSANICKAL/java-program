public class Student {
      String name;
      
      static int  Studentcount=0;
      Student(String name){
    	  this.name= name;
    	  Studentcount++;
      }
      public void printDetails() {
    	  System.out.println(name);
    	  System.out.println(Studentcount);
      }
}
    public class StaticDemo{
    	public static void main(String args[]) {
    		Student student= new Student("test");
    		student.printDetails();
    	}
  

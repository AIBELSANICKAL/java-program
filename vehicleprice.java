package newstudent;

 class vehicle {
	 String Vehicle;
	 String Model;
	 

}  vehicle{
	this.vehicle=vehicle;
	this.model=Model;
}
   public void displauinfo() {
	   System.out.println("Vehicle:"+vehicle);
	   System.out.println("Model:"+Model);
	  
   }
   }
   class car extends Vehicle{
	   String fueltype;
	   car(String Vehicle,String model,String fueltype){
		   super(Vehicle,model);
		   this fueltype=fueltype;
		  
	   }
   }
   public void displayinfo() {
	   super.displayinfo();
	   system.out.println("Fueltype:"+fueltype);
	   
   }
   }
   class extends vehicle{
	   double batterycappacity;
	   Electriccar(String vehicle,string model,string fueltype,double batterycappacity){
		   super(vehicle,model,fueltype);
		   this.batterycappacity=batterycappacity;
	   }
   }
   public void displayinfo() {
	   super displayinfo();
	   System.out.println("batterycappacity=batterycappacity");
   }
   }
   public class vandi{
	   public static void main(String[] args) {
		   electriccar ele=new electriccar("mahindra","BE7",elctric,85);
		   ele.displayinfo();
	   }
   }

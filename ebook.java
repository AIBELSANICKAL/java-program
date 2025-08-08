package newstudent;

 class book {
	String Title;
	String author;
	Double price;
	
	book{
		this.Title=Title;
		this.author=author;
		this.price=price;
		
	}
	public void displayDetails{
		  System.out.println("Title="+Title);
		  System.out.println("author="+author);
		  System.out.println("price="+price);
		  
		
	}
}
   class ebook extends book{
	   double filesizeMB;
	   ebook(String Title,String author,double price,double filesizeMB){
		   super(Title,author,price);
		   this.filesizeMB=filesizeMB;
	   
	   }
   }public void displayDetails() {
	   super.displaydetails();
	   System.out.println("filesize:"+filesizeMB);
	   
   }
   }
    class printedbook extends book{
    	int numberofpages;
    	printedbook(String Title,String author,double price,double numberofpages);
    	super(Title,author,price);
    	this.numberofpages=numberofpages;
    
    }
    public void displayDetails() {
    	super.displayDetails();
    	System.out.println("numberof pages:"+numberofpages);
    }
    public class sub{
    	public static void main(String[] args) {
    		ebook ebook=new ebook("java","unknown",325,22.28);
    		ebook.displayDetails();
    		printedbook print= new printedbook("java","dennis",800,311);
    		print.displayDetails();
    	}
    }

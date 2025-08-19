

	import java.util.Scanner;
	
	public class Array {
		public static void main(String[] args){
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter the value of n:");
			int n= Sc.nextInt();
			int[] array=new int[n];
			System.out.println("Enter the elements:");
			for(int i=0;i<n;i++) {
                array[i]=Sc.nextInt();				
			}
		System.out.println("The given array:");
		for(int num:array) {
			System.out.println(num+"\t");
		}
	    System.out.println();
	    int largest=array[0];
	    for(int i=0;i<n;i++) {
	    	if(array[i]>largest){
	    		largest=array[i];
	    	}
	    }
       System.out.println("The largest number int he array:"+largest);
          Sc.close();
	  }
	}


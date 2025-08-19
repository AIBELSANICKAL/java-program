  import java.util.Scanner;
     public class TwoArray {
        public static void main(String[] args) {
    	   Scanner Sc = new Scanner(System.in);
    	   int [] [] matrix= {
    			   {1,2,3},{4,5,6,7},{7,8}
    				   
    			   };
    	   int [][] matrix1= new int [3][3];
    	   for(int i=0;i<matrix.length;i++) {
    		   for(int j=0;j<matrix[i].length;j++) {
    			   System.out.println(matrix[i][j]+"\t");
    			   
    		   }
    		   System.out.println();
    	   }
    	   
    	   int[][] matrix1 = new int[3][3];
           System.out.println("\nEnter 9 elements for matrix1 (3x3):");
           for (int i = 0; i < matrix1.length; i++) {
               for (int j = 0; j < matrix1[i].length; j++) {
                   matrix1[i][j] = Sc.nextInt();
               }
           }

           System.out.println("Printing matrix1:");
           for (int i = 0; i < matrix1.length; i++) {
               for (int j = 0; j < matrix1[i].length; j++) {
                   System.out.print(matrix1[i][j] + "\t");
               }
               System.out.println();
           }

           Sc.close();
       }
}

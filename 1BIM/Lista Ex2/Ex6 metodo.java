import java.util.*;

 class Main
 {
   public static int[][] JuntaMatriz(int matrizA[],int matrizB[]){
     int res[][] = new int [2][];
         res[0] = matrizA;
         res[1] = matrizB;
         
     return res;
   }
   public static void main(String args[])
   { 
    int a[] = {1,2,3};
    int b[] = {4,5,6};
    
        
    int res [][] = JuntaMatriz(a,b);
    for(int i = 0; i < res.length; i++){
      for(int j = 0; j < res[i].length; j++){
         System.out.print(res[i][j] + " ");
            }
      System.out.println("");
    }
  }
}

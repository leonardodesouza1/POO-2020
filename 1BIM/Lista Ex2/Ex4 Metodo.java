public class Main { 
public static void imprimirMatriz ( int matriz [][]){
for ( int i = 0 ; i < matriz . length ; i++){
for ( int j = 0 ; j < matriz[i]. length ; j++){
System . out . print (matriz[i][j] + " " );
 } 
 System . out . println ( "" ); 
   } 
 }
public static void main ( String args []){ 
int matriz [][] = { { 0 , 4 , 2 } , { 9 , 9 , 5 } , { 6 , 7 , 4 } }; 
imprimirMatriz (matriz); } }
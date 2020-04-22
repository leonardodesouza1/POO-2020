import java.lang.Math;

 public class Main {
   public static double DesvioPadrao(double... numeros){
     System.out.println("a quantidade de numeros e "+ numeros.length);
     double media;
     double acumulado = 0;
     for (int i=0;i < numeros.length;i++){
      acumulado += numeros[i];
     }
    media = acumulado / numeros.length;
    System.out.println("a media e "+media);
    double desvio = 0;
    for (int i = 0;i < numeros.length;i++){
      desvio += ((numeros[i] - media)*(numeros[i] - media)/numeros.length);
    }
    double dp = Math.sqrt(desvio);
    System.out.println("o resultado e "+dp);
    return  dp;
   }
   
 
   public static void main(String args[]) { 
    System.out.println(DesvioPadrao(1.55,1.70, 1.80));
   }
 }
        
import java.util.*;

public class InsertionSort{
  public static void main(String[] args) {

    int x[] = new int [5];
    int i,j,eleito;
    Scanner entrada = new Scanner (System.in);
      for (i=0;i<=4 ;i++ ) {
        System.out.println("Digite o "+(i+1) +"o numero: " );
        x[i] = entrada.nextInt();
      }

      for (i=1; i<= 4; i++ ) {
        eleito= x[i];
        j=i-1;
        while( j>= 0 && x[j] > eleito){
          x[j+1] = x[j];
          j=j-1;

        }
        x[j+1] = eleito;
      }
      for (i=0;i<=4 ; i++ ) {
        System.out.println((i+1)+"o numero: " + x[i]);
      }
  }
}

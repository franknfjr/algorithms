import java.util.*;
import javax.swing.JOptionPane;

public class BubbleSortOptimized2{
  public static void main(String[] args) {

    int x[] = new int [5];
    int n,i,aux,troca, cont=1;
    Scanner entrada = new Scanner (System.in);
      for (i=0;i<=4 ;i++ ) {
        System.out.println("Digite o "+(i+1) +"o numero: " );
        x[i] = entrada.nextInt();
      }
    n=1;
    troca=1;
    while (n<=5 && troca == 1){
      troca =0;

      for (i=0;i<=3 ;i++ ) {
          if (x[i] < x[i+1]) {
            troca = 1;
            aux = x[i];
            x[i] = x[i+1];
            x[i+1] = aux;
            System.out.print(cont +"º  "+ x[i] +" < "+ x[i+1] +" is ");
            System.out.println(x[i] < x[i+1]);

          }
          else{
            System.out.print(cont +"º  "+ x[i] +" > "+ x[i+1] +" is ");
            System.out.println(x[i] > x[i+1]);

          }
      }
      System.out.println((n) + " laço " +  ": " + Arrays.toString(x) +"\n");
      n = n +1;
      cont++;
    }
    for (i=0;i<=4 ;i++ ) {
            System.out.println((i+1)+"o numero: " + x[i]);
    }
  }
}

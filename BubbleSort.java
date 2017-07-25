import java.util.*;
import javax.swing.JOptionPane;

public class BubbleSort{
  public static void main(String[] args) {

    int x[] = new int [5];
    int n, i, aux, cont=1;
    Scanner entrada = new Scanner (System.in);
      for (i=0;i<=4 ;i++ ) {
        System.out.println("Digite o "+(i+1) +"o numero: " );
        x[i] = entrada.nextInt();
      }
      for (n =0 ;n<=4 ;n++ ) {
          for (i=0;i<=3 ;i++ ) {
              if (x[i] > x[i+1]) {
                aux = x[i];
                x[i] =  x[i + 1];
                x[i + 1] = aux;
                System.out.print(cont +"º  "+ x[i] +" > "+ x[i+1] +" is ");
                System.out.println(x[i] > x[i+1]);

              }
              else{
                System.out.print(cont +"º  "+ x[i] +" < "+ x[i+1] +" is ");
                System.out.println(x[i] < x[i+1]);

              }
          }
            System.out.println((n + 1) + " laço " +  ": " + Arrays.toString(x) +"\n");
            cont++;
      }


    for (i=0;i<=4 ;i++ ) {
      System.out.println((i + 1) +" o número: " + x[i]);

    }

  }

}

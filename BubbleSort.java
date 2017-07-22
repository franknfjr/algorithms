import java.util.*;

public class BubbleSort{
  public static void main(String[] args) {

    int x[] = new int [5];
    int n, i, aux;
    Scanner entrada = new Scanner (System.in);
    for (i=0; i<=4 ; i++ ) {
      System.out.println("Digite o " + (i + 1) +" o número.");
      x[i] = entrada.nextInt();
    }
      for (n =0 ;n<=4 ;n++ ) {
          for (i=0;i<=3 ;i++ ) {
              if (x[i] > x[i+1]) {
                aux = x[i];
                x[i] =  x[i + 1];
                x[i + 1] = aux;
                System.out.println(x[i] +" > "+ x[i+1]);
                System.out.println(x[i] > x[i+1]);
              }
              else{
                System.out.println(x[i] +" < "+ x[i+1]);
                System.out.println(x[i] < x[i+1]);
              }
          }
      }


    for (i=0;i<=4 ;i++ ) {
      System.out.println((i + 1) +" o número: " + x[i]);

    }

  }

}

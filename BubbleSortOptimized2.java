import java.util.*;

public class BubbleSortOptimized2{
  public static void main(String[] args) {

    int x[] = new int [5];
    int n,i,aux,troca, cont=0;
    Scanner entrada = new Scanner (System.in);
    for (i=0;i<=4 ;i++ ) {
      System.out.println("Digite o "+(i+1) +"o numero: " );
      x[i] = entrada.nextInt();
    }
    n=1;
    troca=1;
    while (n<=5 && troca == 1){
      troca =0;
      cont = cont +1;
      for (i=0;i<=3 ;i++ ) {
          if (x[i] < x[i+1]) {
            troca = 1;
            aux = x[i];
            x[i] = x[i+1];
            x[i+1] = aux;
            System.out.print(cont +"º  "+ x[i] +" < "+ x[i+1] +" is ");
            System.out.println(x[i] < x[i+1]);
            cont++;
          }
          else{
            System.out.print(cont +"º  "+ x[i] +" > "+ x[i+1] +" is ");
            System.out.println(x[i] > x[i+1]);
            cont++;
          }
      }
      n = n +1;
    }
    for (i=0;i<=4 ;i++ ) {
            System.out.println((i+1)+"o numero: " + x[i]);
    }
  }
}

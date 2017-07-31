import java.util.*;

public class SelectionSort{
  public static void main(String[] args) {

    int x[] = new int [5];
    int i,j,eleito,menor,pos,cont=1;
    Scanner entrada = new Scanner (System.in);
      for (i=0;i<=4 ;i++ ) {
        System.out.println("Digite o "+(i+1) +"o numero: " );
        x[i] = entrada.nextInt();
      }
        for (i=0;i<=3 ;i++ ) {
          eleito = x[i];
          menor = x[i+1];
          pos = i + 1;
            for (j = i+2; j<=4 ;j++ ) {
              if (x[j] < menor) {
                menor = x[j];
                pos = j;
                System.out.print(cont +"º  "+ x[j] +" < "+ menor +" is ");
                System.out.println(x[j] < menor);
              }else{
                System.out.print(cont +"º  "+ x[j] +" > "+ menor +" is ");
                System.out.println(x[j] > menor);
              }
            }
              if (menor < eleito) {
                x[i] = x[pos];
                x[pos] = eleito;
                System.out.print(cont +"º  "+ menor +" < "+ eleito +" is ");
                System.out.println(menor < eleito);
              }else{
                System.out.print(cont +"º  "+ menor +" > "+ eleito +" is ");
                System.out.println(menor > eleito);
              }
              System.out.println(cont + " laço " +  ": " + Arrays.toString(x) +"\n");
              cont++;
        }
      for (i=0; i<=4 ;i++ ) {
        System.out.println((i+1)+"o numero: " + x[i]);
      }
  }
}

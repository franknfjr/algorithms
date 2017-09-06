import java.util.Scanner;

public class BuscaLargura{
    public static class vertice{
      int num;
      vertice prox;

    }
    public static class listaadj{
      public vertice listav;

    }
    public static class fila{
      int numv;
      fila prox;

    }
    public static void inserir(int n){
      fila novo = new fila();
      novo.numv = n;
      novo.prox = null;

        if (inicio == null) {
          inicio = fim = novo;
        } else{
            fim.prox = novo;
            fim = novo;
        }
    }
    public static int remover(){
        if(inicio != null){
            int vert;
            if (inicio == fim) {
              fim  == null
              vert = inicio.numv;
              inicio = inicio.prox;
              return vert;
            }
        }
    }
}

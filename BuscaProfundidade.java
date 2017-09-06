import java.util.Scanner;

public class BuscaProfundidade{
    public static class vertice{
      int  num;
      vertice prox;
    }
    public static class listaadj{
      public vertice listav;
    }
    public static class queue{
      int numv;
      queue prox;
    }
    public static void empilhar(int n){
      queue novo = new queue();
      novo.numv  = n;
      novo.prox  =  pilha;
      pilha = novo;

    }
    public static void desempilhar(int v){
      if (pilha.numv == v) {
          pilha = pilha.prox;
      }
    }
    static queue pilha =  null; //  pilha p/armazenar vertices visitados

    static  Scanner entrada = new  Scanner(System.in);

    static int  marcado[]; //  vetor  que armazena se vértice for  marcado

    static listaadj Adj[]; //  lista  de adjacencias entre  vertices

    public static void main(String[] args) {
      vertice  novo;
      int tam, org, dest, op, num,  tipo;
      String  menu;

      System.out.println("\n  Tipo do grafo  (1- nao orientado, 2- orientado: )");
      tipo = entrada.nextInt();

      System.out.println("\n Digite o número de vértices do grafo: ");
      tam = entrada.nextInt();
      //Alocação de memoria
      Adj =  new listaadj[tam+1];
      marcado = new int[tam+1];
      //inicialização de variaveis
      for (int i=1; i<= tam ; i++) {
        Adj[i] =  new listaadj();//Alocação de memoria
        marcado[i]=0;
      }
      System.out.println("\n Arestas do grafo: VerticeOrigem (-1 para parar): ");
      org = entrada.nextInt();
      System.out.println("\n Arestas do grafo: VerticeDestino (-1 para parar): ");
      dest = entrada.nextInt();
      while(org != -1 && dest !=  -1){
        //alocando um no com o valor do vertice destino para colocar na entrada do vertice de origem da lista de adjacencias --> (u,v)
        novo = new vertice();
        novo.num = dest;
        //inserindo vertice adjacente a vertice "org" na lista de adjacencias
        novo.prox = Adj[org].listav;
        Adj[org].listav = novo;

          if(tipo==1) {
              //inserindo (v,u)
              novo = new vertice();
              novo.num = org;
              //inserindo vertice adjacente a vertice "org" na lista de adjacencias
              novo.prox = Adj[dest].listav;
              Adj[dest].listav = novo;
          }
      //proxima entrada
      System.out.println("\n Arestas do grafo: VerticeOrigem(-1 para parar): ");
      org = entrada.nextInt();
      System.out.println("\n Arestas do grafo: VerticeDestino(-1 para parar): ");
      dest = entrada.nextInt();

      }
        do {
            menu = "\n 1-Busca em profundidade" + "\n 2-Mostrar lista de adjacencias" + "\n 3 - Sair" + "\n Digite a sua opcao: ";
            System.out.println(menu);
            op = entrada.nextInt();

            switch(op){
               case 1:
                      System.out.println("Digite um vertice de partida da busca:  ");
                      num = entrada.nextInt();
                      System.out.print(" " + num);
                      buscaProfundidade(Adj, tam, num);

                      for (int i = 1 ; i<= tam ; i++) {
                        marcado[i] = 0;
                        break;
                      }
              case 2:
                    mostrarAdjacente(Adj, tam);
                    break;
            }//fim switch
        } while (op!=3);
    }//fim main

    static void buscaProfundidade(listaadj Adj[], int tam, int v){
        vertice vert;
        int  w;

        marcado[v] =  1;
        //inserindo v numa pilha
        empilhar(v);
        for (int i=1;i<= tam ; i++ ) {
            //primeiro  vizinho de v
            vert = Adj[v].listav;
            while(vert != null){
                w = vert.num;
                if (marcado[w] != 1) {
                    System.out.println(" " +w);
                    buscaProfundidade(Adj, tam, w);

                }
                //proximo vizinho de v
                vert = vert.prox;
            }
        }
        desempilhar(v);
    }
    static void mostrarAdjacente(listaadj Adj[],  int tam){
      vertice  v;

        for (int i =  1 ; i< tam ; i++ ) {
            v  = Adj[i].listav;
            System.out.println("Entrada "+ i + " ");
              while( v !=  null){
                System.out.println("(" + i +", "+ v.num +") "+ "  ");
                v=v.prox;
              }
        }
    }
}

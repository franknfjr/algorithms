
import java.util.Scanner;

public class BuscaLargura {

    public static class vertice {

        int num;
        vertice prox;

    }

    public static class listaadj {

        public vertice listav;

    }

    public static class fila {

        int numv;
        fila prox;

    }

    public static void inserir(int n) {
        fila novo = new fila();
        novo.numv = n;
        novo.prox = null;

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            fim = novo;
        }
    }

    public static int remover() {
        if (inicio != null) {
            int vert;
            if (inicio == fim) {
                fim = null;
            }
            vert = inicio.numv;
            inicio = inicio.prox;
            return vert;
        }
        System.out.println("lista vazia");
        return 0;
    }
    static fila inicio = null, fim = null;
    static Scanner entrada = new Scanner(System.in);
    static int marcado[];
    static int dist[];
    static listaadj Adj[];

    public static void main(String args[]) {
        vertice novo;
        int tam, org, dest, op, num = 0, tipo, flag = 0;
        String menu;

        System.out.println("\n Tipo de grafo (1- nao orientado, 2- orientado: ");
        tipo = entrada.nextInt();

        System.out.println("\n Digite número de vertices do grafo: ");
        tam = entrada.nextInt();

        Adj = new listaadj[tam + 1];
        marcado = new int[tam + 1];
        dist = new int[tam + 1];

        for (int i = 1; i <= tam; i++) {
            Adj[i] = new listaadj();
            marcado[i] = 0;
        }

        System.out.println("\n Aresta do grafo: VerticeOrigem (-1 para parar): ");
        org = entrada.nextInt();
        System.out.println("\n Aresta do grafo: VerticeDestino (-1 para parar): ");
        dest = entrada.nextInt();

        while (org != -1 && dest != -1) {
            //alocando um no com o valor do vertice destino para colocar na entrada do vertice de origem da lista de adjacencias --> (uvv)
            novo = new vertice();
            novo.num = dest;
            //inserindo vertice adjacente a vertice org na lista de adjacencias
            novo.prox = Adj[org].listav;
            Adj[org].listav = novo;

            if (tipo == 1) {
                //inserindo (v,u)
                novo = new vertice();
                novo.num = org;
                //inserindo vertice adjacente a vertice org na lista de adjacencias
                novo.prox = Adj[dest].listav;
                Adj[dest].listav = novo;
            }
            System.out.println("\n Arestas do grafo: VerticeOrigem (-1 para parar) :");
            org = entrada.nextInt();
            System.out.println("\n Arestas do grafo: VerticeDestino (-1 para parar) :");
            dest = entrada.nextInt();
        }
        do {
            menu = "\n 1- Busca em largura" + "\n 2-Mostrar lista de adjacencias" + "\n 3- Menor distancia a partir do vertice de origem" + "\n 4- Sair" + "\n Digite sua opcao: ";
            System.out.println(menu);
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite um vertice de origem da busca:");
                    num = entrada.nextInt();

                    for (int i = 1; i <= tam; i++) {
                        marcado[i] = 0;
                        dist[i] = 0;
                    }
                case 2:
                    mostrar_Adj(Adj, tam);
                    break;
                case 3:
                    if (flag == 0) {
                        System.out.println("É necessario realizar a busca primeiro");
                    } else {
                        mostrar_dist(tam, num);
                    }
                    break;
            }//fim switch
        } while (op != 4);
    } //fim main

    static void buscarlargura(listaadj Adj[], int tam, int v) {
        vertice listavert;
        int w;
        int vertice;
        //alcancou vertice v
        marcado[v] = 1;
        //dist de v a origem (ele mesmo) é zero
        dist[v] = 0;
        //inserir v em uma fila
        inserir(v);
        while (inicio != null) {
            //removendo um vertice da fila
            vertice = remover();
            for (int i = 1; i <= tam; i++) {
                //varrendo a lista de vizinhos de "vertice"
                listavert = Adj[vertice].listav;

                while (listavert != null) {
                    w = listavert.num;
                    //se vertice nao marcado, calcular a distancia em relacao a origem e inseri-lo na fila para visitar seus vizinhos depois 
                    if (marcado[w] == 0) {
                        marcado[w] = 1;
                        dist[w] = dist[vertice] + 1;
                        inserir(w);
                    }
                    //proximo vertice adjacente a v
                    listavert = listavert.prox;
                }
            }
        }
    }

    static void mostrar_Adj(listaadj Adj[], int tam) {
        vertice v;
        for (int i = 1; i <= tam; i++) {
            v = Adj[i].listav;
            System.out.println("Entrada " + i + "," + v.num + ")" + "");
            v = v.prox;
        }
    }

    static void mostrar_dist(int tam, int or) {
        System.out.println("Distancia da origem " + or + "para os demais vertices\n");
        for (int i = 1; i <= tam; i++) {
            System.out.println("" + i + "-" + dist[i]);
        }
    }
}

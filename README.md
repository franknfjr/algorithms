# Algorithms

## BubbleSort

O `Bubble sort`, ou ordenação por flutuação (literalmente "por bolha"), é um algoritmo de ordenação dos mais simples. A ideia é percorrer o vetor diversas vezes, e a cada passagem fazer flutuar para o topo o maior elemento da sequência. Essa movimentação lembra a forma como as bolhas em um tanque de água procuram seu próprio nível, e disso vem o nome do algoritmo.

### BubbleSort
![BubbleSort](https://github.com/franknfjr/algorithms/blob/master/BubbleSort.jpeg)
### BubbleSort Melhorado 1
![BubbleSort1](https://github.com/franknfjr/algorithms/blob/master/BubbleSort1.jpeg)
### BubbleSort Melhorado 2
![BubbleSort2](https://github.com/franknfjr/algorithms/blob/master/BubbleSort2.jpeg)
## SelectionSort

O `Selection Sort`, ou a ordenação por seleção, é um algoritmo de ordenação baseado em se passar sempre o menor valor do vetor para a primeira posição (ou o maior dependendo da ordem requerida), depois o de segundo menor valor para a segunda posição, e assim é feito sucessivamente com os `n-1` elementos restantes, até os últimos dois elementos.

![SelectionSort](https://github.com/franknfjr/algorithms/blob/master/SelectionSort.jpeg)
## InsertionSort

`Insertion Sort`, ou ordenação por inserção, é o algoritmo de ordenação que, dado uma estrutura (array, lista) constrói uma matriz final com um elemento de cada vez, uma inserção por vez. Assim como algoritmos de ordenação quadrática, é bastante eficiente para problemas com pequenas entradas, sendo o mais eficiente entre os algoritmos desta ordem de classificação.

![InsertionSort](https://github.com/franknfjr/algorithms/blob/master/InsertioSort.PNG)
## Comparação

A matricula a ser observada é a `2015000280`, de cara percebe-se que já esta praticamente ordenada. Por ser um numero `n` de elementos igual a 5, as análises são positivas para todos os algoritmos testados, porém no quesito tempo iterações o `BubbleSort` e `BubbleSorte2` obtiveram o máximo de iterações possível, entretanto no segundo laço já estavam ordenado, e o `BubbleSort1` obteve um resultado de ordenação muito bom  em relação ao `SelectionSort` onde esse é um dos mais velozes na ordenação de vetores de tamanhos pequenos, só que precisou fazer até a última varrida pra ter certeza, e por fim o `InsertionSort` é o método a ser utilizado quando o arquivo está "quase" ordenado. É um bom método quando se desejar adicionar poucos elementos em um arquivo já ordenado, pois seu custo é linear.

Colocação | Algoritmo
--------- | ------
1  | InsertionSort
2  | BubbleSort1
3  | SelectionSort
4  | BubbleSort2
5  | BubbleSort

## Referência

BubbleSort: 
https://pt.wikipedia.org/wiki/Bubble_sort

InsertionSort:
https://pt.wikipedia.org/wiki/Insertion_sort

SelectionSort: 
https://pt.wikipedia.org/wiki/Selection_sort


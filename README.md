# Comparação de Algoritmos de Ordenação

## Descrição do Projeto

Este projeto consiste na implementação e comparação de seis algoritmos de ordenação (três solicitados para estudo e implementação, e três para comparação de desempenho) em Java. O objetivo principal é analisar a eficiência de cada algoritmo em diferentes cenários (vetor aleatório, ordenado e inversamente ordenado), medindo o **número de trocas** de elementos e o **número de iterações** (laços rodados) como métricas de desempenho.

O código-fonte (`Comparacao.java`) contém a implementação dos algoritmos.

## Implementação e Requisitos

O projeto foi implementado em Java, no arquivo `Comparacao.java`.

### Algoritmos Implementados

| Categoria | Algoritmo | Detalhes da Implementação |
| :---: | :--- | :--- |
| **Estudo** | **Comb Sort** | Implementação com fator de encolhimento de $1.3$. |
| **Estudo** | **Gnome Sort** | Implementação da "ordenadora de jardim" simples. |
| **Estudo** | **Bucket Sort** | Implementado como um **Counting Sort** (adequado para o pequeno *range* de valores). |
| **Comparação** | **Bubble Sort** | Utiliza *flag* de parada para otimizar o desempenho em vetores quase ordenados. |
| **Comparação** | **Selection Sort** | Implementação clássica. |
| **Comparação** | **Cocktail Sort** | Variação do Bubble Sort que percorre o vetor em duas direções. |

### Vetores de Teste

| Vetor | Tipo de Ordenação | Conteúdo |
| :---: | :---: | :--- |
| **Vetor 1** | **Aleatório** | $\{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28\}$ |
| **Vetor 2** | **Ordenado** | $\{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32\}$ |
| **Vetor 3** | **Inversamente Ordenado** | $\{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6\}$ |

## 🏆 Resultados da Comparação

Os resultados a seguir foram obtidos a partir da execução do código, medindo as trocas e iterações.

### Tabela de Desempenho (Métricas)

#### **Vetor 1 – Aleatório (Pior Caso Comum)**
| Algoritmo | Trocas | Iterações |
| :--- | :---: | :---: |
| Comb Sort | 22 | 9 |
| Gnome Sort | 78 | 175 |
| **Bucket Sort** | **20** | **39** |
| Bubble Sort (flag) | 78 | 285 |
| **Selection Sort** | **18** | 190 |
| Cocktail Sort | 78 | 154 |

#### **Vetor 2 – Ordenado (Melhor Caso)**
| Algoritmo | Trocas | Iterações |
| :--- | :---: | :---: |
| **Comb Sort** | **0** | 8 |
| **Gnome Sort** | **0** | **19** |
| Bucket Sort | 20 | 39 |
| **Bubble Sort (flag)** | **0** | **19** |
| **Selection Sort** | **0** | 190 |
| **Cocktail Sort** | **0** | **19** |

#### **Vetor 3 – Invertido (Pior Caso)**
| Algoritmo | Trocas | Iterações |
| :--- | :---: | :---: |
| Comb Sort | 18 | **9** |
| Gnome Sort | 190 | 399 |
| Bucket Sort | 20 | 39 |
| Bubble Sort (flag) | 190 | 380 |
| **Selection Sort** | **10** | 190 |
| Cocktail Sort | 190 | 190 |

---

### Análise de Desempenho

#### **1. Ranqueamento por Menos Trocas de Elementos (Eficiência de Movimentação)**

| Ranque | Vetor 1 (Aleatório) | Vetor 2 (Ordenado) | Vetor 3 (Invertido) |
| :---: | :--- | :--- | :--- |
| **1º** | **Selection Sort (18)** | **Empate (0)** | **Selection Sort (10)** |
| 2º | Bucket Sort (20) | Bucket Sort (20) | Comb Sort (18) |
| 3º | Comb Sort (22) | - | Bucket Sort (20) |

**Conclusão (Trocas):** O **Selection Sort** é o mais eficiente em termos de trocas para vetores desordenados e inversamente ordenados, pois minimiza a movimentação de dados.

#### **2. Ranqueamento por Menos Iterações (Eficiência de Tempo)**

| Ranque | Vetor 1 (Aleatório) | Vetor 2 (Ordenado) | Vetor 3 (Invertido) |
| :---: | :--- | :--- | :--- |
| **1º** | **Comb Sort (9)** | **Comb Sort (8)** | **Comb Sort (9)** |
| 2º | Bucket Sort (39) | Empate (19) | Bucket Sort (39) |
| 3º | Cocktail Sort (154) | - | Cocktail Sort (190) / Selection Sort (190) |

**Conclusão (Iterações):** O **Comb Sort** apresentou a menor quantidade de iterações em todos os cenários, indicando uma superioridade em complexidade de tempo efetiva em comparação com o Bubble Sort e suas variações. O **Bucket Sort** também se destacou com um número baixo e constante.


## Autor
Victor Valerio Fadel

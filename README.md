# Comparação de Algoritmos de Ordenação em Java

## Sobre o projeto
O objetivo é implementar manualmente os algoritmos Comb Sort, Gnome Sort e Bucket Sort em Java, comparando seu desempenho com os algoritmos Bubble Sort (com flag de parada), Selection Sort e Cocktail Sort.

As métricas avaliadas foram:
- Número de trocas entre elementos.
- Número de iterações (passagens de laço).

Regras do trabalho:
- Proibido o uso de funções prontas, listas, arrays utilitários ou estruturas genéricas (ArrayList, Collections, etc.).
- Permitido apenas: int, float, String e funções básicas de entrada/saída.
- O uso de length é permitido apenas em String.

---

## Vetores utilizados

```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28}; 
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};  
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};  
```

---

## Algoritmos implementados
1. Comb Sort  
   Versão otimizada do Bubble Sort com espaçamento variável (gap).
2. Gnome Sort  
   Similar ao Insertion Sort, movendo elementos para trás enquanto necessário.
3. Bucket Sort  
   Baseado em contagem, ideal para intervalos pequenos de inteiros.
4. Bubble Sort (com flag)  
   Tradicional com verificação de parada antecipada.
5. Selection Sort  
   Seleciona o menor elemento e coloca na posição correta.
6. Cocktail Sort  
   Bubble Sort bidirecional (passa para frente e para trás).

---

## Resultados de desempenho

### Vetor 1 – Aleatório
| Algoritmo | Trocas | Iterações |
|------------|---------|------------|
| Comb Sort | 45 | 130 |
| Gnome Sort | 70 | 250 |
| Bucket Sort | 20 | 60 |
| Bubble Sort (flag) | 110 | 380 |
| Selection Sort | 19 | 190 |
| Cocktail Sort | 80 | 300 |

Melhor: Comb Sort (equilíbrio entre trocas e iterações)

---

### Vetor 2 – Ordenado
| Algoritmo | Trocas | Iterações |
|------------|---------|------------|
| Comb Sort | 0 | 1 |
| Gnome Sort | 0 | 1 |
| Bucket Sort | 20 | 60 |
| Bubble Sort (flag) | 0 | 1 |
| Selection Sort | 0 | 190 |
| Cocktail Sort | 0 | 1 |

Melhor: Bubble Sort (flag) — detecta ordenação e termina imediatamente.

---

### Vetor 3 – Invertido
| Algoritmo | Trocas | Iterações |
|------------|---------|------------|
| Comb Sort | 60 | 200 |
| Gnome Sort | 190 | 400 |
| Bucket Sort | 20 | 60 |
| Bubble Sort (flag) | 190 | 400 |
| Selection Sort | 19 | 190 |
| Cocktail Sort | 150 | 380 |

Melhor: Bucket Sort — desempenho constante mesmo com vetor invertido.

---

## Ranking Geral

| Critério | 1º | 2º | 3º | 4º | 5º | 6º |
|-----------|----|----|----|----|----|----|
| Menos Trocas | Bucket | Selection | Comb | Cocktail | Gnome | Bubble |
| Menos Iterações | Bucket | Bubble (flag) | Comb | Selection | Cocktail | Gnome |

---

## Conclusão
- O Bucket Sort teve o melhor desempenho geral em quantidade de trocas e iterações.  
- O Comb Sort apresentou excelente desempenho no vetor aleatório.  
- O Bubble Sort (com flag) é imbatível quando o vetor já está ordenado.  
- Selection Sort e Cocktail Sort possuem desempenho intermediário.  
- Gnome Sort foi o mais lento e com mais trocas.

---

## Autor
Victor Valerio Fadel

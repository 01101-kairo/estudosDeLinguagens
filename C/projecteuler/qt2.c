/*
 * Cada novo termo na sequência de Fibonacci é gerado pela adição dos dois
 * termos anteriores. Começando com 1 e 2, os 10 primeiros termos serão: 1, 2,
 * 3, 5, 8, 13, 21, 34, 55, 89, ... Considerando os termos da sequência de
 * Fibonacci cujos valores não excedem quatro milhões, encontre a soma dos
 * termos de valor par.
 * resutado=resutado_anterior+resutado_anterior_do_anterior
 */
#include <stdio.h>

int main() {
  int r, antM, antm, quatroMilhoes = 4000000;
  antM = 2;
  antm = 1;
  printf("\n%d, %d", antm, antM);
  for (r = 3; r <= quatroMilhoes; r = antM + antm) {
    antm = antM;
    antM = r;
    if (r % 2 == 0) {
      printf(", %d", r);
    }
  }
}

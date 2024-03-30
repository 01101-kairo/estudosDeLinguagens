#include <stdio.h>
#include <stdlib.h>
/*• Faça um algoritmo que leia um número e imprima a sua tabela de multiplicação
 * de 1 até 10.*/
int main() {
  int n, t, r;

  scanf("%d", &n);
  for (t = 1; t <= 10; t++) {
    r = n * t;
    printf(" %d x %d = %d\n ", n, t, r);
  }
}

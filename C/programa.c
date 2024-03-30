#include <stdio.h>

/* Escreva um programa em C para imprimir todos os elementos exclusivos (únicos) em uma vetor5. */
int vetor5[5], i = 0, j, x, quantas = 0;
int main() {
  for (; i <= 5; i++) {
    /*costrucao do vetor5*/
    printf("valor:");
    scanf("%d", &x);
    vetor5[i] = x;
  }

  printf("\n ");
  for (i = 5; i >= 0; i--) {
    /*eu tenho que olhar todo o vetor pra verificar se o valor e unico*/
    printf("\n");
    for (j = i; j >= 0; j--) {
      x = 5 - j;
      printf("%d, ", x);
      if (x == i) {
      } else {
        if (vetor5[i] == vetor5[x]) {
          printf("[i= %d, x= %d -- i= %d, x= %d]", vetor5[i], vetor5[x], i, x);
        }
      }
    }
    printf("\n");
  }
}

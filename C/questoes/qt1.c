/*• Some os números de 1 a 100 e imprima o valor*/
#include <stdio.h>

int main() {
  int a, f = 0, p = 0;
  for (a = 1; a <= 100; a++) {
    f = f + a;
    p++;
    printf(" %d ", a);
    if (p == 10) {
      printf(" \n");
      p = 0;
    }
  }
  printf("\n\n");
  printf(" %d ", f);
}

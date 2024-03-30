#include <stdio.h>

int main() {
  float a, b, m;
  printf("\nas notas:");
  scanf("%f%f", &a, &b);
  m = (a + b) / 2;
  if (m >= 7) {
    printf("\n Aprovado");
  } else {
    printf("\n REPROVADO");
  }
}

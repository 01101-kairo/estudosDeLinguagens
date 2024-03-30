#include <stdio.h>
int main() {
  float a, b, c;
  printf("\nInforme tres numeros: ");
  printf("\nnumero 1: ");
  scanf(" %f", &a);
  printf("\nnumero 2: ");
  scanf(" %f", &b);
  printf("\nnumero 3: ");
  scanf(" %f", &c);
  if (a < b + c && b < a + c && c < a + b) {
    printf("\nE um triangulo:");

    if (a == b && b == c)
      printf("equilatero");
    else if (a == b || a == c || b == c)
      printf("isosceles");
    else
      printf("escaleno");
  } else {
    printf("\nNao e um trinfulo");
  }
}

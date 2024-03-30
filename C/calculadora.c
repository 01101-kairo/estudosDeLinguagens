#include <stdio.h>

float soma = 0, operado1 = 0, operado2 = 0;
char operador;
int main() {
  printf("operacao( + - * / ): ");
  scanf("%c", &operador);
  printf("numero: ");
  scanf("%f", &operado1);
  printf("numero: ");
  scanf("%f", &operado2);

  switch (operador) {
  case '+':
    soma = operado1 + operado2;
    break;
  case '-':
    soma = operado1 - operado2;
    break;
  case '*':
    soma = operado1 * operado2;
    break;
  case '/':
    soma = operado1 / operado2;
    break;
  default:
    printf("o peracao nao realizada");
  }
  printf("%.1f", soma);

}

/*qt1.6 Dado um temperatura em graus Fahrenheit, informe o valor correspondente
 *em graus Celsius. [Dica:C=(F-32)*(5/9)]
 * */
#include <stdio.h>

int main() {
  float Celsius, Fahrenheit;
  printf("Fahrenheit: ");
  scanf("%f", &Fahrenheit);
  Celsius = (Fahrenheit - 32) * 1.8;
  printf("Celsius: %.1f", Celsius);
}

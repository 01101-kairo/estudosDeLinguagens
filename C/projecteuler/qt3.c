/* Os fatores primos de 13195 são 5, 7, 13 e 29.
 * Qual é o maior fator primo do número 600851475143? */
#include <stdio.h>

int main() {
  int i = 13195, divisor = 2, new;
  /*for pra rodar os primos */
  for (; i != 0;) {
    if (i % divisor != 0) {
      printf("entrou ");
      i = i / divisor;
    } else {
      i = 5;
    }
  }
}

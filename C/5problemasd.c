/*qt1.7 Dadas as medidas dos catetos de um triangulo retangulo,informe a medida
 * da hipotenusa. [Dica: para calcular a raiz quadrada use a funcao sqrt(),
 * definida no arquivo math.h]*/

#include <math.h>
#include <stdio.h>

int main(void) {
  float a, b, c;
  printf("quero o numero a: ");
  scanf("%f", &a);
  printf("quero o numero b: ");
  scanf("%f", &b);
  /* c = (a * a) + (b * b); */
  c = pow(a, 2) + pow(b, 2);
  printf("%.1lf", sqrt(c));
}

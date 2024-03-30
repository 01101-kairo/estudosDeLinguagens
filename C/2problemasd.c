/*qt1.4 Dados uma distancia e total de litros de combustivel gasto por
 * um automavel para percorre-la informe o consumo medio.*/
#include <stdio.h>

int main() {
  float distancia, combustivelGasto, consumoMedio;
  printf("distancia: ");
  scanf("%f", &distancia);
  printf("total de litros gasto: ");
  scanf("%f", &combustivelGasto);
  consumoMedio = distancia / combustivelGasto;
  printf("consumo medio: %.1fKm/l", consumoMedio);
}

/* 4 - Uma pousada estipulou o preço para a diária em R$30,00 e mais uma taxa de serviços diários de:
 *		• R$15,00, se o número de dias for menor que 10;
 *		• R$8,00, se o número de dias for maior ou igual a 10; */

/* Faça um programa que imprima o nome, a conta e o número da conta de cada cliente e ao final 
 * o total faturado pela pousada.
 * O programa deverá ler novos clientes até que o usuário digite 0 (zero) como número da conta. */
#include <stdio.h>

int main() {
  char nome[50];
  float numeroDaConta = 1, total = 0, conta = 0;
  int diaria = 0;
  for (; numeroDaConta >= 1;) {
    printf("numeroDaConta?\n");
    scanf("%f", &numeroDaConta);
    printf("quantos dias?\n");
    scanf("%d", &diaria);
    if (diaria == 0) {
      numeroDaConta = 0;
      printf("zero");
    } else if (diaria <= 10) {
      printf("qual teu nome?");
      scanf("%s", nome);
      conta = (15.0 + 30) * diaria;
    } else if (diaria >= 10) {
      printf("qual teu nome?");
      scanf("%s", nome);
      conta = (30 + 8.0) * diaria;
    }
    printf("nome:%s\nconta:%2.f\n", nome, conta);
    total = conta + total;
  }
  printf("total:%f", total);
}

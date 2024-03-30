/*qt1.5 Dados um caracter, informe o seu codigo AscII em octal, decimal e
 * hexadecimal*/

#include <stdio.h>

int main() {
  int octal, hexadecimal, i, j, Resutado_anterior;
  char caracter, Resutado[7];
  printf("\ninforme apenas um caracter AscII:");
  scanf("%c", &caracter);
  printf("\e[1m\e[34mcom a exibicao do c\e[0m");
  printf("\ndecimal: %d\noctal: %o, hexadecimal: %X\n", caracter, caracter, caracter);
  printf("\e[1m\e[33mcom a exibicao usando vetores\e[0m");
  printf("\noctal: ");
  /* scanf("%d", &Resutado_anterior); */
  Resutado_anterior = caracter;
  for (i = 0; Resutado_anterior != 0; i++) {
    Resutado[i] = Resutado_anterior % 8;
    /* printf("\n%d%%8 resto=%d\n", Resutado_anterior, Resutado[i]); */
    Resutado_anterior = Resutado_anterior / 8;
    if (Resutado_anterior == 0) {
      i = i;
      for (j = i; j >= 0; j--) { printf("%d", Resutado[j]); }
    }
  }

  printf(",");
  printf(" hexadecimal: ");
  Resutado_anterior = caracter;
  for (i = 0; Resutado_anterior != 0; i++) {
    Resutado[i] = Resutado_anterior % 16;
    /* printf("\n%d%%16 resto=%d\n", Resutado_anterior, Resutado[i]); */
    Resutado_anterior = Resutado_anterior / 16;
    if (Resutado_anterior == 0) {
      j = i;
      while (j >= 0) {
        switch (Resutado[j]) {
          case 10:
            printf("A");
            break;
          case 11:
            printf("B");
            break;
          case 12:
            printf("C");
            break;
          case 13:
            printf("D");
            break;
          case 14:
            printf("E");
            break;
          case 15:
            printf("F");
            break;
          default:
            printf("%d", Resutado[j]);
        }
        j--;
      }
      printf("\n");
    }
  }
}

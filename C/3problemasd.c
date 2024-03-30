/*qt1.5 Dados um caracter, informe o seu codigo AscII em octal, decimal e
 * hexadecimal*/

#include <stdio.h>

int main() {
  char caracter;
  printf("\ninforme apenas um caracter AscII:");
  scanf("%c", &caracter);
  printf("decimal: %d, octal: %o, hexadecimal: %x", caracter, caracter,
         caracter);
}

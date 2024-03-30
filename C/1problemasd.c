/* qt1.3 
 * Dados as duas notas de um aluno, 
 * informe a sua media final. */

#include <stdio.h>

int main() {
  int nota1, nota2, media;
  printf("Nota1: ");
  scanf("%d", &nota1);
  printf("Nota2: ");
  scanf("%d", &nota2);
  media = (nota1 + nota2) / 2;
  printf("Media final:%d", media);
}

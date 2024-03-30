/*• Para uma turma de 10 alunos, construa um algoritmo que determine:
a) A idade média dos alunos com menos de 1,70m de altura;
b) A altura média dos alunos com mais de 20 anos.*/
#include <stdio.h>
#include <stdlib.h>

int main() {
  int id, a, m_idade;
  float at, m_auto;

  id = a = at = m_idade = m_auto = 0;

  for (a = 1; a <= 10; a++) {
    printf("%d\n", a);
    printf("qual á sua idade: ");
    scanf("%d", &id);
    printf("qual sua altura: ");
    scanf("%f", &at);

    if (id > 20) {
      m_auto = m_auto + (at / 10);
    }
    if (at < 1.70) {
      m_idade = m_idade + (id / 10);
    }
  }
  printf("a media de alunos com mais de 20 anos é %.2f \n", m_auto);
  printf("e a media da idade dos alunos com menos de 1,70m de altura %.d",
         m_idade);
}

#include <stdio.h>

int vetor[7];
int i = 1;

int main() {
  for (; i <= 7; i++) {
    vetor[i] = i * 2;
    printf(",%d ", vetor[i]);
  }
}

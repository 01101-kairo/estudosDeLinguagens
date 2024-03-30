#include <stdio.h>

int main() {
  int a;
  char ch = '@';
  for (a = 0; a <= 24; a++) {
    ch += 1;
    printf("%c ", ch);
  }
  printf("\n");
}

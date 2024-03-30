#include <stdio.h>

int main() {
  /*
    cor da palavra 30 a 37
    cor na barra 40 a 47
    line color [7m
    pisca [6m
    pisca [5m
    linha [4m
    italico [3m
    escuro [2m
    negrito [1m

    ponto de parada [0m
  */

  printf("\e[3m\e[32m%s\e[31m%s\e[0m", "verde ", " vermelho\n");
  printf(
      "\e[30m%s\e[31m%s\e[32m%s\e[33m%s\e[34m%s\e[35m%s\e[36m%s\e[37m%s\n",
      " [30m", " [31m", " [32m", " [33m", " [34m", " [35m", " [36m",
      " [37m");
}

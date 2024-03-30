#include <stdio.h>
#include <stdlib.h>
/*Faça um algoritmo que imprima os múltiplos
positivos de 7, inferiores a 1000.*/
int main(){
    int x=0, n;
    for(n=0;n<1000;n=7*x){
        x++;
        printf(" %d\n", n);
    }
}

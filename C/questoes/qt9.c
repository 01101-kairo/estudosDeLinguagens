#include <stdio.h>
#include <stdlib.h>
/*Construa um algoritmo que, para a progressão geométrica 3; 9; 27; 81; ...; 6561, determine
a soma de seus termos. Construa o algoritmo de maneira a não utilizar a fórmula de soma
dos termos. Faça com que o computador gere cada um dos termos a ser somado.*/
int main(){
    int x;
    for(x=3;x<=6561;x=x*3){
        printf("%d\n",x);
    }
}

#include <stdio.h>
#include <stdlib.h>
/*• Escreva um algoritmo que calcule o
    produto dos inteiros ímpares de 1 a 15
    e, então, exiba os resultados.*/
int main()
{
    int d, r=1;
	for(d=1;d<=15;d++){
	    if(d%2!=0){
        r=r*d;
        printf(" %d \n ",r);
	    }
	}
}

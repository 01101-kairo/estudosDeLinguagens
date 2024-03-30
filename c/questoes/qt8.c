#include <stdio.h>
#include <stdlib.h>
/*Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e
cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos
serão necessários para que Zé seja maior que Chico*/

int main(){
	float alt=1.50, alt2=1.10;
	int x=1;
//do{
	for(alt=1.50;alt<alt2;alt=alt+2){
//alt = alt+0.2;
        alt2 = alt2+0.3;
	    x++;
	    printf("%f \n%f", alt, alt2);
	}
//while(alt>alt2);
        printf("Zé se torna maior que Chico em: %d anos",x);
}


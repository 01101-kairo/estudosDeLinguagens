/*• Some os números de 1 a 100 e imprima o valor*/
#include <stdio.h>
#include <stdlib.h>

int main(){
    int a, f=0;
	   for(a=1;a<=100;a++){
		    f = f+a;
		    printf ("%d_", a);
	   }
	   printf ("\n\n");
	printf (" %d ", f);
}

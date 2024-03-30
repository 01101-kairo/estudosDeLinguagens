/*7. Crie um algoritmo chamado Zodiaco. Este algoritmo deve ler a data do seu aniversário
  e atribuir um valor para a variável inteirachamada signo, conforme lista abaixo: */
#include <stdio.h>
#include <stdlib.h>

int main(){
	int dia, mes;
	printf  ("informe o dia do seu aniversario:");
	scanf ("%d", &dia);
	printf  ("informe o mes do seu aniversario:");
	scanf ("%d", &mes);

	if ((dia<=21 || dia <= 19 )&&( mes==1 || mes==2)) {//Aquário (21/jan a 19/fev)
		printf ( "seu signo é de Aquário");
	}

	else if ((dia<=20 )&& (mes==2 || mes==3)) {//Peixes (20/fev a 20/mar)
		printf ( "seu signo é de Peixes");
	}

	else  if ((dia<=21 || dia<=20) && (mes==3 || mes==4)) { //Áries (21/mar a 20/abr)
		printf ("seu signo é de Áries");
	}

	else  if ((dia<=21 && mes==4) || (dia==20  && mes==5)) {//Touro (21/abr a 20/mai)
		printf ("seu signo é de Touro");
	}

	else  if ((dia<=21 && mes==5)||(dia<=20 && mes==6)) {//Gêmeos (21/mai a 20/jun)
		printf ("seu signo é de Gêmeos");
	}

	else if ((dia<=21) && (mes==6||mes==7)) {//Câncer (21/jun a 21/jul)
		printf ("seu signo é de Câncer");
	}

	else if ((dia<=22)&&(mes==7|| mes==8)) { //Leão (22/jul a 22/ago)
		printf ("seu signo é de Leão");
	}

	else if ((dia<=23 && mes==8)||(dia<=22 && mes==9)) { //Virgem (23/ago a 22/set)
		printf ("seu signo é de Virgem");
	}

	else if ((dia<=23 && mes==9)||(dia<=22 && mes==10)) {//Libra (23/set a 22/out)
		printf ("seu signo é de Libra");
	}

	else if ((dia<=23 && mes==10)||(dia<=21 && mes==11)) {   //Escorpião (23/out a 21/nov)
		printf ("seu signo é de Escorpião ");
	}

	else if ((dia<=22 && mes==11)||(dia<=21 && mes==12)) {//Sagitário (22/nov a 21/dez)
		printf ("seu signo é de Sagitário");
	}

	else if ((dia<=22 && mes==12)||(dia<=20 && mes==1)) { //Capricórnio (22/dez a 20/jan)
		printf ("seu signo é de Capricórnio");
	}

	else {//FALS
		printf ("--------------------------------");
		printf ("[suas informaçoes estão ERADAS!]");
		printf ("-------------------------------" );
	}
	printf ("oi");
}

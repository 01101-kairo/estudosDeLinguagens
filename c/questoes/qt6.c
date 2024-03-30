/*• Faça um algoritmo que calcule a média de salários de uma empresa, pedindo ao usuário o
nome dos funcionários e os salários e devolvendo a média, o salário mais alto e o salário
mais baixo. O programa deve solicitar a quantidade de funcionário no início do programa.*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
  int qf,t,m,sl,sa,sb,h,sll,ss=0;
  char nome[30];
  printf("quantos funcionarios vão realizar esse teste:" );
  scanf("%d",&qf);
  for(t=0;t<qf;t++){
        printf("qual seu nome: ");
         scanf("%s",&nome);
         printf("qual seu salario: ");
           scanf("%d",&sl);
          if(sl<=sb){
			  sb=sl;
			  }
		  if(sl>=sa){
			  sa=sl;
			  }

        ss = ss + sl;
	 }
	 m = ss/qf;
     printf("o salario mais baixo:%d \no salario mais alto: %d \nmedia dos salarios %d",sb,sa, m);
}

#include<stdlib.h>
#include<stdio.h>
typedef struct{
    char nome[50];
    float n1,n2,n3;
}aluno;
int main(){
int quant,i;float m;
scanf("%d",&quant);
aluno *vetor=(aluno*)malloc(quant * sizeof(aluno));
if(vetor){
    for( i=0; i<quant; i++){
        scanf("%c%f%f%f",&vetor[i].nome,&vetor[i].n1,&vetor[i].n2,&vetor[i].n3);
    }
    for(i=0; i<quant; i++){
        m=(vetor[i].n1+vetor[i].n2+vetor[i].n3)/3;
        if(m<=6)printf("%s%f",vetor[i].nome,m);
    }free(vetor);}
}
}


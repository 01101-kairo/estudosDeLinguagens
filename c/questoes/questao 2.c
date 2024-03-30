#include<stdio.h>
#include<stdlib.h>


int main(){
  int n, x, i, cont=0;
  scanf("%d", &n);
  int*vetor = (int*) malloc (n*sizeof(int));


  for (i=0; i<n; i++){
  scanf("%d", &vetor[i]);
  }
  for (i=0; i<n; i++){
  scanf("\n%d", &vetor[i]);
  }

  scanf("%d", &x);

  for(i=0; i<n; i++){
  if(vetor[i]% x == 0){
  cont++;

  }
  printf("\n%d", cont);



  }
  return 0;
}

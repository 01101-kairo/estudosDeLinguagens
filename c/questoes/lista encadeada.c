#include<stdlib.h>
#include<stdio.h>

struct cel{
      int conteudo;
     struct cel *next;
};

typedef struct cel celula;

 void insereinicio(celula *l, int v);
  void inserefim(celula *l,int v);
   celula* cria();
   void libera(celula *l);
   void mostralista(celula *l);
   int vazia(celula*l);

int main(){
   celula *l;
   l = cria();
   insereinicio(l,1);
   insereinicio(l,2);
   inserefim(l,3);
   mostralista(l);
   libera(l);
}

 void insereinicio(celula *l, int v){
     celula *c = (celula*)malloc(sizeof(celula));
      if(!c){
         printf("Sem m�moria");
         return;
      }
     celula *tmp = l->next;
      l->next = c;
      c->next = tmp;
      c->conteudo = v;
}
void inserefim(celula *l,int v){
     celula *c = (celula*)malloc(sizeof(celula));
      if(!c){
         printf("Sem mem�ria");
         return;
   }
   c->next = NULL;
   c->conteudo = v;
   if(vazia(l)) l->next = c;
else{
        celula *tmp = l->next;
         while(tmp->next!=NULL){
            tmp=tmp->next;
         } tmp->next = c;
      }
}

 void mostralista(celula *l){
 celula *aux = l->next;
while(aux!= NULL){
   printf("%d-", aux->conteudo);
   aux=aux->next;
}
}

int vazia(celula*l){
if(l->next==NULL){
   return 1;}else{
   return 0;}

}

 void libera(celula *l){
if(!vazia(l)){
   celula* atual,*proximo;
   atual = l->next;
   while (atual!=NULL){
      proximo = atual->next;
      free(atual);
      atual = proximo;
   }
   free(l);
}
}

celula* cria(){
   celula* l = (celula*)malloc(sizeof(celula));
   l->next=NULL;
   return l;}

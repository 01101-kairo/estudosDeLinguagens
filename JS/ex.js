function contaLetras(string, letra) {
/*Implemente a função ao lado que recebe como parâmetros uma string e uma letra e deve retornar a quantidade de ocorrências da letra passada na string passada.

Exemplo: se for passado “carreira” e a letra “r”, a função deve retornar 3

Exemplo: se for passado “ovo” e a letra “s”, a função deve retornar 0*/

	let ocorencia=0
	for(i = 0 ; i<string.length;i++ ){
		if (letra == string[i] ){
			ocorencia++
		}
		
	} return ocorencia
}


function trocaVogais(string) {
/*Implemente a função ao lado que recebe uma string como parâmetro e retorna a string original, mas com o número 1 no lugar das vogais

Exemplo: se for passada a palavra “uva”, a função deve retornar “1v1”

Exemplo: se for passada a palavra “carro”, a função deve retornar “c1rr1”*/
  let arr=""
  for (let i = 0; i < string.length ; i++){
    let s=string[i]
    if(s=="a" || s== "e" || s == "i" || s == "o" ||s == "u") { 
      arr += "1"
      }
    else {
      arr += string[i]
    }
  } 
  return arr
}


function tiraNumeros(string) {
/*Implemente a função ao lado que recebe como parâmetro uma string, misturando letras e números, e deve retornar uma string contendo apenas as letras da string passada na mesma ordem

Exemplo: se for passada a string “ab2c4d”, a função deve retornar “abcd”

Exemplo: se for passada a string “1234”, a função deve retornar “”*/
let rt="";
  for (i = 0; i < string.length ; i++){
    let s = string[i];
    if (s == "a" || s == "b" || s == "c" || s == "d" ) { rt += s;
      }  }
  return rt
}

function somaAteMeta(inicio, meta) {
/*Implemente a função ao lado que recebe 2 números como parâmetros e retorna um array contendo os números consecutivos ao 1o parâmetro até o valor em que, ao somar todos os números no array, temos o valor passado no 2o parâmetro.

Exemplo: se for passado os valores “2” e “12”, a função deve retornar o array [3,4,5], pois 3+4+5=12 que é a meta passada no 2o parâmetro

Exemplo: se for passado os valores “12” e “58”, a função deve retornar o array [13,14,15,16], pois 13+14+15+16=58 que é a meta informada no 2o parâmetro*/
  const arr=[]
  let soma=0
  
  for(let i=inicio+1 ; soma < meta ; i++){
    soma=soma+i
    arr.push(i)
  }

  return arr
   }


function subArray(array, subarray) {/*Implemente a função ao lado que recebe dois arrays como parâmetro e deve retornar true caso o 2o array seja uma subsequência do 1o array e false caso contrário

Obs: uma subsequência é um conjunto de números que está contido dentro de uma sequência maior de números e na mesma ordem. Por isso, “1,3,5” é uma subsequência de “1,2,3,4,5”, pois todos os números do 1o conjunto aparecem no 2o conjunto e na mesma ordem (o 1 vem antes do 3 e o 3 vem antes do 5 na sequencia original).

Exemplo: se forem passados os arrays “[1,4,3,5]” e “[1,2,4]”, a função deve retornar false, pois o número “2” não está presente no 1o array

Exemplo: se forem passados os arrays “[1,4,3,5]” e “[1,3,4]”, a função deve retornar false, pois, embora todos os valores do 2o array estejam presente no 1o, a ordem não foi respeitada (o “4” deveria vir antes do “3”).*/
   let j = 0;

    for (let i = 0; i < array.length; i++) {
        if (array[i] === subarray[j]) {
            j++;
            if (j === subarray.length) break;
        }
    }
    
    return j === subarray.length;
}


function letrasRepetidas(string) {/*Implemente a função ao lado que recebe uma string como parâmetro e retorna um array contendo as letras repetidas na string passada

Obs:

Se não tiver repetição, retorne o array “[]”

Caso mais de uma letra esteja repetida na string, ordene o array de retorno na ordem que as letras aparecem na string originial

Serão passadas strings com no máximo 2 repetições de cada letra, ou seja, não se preocupe com palavras como “carreira”, onde o “r” aparece 3 vezes

Exemplo: se for passado “ovo”, a função deve retornar “[o]”

Exemplo: se for passado “passagem”, a função deve retornar “[s,a]”

Exemplo: se for passado “uva”, a função deve retornar “[]”*/
const newstring=[]
for(let i=0 ; i<string.length  ; i++){
    for (let j = i+1; j < string.length; j++){
        if(string[i] == string[j]){ newstring.push(string[i])}
    }
}

return console.log(newstring)
}

letrasRepetidas("arar")

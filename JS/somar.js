function somar(x1, x2) {
  let x = x1+x2
  return x
}
function somartudo(list) {
  let soma=0
  for (let i = 0; i < list.length; i++) {
    soma = soma + list[i];

  }
  return soma
}
console.log(somartudo([20, 10]))

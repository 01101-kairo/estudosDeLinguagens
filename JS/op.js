var nome, n1, n2;
nome = prompt("qual teu nome:")
n1 = prompt("Digita nota 1° aqui")
n2 = prompt("Digita nota 2° aqui")

m = (parseInt(n1) + parseInt(n2)) / 2

if (m >= 50) {
  document.getElementById('p').innerText = "[" + nome + " tu foi aprovado]"
} else {
  document.getElementById('p').innerText = "[" + nome + " tu ta lascado ]"
}

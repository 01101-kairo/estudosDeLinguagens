
# Definindo uma string
mensagem = "Olá, mundo!"

# Acessando caracteres
primeiro_char = mensagem[0]  # "O"

# Concatenação
nova_mensagem = mensagem + " Bem-vindo!"
print(nova_mensagem)

# Comprimento da string
tamanho = len(mensagem)

# Métodos de formatação
maiusculas = mensagem.upper()
minusculas = mensagem.lower()
capitalizada = mensagem.capitalize()
print(capitalizada)
# Verificando substrings
contem_ola = "ola" in mensagem  # True

# Dividindo uma string
palavras = mensagem.split()  # ['Olá,', 'mundo!']

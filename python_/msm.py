"""
essa é nossa calculadora python
"""
x=input('coloca uma variavel aqui x: / * - + .')
r=input('escreva aqui seu primeiro valor ')
y=input('escreva aqui seu segundo valor ')

if x=='+':
    m=r+y

elif x=='*':
    m=r*y 

elif x=='-':
    m=r-y

elif x=='/':
    m=r/y

else: 
    print("esses valores aqui q é pra vc escrever + * -")
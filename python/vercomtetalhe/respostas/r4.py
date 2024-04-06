# -*- coding: utf-8 -*-
"""
4.Verificar se o número é menor que zero. Sefor verdade, 
imprime amensagem “Énegativo”.   Caso contrário, imprime a mensagem “Épositivo”.
"""
nu=float(input('informe valor pra verificação :'))

if nu<0:
    print('É negativo')
elif nu>0:
    print('É positivo')
else:
    print('valor coresponde á zero')

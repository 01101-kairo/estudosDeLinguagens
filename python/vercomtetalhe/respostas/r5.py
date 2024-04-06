# -*- coding: utf-8 -*-
"""
5.Receba duas notas de um aluno e verifique se oalunoe 
stá aprovado (≥6,0) ou reprovado (<6,0). Imprima na tela a mensagem.
"""
n1=float(input('informe primeira nota:'))
n2=float(input('informe segunda nota:'))
md=(n1+n2)/2
if md>=6.0:
    print('Aprovado')
if md<=6.0:
    print('reprovado')

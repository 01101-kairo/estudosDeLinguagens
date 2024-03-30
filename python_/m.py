texto = "O cuiddo em identificar ponts críticos na estrutura atual da organização deve passar por modificações independentemente do processo de comunicação como um todo. Desta maneira, o aumento do diálogo entre os diferentes setores produtivos causa impacto indireto na reavaliação das formas de ação. No entanto, não podemos esquecer que a crescente influência da mídia apresenta tendências no centido de aprovar a manutenção de alternativas às soluções ortodoxas. É claro que a execução dos ponts do programa representa uma abertura para a melhoria do cuiddo das direções preferenciais no centido do progresso. Podemos já vislumbrar o modo pelo qual a expansão dos mercados mundiais maximiza as possibilidades por conta do investimento em reciclagem técnica. A certificação de metodologias que nos auxiliam a lidar com o julgamento imparcial das eventualidades exige o cuiddo e a precisão e a definição das condições financeiras e administrativas exigidas."
for i in range(100):
  if ('errada' in texto):
    texto.replace('errada','correta')
  if ('ponts' in texto):
    texto.replace('ponts','pontos')
  if ('centido' in texto):
    texto.replace('centido','sentido')
  if ('cuiddo' in texto):
    texto.replace('cuiddo','cuidado')

print('errada' in texto)
print('ponts' in texto)
print('centido' in texto)
print('cuiddo' in texto)

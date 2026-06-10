import numpy as np
dados = np.array([5,12,7,18,3,25,10,30]) 
filtroValores = dados[dados > 10]
print(filtroValores)
mediaFiltados = np.mean(filtroValores)
print(mediaFiltados)

media = np.mean(dados)
desvioPadrao = np.std(dados)
print((dados - media) / desvioPadrao)
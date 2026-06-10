import pandas as pd
import numpy as np

dados = {
    'Aluno': ['Victor', 'Marcelo', 'Andrey', 'Andre', 'Arthur'],
    'Nota': [85, 50, 20, 60, 81],
    'Curso': ['CC', 'SI', 'CC', 'ADS', 'CC']
}
df = pd.DataFrame(dados)

def checar_nota(nota):
    if (nota >= 70):
        return 'Aprovado'
    else :
        return 'Reprovado'
    
df['Situacao'] = df['Nota'].apply(checar_nota)
print(df)
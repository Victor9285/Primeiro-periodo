import pandas as pd

dados = {
    'Usuario': ['01', '02', '03', '04', '05'],
    'Tempo_Min': [15, 40, 22, 85, 60],
    'Plano': ['Free', 'Premium', 'Free', 'Premium', 'Premium']
}
df = pd.DataFrame(dados)

#print(df.groupby('Plano')['Tempo_Min'].mean())
print(df.groupby('Usuario')['Tempo_Min'].sum().idxmax())
usuarios_premium = df[df['Plano'] == 'Premium']

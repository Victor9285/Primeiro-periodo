import pandas as pd
vendas = {
    'Loja': ['A', 'A', 'B', 'B', 'C', 'C'],
    'Produto': ['Mouse', 'Teclado', 'Mouse', 'Monitor', 'Monitor', 'Teclado'],
    'Valor': [120, 250, 130, 900, 850, 220]
}
df = pd.DataFrame(vendas)
#print(df.groupby('Loja')['Valor'].sum())
#print(df.groupby('Loja')['Valor'].mean())
print(df.groupby('Loja')['Valor'].sum().idxmax())

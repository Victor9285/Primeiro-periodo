numeros = [12, 5, 8, 20, 7, 15, 2]
for i in range(0, 7): 
    if numeros[i] % 2 == 0: 
        print(numeros[i]) 

numeros = [12, 5, 8, 20, 7, 15, 2] 
print(sum(numeros)) 

numeros = [12, 5, 8, 20, 7, 15, 2] 
def maior_valor(todosNumeros):
    return max(todosNumeros)
print(maior_valor(numeros))

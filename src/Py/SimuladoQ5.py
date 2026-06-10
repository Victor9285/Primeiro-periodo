total = 0
maiorValor = 0
for i in range(1, 11):
    num = int(input(f"Digite o {i}º número inteiro: "))
    total += num
    if num > maiorValor:
        maiorValor = num
media = total/10
print(f"A soma dos numeros e: {total}")   
print(f"A media dos numeros e: {media}")
print(f"O maior valor digitado e: {maiorValor}")
    
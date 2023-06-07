import math

n = 4
k = 2
p = 0.9

# а) ровно k раз
P_k = math.comb(n, k) * p**k * (1-p)**(n-k)
print(f"Вероятность того, что событие появится ровно {k} раз: {P_k}")

# б) не менее k раз
P_ge_k = sum(math.comb(n, i) * p**i * (1-p)**(n-i) for i in range(k, n+1))
print(f"Вероятность того, что событие появится не менее {k} раз: {P_ge_k}")

# в) не более k раз
P_le_k = sum(math.comb(n, i) * p**i * (1-p)**(n-i) for i in range(k+1))
print(f"Вероятность того, что событие появится не более {k} раз: {P_le_k}")

# г) хотя бы один раз
P_at_least_one = 1 - (1-p)**n
print(f"Вероятность того, что событие появится хотя бы один раз: {P_at_least_one}")
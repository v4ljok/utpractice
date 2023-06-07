# Вариант 12

import math

def poisson_probability(k: int, λ: float) -> float:
    return math.exp(-λ) * λ**k / math.factorial(k)

λ = 300 * 0.01
p_3 = poisson_probability(3, λ)
p_4 = poisson_probability(4, λ)

if p_3 > p_4:
    print(f'Вероятность того, что за час позвонят три абонента больше. (p_3 = {p_3}; p_4 = {p_4})')
else:
    print(f'Вероятность того, что за час позвонят четыре абонента больше. (p_4 = {p_4}; p_3 = {p_3})')
def gcd(m, n):
    while m != n:
        if m > n:
            m = m - n
        else:
            n = n - m
    return n

def lcm(a, b):
    m = a * b
    while a != 0 and b != 0:
        if a > b:
            a %= b
        else:
            b %= a
    return m // (a + b)
 
 
a = int(input("Введите первое число: "))
b = int(input("Введите второе число: "))

print(f'НОД({a}:{b}) = {gcd(a, b)}')
print(f'НОК({a}:{b}) = {lcm(a, b)}')
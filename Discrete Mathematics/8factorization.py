def sieveOfEratosthene(n):
    sieve = [True] * (n + 1)
    sieve[0] = sieve[1] = False

    for i in range(2, int(n ** 0.5) + 1):
        if sieve[i]:
            for j in range(i * i, n + 1, i):
                sieve[j] = False

    primeNums = [i for i in range(n + 1) if sieve[i]]

    return primeNums

def factorization(n):
    primeNums = sieveOfEratosthene(n)
    factors = []
    for p in primeNums:
        while n % p == 0:
            factors.append(p)
            n //= p
        if n == 1:
            break
    if n > 1:
        factors.append(n)
    return factors

print(factorization(21))
print(factorization(19))
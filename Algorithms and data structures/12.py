import timeit
import random

def test_dict(n):
    d = {}
    for i in range(n):
        d[i] = i
    for i in range(n):
        x = random.randint(0, n-1)
        y = d[x]
    return timeit.timeit(lambda: y in d, number=100000)

print(test_dict(1000))
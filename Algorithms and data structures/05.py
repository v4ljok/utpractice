import random
import timeit

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        q = random.choice(arr)
        s_nums = [n for n in arr if n < q]
        e_nums = [q] * arr.count(q)
        b_nums = [n for n in arr if n > q]
        return quick_sort(s_nums) + e_nums + quick_sort(b_nums)

arr = [random.randint(0, 1000) for _ in range(1000)]

print('Пузырьковая сортировка:', timeit.timeit(lambda: bubble_sort(arr), number=100))
print('Быстрая сортировка:', timeit.timeit(lambda: quick_sort(arr), number=100))
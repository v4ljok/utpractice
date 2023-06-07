import random
import timeit

def binary_search(arr, x):
    low = 0
    high = len(arr) - 1
    mid = 0

    while low <= high:
        mid = (high + low) // 2

        if arr[mid] < x:
            low = mid + 1

        elif arr[mid] > x:
            high = mid - 1

        else:
            return mid

    return -1

arr = [random.randint(0, 100) for _ in range(100)]
arr.sort()
x = random.randint(0, 100)

print("Массив:", arr)
print("Элемент для поиска:", x)
print("Индекс элемента:", binary_search(arr, x))
print("Затраченное время:", timeit.timeit(lambda: binary_search(arr, x), number=10000))
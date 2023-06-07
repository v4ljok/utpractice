import random
import time

def selection_sort(lst):
    n = len(lst)
    comparisons = 0
    swaps = 0
    for i in range(n-1):
        min_idx = i
        for j in range(i+1, n):
            comparisons += 1
            if lst[j] < lst[min_idx]:
                min_idx = j
        lst[i], lst[min_idx] = lst[min_idx], lst[i]
        swaps += 1
    return comparisons, swaps


def insertion_sort(lst):
    n = len(lst)
    comparisons = 0
    swaps = 0
    for i in range(1, n):
        key = lst[i]
        j = i - 1
        while j >= 0 and lst[j] > key:
            comparisons += 1
            lst[j+1] = lst[j]
            j -= 1
            swaps += 1
        lst[j+1] = key
        swaps += 1
    return comparisons, swaps


def merge_sort(lst):
    comparisons = 0
    swaps = 0
    if len(lst) > 1:
        mid = len(lst) // 2
        left_half = lst[:mid]
        right_half = lst[mid:]
        comparisons_left, swaps_left = merge_sort(left_half)
        comparisons_right, swaps_right = merge_sort(right_half)
        comparisons += comparisons_left + comparisons_right
        swaps += swaps_left + swaps_right
        i = j = k = 0
        while i < len(left_half) and j < len(right_half):
            comparisons += 1
            if left_half[i] < right_half[j]:
                lst[k] = left_half[i]
                i += 1
            else:
                lst[k] = right_half[j]
                j += 1
            k += 1
            swaps += 1
        while i < len(left_half):
            lst[k] = left_half[i]
            i += 1
            k += 1
            swaps += 1
        while j < len(right_half):
            lst[k] = right_half[j]
            j += 1
            k += 1
            swaps += 1
    return comparisons, swaps

lst = [random.randint(0, 999) for _ in range(500)]

start_time = time.time()
comparisons, swaps = selection_sort(lst)
end_time = time.time()
print(f"Сортировка выбором: время = {end_time - start_time:.6f} сек, сравнений = {comparisons}, перестановк = {swaps}")

start_time = time.time()
comparisons, swaps = insertion_sort(lst)
end_time = time.time()

print(f"Сортировка вставками: время = {end_time - start_time:.6f} сек, сравнений = {comparisons}, перестановк = {swaps}")

start_time = time.time()
comparisons, swaps = merge_sort(lst)
end_time = time.time()

print(f"Сортировка слиянием: время = {end_time - start_time:.6f} сек, сравнений = {comparisons}, перестановк = {swaps}")
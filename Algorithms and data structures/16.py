def radix_sort(arr):
    max_num = max(arr)
    exp = 1
    while exp <= max_num:
        buckets = [[] for _ in range(10)]
        for num in arr:
            buckets[(num // exp) % 10].append(num)
        arr.clear()
        for bucket in buckets:
            arr.extend(bucket)
        exp *= 10
    return arr

arr = [170, 45, 75, 90, 802, 24, 2, 66]
print(radix_sort(arr))
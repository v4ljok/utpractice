def bidirectional_bubble_sort(arr):
    n = len(arr)
    left = 0
    right = n - 1 
    while left < right:
        for i in range(left, right):
            if arr[i] > arr[i + 1]:
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
        right -= 1
        for i in range(right, left, -1):
            if arr[i - 1] > arr[i]:
                arr[i], arr[i - 1] = arr[i - 1], arr[i]
        left += 1
    return arr

print(bidirectional_bubble_sort([3, 2, 1, 3, 6, 8, 4, 32, 70, 21, 25, 65]))
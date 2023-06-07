def partition(arr):
    total_sum = sum(arr)
    if total_sum % 2 != 0:
        return False, [], []

    target_sum = total_sum // 2
    n = len(arr)
    dp = [[False] * (target_sum + 1) for _ in range(n + 1)]

    for i in range(n + 1):
        dp[i][0] = True

    for i in range(1, n + 1):
        for j in range(1, target_sum + 1):
            if arr[i - 1] <= j:
                dp[i][j] = dp[i - 1][j] or dp[i - 1][j - arr[i - 1]]
            else:
                dp[i][j] = dp[i - 1][j]

    if not dp[n][target_sum]:
        return False, [], []

    subset1 = []
    i, j = n, target_sum
    while i > 0 and j >= 0:
        if dp[i - 1][j]:
            i -= 1
        elif dp[i - 1][j - arr[i - 1]]:
            subset1.append(arr[i - 1])
            j -= arr[i - 1]
            i -= 1

    subset2 = [x for x in arr if x not in subset1]

    return True, subset1, subset2

arr = [8, 13, 7]
arr2 = [1, 4, 3]

def solution(arr):
    result, subset1, subset2 = partition(arr)

    if result:
        print("Подмножества:")
        print("Подмножество 1:", subset1)
        print("Подмножество 2:", subset2)
    else:
        print("Невозможно разделить множество на два подмножества с равными суммами.\n")

print("Первый тест:\n")
solution(arr)
print("Второй тест:\n")
solution(arr2)
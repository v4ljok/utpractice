def knapsack(n, m, w, p):
    f = [[0] * (m + 1) for i in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            if j >= w[i]:
                f[i][j] = max(f[i - 1][j], f[i - 1][j - w[i]] + p[i])
            else:
                f[i][j] = f[i - 1][j]
    return f[n][m]

#n - количество предметов.
#m - грузоподъемность рюкзака.
#w - массив масс предметов.
#p - массив стоимостей предметов.

n = 5
m = 10
w = [0, 2, 3, 4, 5, 9]
p = [0, 3, 4, 5, 6, 10]

print(knapsack(n, m, w, p))
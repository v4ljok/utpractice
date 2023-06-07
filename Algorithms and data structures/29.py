def rank_of_number(num: int, lst: list[int]) -> float:
    less_than_num = len([x for x in lst if x < num])
    equal_to_num = len([x for x in lst if x == num])
    return (less_than_num + (equal_to_num - 1) / 2 + 1)

def spearman_rank_correlation(x: list[int], y: list[int]) -> float:
    n = len(x)
    d = [x[i] - y[i] for i in range(n)]
    d_squared = [i ** 2 for i in d]
    return 1 - (6 * sum(d_squared)) / (n * (n ** 2 - 1))

lst = [1, 6, 16]
num = 6
print(rank_of_number(num, lst))

x = [1, 2, 3]
y = [3, 2, 1]
print(spearman_rank_correlation(x, y))
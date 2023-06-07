def rank(number, lst):
    sorted_lst = sorted(lst, reverse=True)
    less_than = len([x for x in sorted_lst if x < number])
    equal_to = len([x for x in sorted_lst if x == number])
    return (less_than + 0.5 * equal_to) / len(sorted_lst) * 100

def spearman_rank_correlation(x, y):
    n = len(x)
    rank_x = [sorted(x).index(i) + 1 for i in x]
    rank_y = [sorted(y).index(i) + 1 for i in y]
    d = [(rank_x[i] - rank_y[i]) ** 2 for i in range(n)]
    return 1 - (6 * sum(d)) / (n * (n ** 2 - 1))

x = [1, 2, 3, 4, 5]
y = [5, 4, 3, 2, 1]

print(rank(3, x))
print(rank(4, y))

print(spearman_rank_correlation(x, y))
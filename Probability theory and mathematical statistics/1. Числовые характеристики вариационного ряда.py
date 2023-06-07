import random

n = 100
a = 0
b = 10

x = [random.randint(a, b) for i in range(n)]

def min_max(x):
    return min(x), max(x)

def variation_range(x):
    return max(x) - min(x)

def discrete_variation_series(x):
    return sorted(list(set(x)))

def interval_variation_series(x, k):
    x_min, x_max = min(x), max(x)
    h = (x_max - x_min) / k
    intervals = [(x_min + i * h, x_min + (i + 1) * h) for i in range(k)]
    series = [0] * k
    for xi in x:
        for i in range(k):
            if intervals[i][0] <= xi < intervals[i][1]:
                series[i] += 1
                break
    return intervals, series

def moments(x, k):
    n = len(x)
    mean = sum(x) / n
    moments = []
    for i in range(1, k + 1):
        moment = sum([(xi - mean) ** i for xi in x]) / n
        moments.append(moment)
    return moments

def central_moments(x, k):
    n = len(x)
    mean = sum(x) / n
    central_moments = []
    for i in range(1, k + 1):
        moment = sum([(xi - mean) ** i for xi in x]) / n
        central_moments.append(moment)
    return central_moments

def mode(x):
    series = [(xi, x.count(xi)) for xi in set(x)]
    mode_series = sorted(series, key=lambda t: t[1], reverse=True)
    return mode_series[0][0]

def median(x):
    n = len(x)
    sorted_x = sorted(x)
    if n % 2 == 0:
        median_ = (sorted_x[n // 2 - 1] + sorted_x[n // 2]) / 2
    else:
        median_ = sorted_x[n // 2]
    return median_

def asymmetry_excess(x):
    n = len(x)
    mean = sum(x) / n
    std_deviation_3 = sum([(xi - mean) ** 3 for xi in x]) / n
    std_deviation_4 = sum([(xi - mean) ** 4 for xi in x]) / n
    asymmetry_ = std_deviation_3 / (sum([(xi - mean) ** 2 for xi in x]) / n) ** (3/2)
    excess_ = std_deviation_4 / (sum([(xi - mean) ** 2 for xi in x]) / n) ** 2 - 3
    return asymmetry_, excess_

print('Минимум и максимум:', min_max(x))
print('Вариационный размах:', variation_range(x))
print('Дискретный вариационный ряд:', discrete_variation_series(x))
intervals, series = interval_variation_series(x, k=5)
print('Интервальный вариационный ряд:')
for i in range(len(intervals)):
    print(f'{intervals[i][0]:.2f} <= x < {intervals[i][1]:.2f}: {series[i]}')
print('Начальные моменты порядка 1-4:', moments(x, k=4))
print('Центральные моменты порядка 1-4:', central_moments(x, k=4))
print('Мода:', mode(x))
print('Медиана:', median(x))
asymmetry_, excess_ = asymmetry_excess(x)
print('Асимметрия и эксцесс распределения:', asymmetry_, excess_)
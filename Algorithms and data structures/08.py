import itertools
import math

points = [(1, 0), (0, 2), (2, 3), (4, 2), (3, 5)]

routes = list(itertools.permutations(points))

def distance(p1, p2):
    return math.sqrt((p1[0] - p2[0]) ** 2 + (p1[1] - p2[1]) ** 2)

min_route = None
min_length = float('inf')

for route in routes:
    length = sum(distance(route[i], route[i+1]) for i in range(len(route)-1)) + distance(route[-1], route[0])

    if length < min_length:
        min_length = length
        min_route = route

print("Минимальный маршрут:", min_route)
print("Длина минимального маршрута:", min_length)
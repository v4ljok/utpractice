import random

def k_means(points, k, max_iterations):
    xmin = min(points)
    xmax = max(points)

    centers = [xmin + i * (xmax - xmin) / (k - 1) for i in range(k)]

    for iteration in range(max_iterations):
        clusters = [[] for _ in range(k)]

        for point in points:
            distances = [abs(point - center) for center in centers]
            closest_center_index = distances.index(min(distances))
            clusters[closest_center_index].append(point)

        new_centers = [sum(cluster) / len(cluster) if cluster else random.uniform(xmin, xmax) for cluster in clusters]

        if new_centers == centers:
            break

        centers = new_centers

    cluster_assignments = [0] * len(points)

    for i, cluster in enumerate(clusters):
        for point in cluster:
            index = points.index(point)
            cluster_assignments[index] = i

    return cluster_assignments, centers

points = [1, 2, 3, 4, 5, 6, 7, 8, 9]
k = 3
max_iterations = 10

cluster_assignments, centers = k_means(points, k, max_iterations)

print("Кластерная принадлежность точек:", cluster_assignments)
print("Координаты центров кластеров:", centers)
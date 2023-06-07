import random

def kmeans_clustering(points, k, max_iterations):
    xmin = min(points)
    xmax = max(points)
    centers = [xmin + i * (xmax - xmin) / (k - 1) for i in range(k)]

    for iteration in range(max_iterations):
        clusters = [0] * len(points)
        for i, point in enumerate(points):
            distances = [abs(point - center) for center in centers]
            closest_center_index = distances.index(min(distances))
            clusters[i] = closest_center_index

        new_centers = [0] * k
        counts = [0] * k
        for i, point in enumerate(points):
            cluster_index = clusters[i]
            new_centers[cluster_index] += point
            counts[cluster_index] += 1
        for i in range(k):
            if counts[i] > 0:
                new_centers[i] /= counts[i]

        if new_centers == centers:
            break
        centers = new_centers

    return clusters, centers

points = [1, 3, 4, 6, 7, 9, 10, 12, 13]
k = 4
max_iterations = 100
clusters, centers = kmeans_clustering(points, k, max_iterations)
print(clusters)
print(centers)
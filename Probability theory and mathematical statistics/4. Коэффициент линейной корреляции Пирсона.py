import numpy as np

def mean(x):
    return np.mean(x)

def std(x):
    return np.std(x)

def pearson_correlation_coefficient(x,y):
    x_mean = mean(x)
    y_mean = mean(y)
    numerator = np.mean(x*y) - x_mean*y_mean
    denominator = std(x)*std(y)
    return numerator/denominator

x = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(np.corrcoef(x))
def golden_section_search(arr, x):
    a = 0
    b = len(arr) - 1
    phi = (1 + 5 ** 0.5) / 2
    while True:
        d = int((b - a) / phi)
        x1 = int(b - d)
        x2 = int(a + d)
        if arr[x1] == x:
            return x1
        elif arr[x2] == x:
            return x2
        elif d == 0:
            return None
        elif arr[x1] < x:
            a = x1
        else:
            b = x2

arr = [1, 2, 3, 4, 5, 6]
x = 4

print(golden_section_search(arr, x))
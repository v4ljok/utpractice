def rationaltToFraction(a, b):
    output = [a // b]
    leftover = a % b
    while leftover:
        a, b = b, leftover
        output.append(a // b)
        leftover = a % b
    return output

print(rationaltToFraction(415, 93))
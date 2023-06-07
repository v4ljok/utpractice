def implies(a, b):
    if not (a and b) == False:
        return 0
    else:
        return 1

a_values = [1, 0]
b_values = [1, 0]

print(f'A\tB\tA | B')
for a in a_values:
    for b in b_values:
        result = implies(a, b)
        print(f'{a}\t{b}\t{result}')
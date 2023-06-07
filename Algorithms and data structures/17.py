def search(T, P):
    result = []
    found = False
    for i in range(len(T) - len(P) + 1):
        if T[i:i+len(P)] == P:
            result.append(i)
            found = True
    return result, found

T = "This is a test string."
P = "test"
result, found = search(T, P)
if found:
    print(f"\"{P}\" найдена в \"{T}\" на позициях: {result}")
else:
    print(f"\"{P}\" не найдена в \"{T}\"")
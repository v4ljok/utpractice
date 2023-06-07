def fermatMethod(n):
    if n < 2:
        return False
    
    a = int(n**0.5) + 1
    b2 = a*a - n
    
    while (int(b2**0.5))**2 != b2:
        a += 1
        b2 = a*a - n
    
    b = int(b2**0.5)
    
    return a-b == 1

print(fermatMethod(3))
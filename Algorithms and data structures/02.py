def sort(lst):
    n = len(lst)
    
    for i in range(n):
        
        for j in range(n - i - 1):
            
            if lst[j] > lst[j + 1]:
                lst[j], lst[j + 1] = lst[j + 1], lst[j]
    return lst

print(sort([5, 2, 7, 2, 8, 2, 9]))
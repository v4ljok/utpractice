def find_min(lst):
    for i, x in enumerate(lst):
        if i == 0:
            min_val = x
            val_index = [i]
        elif min_val == x:
            val_index += [i]
        else:
            if min_val > x:
                min_val = x
                val_index = [i]
    return min_val, val_index

def find_max(lst):
    for i, x in enumerate(lst):
        if i == 0:
            max_val = x
            val_index = [i]
        elif max_val == x:
            val_index += [i]
        else:
            if max_val < x:
                max_val = x
                val_index = [i]
    return max_val, val_index

print(find_min([5, 2, 7, 2, 8, 2, 9]))
print(find_max([5, 2, 7, 2, 8, 2, 9]))
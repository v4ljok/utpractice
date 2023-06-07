# Вариант 1

str1 = "abc"
str2 = "bcd"
result = ""

for char in str1:
    if char in str2 and char not in result:
        result += char

print(result)
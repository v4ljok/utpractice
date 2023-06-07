import time

list1 = list(range(5000))
dict1 = {i: i for i in range(5000)}
start_time = time.time()

while len(list1) > 0:
    del list1[0]

end_time = time.time()
list_time = end_time - start_time

print("Время выполнения для списка: " + str(list_time))

start_time = time.time()

for key in dict(dict1):
    del dict1[key]

end_time = time.time()
dict_time = end_time - start_time

print("Время выполнения для словаря: " + str(dict_time))

if list_time < dict_time:
    print("Оператор del быстрее для списков")
else:
    print("Оператор del быстрее для словарей")
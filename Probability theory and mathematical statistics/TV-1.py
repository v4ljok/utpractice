import math

def calculate_probability(surname, name):
    surname_length = len(surname)
    name_length = len(name)
    total_letters = surname_length + name_length

    total_permutations = math.factorial(total_letters)

    surname_permutations = math.factorial(surname_length)
    name_permutations = math.factorial(name_length)

    numerator = surname_permutations * name_permutations

    denominator = total_permutations

    probability = numerator / denominator

    return probability

surname = "Иванов"
name = "Иван"
probability = calculate_probability(surname, name)
print(f"Вероятность вытаскивания букв в порядке: {probability}")

surname = "Smith"
name = "John"
probability = calculate_probability(surname, name)
print(f"Вероятность вытаскивания букв в порядке: {probability}")
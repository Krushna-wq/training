list = [2, 4, 6, 8, 10]

total = 0

for item in list:
    total = item*item

#  print(total)

list2 = [2, 4, 6, 13, 10]

for item2 in list2:
    if item2 == 13:
        break
    # print(item2)


list3 = [1, 2, 3, 4]

total = 0

for item3 in list3:
    total += item3

# print(total)


str = "maharashtra"
str2 = ""

for i in str:
    str2 = i + str2

print(str2)


listF = [10, 20, 30, 40, 50]

first = 0
second = 0

for number  in listF:
    if number > first:
        second = first
        first = number

    elif number > second:
        second = number

print(second)


lists = [1, 2, 3], [4, 5, 6], [7, 8, 9]

flat_list = sum(lists, [])

print(flat_list)

str = "Hello World"

count = 0

for ch in str.lower():
    if ch in "aeiouAEIOU":
        count += 1

print(count)

a = 5


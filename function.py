# def add(a, b):
#     total = a + b
#     return total


# result = add(40, 50)
# print(result)

# def hello():
#     return "hello world"

# print(hello())

# def add2(*nums):
#     return sum(nums)

# print(add2(2, 3, 4, 5, 6, 7, 8, 9))

# def Sub(a, b):
#     total = a - b
#     return total
# print(Sub(7, 4))

# c = 44


# def addition(d):
#     global c
#     total = c + d
#     return total
# print(addition(44))

# AddTwo = lambda x: x + 10
# print(AddTwo(10))


# list1 = [2, 4, 6, 8, 10]

# FindSqr = list(map(lambda x: x * x, list1))
# print(FindSqr)

multipleOPS = lambda x, y: [x + y, x - y]
# print(multipleOPS(4, 4))

str = lambda s: (s.lower(), s.upper())
# print(str("KRUSHNA"))

FindOdd = lambda x: "Even" if x % 2 == 0 else "Odd"
print(FindOdd(4))
print(FindOdd(7))

numbers = [1, 2, 3, 4, 5]


result = list(map(lambda x: f"{x} is Even" if x % 2 == 0 else f"{x} is Odd", numbers))

print(result)


marks = [1, 2, 3, 25, 70, 80]

findMax = list(filter(lambda x: x > 50, marks))
print(findMax)

findAvg = list(map(lambda x: x / len(marks), marks))

#pass keyword 
for i in range(5):
    if i % 2 == 0:
        print(i)
    else:
         pass

def decr(team):
    def wrapper():
        print("hello before calling team")
        team()
        print("hello after calling team")
    return wrapper


@decr
def team():
    print("hello team")


team()

def decorator(func):
    def wrapper(a, b):
        print("Addition is starting...")
        result = func(a, b)
        print("Addition completed.")
        return result
    return wrapper


@decorator
def add(a, b):
    return a + b


print(add(10, 20))


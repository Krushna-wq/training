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

def uppercase_decorator(func):
    def wrapper():
        result = func()
        return result.upper()
    return wrapper


@uppercase_decorator
def greet():
    return "hello team"


print(greet())

def auth(func):
    def wrapper(username, password):
        if username == "admin@123" and password == "password":
            return func()
        else:
            return "Auth Failed"
    return wrapper
    

@auth
def use():
    return "Welcome"
print(use("krushna", "12344"))

def otp_auth(func):
    def wrapper(otp):
        if otp == "123456":
            return func()
        else:
            return "Invalid OTP"
    return wrapper


@otp_auth
def user():
    return "Welcome"


print(user("123456"))

def test():
    yield 1
    yield 2

gen = test()

# print(next(gen))
# print(next(gen))

def count():
    print("Start")
    yield 1

    print("Middle")
    yield 2

    print("End")
    yield 3

gen = count()

print(next(gen))
print(next(gen))
print(next(gen))


def even_num(a):
    for i in range(a+1):
        if i % 2 == 0:
            yield i

g = even_num(5)
# print(next(g))
# print(next(g))
# print(next(g))


def primeNums(a):
    for num in range(2, a + 1):
        is_prime = True
        for i in range(2, num):
            if num % i == 0:
                is_prime = False
                break
        if is_prime:
            yield num


gen = primeNums(20)

print(next(gen)) 
print(next(gen))  
print(next(gen))  
print(next(gen))  
print(next(gen))  


# balance = 5000

# try:
#     amount = int(input("Enter withdrawal amount: "))

#     if amount > balance:
#         raise Exception("Insufficient Balance")

#     balance -= amount

# except ValueError:
#     print("Please enter a valid number")

# except Exception as e:
#     print(e)

# else:
#     print("Withdrawal Successful")
#     print("Remaining Balance:", balance)

# finally:
#     print("Thank you for using the ATM")

arr = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def findTotal():
    total = 0
    for row in arr:
     for num in row:
        total += num
    return total

print(findTotal())

# import re

# password = input("Enter password: ")

# pattern = r"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$"

# if re.match(pattern, password):
#     print("Strong Password")
# else:
#     print("Weak Password")



file = open("data.txt", "w")

file.write("Hello Krushna")

file.close()

file = open("data.txt", "r")

content = file.read()

print(content)

file.close()

file = open("data.txt", "a")

file.write("\nWelcome to Python")

file.close() 
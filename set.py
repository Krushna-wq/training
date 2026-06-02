MySet = set()

print(type(MySet))

NewSet = {4, 5, 6, 7, 8, 9, 10}

NewSet.pop()

print(NewSet)

setA = {1, 2, 3, 4, 5}
setB = {6, 7, 8, 9, 5}

print(setA.union(setB))
print(setA.intersection(setB))

setC = {1, 9, 5, 7, 8, 10}

setC.discard(11)
print(setC)

setC.discard(5)
print(setC)


name = {"Parth", "aaryan", "tanmay", "XYZ", "ABC"}

name.pop()

print(name)

a = 20
b = 30

a ,b = b, a

print("value of a is", a, "value of b is", b)

total = {"amit", "sumit", "suraj"}

present = {"amit", "sumit"}

print(total.difference(present))

listS = ["python is easy and python is powerfull"]

listS.sort()
clean = listS

print(clean)

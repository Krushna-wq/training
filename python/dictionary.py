user = {
    "name": "Alex",
    "age": 24,
    "city": "NY",
    "IsAdmin": "true"
}

print(user["name"])
user["name"] = "Jimmy"

print(user["name"])

print(type(user["IsAdmin"]))

print(user.keys())

user["Marks"] = 34

print(user)

s1 = {
    "name": "parth",
    "Roll NO": 400,
    "subject": "scil"
}

s2 = {
    "name": "krushna",
    "Roll NO": 500,
    "subject": "shd"
}

student = [s1, s2]

print(student)

company = {
    "emp1": {
        "name": "Alice",
        "role": "Developer",
        "skills": ["Python", "SQL"]
    },
    "emp2": {
        "name": "Bob",
        "role": "Designer",
        "skills": ["Figma", "CSS"]
    }
}

# print(company["emp1"][""])

user2 = {
    "ranking": {"first" :"top", "second": "2nd"}

}

print(user2["ranking"]["first"])

stock = {"pen" : 20}
sold = {"pen": 5}

total = stock["pen"] - sold["pen"]

print(total)

marks = {
    "eng" : 85,
    "math": 86,
    "science": 89,
    "sports":94
}

# for mark in marks.value():

total = sum(marks.values())
avg = total / 4;
print(avg)
print(total)


#? Behind the scenes of loops in python
# python uses iterable tools to loop through data structures like lists, tuples, dictionaries, etc. When you use a for loop, Python creates an iterator from the iterable and uses it to access each element one by one.

# iterable tools include: for loops, while loops, list comprehensions, generator expressions, etc. These tools allow you to iterate over data structures and perform operations on each element.

# iterable tools are used to iterat e over iterable objects

file = open('LearningImport.py')
# print(file.readline())
# print(file.read())
# print(file.__next__()) #!raw method for iterating

for line in open('LearningImport.py'):
    a = ""
    # print(line)

f = open('01_basics.py')
while True:
    line = f.readline()
    if not line: break #not checks if its empty string or not
    # print(line)


myList = [1,2,3,4,56,6,7]
I = iter(myList)
print(I)
print(I.__next__())
print(I) #! always point to first index of object no matter what

# Dictonaries are also iterable
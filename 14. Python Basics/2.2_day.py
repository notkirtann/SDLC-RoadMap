
#? mutable and immutable actual concept

username = "notkirtann"
print("Hello",username)
username = "maiKirtanHoon"
print("Hello",username)
# NOTE: username is changeable.

name = "Ronaldo"
name_2 = name
print(name,name_2)
name = "Messi"
print(name,name_2)
# NOTE: name_2 is not changeable 

# jab username bana tha tab usne "notkirtann" value ko point kiya tha. jab username ki value change ki gayi to usne "maiKirtanHoon" value ko point karna start kar diya. toh notkirtan koi point nhi kraa toh automatic garbage collection k through remove hogya.same object ko change nhi kraa new object bana ke usko point krna start kraa.

# same logic for name and name_2. jab dono bane the dono ronaldo value ko point kr rhe the. jab name ki value change ki gayi to usne new object bana ke usko point krna start kraa. toh name_2 abhi bhi ronaldo value ko point kr rha hai. toh name_2 ki value change nhi hui hai.

# ? Object Types / Data types in python
# - Numbers : 1234, 3.14, 2+3j, 0b1010, 0o12, 0x1A, Decimal(10), Fraction(1, 3)
# - Strings : "Hello", 'World', """Python""", '''Programming''' , b'a\x01c', u'sp\xc4m'
# - Lists : [1, 2, 3], ["a", "b", "c"], [1, "a", 3.14]
# - Tuples : (1, 2, 3), ("a", "b", "c"), (1, "a", 3.14)
# - Sets : {1, 2, 3}, {"a", "b", "c"}, {1, "a", 3.14}
# - Dictionaries : {"name": "Alice", "age": 30}, {"name": "Bob", "age": 25}, {"name": "Charlie", "age": 35}
# - Boolean : True, False
# - None : None
# - File Object : open("file.txt", "r"), open("file.txt", "w"), open("file.txt", "a")
# - Function Object : def func(): pass, lambda x: x + 1
# function, module, classes.

# Advance - Implementation-related types: Compiled code, traceback, stack, Decorators, Generators, Coroutines, Asyncio, Context Managers, Iterators, MetaProgramming etc.  


import random
print(random.randint(1, 10))

import math
print(math.sqrt(16))

size = len("Hello World")
print(size)

myList = [1,2,2,3,4,5] # list is nothing but a array in python.

myDict = {"name":"Alice","age":30} # dict is nothing but a hash table in python.

myTuple = (1,2,3) # tuple is nothing but a array in python but it is immutable.
mylist = [1,2,3]
mylist_2 = mylist
print("List1 and List2",mylist,mylist_2)
mylist[0] = 47
print("List1 and List2",mylist,mylist_2)
# NOTE: mylist and mylist_2 dono same list ko point kr rhe the. jab mylist ki [0] value change ki to aur mylist_2 ki [0] value change ho gyi. toh mylist and mylist_2 dono ki value change ho gyi hai. mutable object me jab bhi hum kisi bhi value ko change krte hai to uska effect uske reference variable pe bhi hota hai.
print("------------------------------------------------")
l1 = [1,2,3]
l2 = l1
print("L1 and L2",l1,l2)
l1 = [1,2,3,4]
print("L1 and L2",l1,l2)
# NOTE: l1 and l2 dono same list ko point kr rhe the. jab l1 ki value change ki gayi to usne new list bana ke usko point krna start kraa. toh l2 abhi bhi old list ko point kr rha hai. toh l2 ki value change nhi hui hai.
print("------------------------------------------------")
h1 = [1,2,3]
h2 = h1[:] # NOTE: h1[:] is a slicing operation that creates a new list with the same elements as h1. so h2 is a new list that has the same elements as h1 but it is a different object in memory.
h1 = [1,2,3,4]
print("H1 and H2",h1,h2)
print("------------------------------------------------")
import copy
import_h3 = copy.copy(h1) 
# NOTE: h3 is a new list that has the same elements as h1 but it is a different object in memory. 
h1 = [1,2,3,4,5]
print("H1 and Import-H3",h1,import_h3)
print("------------------------------------------------")
m = [1,2,3]
n = m
print("M == N",m==n)
print("M is N",m is n)

n = [1,2,3]
print("M == N",m==n)
print("M is N",m is n)

# NOTE: m and n dono same list ko point kr rhe the. jab n ki value change ki gayi to usne new list bana ke usko point krna start kraa. toh m abhi bhi old list ko point kr rha hai. toh m ki value change nhi hui hai. m and n dono ki value same hai but dono different object hai memory me. isliye m == n true hai but m is n false hai.

print("------------------------------------------------")
# ? Numbers in python
# - Integers : 1234, -5678, 0   
# - Floating-point : 3.14, -0.001, 2e10
# - Complex : 2+3j, -1-4j
print(7**7)
import math
print(math.pow(7,7))
print(math.sqrt(49))
print(math.ceil(3.14))
print(math.floor(3.14))
print(math.trunc(-5.14))
print(math.fabs(-5.14))
print(math.factorial(5))
a = 2+3j
b = 2-3j
print(a+b)
print(a-b)  
print(a*b)
print("---------BINARY, OCTAL AND HEXADECIMAL NUMBERS---------")
# Number with not being base 10
print(0b111) # binary
print(0o16) # octal
print(0x1A) # hexadecimal

# to find the octal hexadecimal and binary representation of a number we can use oct(), hex() and bin() functions respectively.
print(oct(14)) # octal representation of 14
print(int("14",8)) # to find the decimal representation of an octal number we can use int() function with base 8.
print(hex(26)) # hexadecimal representation of 26
print(int("1A",16)) # to find the decimal representation of a hexadecimal number we can use int() function with base 16.
print(bin(7)) # binary representation of 7
print(int("111",2)) # to find the decimal representation of a binary number we can use int() function with base 2.

# Bits shift operators
print(1<<2) # left shift operator 001 to 100
print(8>>1) # right shift operator 1000 to 0100
print(8>>2) # right shift operator 1000 to 0010
print(1<<1) # right shift operator 001 to 010

# ? Inbuild modules in python
import random
print(random.randint(1, 10))
print(random.choice(["apple", "banana", "cherry"]))
players = ["Ronaldo", "Messi", "Neymar"]
random.shuffle(players)
print(players)

print("------------------------------------------------")
print((0.1 + 0.1 + 0.1) == 0.3) # NOTE: due to the way floating-point numbers are represented in computer memory, the result of this expression is False. This is because the sum of 0.1 + 0.1 + 0.1 is not exactly equal to 0.3 due to precision issues with floating-point arithmetic.
print((0.1 + 0.1 + 0.1) - 0.3) # NOTE: the result of this expression is a very small number close to zero, but not exactly zero. This is because the sum of 0.1 + 0.1 + 0.1 is not exactly equal to 0.3 due to precision issues with floating-point arithmetic.

# solution:
import decimal
print(decimal.Decimal('0.1') + decimal.Decimal('0.1') + decimal.Decimal('0.1') == decimal.Decimal('0.3')) 

#? SETS
mySet = {1, 2, 3, 4, 5, 5}
print(mySet) # NOTE: sets do not allow duplicate values, so the second 5 is ignored.
mySet.add(6)

print(mySet & {4, 5, 6, 7}) # NOTE: this will give us the intersection of the two sets, which is {4, 5, 6}.
print(mySet | {4,5,6,7}) # NOTE: this will give us the union of the two sets, which is {1, 2, 3, 4, 5, 6, 7}.

#@ DIFFERENCE BETWEEN difference and symmetric difference:
# - difference: it will give us the elements that are present in the first set but not in the second set. in this case it will give us {1, 2, 3}.
print(mySet - {4,5,6,7}) # NOTE: this will give us the difference of the two sets, which is {1, 2, 3}.
# - symmetric difference: it will give us the elements that are present in either of the sets but not in both sets. in this case it will give us {1, 2, 3, 7} because 7 is present in the second set but not in the first set.
print(mySet ^ {4,5,6,7}) # NOTE: this will give us the symmetric difference of the two sets, which is {1, 2, 3, 7}.

set1 = {1, 2, 3}
print(set1 - {1,2,3}) # gives us an empty set in this manner #! set()
#@ not empty {} beacause {} is used to create an empty dictionary in python. 
# so to create an empty set we have to use #! set() function.

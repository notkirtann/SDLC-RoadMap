import math

def circle_data(radius):
    area = math.pi * radius ** 2
    circum = math.pi * 2 * radius
    return area,circum

result = circle_data(5)
print(result)
# better approach if you know the return value
area, circum = circle_data(5)
print(area," ",circum)

# ?Lambda Function also unanymous function
cube = lambda x: x**3
print(cube(3))

# ? Multiply arguments to take *args
def multiplr_argument_takes(*args): #! * astrik tell you multiply arguments are the possibilty
    return sum(args)
result = multiplr_argument_takes(1,2,3,4,5,6,7,8,9,10)
print(result)

#? **kwargs
def example_of_kwargs(**kwargs):
    for key,value in kwargs.items():
        print(f"{key}: {value}") 

example_of_kwargs(Name="Kirtan",Role="Developer")

#? Yields 
# Defination: A generator is a special type of iterator that allows you to iterate over a sequence of values without storing them all in memory at once. Instead of returning a single value, a generator yields a sequence of values one at a time, allowing you to iterate through them using a for loop or other iteration tools.
#@ ISSUE WITHOUT YIELD: 
## def even_number(n):
##     for i in range(2,n+1,2):
##         return i
#NOTE: The above code will only return the first even number and then exit the function, which is not what we want. We want to return all even numbers up to n, which is where yield comes in handy. 

def even_numbers_without_yield(n):
    even_numbers = []
    for i in range(2,n+1,2):
        even_numbers.append(i)
    return even_numbers
print(even_numbers_without_yield(10))
#problem with above code is that it creates a list of even numbers in memory, which can be inefficient for large values of n.
#@ SOLUTION WITH YIELD:
def even_numbers_with_yield(n):
    for i in range(2,n+1,2):
        yield i
even_numbers_with_yield(10) #! this will not return anything because its a generator object
for even in even_numbers_with_yield(10):
    print(even)

#? Recursive function
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)
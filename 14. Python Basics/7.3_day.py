
#? SCOPES AND CLOSURES:
# A closure is a function that retains access to its lexical scope, even when the function is executed outside of that scope. This means that a closure can access variables from its enclosing scope, even after the outer function has finished executing.
# Example of closure:
def outer_function(x):
    def inner_function(y):
        return x + y
    return inner_function
closure = outer_function(10)
print(closure(5)) # Output: 15

# ? Scope: The scope of a variable is the region of the program where the variable is defined and can be accessed. In Python, there are four types of scopes: local, enclosing, global, and built-in.
# Example of scope:
Number = 10
def outer_function():
    Number = 20
    print(Number) 
outer_function() # Output: 20
print(Number) # Output: 10

# ? changing global variable inside a function
def change_global_variable():
    global Number
    Number = 30 
change_global_variable()
print(Number) # Output: 30

def f1():
    x = 10
    def f2():
        print(x)
    return f2
closure = f1()
closure() # Output: 10
#NOTE: explaining closure from above code: hame lga tha x unkown hoga lekin jab x = 10 print hua kyuki f2 jab f1 ke andar f2 ki defination gyi thi uske saath hi sath saare associated variables bhi closure ke andar aa gaye the isliye x ki value 10 print hui. 

#? FACTORY FUNCTION:
def multiplier(n):
    def multiply(x):
        return x * n
    return multiply
double = multiplier(2)
triple = multiplier(3)
print(double(5)) # Output: 10
print(triple(5)) # Output: 15 

# DEFINATION: A factory function is a function that returns another function. It is a way to create functions dynamically based on certain parameters or conditions. Factory functions are often used to create closures, which are functions that retain access to their lexical scope even after the outer function has finished executing.

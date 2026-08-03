
#? learn about decorators:
#@ In Python, decorators are a powerful tool for modifying the behavior of functions or methods. Decorators allow you to wrap another function in order to extend its behavior without permanently modifying it. They are often used for logging, access control, memoization, and more. 

#! Example 1: A simple decorator that logs the execution time of a function.

import time
def timer(func):
    def wrapper(*args, **kwargs):
        start_time = time.time()
        result = func(*args, **kwargs)
        end_time = time.time()
        print(f"Execution time: {end_time} - {start_time} seconds")
        return result
    return wrapper

@timer
def example_function():
    time.sleep(2)  # Simulate a time-consuming task
    return "Function completed"

print(example_function())  

#! Example 2: A decorator that checks if a user is authenticated before allowing access to a function.
def requires_authentication(func):
    def wrapper(user, *args, **kwargs):
        if not user.get("authenticated", False):
            raise Exception("User is not authenticated")
        return func(user, *args, **kwargs)
    return wrapper

@requires_authentication
def access_sensitive_data(user):
    return "Sensitive data accessed"

# ! Example 3: Printing function name and arguments using a decorator every time a function is called.
def log_function(func):
    def wrapper(*args, **kwargs):
        print(f"Function '{func.__name__}' called with arguments: {args} and keyword arguments: {kwargs}")
        return func(*args, **kwargs)
    return wrapper


@log_function
def add(a, b):
    return a + b

print(add(5, 3))

@log_function
def greet(name):
    return f"Hello, {name}!" 
print(greet("Alice"))   

# Example 4: A decorator that caches the results of a function to improve performance (memoization).
def memoize(func):
    cache = {}
    def wrapper(*args):
        if args in cache:
            return cache[args]
        result = func(*args)
        cache[args] = result
        return result
    return wrapper

@memoize
def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)
print(fibonacci(10))  # Output: 55
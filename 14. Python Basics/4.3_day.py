
#? Tuples in Python
#! List Vs Tuple
# List is mutable, Tuple is immutable
# List is defined using [], Tuple is defined using ()
# Creating a tuple
my_tuple = (1, 2, 3, 4, 5)

#! Accessing elements in a tuple
print(my_tuple[0])  # Output: 1
print(my_tuple[1:4])  # Output: (2, 3, 4)
#@ Tuples can contain different data types
mixed_tuple = (1, "Hello", 3.14, [1, 2, 3])
print(mixed_tuple)  # Output: (1, 'Hello', 3.14, [1, 2, 3])
#@ Tuples are immutable, so we cannot change their elements  
# my_tuple[0] = 10  # This will raise a TypeError
#NOTE: However, we can concatenate tuples to create a new tuple
new_tuple = my_tuple + (6, 7, 8)
print(new_tuple)  # Output: (1, 2, 3, 4, 5, 6, 7, 8)

#! We can also use the tuple() constructor to create a tuple from an iterable
list_to_tuple = [1, 2, 3, 4, 5] 
tuple_from_list = tuple(list_to_tuple)
print(tuple_from_list)  # Output: (1, 2, 3, 4, 5)

#! Tuples can be used to return multiple values from a function
def get_coordinates():
    return (10, 20)
coordinates = get_coordinates()
print(coordinates)  # Output: (10, 20)

#! Using tuple unpacking to assign values to variables
clubs = ("Real Madrid", "Barcelona", "Manchester United")
(madrid, barca, man) = clubs
print(madrid)  # Output: Real Madrid
print(barca)   # Output: Barcelona  
print(man)     # Output: Manchester United


#? DEFINATION OF STATIC METHOD: 
#@ A static method is a method that belongs to a class rather than an instance of the class. It can be called on the class itself, rather than on an instance of the class. Static methods are defined using the @staticmethod decorator and do not have access to the instance (self) or class (cls) variables. They are typically used for utility functions that perform a specific task related to the class but do not require access to instance or class data.

class Car:
    __total_cars = 0 #! class variable to keep track of total cars created

    def __init__(self,brand,model):
        self.brand = brand
        self.model = model
        Car.__total_cars += 1 #! increment total cars count whenever a new car is created
    
    def acknowledge(self):
        return f"This is a {self.brand} {self.model}"
    
    @staticmethod
    def static_method_example():
        return f"This is a static method example and Car Count: {Car.__total_cars}"

class ElectricCar(Car):
    def __init__(self,brand,model,battery_capacity):
        super().__init__(brand,model) #! super() is used to call the parent class constructor
        self.battery_capacity = battery_capacity
    
Tesla=ElectricCar("Tesla","Model S",100)
Lambo=Car("Lamborghini","Aventador")
Merc=Car("Mercedes","C-Class")

print(isinstance(Tesla,Car))
print(isinstance(Tesla,ElectricCar))
print(isinstance(Lambo,Car))
print(isinstance(Lambo,ElectricCar))

print(Car.static_method_example()) # Output: This is a static method example and Car Count: 3
#print(Car.__total_cars) #!  __total_cars is a private class variable and cannot be accessed directly from outside the class.

# ? Decorators
# Defination of Decorators: A decorator is a design pattern in Python that allows you to modify the behavior of a function or class method without changing its source code. Decorators are typically used to add functionality to existing functions or methods in a clean and reusable way. They are defined using the @ symbol followed by the decorator function name, and they can be applied to any function or method.

#! @property decorator example
class Circle:
    def __init__(self,radius):
        self.__radius = radius #! private attribute
    
    @property
    def radius(self):
        return self.__radius
    
    @staticmethod
    def Hello():
        return "Hello static method"
    
circle = Circle(5)
# circle.__radius = 10 #NOTE: This will not change the radius because __radius is a private attribute and cannot be accessed directly from outside the class.
print(circle.radius) # Output: 5

print(Circle.Hello()) # Output: Hello static method


#? Multiple Inheritance Example
class A:
    def method_a(self):
        return "Method A from class A"  
    
class B:
    def method_b(self):
        return "Method B from class B"

class C(A,B):
    def method_c(self):
        return "Method C from class C"

c = C()
print(c.method_a()) 
print(c.method_b()) 
print(c.method_c()) 

#? OOPS: Object Oriented Programming System
# !Class:
# @A class is a blueprint for creating objects. It defines a set of attributes and methods that the objects created from the class will have.
# !Object: 
# @An object is an instance of a class. It is a self-contained entity that has its own state and behavior. Objects are created from classes and can interact with each other through their methods and attributes.
# !Inheritance: 
# @Inheritance is a fundamental concept in object-oriented programming that allows a new class (called a child class or subclass) to inherit attributes and methods from an existing class (called a parent class or superclass). This promotes code reusability and establishes a natural hierarchical relationship between classes.
# !Polymorphism: 
# @Polymorphism is the ability of different classes to be treated as instances of the same class through a common interface. It allows objects of different classes to be used interchangeably, as long as they implement the same methods or attributes.
# !Encapsulation: 
# @Encapsulation is the practice of bundling data (attributes) and methods that operate on that data into a single unit (class) and restricting access to some of the object's components. This is typically achieved through the use of access modifiers (like private, protected, and public) to control the visibility of attributes and methods.

class Car:
    def __init__(self,brand,model):
        self.brand = brand
        self.model = model
    
    def acknowledge(self):
        return f"This is a {self.brand} {self.model}"

lambo = Car("Lamborghini","Aventador")
print(lambo.brand) # Output: Lamborghini
print(lambo.model) # Output: Aventador

mercedes = Car("Mercedes","C-Class")
print(mercedes.brand) # Output: Mercedes
print(mercedes.model) # Output: C-Class

print(lambo.acknowledge()) # Output: This is a Lamborghini Aventador
print(mercedes.acknowledge()) # Output: This is a Mercedes C-Class

#? Inheritance example
class ElectricCar(Car):
    def __init__(self,brand,model,battery_capacity):
        super().__init__(brand,model) #! super() is used to call the parent class constructor
        self.battery_capacity = battery_capacity
    
    def acknowledge(self):
        return f"This is an electric car: {self.brand} {self.model} with a battery capacity of {self.battery_capacity} kWh"

tesla = ElectricCar("Tesla","Model S",100)
print(tesla.acknowledge()) # Output: This is an electric car: Tesla Model S with a battery capacity of 100 kWh

#? Encapsulation example
class BankAccount:
    def __init__(self,account_number,balance):
        self.account_number = account_number
        self.__balance = balance #! private attribute
    
    def deposit(self,amount):
        self.__balance += amount
    
    def withdraw(self,amount):
        if amount > self.__balance:
            print("Insufficient funds")
        else:
            self.__balance -= amount
    
    def get_balance(self):
        return self.__balance

account = BankAccount("123456789",1000)
account.deposit(500)
account.withdraw(200)

#print(account.__balance) #!Output: AttributeError: 'BankAccount' object has no attribute '__balance' because __balance is a private attribute and cannot be accessed directly from outside the class.

print(account.get_balance()) # Output: 1300

#? Polymorphism example
class Dog:
    def speak(self):
        return "Woof!"
class Cat:
    def speak(self):
        return "Meow!"
    
def animal_speak(animal):
    print(animal.speak())
dog = Dog()
cat = Cat()
animal_speak(dog) # Output: Woof!
animal_speak(cat) # Output: Meow!    
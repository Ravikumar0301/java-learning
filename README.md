# java-learning
### Java class:
Java is object-oriented programming language.
Everything in java is associated with classes and objects, along with these attributes and methods
For Example in real life
*     car is a object
*     car weight and color is a attribute
*     drive and brake is a method
A class is like an object constructor, or a blueprint for creating objects("car")

#### Create a class with attributes and methods:
to create a class, use the keyword "class"
class name start with "uppercase" letter
    ([example code](src/Class/Car.java))

#### Java Constructors:
used to initialize the objects
called when an object of class is created
can be used to set initial values for object attributes
name must match with class name
cannot have a return type like void method
if we not create constructor java will create a constructor for yourself, because all classed have a own constructors
constructor will take values as a parameters, which is used to initialize the class attributes
    [example code](src/Class/Constructors.java)

#### Java Modifiers:
used to set the access level for classess, attributes, methods and constructors
modifiers are divide into two groups :
*     Access modifiers - allows the control level 
*     Non access modifiers - do not allows the control level

##### Access modifiers - allows the control level:
For **classes** we can use either **public** or **default**
1. **public:** the class is accessible by other classes
2. **default:**  the class is only accessible by same package, this is used when you don't use a modifier

For **attributes**, **methods** and **constructors** you can use one of the following list
1. **public:** code accessible by other classes
2. **private:** code accessible within the declared class
3. **default:** code accessible by same package, this is used when you don't use a access modifier
4. **protected:** code accessible in the same package and subclasses.
   example code

##### No Access modifiers - do not allow the control level:

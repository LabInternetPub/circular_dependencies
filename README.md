# Circular Dependencies

A circular dependency happen when one class depends on another class that in turn depends on the first one. In a circular dependency more than two classes may be involved (the more classes there are involved the more difficult it is to detect them).

Circular dependencies are usually a **design flaw** but sometimes (I mean very few times) it may be justified to have one. 

To create objects of the classes involved in a circular dependency we need to create an object of the two (or more) classes involved without having the refence to the object of the other class. For doing so, we cannot use the *constructor injection* since we don't have the reference to the other class object in creation time. As you may have guessed we will need to use the *setter injection* creating first the two objectes and then setting the cross references with their set methods.

In the code you'll find two classes:
* ClassA_NeedsB: a class that has a reference to ClassB_NeedsA
* ClassB_NeedsA: a class that has a reference to ClassA_NeedsB

Both classes have the @Component annotation to ask Spring to create an object of their type. Once the objects are created Spring authomatically sets the crossed references by calling the corresponding set methods. Note that the @Autowired annotations are not needed since Spring knows that the references must be initialized and it finds the method for doing so. Actually it looks for a method with a name of the form *setAttributeName(AttributeType param)* 

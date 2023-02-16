Set 5 :
47. Why Java does not allow overriding a static method?

Because method overrides are based on dynamic binding at runtime, static methods are bound at compile time using static binding

48. Is it allowed to override an overloaded method?

Yes


49. What is the difference between method overloading and method
overriding in Java?

Method overloading refers that we can define mutiple methods with same name is the same class, but with different parameters. like parameter numbers, types, orders.
Method overriding refers that we can define a method in a subclass that has the same method name, same method signature, with in parent class.

50. Does Java allow virtual functions?

When a method is invoked on an object in Java, the JVM determines which implementation of the method to call based on the actual type of the object at runtime. If the object is an instance of a subclass that has overridden the method, the JVM will call the subclass's implementation of the method.



51. What is meant by covariant return type in Java?
covariant return type in Java allows a subclass to override a method in its superclass and return a more specific type without violating the method signature or causing a runtime error.



Polymorphism

52. What is Runtime Polymorphism?
Also called dynamic binding, it generally refers to determining the actual type of the referenced object during execution (not during compilation), and judging and calling the corresponding properties and methods based on the actual type.

53. Is it possible to achieve Runtime Polymorphism by data members in
Java?

54. Explain the difference between static and dynamic binding?

static binding occurs at compile-time and is used for static, private, final or overloaded methods, while dynamic binding occurs at runtime and is used for overridden methods.


Abstraction


55. What is Abstraction in Object Oriented programming?

It involves creating simplified models or interfaces that hide the complexity of the underlying system.

56. How is Abstraction different from Encapsulation?

Abstraction focus on the common method behavior without implementation, it ignore the details.
Encapsulation is for hiding the impelmentation details of object. for controlling access it its internal state.


57. What is an abstract class in Java?

An abstract class in Java is a class that cannot be instantiated, but instead of designed to subclass. It can contain both abscreat method and non-abstrat method.  Typically, used to define a common method bahevior that shared by its subclass. each subcalss could have different implementation.

58. Is it allowed to mark a method abstract method without marking the
class abstract? ?

No, abstract method must be in abstract cllass. If a method is defined as abstract, it means that it hasnot implementation.

59. Is it allowed to mark a method abstract as well as final?

No, abstract method is one that is declared without an implementation and must be implemented by any concrete subclasses.
However,  final method is one that cannot be overridden by any subclasses.  So it's conflict.

60. Can we instantiate an abstract class in Java?

No, abstract class is designed to be extennded by its subclass. 
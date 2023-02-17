Set 6
61. What is an interface in Java?

1） decleared with the keyword interface
2)  It is essentially a collection of method signatures, without any implementation details.


62. Is it allowed to mark an interface method as static?

Yes, the static method in interface is different in the class
When method in inteferface is defined as static, it will associate with the interface itself, rather than with any particular implementation of the interface. 


63. Why an Interface cannot be marked as final in Java?

The final keyword indicates that a class or method cannot be extended or overridden. However, the interface is designed to  be implemented by classes.


64. What is a marker interface?

a marker interface is an interface that does not have any method declarations, but is used to signal or mark a particular characteristic. like  'java.io.Serializable'

65. What can we use instead of Marker interface?
annotations


66. How Annotations are better than Marker Interfaces?

Annotations can provide more information than marker interfaces.  Marker Interfaces could only provide singal role.

67. What is the difference between abstract class and interface in Java?
1) abstract class could have constructor
2) abstract class could have variable and could have the implementations of methods. But interface could only have method signature.
3) class could implement a lot of interface, but could have only extend one abstract class


68. Does Java allow us to use private and protected modifiers for variables in interfaces?

Yes,

 A variable in an interface can be marked as private, but it can only be accessed within the same interface. It cannot be accessed from any implementing class or interface.

 'protected': it can only be accessed within the same interface or within a subclass of an implementing class.


69. How can we cast to an object reference to an interface reference?


Final
70. How can you change the value of a final variable in Java?

Normally ,if a variable with final is primitive, then it could not be changed
But, if we are using final with an obejct or array, then we could change its content.

71. Can a class be marked final in Java?

Yes, When a class is marked as final, it cannot be extended by any subclass


72. How can we create a final method in Java?

using the final keyword before the method declaration

73. How can we prohibit inheritance in Java?
can prohibit inheritance for a class by marking it as final


74. Why Integer class in final in Java?

guarantee that the behavior of the class cannot be modified by any third-party library or code.

75. What is a blank final variable in Java?
blank final variable is a final variable that is not initialized when it is declared. A blank final variable must be initialized before it can be used, and it can only be initialized once.

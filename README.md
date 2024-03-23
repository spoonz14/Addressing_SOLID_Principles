For my project; I chose Interface Segregation Principle, Liskov Substitution Principle, and Single Responsibility Principle.

ISP is important because it enhances the modularity of the program, and reduces the coupling of interfaces and classes, this means changes to one part of the program are less likely to affect another.

ISP is violated in my program by creating an interface with methods for 2 different types of classes.  When implementing it into each class, the unnecessary methods MUST be implemented since they are in the interface.  The solution was simply to create 2 different interfaces for the 2 classes to inherit from.

LSP is important because it allows objects of  a superclass to be replaced by objects of its subclasses without altering the correctness of the program.  It also allows code to be reused very efficiently since it ensures subclasses and superclasses can be used interchangeably.

LSP is violated in my program by creating a Rectangle superclass and a Square subclass, but Square is not substitutable with the Rectangle class in every context.  We solve the violation by using an interface called Shape this time; in which both Square and Rectangle will implement.

SRP is important because it again helps to ensure modularity; so that when one class is modified it doesn't break the entire program.  

SRP in my program is violated by creating a BankAccount class with methods to handle account information, as well as transactions/money transfer.  The solution is to break those 2 responsibilities up into two different classes.

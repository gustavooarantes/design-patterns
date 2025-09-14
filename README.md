# Design Patterns

- Abstract Factory - provide an interface for creating families of related or dependent objects without specifying their concrete classes.

- Adapter - convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

- Bridge - decouple an abstraction from its implementation so that the two can vary independently.

- Builder - separate the construction of a complex object from its representation so that the same construction process can create different representations.

- Chain of Responsibility - avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

- Command - encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

- Decorator - attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

- Facade - provide an unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

- Factory Method - define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

- Flyweight - use sharing to support large number of fine-grained objects efficiently.

- Interpreter - given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

- Iterator - provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

- Mediator - define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

- Memento - without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

- Observer - define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

- Prototype - specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

- Proxy - provide a surrogate or placeholder for another object to control access to it.

- Singleton - ensure a class only has one instance, and provide a global point of access to it.

- State - allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

- Strategy - define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

- Template Method - define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

- Visitor - represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

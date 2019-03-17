# Decorator-Pattern-Example
Java Decorator Pattern Example - Waffle Shop with UML Diagram


## Statement of Work

Waffle Shop is a café that sells waffles . When customers arrive at this cafe,
they design the waffle they want according to the kinds of waffles, their
ingredients and their prices. The waitress delivers these orders to the cook
from the customer. The cook is responsible for making the waffle. We will
prepare an order system in which we will check the company's waffle orders.
We have to act with some problems in creating this system. For example,
there is a waffle order from the customer. The customer wanted for a waffle
with strawberry and white chocolate sauce. We need to expand the
functionality of the class in a transparent and dynamic way. Here ,we will pay
attention to this.

## Design Pattern(s)

Decorator design pattern are applied for solving existing problems in the
project. Decorator pattern lets you dynamically change the behavior of an
object at run time by wrapping them in an object of a decorator class.
In real world, imagine you run a car service shop offering multiple services.
Now how do you calculate the bill to be charged? You pick one service and
dynamically keep adding to it the prices for the provided services till you get
the final cost. Here each type of service is a decorator.

In my example, I am using decorator pattern because in waffle shop people
comes and orders one base waffle from our options and they are adding some
fruits and sauces whatever they want. So I will create base waffle classes as
ConcreteComponent and we will create decorators like chocolate, fruits, sauce
as ConcreteDecorator. For example, When I order a waffle, firstly I pick dough
of waffle. Then I’m adding Nutella chocolate on waffle dough and I’m choosing
fruits(like strawberry,bananas,pineapple). Then top of the waffle, I’m adding
white chocolate sauce and nut, almond pieces. It is ready! Mmm awesome.
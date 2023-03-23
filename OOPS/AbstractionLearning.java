/**
1. A method without body(no implementation) is known as abstarct method.
2. A method must always be declared in an abstract class or we can say that itf a class has an abstract method,the class should be declared abstract as well.
3. If a regular class extends an abstract class then the class must have to implement all the abstract methods of abstract parent class or it has to be declared abstract.
4. Abstract classses cannot be instantiated,means we cant create an object of abstract class.

 */

 abstract class Vehicle{
    int no_of_tyres;
    abstract void start();
 }

 class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
 }

  class Scooter extends Vehicle{
    void start(){
        System.out.println("Scooter starts with kick");
    }
    public static void main(String args[]){
        Car c = new Car();
        Scooter s = new Scooter();

        c.start();
        s.start();
    }
 }
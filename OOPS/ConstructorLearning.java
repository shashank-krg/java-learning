/**
-> It is a nlock similiar to method having same name as class name;
-> there is no return type of it even void.
-> the only modifiers applicabe for constructor is public,private,default,protected
-> It invokes automatically when create object in the class
-> Constructor is basically use to initialize an object.
There are three type of constructor:
1. Default constructor(no argument constructor) created by compiler when we create an object if user not creates any
2. No Argument constructor(user defined)
3. Parametrized constructor(User sends parameter while creating an object)

 */

 class ConstructorLearning{
    String name;
    int id;

    ConstructorLearning(String name,int id){
        this.name = name;
        this.id = id;
    }

    public static void main(String []args){
        ConstructorLearning cl = new ConstructorLearning("Shashank",101);
        ConstructorLearning cl1 = new ConstructorLearning("Rahul",201);

        System.out.println("Name of the Employee is " +cl.name+ " and ID is "+cl.id);
        System.out.println("Name of the Employee is " +cl1.name+ " and ID is "+cl1.id);
    }

 }
/**
1. It is used to achive 100% abstraction.
2. Multiople inheritance can be achieved by this.
3. losse coupling achived by it.
4. Only abstract method can be declared in interface. not any concrete method,,,After 8 versio we can do it.
5. we can create concrete method in interface using default and static keyword(default void display(){} or static void display(){})
6. In interface all variable will be of type public static final, if you will write it then its ok otherwise compiler does it for you.
7.
 */ 

 interface I1{
    void show();
 }
  interface I2{
    void display();
 }

 class Test implements I1,I2{
    public void show(){
        System.out.println("!");
    }
      public void display(){
        System.out.println("2");
    }
    public static void main(String args[]){
        Test t = new Test();
        t.show();
        t.display();
    }
 }
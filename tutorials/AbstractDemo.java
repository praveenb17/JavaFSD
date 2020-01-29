// abstract in Java

    // abstract method is the one which doesn't have body
    // abstract class can have 0 to n abstract methods
    // abstract class can contain non abstract methods

abstract class Human{
    void breathe(){
        System.out.println("Generic breathe");
    }
     
     //method cannot be abstract and final at the same time, it gives error
    // Also it cannot be private and abstract at the same time, it gives error
     abstract void eat();
     abstract void run();
}
 
 
 
class Sameer extends Human{
     
    /*  subclass can declare as abstract so that it's no need to,
        override the abstract methods in superclass
        But it's not suggested to declare subclass as abstract because it 
        can't be insantiated from anywhere
        which is this object can't get created as it is abstract class. 
        Hence if we wants to prevent the 
        class from creating it's objects we can declare it as abstract.
    */

    @Override 
    //Because abstract methods which are in superclass must be overrided in subclass

    void eat(){
        System.out.println("Sameer can eat in his own way...");
    }
 
    @Override
    void run(){
        System.out.println("Sameer can run in his own way...");
    }
 
 
}
 
class Rashmi extends Human{
 
    void swim(){
        System.out.println("Rashmi's own swim...");
    }
}
 
 
class AbstractDemo{
    public static void main(String[] args) {
         Sameer ref = new Sameer();
         ref.breathe();
         ref.eat();
 
        // Rashmi ot = new Rashmi();
        // ot.breathe();
        // ot.eat();
         
    }
}
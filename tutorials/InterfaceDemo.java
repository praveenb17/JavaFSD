//interface in Java
    //inside interfacae all the methods should be abstract and public
    //Hence all the methods in interface are public and abbstract by default
    
    //methods in interface cannot be changed to other scope

    //if class wants to inherit from interface then keyword "implements" should be used
    
    //Keyword "new" can't be used within interface, that means objects can't be created for interface

    //inheritance using interface is called "type inheritance"

    //instance variables inside interface are public, static and final by default

interface Human{
 
     int VAR = 98;
 
     void breathe();
     void eat();
     void run();
 
     static void talk(){
        System.out.println("Generic talk, added later on...");
     }
}
 
//new Human();//Banned
 
interface Employee extends Human{ //interface inheriting from other interface should use the keyword "extends"
    void work();
}
 
interface Warrior{
    void fight();
    void run();
}
 
class Sameer implements Human, Warrior{ //multiple inheritance is allwed from the interfaces
 
    @Override
    public void fight(){
        System.out.println("Sameer fights well...");
    }
     
    @Override
    public void eat(){
        System.out.println("Sameer can eat in his own way..." + Human.VAR);
    }
 
    @Override
    public void run(){
        System.out.println("Sameer can run in his own way...");
    }
 
    @Override
    public void breathe(){
        System.out.println("Sameer can breathe in his own way...");
    }
 
 
}
 
 
 
 
 
class Rashmi implements Employee{
 
    @Override
    public void work(){
        System.out.println("Rashmi's work...");
    }
 
    @Override
    public void eat(){
        System.out.println("Rashmi can eat in her own way..." + Human.VAR);
    }
 
    @Override
    public void run(){
        System.out.println("Rashmi can run in her own way...");
    }
 
    @Override
    public void breathe(){
        System.out.println("Rashmi can breathe in her own way...");
    }
 
    void swim(){
        System.out.println("Rashmi's own swim...");
    }
}
 
 
class InterfaceDemo{
    public static void main(String[] args) {
         Sameer ref = new Sameer();
         ref.breathe();
         ref.eat();
 
        // Rashmi ot = new Rashmi();
        // ot.breathe();
        // ot.eat();
         
    }
}
// Run time polymorphism

class RuntimePolyDemo{
    public static void main(String[] args) {
 
        //new Human();//ERROR
 
 
        // Human ref = new Sameer();
 
        // ref.eat();
        // ref.breathe();
         
 
        // ref = new Rashmi(); //IS-A
 
        // ref.eat();
        // ref.breathe();
 
        // ref.swim();
 
 
 
 
 
 
         Human []arr = new Human[3]; //IS-A
  		
  		//array in local always has default values, arr is of type Human therefore default values are null
 
          
 
         // // arr[0].eat();
 
         // arr[0] = new Sameer();
 
         // arr[0].eat();
 
 
 
         arr[0] = new Sameer();
         arr[1] = new Sameer();
         arr[2] = new Rashmi();
 
 
         for(Human ref : arr){
            ref.eat();
 
            if(ref instanceof Rashmi){
                ((Rashmi)ref).swim();
                 
            }
         }
 
 
         // arr[0].eat();
         // arr[1].eat();
         // arr[2].eat();
         // arr[2].swim();
 
 
 
        // char []arr = new char[10];
 
        // Sameer []sam = new Sameer[5];
 
        // sam[0] = new Sameer();
 
        // sam[3] = new Sameer();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    }
}
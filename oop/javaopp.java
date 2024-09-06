package oop;

public class javaopp {
    static class KIIT{
        int roll;
        String Name;
    KIIT(int roll,String Name){
        this.Name=Name;
        this.roll=roll;
    }
    //function overloading or Polymorphism
    public void print(int roll,String name){
        System.out.println("Name="+this.Name+"\nRoll="+this.roll);
    }
    public void print(String name){
        System.out.println("Name="+this.Name+"\nRoll="+this.roll);
    }
    public void print(int roll){
        System.out.println("Name="+this.Name+"\nRoll="+this.roll);
    }
    };
    
    public static void main(String[] args) {
        
        KIIT bacche=new KIIT(2128000, "Satya");
        bacche.print();

    }
}

package oop;

public class javaopp {
    static class KIIT{
        int roll;
        String Name;
    KIIT(int roll,String Name){
        this.Name=Name;
        this.roll=roll;
    }

    public void print(){
        System.out.println("Name="+this.Name+"\nRoll="+this.roll);
    }
    };
    
    public static void main(String[] args) {
        
        KIIT bacche=new KIIT(2128000, "Satya");
        bacche.print();

    }
}

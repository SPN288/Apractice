package oop;

public class javaopp {

    static class KIIT {

        int roll;
        String Name;

        
        //function overloading or Polymorphism

        public void print(int roll, String name) {
            System.out.println("Name=" + this.Name + "\nRoll=" + this.roll);
        }

        public void print(String name) {
            System.out.println("Name=" + this.Name);
        }

        public void print(int roll) {
            System.out.println("Roll=" + this.roll);
        }
    };
    //Inheritance
    static class Student extends KIIT{
        String branch;

        void print(){
            System.out.println("Name="+Name+"\nRoll="+roll+"\nBranch="+branch);
        }
        

    };

    public static void main(String[] args) {

        KIIT bacche = new KIIT();
        bacche.Name="Sam";bacche.roll=1;
        bacche.print(2128000, "satya");
        bacche.print("satya");
        bacche.print(2128000);
        Student s1=new Student();
        s1.Name="jack";
        s1.roll=9089;
        s1.branch="CSE";
        s1.print();

    }
}

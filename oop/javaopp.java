package oop;

public class javaopp {

    static class KIIT {

        int roll;
        String Name;

        KIIT(int roll, String Name) {
            this.Name = Name;
            this.roll = roll;
        }
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
    static class Student extends KIIT{

        public Student() {
            super(0, null);
        }
        

    };

    public static void main(String[] args) {

        KIIT bacche = new KIIT(2128000, "Satya");
        bacche.print(2128000, "satya");
        bacche.print("satya");
        bacche.print(2128000);
        Student s1=new Student();
        s1.Name="jack";
        s1.roll=9089;
        s1.print(33, "jk");

    }
}


import java.util.ArrayList;

class ArratLis{
    static class MinStack {

        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> min=new ArrayList<>();
        int top=-1;
    
        public MinStack() {
            
        }
        
        public void push(int val) {
            al.add(val);
            top++;
            if(min.isEmpty()){
                min.add(val);
            }else{
                if(val<min.get(min.size()-1)){
                    min.add(val);
                }else{min.add(min.get(min.size()-1));}
            }
        }
        
        public void pop() {
            min.remove(min.size()-1);
            al.remove(top);
            top--;
        }
        
        public int top() {
           return al.get(top);
        }
        
        public int getMin() {
            return min.get(min.size()-1);
        }
        public void print(){
            System.out.println(al);
            System.out.println(min);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MinStack ms=new MinStack();
        ms.push(0);
        ms.push(1);
        ms.push(0);
        ms.print();
        System.out.println(ms.getMin());
        ms.pop();
        ms.print();
    }
}
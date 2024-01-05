import java.util.Stack;
public class StackExample{
public static void main(String[]args){
//creating an instance of Stack class
Stack<Integer> stk = new Stack<>();
//checking stack is empty or not
boolean result = stk.empty();
System.out.println("IS the stack empty " + result);
stk.push(78);
stk.push(90);
stk.push(113);
stk.push(120);
result = stk.empty();
System.out.println("IS the stack empty " + result);

System.out.println("Element is stack" + stk);
stk.pop();
System.out.println("Element is stack" + stk);
stk.pop();
System.out.println("Element is stack" + stk);
stk.pop();
System.out.println("Element is stack" + stk);
stk.pop();
System.out.println("Element is stack" + stk);
stk.pop();

}
}
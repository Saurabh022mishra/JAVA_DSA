public class Stak{
int size;
int arr[];
int top;
Stak(int size){
this.size=size;
this.arr = new int[size];
this.top = -1;
}
public boolean isEmpty(){
return (top==-1);
}
public boolean isFull(){
return (size-1==top);
}
public int peek(){
if(!this.isEmpty()){
return arr[top];
}else{
System.out.println("Stak is empty");
return -1;
}
}
public void push(int element){
if(!isFull()){
top++;
arr[top]=element;
System.out.println("pushed element is : " +element);
}
else{
System.out.println("Stack is full now");
}
}
public int pop(){
if(!isEmpty()){
int returnedTop=top;
top--;
System.out.println("pooped element : " + arr[returnedTop]);
return arr[returnedTop];
}
else{
System.out.println("Stak is empty");
return -1;
}
}
public static void main(String[]args){
Stak s = new Stak(3);
s.pop();
s.pop();
System.out.println("-----------");
s.push(100);
s.push(200);
s.push(300);
System.out.println(s.peek() + " Top element");
s.pop();
System.out.println(s.peek() + " Top element");
s.pop();
System.out.println(s.peek() + " Top element");
s.pop();
System.out.println(s.peek() + " Top element");
s.pop();
System.out.println(s.peek() + " Top element");
s.pop();
}
}
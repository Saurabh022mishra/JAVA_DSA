class Stack_1{
static final int MAX =5;
int top;
int a[] = new int[MAX]; //Maximum size of stack

boolean isEmpty(){
return(top<0);
}
Stack_1(){
top = -1;
}
boolean push(int x){
if(top >= (MAX-1)){
System.out.println("stack overflow");
return false;
}else{
a[++top] = x;
System.out.println(x + " pushed into stack");
return true;
}
}

int pop(){
if(isEmpty()){
System.out.println("Stack underflow");
return 0;
}else{
int x = a[top--];
return x;
}
}
int peek(){
if(isEmpty()){
System.out.println("Stack underflow");
return 0;
}
else{
int x = a[top];
return x;
}
}
public static void main(String[]args){
Stack_1 s = new Stack_1();
s.pop();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
s.push(60);
System.out.println(s.peek()+ " Top Element" );
System.out.println(s.pop() + "Item popped");
}
}
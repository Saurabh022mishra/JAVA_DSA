class Stackj{
private int arr[];
private int top;
private int capacity;
//Creating a stack
Stackj(int size){
arr = new int[size];
capacity= size;
top = -1;
}
//add elements into stack

public void push(int x){
if(isFull()){
System.out.println("OverFlow\nProgram Terminated\n");
System.exit(1);
}
System.out.println("Inserting " + x);
arr[++top] = x;
}
//Remove element from stack
public int pop(){
if(isEmpty()){
System.out.println("Stack Empty");
System.exit(1);
}
return arr[top--];
}

//utility function to return the size of the stack

public int size(){
return top+1;
}

//check if the stack is empty
public boolean isEmpty(){
return top ==-1;
}

//check if the stack is full
public boolean isFull(){
return top == capacity-1;
}
public void printStack(){
for(int i = 0; i <=top; i++){
System.out.println(arr[i]);
}
}
public static void main(String[]args){
Stackj stack = new Stackj(6);
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
stack.push(6);
stack.push(7);
stack.pop();
stack.pop();
stack.pop();
stack.pop();
stack.pop();
stack.pop();
	
System.out.println("\nAfter popping out");
stack.printStack();
stack.pop();
}
}

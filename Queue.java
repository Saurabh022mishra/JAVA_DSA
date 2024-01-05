
public class Queue{
static final int N =4;
int queue[] = new int [N];
int front =0, rear =-1;
void enqueue(int x){
if(rear==N-1){
System.out.println("Overflow");
}else if(front ==-1&&rear==-1){
front = rear = 0;
queue[rear] =x;
}
else{
rear++;
queue[rear]=x;
System.out.println("item inserted " + rear);
}
}
void dequeue(){
if(front ==-1 && rear==-1){
System.out.println("under flow");
}else if(front == rear){
front=rear=-1;
}else{
System.out.println("item deleted " + queue[front]);
front++;
}
}
void display(){
int i;
if(front ==-1 && rear==-1){
System.out.println("Empty");
}else{
for(i=front;i<rear+1;i++){
System.out.print(queue[i] + " " + " item displayed ");
}
System.out.println();
}
}


public static void main(String[]args){
 Queue q = new Queue();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
q.enqueue(4);
q.display();
q.dequeue();
q.dequeue();
q.dequeue();
}
}
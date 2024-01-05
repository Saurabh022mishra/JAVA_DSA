public class QueueTest{
private int maxSize;
private int front;
private int rear;
private int currentSize;
private int queueArray[];
public QueueTest(int maxSize){
this.maxSize=maxSize;
this.front=0;
this.rear=  -1;
this.currentSize=0;
this.queueArray = new int[maxSize];
}
public void enQueue(int data){
//Checking if queue is full before inserting new item
if(isQueueFull()){
throw new RuntimeException("Queue is full");
}
//we have to wrap the queue in case maxSize has reached
if(rear ==maxSize-1){
rear=-1;
}
queueArray[++rear] = data;
System.out.println(data+ " is added in Queue");
currentSize++;
}
public int deQueue(){
//checking if queue is empty before removing new item
if(isQueueEmpty()){
throw new RuntimeException("Queue is empty!");
}
int result = queueArray[front++];
System.out.println(result + " is removed in queue");
//we have to wrap the queue in case maxSize has reached
if(front==maxSize){
front = 0;
}
currentSize--;
return result;
}
private boolean isQueueEmpty(){
return currentSize==0;
}
private boolean isQueueFull(){
return maxSize == currentSize;
}
public int size(){
return currentSize;
}
public static void main(String[]args){
QueueTest queue = new QueueTest(5);
queue.enQueue(10);
queue.enQueue(20);
queue.enQueue(30);
queue.enQueue(40);
queue.enQueue(50);
System.out.println("Size is " + queue.size());
queue.deQueue();
System.out.println("Size is " + queue.size());
queue.enQueue(60);
System.out.println("Size is " + queue.size());
queue.deQueue();
queue.deQueue();
queue.deQueue();
queue.deQueue();
queue.deQueue();
queue.deQueue();
System.out.println("Size is " + queue.size());
}
}
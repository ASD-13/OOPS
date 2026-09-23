Queue:

import java.util.*;
public class QueueEx1
{
int queueLength = 3;
int items[] = new int[queueLength];
int front = -1;
int back = -1;
boolean isFull()
{
if (back == queueLength - 1)
{
return true;
}
else
{
return false;
}
}
boolean isEmpty()
{
if (front == -1 && back == -1)
{
return true;
}
else
{
return false;
}
}
void enQueue(int itemValue)
{
if (isFull())
{
System.out.println("Queue is full");
}
else if (front == -1 && back == -1)
{
front = back = 0; items[back] = itemValue;
}
else
{
back++;
items[back] = itemValue;
}
}
void deQueue()
{
if (isEmpty())
{
System.out.println("Queue is empty. Nothing to deQueue");
}
else if (front == back)
{
front = back = -1;
}
else
{
front++;
}
}
void display()
{
int i;
if (isEmpty())
{
System.out.println("Queue is empty");
}
else
{
for (i = front; i <= back; i++)
System.out.print("\t " + items[i]);
}
System.out.print("\n ");
}
void peak()
{
System.out.println("Front value is: " + items[front]);
}
public static void main(String[] args) throws ArrayIndexOutOfBoundsException
{
QueueEx1 myQueue = new QueueEx1();
System.out.println("Enqueue: ");
myQueue.enQueue(5);
myQueue.display();
myQueue.enQueue(9);
myQueue.display();
myQueue.enQueue(7);
myQueue.display();
myQueue.peak();
System.out.println("DeQueue: ");
myQueue.deQueue();
myQueue.display();
myQueue.deQueue();
myQueue.display();
myQueue.peak();
}
}
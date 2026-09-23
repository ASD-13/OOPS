import java.util.*; class NumberGenerate
{
private int value; private boolean flag;
public synchronized void put()
{
while (flag)
{
try
{
wait();
}
catch (InterruptedException e) {}
}
flag = true;
Random random = new Random(); this.value = random.nextInt(100);
System.out.println("The generated Numberis:"+ value);
notifyAll();
}
public synchronized void get1()
{
while (!flag)
{
try
{
wait();
}
catch (InterruptedException e) {}
}
if (value % 2 == 0)
{
System.out.println("Second is executing now"); int ans = value * value;
System.out.println(value + "is evenNumber and its square is" + ans);
}
flag = false; notifyAll();
}
public synchronized void get2()
{
while (!flag)
{
try
{
wait();
}
catch (InterruptedException e) {}
}
if (value % 2!= 0)
{
System.out.println("Third thread is executing now...");
int ans = value * value * value;
System.out.println(value + "is OddNumber and the cube is:" + ans);
}
flag = false; notifyAll();
}
}
public class TestNumber
{
public static void main(String[] args)
{
final NumberGenerate obj = new NumberGenerate();
Thread ProducerThread = new Thread()
{
public void run()
{
for (int i = 1; i <= 3; i++)
{
System.out.println("Main thread Started...");
obj.put();
try
{
Thread.sleep(1000);
}
catch (InterruptedException e) {}
}
}
};
ProducerThread.start();
Thread consumerThread1 = new Thread()
{
public void run()
{
for (int i = 1; i <= 2; i++)
{
obj.get1();
}
}
};
consumerThread1.start();
Thread consumerThread2 = new Thread()
{
public void run()
{
for (int i = 1; i <= 2; i++)
{
obj.get2();
}
}
};
consumerThread2.start();
}
}
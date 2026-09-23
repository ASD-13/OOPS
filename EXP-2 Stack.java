Stack:

import java.util.EmptyStackException;
import java.util.Stack;
public class StackPushPopExample
{
public static void main(String args[])
{
Stack < Integer > stk = new Stack <> ();
System.out.println("stack: " + stk);
pushelement(stk, 15);
pushelement(stk, 42);
pushelement(stk, 7);
pushelement(stk, 68);
pushelement(stk, 31);
pushelement(stk, 54);
pushelement(stk, 26);
popelement(stk);
popelement(stk);
try
{
popelement(stk);
}
catch (EmptyStackException e)
{
System.out.println("empty stack");
}
}
static void pushelement(Stack stk, int x)
{
stk.push(new Integer(x));
System.out.println("push ->" + x);
System.out.println("stack: " + stk);
}
static void popelement(Stack stk)
{
System.out.print("pop -> ");
Integer x = (Integer) stk.pop();
System.out.println(x);
System.out.println("stack: " + stk);
}
}
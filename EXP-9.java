import java.util.*;
public class Test
{
public static < T extends Object & Comparable <? super T >> T max(Collection <? extends T >
coll)
{
Iterator< ? extends T > MyList = coll.iterator();
T element = MyList.next(); while (MyList.hasNext())
{
T next_element = MyList.next();
if (next_element.compareTo(element) > 0) element = next_element;
}
return element;
}
public static void main(String args[])
{
List < Integer > ints = new ArrayList < Integer > (Arrays.asList(8, 42, 17, 63, 5, 91, 28, 36));
int max = Collections.max(ints);
System.out.println(ints);
System.out.println("MaximumValueis:" + max);
List < Character > chars = new ArrayList < Character > (Arrays.asList('b', 'g', 'k', 'p', 'w'));
char maxc = Collections.max(chars);
System.out.println(chars);
System.out.println("MaximumValueis:" + maxc);
}
}
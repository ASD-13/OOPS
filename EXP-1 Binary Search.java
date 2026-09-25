import java.io.*;
import java.util.*;
public class Binary
{
public static void main(String args[])
{
int[] exampleset = {5, 13, 27, 41, 58, 76, 94};
System.out.println("Enter Your target integer in the array:");
Scanner scn = new Scanner(System.in);
int target = scn.nextInt();
binarySearch(exampleset, target);
}
public static void binarySearch(int[] ref1, int ref2)
{
int index = -1;
int lowEnd = 0;
int highEnd = ref1.length - 1;
while (highEnd >= lowEnd)
{
int middle = (lowEnd + highEnd) /2;
if (ref1[middle] == ref2)
{
index = middle; break;
}
else
{
if (ref1[middle] < ref2)
{
lowEnd = middle +1;
}
else if (ref1[middle] > ref2)
{
highEnd = middle - 1;
}
}
}
if (index == -1)
{
System.out.println("Your target integer does not exist in the array");
}
else
{
System.out.println("Your target integer is in index" + index + " of the array");
}
}
}

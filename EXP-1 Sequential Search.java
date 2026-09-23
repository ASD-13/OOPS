Sequential Search:

import java.io.*;
import java.util.*;
public class Sequential
{
public static void main(String args[])
{
int[] exampleset = {4, 11, 8, 15, 2, 19, 6, 13, 1, 7};
System.out.println("Enter Your target integer in the array:");
Scanner scn = new Scanner(System.in);
int target = scn.nextInt();
sequentialSearch(exampleset, target);
}
public static void sequentialSearch(int[] ref1, int ref2)
{
int index = -1;
for (int i = 0; i < ref1.length; i++)
{
if (ref1[i] == ref2)
{
index = i; break;
}
}
if (index == -1)
{
System.out.println("Your target integer does not exist in the array");
}
else
{
System.out.println("Your target integer is in index" + index + "of the array");
}
}
}

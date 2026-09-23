import java.util.Scanner; import java.io.File;
class FileDemo
{
public static void main(String args[])
{
System.out.println("Enter the name of the file");
Scanner input = new Scanner(System.in);
String s = input.nextLine();
File f1 = new File("Report_2026.txt");
System.out.println(" ");
System.out.println("File name:"+ f1.getName());
System.out.println("Path:" + f1.getPath());
System.out.println("Abs Path:" + f1.getAbsolutePath());
System.out.println("Thefileis:" + (f1.exists()? "Exists" : "DoesnotExists"));
System.out.println("Isfile:" + f1.isFile());
System.out.println("Is Directory:" + f1.isDirectory());
System.out.println("Is Readable:" + f1.canRead());
System.out.println("Is Writable:" + f1.canWrite());
System.out.println("Is Absolute:" + f1.isAbsolute());
System.out.println("File Size:" + f1.length() + "bytes");
System.out.println("IsHidden:" + f1.isHidden());
}
}
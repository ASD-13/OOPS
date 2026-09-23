import java.util.Scanner;
class Employee
{
int Emp_id;
String Emp_name; String Address;
String Mail_id; String Mobile_no;
Employee(int id, String name, String addr, String mail, String mob)
{
this.Emp_id = id; this.Emp_name = name;
this.Address = addr;
this.Mail_id = mail;
this.Mobile_no = mob;
}
}
class Programmer extends Employee
{
Double BP, Gross_salary, Net_salary;
public Programmer(int id, String name, String addr, String mail, String mob)
{
super(id, name, addr, mail, mob);
}
void computePay()
{
System.out.println("enter basic pay");
Scanner input = new Scanner(System.in);
BP = input.nextDouble();
double DA, HRA, PF, Fund;
DA = (BP * 97/ 100);
HRA = (BP * 10 / 100);
PF = (BP * 12/100);
Fund = (BP * 0.1 / 100);
Gross_salary = BP + DA + HRA;
Net_salary = BP + DA + HRA - (PF + Fund);
System.out.println("Emp_Id:" + Emp_id);
System.out.println("Emp_name:" + Emp_name);
System.out.println("Address" + Address);
System.out.println("mail_Id:" + Mail_id);
System.out.println("Mobile_no:" + Mobile_no);
System.out.println("Grosspay:" + Gross_salary);
System.out.println("Netpay:" + Net_salary);
}
}
class Asst_Proffessor extends Employee
{
double BP, Gross_salary, Net_salary;
public Asst_Proffessor(int id, String name, String addr, String mail, String mob)
{
super(id, name, addr, mail, mob);
}
void computePay()
{
System.out.println("enter basic pay");
Scanner input = new Scanner(System.in);
BP = input.nextDouble();
Gross_salary = BP;
double DA, HRA, PF, Fund;
DA = (BP *97 / 100);
HRA = (BP * 10 / 100);
PF = (BP *12/100);
Fund = (BP* 0.1 / 100);
Net_salary = BP + DA + HRA - (PF + Fund);
System.out.println("Emp_Id:" + Emp_id);
System.out.println("Emp_name:" + Emp_name);
System.out.println("Address" + Address);
System.out.println("mail_Id:" + Mail_id);
System.out.println("Mobile_no:" + Mobile_no);
System.out.println("Grosspay:" + Gross_salary);
System.out.println("Netpay:" + Net_salary);
}
}
class Associate_Proffessor extends Employee
{
double BP, Gross_salary, Net_salary;
public Associate_Proffessor(int id, String name, String addr, String mail, String mob)
{
super(id, name, addr, mail, mob);
}
void computePay()
{
System.out.println("enter basic pay");
Scanner input = new Scanner(System.in);
BP = input.nextDouble();
Gross_salary = BP;
double DA, HRA, PF, Fund; DA = (BP * 97 / 100);
HRA = (BP * 10 / 100); PF = (BP* 12/ 100);
Fund = (BP * 0.1/ 100);
Net_salary = BP + DA + HRA - (PF + Fund);
System.out.println("Emp_Id:" + Emp_id);
System.out.println("Emp_name:" + Emp_name);
System.out.println("Address" + Address);
System.out.println("mail_Id:" + Mail_id);
System.out.println("Mobile_no:" + Mobile_no);
System.out.println("Grosspay:" + Gross_salary);
System.out.println("Netpay:" + Net_salary);
}
}
class Proffessor extends Employee
{
double BP, Gross_salary, Net_salary;
public Proffessor(int id, String name, String addr, String mail, String mob)
{
super(id, name, addr, mail, mob);
}
void computePay()
{
System.out.println("enter basic pay");
Scanner input = new Scanner(System.in); BP = input.nextDouble();
Gross_salary = BP;
double DA, HRA, PF, Fund; DA = (BP * 97 /100);
HRA = (BP * 10 / 100);
PF = (BP * 12/ 100);
Fund = (BP* 0.1 / 100);
Net_salary = BP + DA + HRA - (PF + Fund);
System.out.println("Emp_Id:" + Emp_id);
System.out.println("Emp_name:" + Emp_name);
System.out.println("Address" + Address);
System.out.println("mail_Id:" + Mail_id);
System.out.println("Mobile_no:" + Mobile_no);
System.out.println("Grosspay:" + Gross_salary);
System.out.println("Netpay:" + Net_salary);
}
}
public class Main
{
public static void main(String[] args)
{
Programmer p = new Programmer(501, "Arjun", "Hyderabad", "arjun_501@gmail.com",
"9871234560");
System.out.println("....Programmer");
p.computePay();
Asst_Proffessor Ap = new Asst_Proffessor(602, "Sneha", "Bangalore", "sneha_602@gmail.com",
"9765432109");
System.out.println("....Asst_Proffessor");
Ap.computePay();
Associate_Proffessor As = new Associate_Proffessor(703, "Vikram", "Kolkata", "vikram_703@gmail.com",
"9654321098");
System.out.println("....Associate_Proffessor");
As.computePay();
Proffessor Pf = new Proffessor(804, "Divya", "Jaipur", "divya_804@gmail.com", "9543210987");
System.out.println("....Proffessor");
Pf.computePay();
}
}
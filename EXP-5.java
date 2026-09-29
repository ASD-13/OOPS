public interface Shape
{
void input();
void area();

public static void main(String[] args)
{
Rectangle obj = new Rectangle();
obj.input();
obj.area();
}
}
class Circle implements Shape
{
int r = 0;
double pi = 3.14, ar = 0;
@Override
public void input()
{
r = 7;
}
@Override public void area()
{
ar = pi* r *r;
System.out.println("Area of circle:"+ar);
}
}
class Rectangle implements Shape
{
int l = 0, b = 0; double ar;
@Override
public void input()
{
l = 9;
b = 5;
}
@Override
public void area()
{
ar = l* b;
System.out.println("Area of rectangle:"+ar);
}
}

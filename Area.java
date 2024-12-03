import java.util.Scanner;
abstract class shape
{
 double dim1;
 double dim2;
 void printarea()
 {
 }
}
class rectangle extends shape
{
 void printarea()
 {
  double area=dim1*dim2;
  System.out.println("area of rectangle is:"+area);
 }
}
class triangle extends shape
{
 void printarea()
 {
  double area=(dim1*dim2)/2;
  System.out.println("area of triangle is:"+area);
 }
}
class circle extends shape
{
 void printarea()
 {
  double area=3.14*dim1*dim1;
  System.out.println("area of circle is:"+area);
 }
}
class area
{
 public static void main(String args[])
 {
  rectangle r=new rectangle();
  triangle t=new triangle();
  circle c=new circle();
  Scanner in=new Scanner(System.in);
  System.out.println("enter the length of rectangle:");
  r.dim1=in.nextDouble();
  System.out.println("enter the breadth of rectangle:");
  r.dim2=in.nextDouble();
  System.out.println("enter the base of triangle :");
  t.dim1=in.nextDouble();
  System.out.println("enter the height of triangle:");
  t.dim2=in.nextDouble();
  System.out.println("enter the radius of circle:");
  c.dim1=in.nextDouble();
  r.printarea();
  t.printarea();
  c.printarea();
 }
}
  
  
  


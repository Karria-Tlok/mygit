package shiyan;

/*class Cylinder
{
  private double radius;//����˽�б���
  private int height;
  private double pi=3.14;
  public void setCylinder(double r,int h)//�����������������ķ���������˽�б���
  {
	  if(r>0&&h>0)
	  {
		  radius=r;
		  height=h;
	  }
	  else System.out.println("���������д��󣡣�"); 
  }
  double area()
  {
	  return pi*radius*radius;
  }
  double volume()
  {
	  return area()*height;
  }
}
 class ������
{
   	public static void main(String[]args)
   	{
   		Cylinder volu;
   		volu=new Cylinder();
   		volu.setCylinder(2.5, -5);//ͨ��������������˽������
   		System.out.println("Բ�������="+volu.area());
   		System.out.println("Բ�������="+volu.volume());
   	}
}*/
//C1.javaʵ��32
/*class PersonA
{
    private String name;
    public void setName(String newName)
    {
    	name=newName;
    }
    public String getName()
    {
    	return name;
    }
}
class StudentA extends PersonA
{
    	private String department;
    	public void setDepartment(String newDepartment)
    	{
    		department=newDepartment;
    	}
    	public String getDepartment()
    	{
    		return department;
    	}
}
class ������
{
       public static void main(String[]args)
       {
    	   StudentA s1=new StudentA();
    	   s1.setName("����");
    	   s1.setDepartment("�����ϵ");
    	   System.out.println("��ã�����"+s1.getName());
    	   System.out.println("����"+s1.getDepartment()+"��ѧ��");
       }	
}*/
//ʵ��33
/*class PersonB
{
      String name;
      int age;
      public PersonB()
      {
    	  System.out.println("PersonB()������");
      }
      public PersonB(String newName)
      {
          name=newName;
    	  System.out.println("PersonB(String newName)������");
      }
      public void introduce()
      {
    	  System.out.println("����"+name+"������"+age+"��");
      }
}
class StudentB extends PersonB
{
      public StudentB()
      {
    	  System.out.println("StudentB()������");
    	  }
      public StudentB(String newName,int newAge)
      {
    	  super(newName);
    	  age=newAge;
      } 
}
class ������
{
      public static void main(String[]args)
      {
    	  StudentB s1=new StudentB();
    	  StudentB s2=new StudentB("����",19);
    	  s2.introduce();
      }	
}
*/
//ʵ��34
/*class Animal
{
      void play()
      {
    	  System.out.println("���Ƕ���һ�ܶ౾��");
      }	
}
class Bird extends Animal
{
      void play()
      {
    	  System.out.println("����С�����ܷ���");
      }	
}
class Fish extends Animal
{
      void play()
      {
    	  System.out.println("����С�㣬������Ӿ");
      }	
}
class ������
{
      public static void main(String[]args)
      {
    	  Animal s1=new Animal();
    	  Bird s2=new Bird();
    	  Fish s3=new Fish();
    	  s1.play();
    	  s2.play();
    	  s3.play();
      }	
}*/
//ʵ��35
/*abstract class Shape
{
    abstract float Area();	
    abstract void printArea();
}
class Rectangle extends Shape
{
    int width;
    int length;
    public Rectangle(int newWidth,int newLength)
    {
    	width=newWidth;
    	length=newLength;
    }

   float Area()
   {
	  return width*length;}
   void printArea()
   {
	  System.out.println("����һ�����Σ��ҵ������"+Area());   }
}
class Circle extends Shape
{
    	final float pi=3.14F;
    	int radius;
    	public Circle(int newRadius)
    	{
    		radius=newRadius;
    	}
    	float Area()
    	{
    		return pi*radius*radius;
    	}
    	void printArea()
    	{
    		System.out.println("����һ��Բ���ҵ������"+Area());
    	}
}
class ������
{
	public static void main(String[]args)
	{
		Rectangle s1=new Rectangle(3,4);
		Circle s2=new Circle(2);
		s1.printArea();
		s2.printArea();
	}
}*/
//ʵ��41
/*import java.text.DecimalFormat;
interface Shape
{
     final float pi=3.14F;
     abstract double area();
     abstract double volume();
}
class Cylinder implements Shape 
{
     private double radius;
     private int height;
     public Cylinder(double r,int h)
     {
    	 radius=r;
    	 height=h;
     }
     public double area(){
    	 return pi*radius*radius;
     }
     public double volume()
     {
    	 return area()*height;
     }
}
class ������
{
    public static void main(String[]args)
    {
    	Cylinder a=new Cylinder(2,3);
    	DecimalFormat myFormat=new DecimalFormat("0.00");
    	System.out.println("Բ����������"+myFormat.format(a.area()));
    	System.out.println("Բ����������"+myFormat.format(a.volume()));
    }	
}*/
//ʵ��42
interface Achievement
{
     public float average();	
}
class Person 
{
     String name;
     int age;
     public Person(String newName,int newAge)
     {
    	 name=newName;
    	 age=newAge;
     }
     public void introduce()
     {
    	 System.out.println("��ã�����"+name+",����"+age+"��");
     }
}
class Student extends Person implements Achievement
{
     int Chinese;
     int Math;
     int English;
     public Student(String newName,int newAge)
     {
    	 super(newName,newAge);
     }
     public void setScore(int c,int m,int e)
     {
    	 Chinese=c;
    	 Math=m;
    	 English=e;
     }
     public float average()
     {
    	 return(Chinese+Math+English)/3;
     }
}
class ������
{
	public static void main(String[]args)
	{
		Student s1=new Student("����",16);
		s1.introduce();
		s1.setScore(80,90, 80);
		System.out.println("�ҵ�ƽ������"+s1.average());
	}
}
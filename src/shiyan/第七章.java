package shiyan;

/*class Cylinder
{
  private double radius;//声明私有变量
  private int height;
  private double pi=3.14;
  public void setCylinder(double r,int h)//声明具有两个参数的方法来访问私有变量
  {
	  if(r>0&&h>0)
	  {
		  radius=r;
		  height=h;
	  }
	  else System.out.println("您的数据有错误！！"); 
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
 class 第七章
{
   	public static void main(String[]args)
   	{
   		Cylinder volu;
   		volu=new Cylinder();
   		volu.setCylinder(2.5, -5);//通过公共方法访问私有数据
   		System.out.println("圆柱底面积="+volu.area());
   		System.out.println("圆柱体体积="+volu.volume());
   	}
}*/
//C1.java实验32
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
class 第七章
{
       public static void main(String[]args)
       {
    	   StudentA s1=new StudentA();
    	   s1.setName("张三");
    	   s1.setDepartment("计算机系");
    	   System.out.println("你好，我是"+s1.getName());
    	   System.out.println("我是"+s1.getDepartment()+"的学生");
       }	
}*/
//实验33
/*class PersonB
{
      String name;
      int age;
      public PersonB()
      {
    	  System.out.println("PersonB()被调用");
      }
      public PersonB(String newName)
      {
          name=newName;
    	  System.out.println("PersonB(String newName)被调用");
      }
      public void introduce()
      {
    	  System.out.println("我是"+name+"，今年"+age+"岁");
      }
}
class StudentB extends PersonB
{
      public StudentB()
      {
    	  System.out.println("StudentB()被调用");
    	  }
      public StudentB(String newName,int newAge)
      {
    	  super(newName);
    	  age=newAge;
      } 
}
class 第七章
{
      public static void main(String[]args)
      {
    	  StudentB s1=new StudentB();
    	  StudentB s2=new StudentB("张三",19);
    	  s2.introduce();
      }	
}
*/
//实验34
/*class Animal
{
      void play()
      {
    	  System.out.println("我是动物，我会很多本领");
      }	
}
class Bird extends Animal
{
      void play()
      {
    	  System.out.println("我是小鸟，我能飞翔");
      }	
}
class Fish extends Animal
{
      void play()
      {
    	  System.out.println("我是小鱼，我能游泳");
      }	
}
class 第七章
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
//实验35
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
	  System.out.println("我是一个矩形，我的面积是"+Area());   }
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
    		System.out.println("我是一个圆，我的面积是"+Area());
    	}
}
class 第七章
{
	public static void main(String[]args)
	{
		Rectangle s1=new Rectangle(3,4);
		Circle s2=new Circle(2);
		s1.printArea();
		s2.printArea();
	}
}*/
//实验41
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
class 第七章
{
    public static void main(String[]args)
    {
    	Cylinder a=new Cylinder(2,3);
    	DecimalFormat myFormat=new DecimalFormat("0.00");
    	System.out.println("圆柱体的面积是"+myFormat.format(a.area()));
    	System.out.println("圆柱体的体积是"+myFormat.format(a.volume()));
    }	
}*/
//实验42
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
    	 System.out.println("你好，我是"+name+",今年"+age+"岁");
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
class 第七章
{
	public static void main(String[]args)
	{
		Student s1=new Student("张三",16);
		s1.introduce();
		s1.setScore(80,90, 80);
		System.out.println("我的平均分是"+s1.average());
	}
}
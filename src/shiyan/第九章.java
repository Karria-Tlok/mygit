package shiyan;


//DivideZero.javaʵ��44
//	public class �ھ��� {
//	 public static void main(String[]args){
//		 try{
//		 int x=0;
//		 int y=0;
//		 y=3/x;}
//		 catch(Exception e){
//			 System.out.println("��������ʱ�����쳣");
//		 }
//		 System.out.println("�������");
//	 }	
//}
//ʵ��45
//public class �ھ���{
//	public static void main(String[]args){
//		try{
//			int a[]=null;
//			a[0]=1;
//		}
//		catch(NullPointerException e){
//			System.out.println("��ָ���쳣");
//		}
//		try {
//			String str=null;
//			str.length();
//		}
//		catch(NullPointerException e){
//			System.out.println("��ָ���쳣");
//		}
//		try {
//			Object obj=new Object();
//			String str=(String)obj;
//		}
//		catch(ClassCastException e){
//			System.out.println("����ǿ��ת���쳣");
//		}
//		try{
//			int a[]=new int[-1];
//		}
//		catch(NegativeArraySizeException e){
//			System.out.println("���鸺�±��쳣");
//		}
//		try{
//			int a[]=new int[1];
//			a[0]=0;
//			a[1]=1;
//		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("�����±�Խ���쳣");
//		}
//	}
//}
//ManyException.javaʵ��46
//public class �ھ���{
//	public static void main(String[]args){
//		int i;
//		int a[]={1,2,3,4};
//		for(i=0;i<5;i++){
//			try{
//				System.out.print("a["+i+"]/"+i+"="+(a[i]/i));
//				
//			}
//			catch(ArrayIndexOutOfBoundsException e){
//				System.out.print("��ץ���������±�Խ���쳣");
//			}
//			
//			catch(ArithmeticException e){
//				System.out.print("�쳣�������ǣ�"+e);
//			}
//			catch(Exception e){
//				System.out.println("����"+e.getMessage()+"�쳣��");
//			}
//			finally{
//				System.out.println("  finally  i="+i);
//			}
//		}
//		System.out.println("����!!");
//	}
//}
//MethodException.javaʵ��47
//class �ھ���{
//	static void m()throws Exception{
//		int a=3;
//		int b=0;
//		int c=a/b;
//		System.out.println(a+"/"+b+"="+c);	}
//
// public static void main(String[]args){
//	try{ m();}
//	catch(Exception e){
//		System.out.println("��������쳣��"+e.getMessage());
//	  }
//	 System.out.println("�������");
// }
//}
//ThrowException.javaʵ��48
//class AaaException extends Exception{}
//class BbbException extends Exception{}
//public class �ھ���{
//	public static void main(String[]args){
//		int x =1;
//		try{
//			if(x>0) 
//			 {AaaException e = new AaaException();
//				throw e;}
//			else 
//				throw new BbbException();
//		}
//		catch(AaaException e){
//			System.out.println("ִ��aaa�쳣�������");
//		}
//		catch(BbbException e){
//			System.out.println("ִ��bbb�쳣�������");
//		}
//	}
//}
//CatchException.javaʵ��49
import java.io.*;
public class �ھ���{
	public static void main(String[]args){
		System.out.println("����ʼ");
	   try{
	    	System.in.read();
	   }
	    catch(Exception e){
	    	
	    }System.out.println("�������");
	}
}
//import java.util.Scanner;
//class NumberTooBigException extends Exception{
//	NumberTooBigException(){
//		System.out.println("��������̫���쳣");
//	};
//}
//class NumberTooSmallException extends Exception{
//	NumberTooSmallException(){
//		System.out.println("��������̫С�쳣");
//	};
//}

//public class �ھ���{
//	public static void numberException(int x) throws Exception{
//		if(x>100)
//			
//			throw new NumberTooBigException();
//		if(x<0) 
//			throw new NumberTooSmallException();
//		else 
//			System.out.println("û�з����쳣");
//	}
//	public static void main(String[]args)throws Exception{
//		
//		try{
//			Scanner input=new Scanner(System.in);
//	        int x;
//	        x=input.nextInt();
//		    numberException(x);
//		}
//		catch(NumberTooSmallException e){
//			e.getMessage();
//		}
//		catch(NumberTooBigException e){
//			e.getMessage();
//		} 
//
//	}
//	   
//}
//class A {
//    public void process() { System.out.print("A,"); }
// }
//
// class B extends A{
//    public void process() throws IOException {
//       super.process();
//       System.out.print("B,");
//       throw new IOException();
//        }
// }
// public class �ھ���{
// public static void main(String[] args){
//     try { new B().process(); }
//     catch (IOException e) { System.out.println("Exception"); } 
//     }
// }
//class MinusException extends Exception {
//	int number;
//	public MinusException (String msg, int i)	{
//		super(msg);
//		this.number = i;
//	}
//}
//  
//class Salary {
//  private String name;
//  private int salary;
//  public Salary(String n, int s ) throws MinusException  {
//     this.name=n;
//     if (s<0) throw new MinusException("���ʲ���Ϊ����",s);
//     this.salary=s;
//  }
//  public void print()  {
//  	System.out.println(name+"�Ĺ���Ϊ"+salary+"Ԫ��");
//  }
//}
//
//class �ھ���  {
//    public static void main(String [] args)    {
//       try { 
//	         Salary s1=new Salary("����",1000);
//          s1.print( );
//	         Salary s2=new Salary("����",-10);
//          s2.print( );
//       }
//       catch(MinusException e)    {
//          System.out.println("�쳣:"+e.getMessage());
//       }
//    }
//}


/*class MeException extends Exception{}
class A{
public void m()throws MeException{
	int a=3;
	int b=0;
	int s=a/b;
	System.out.println(a+"/"+b+"="+s);

     }}
public class �ھ���{
public static void main(String[]args)throws MeException{
//	try{
//	    A a=new A();
//		a.m();
//	}
//	catch(MeException e){
//		System.out.println(e.getMessage());
//	}
}
}*/
//public class �ھ���{
//public static void main(String[]args)
//{
//�ھ��� e=new �ھ���();
//System.out.println(e.tryThis());
//}
//
//public int tryThis()
//{
//try{
//System.out.println("1");
//throw new Exception();
////return 1;
//}catch(Exception ex){
//System.out.println("2");
//return 2;
//}
//finally{
//System.out.println("4");
//return 2;
//
//}
//}
//}


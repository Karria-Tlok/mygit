package Myself;
abstract class Ca{
	int A;
	int B;
   
	Ca(int newA,int newB){
		this.A=newA;
		this.B=newB;
	}
    
}
class Co extends Ca
{   int C;   
	Co(int newA,int newB,int newC) 
	{
	   super(newA,newB);
	   C=newC;   
	} 
	
     	 public double jia()
     { 
    	 return this.A+this.B+this.C;
     }
}
public class chouxiang 
{    public String toString(){
	return "在"+getClass().getName()+"类中重写toString（）方法";
}
	 public static void main(String[]args){
         System.out.println(new chouxiang());
		 Co s1=new Co(2,3,3);
    System.out.println(s1.jia());  
   
}
}
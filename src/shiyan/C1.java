package shiyan;

class PersonA
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
class C1
{
       public static void main(String[]args)
       {
    	   StudentA s1=new StudentA();
    	   s1.setName("张三");
    	   s1.setDepartment("计算机系");
    	   System.out.println("你好，我是"+s1.getName());
    	   System.out.println("你好，我是"+s1.getDepartment());
       }	
}

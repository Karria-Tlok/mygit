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
    	   s1.setName("����");
    	   s1.setDepartment("�����ϵ");
    	   System.out.println("��ã�����"+s1.getName());
    	   System.out.println("��ã�����"+s1.getDepartment());
       }	
}

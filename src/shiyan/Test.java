package shiyan;
/*abstract class Student{				//父类,抽象类
	String number;
	String name;
	int age;
	String department;
	
	public abstract double grade();
}

class English extends Student{

double Exam;


English(double speech,double qimo,double qizhong){
	Exam=speech*0.5+qimo*0.25+qizhong*0.25;
}
public double grade(){
	return Exam;
}
}

class IT extends Student{
	double Exam;
	String department="计算机系";
	IT(double caozuo,double xiezuo,double qimo,double qizhong){
		Exam=caozuo*0.4+xiezuo*0.2+qimo*0.2+qizhong*0.2;
	}
	public double grade(){
		return Exam;
	}
}

class Wenxue extends Student{
	double Exam;
	String department="文学系";
	Wenxue(double speech,double work,double qimo,double qizhong){
		Exam=speech*0.35+work*0.35+qimo*0.15+qizhong*0.15;
	}
	public double grade(){
		return Exam;
	}
}



class Test{
	public static void main(String[] args){
		Student[] e = new Student[6];
		e[0]= new English(90,90,90);
		e[0].number = "10001";
		e[0].name = "张三";
		e[0].age = 18;
		e[0].department = "英语系";
		e[1]= new Wenxue(90,90,90,90);
		e[1].number = "200003";
		e[1].name = "李四";
		e[1].age = 19;
		e[1].department = "文学系";
		e[2]= new IT(90,100,90,90);
		e[2].number = "100002";
		e[2].name = "小明";
		e[2].age = 20;
		e[2].department = "计算机系";
		e[3]= new Wenxue(66,77,88,99);
		e[3].number = "100003";
		e[3].name = "小红";
		e[3].age = 21;
		e[3].department = "文学系";
		e[4]= new English(78,90,90);
		e[4].number = "100005";
		e[4].name = "小刚";
		e[4].age = 22;
		e[4].department = "英语系";
		e[5]= new IT(90,88,90,90);
		e[5].number = "100006";
		e[5].name = "小芳";
		e[5].age = 23;
		e[5].department = "计算机系";
		for(int i=0;i<6;i++){
			System.out.println ("学号"+e[i].number+" "+"姓名："+e[i].name+" "+"年龄；"+e[i].age+" "+"系别；"+e[i].department+" "+"综合成绩:"+e[i].grade());
		}
		
		
	}
}*/
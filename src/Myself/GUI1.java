package Myself;
import java.awt.*;

public class GUI1 extends Frame{
	Panel P1;
	Panel P2;
	Button[] buttons=new Button[4];
    
    public GUI1(){
		setSize(300,200);
		setLocation(300,300);	
		setResizable(false);
    	for(int i=0;i<buttons.length;i++)
		  buttons[i]=new Button("Button"+(i+1));
		
    	
    	P1=new Panel();
		P1.setBackground(Color.YELLOW);
		P1.setLayout(new FlowLayout());
		P1.add(buttons[0]);
		P1.add(buttons[1]);
		
		P2=new Panel();
		P2.setBackground(Color.GREEN);
		P2.setLayout(new FlowLayout());
		P2.add(buttons[2]);
		P2.add(buttons[3]);
		
		setLayout(new BorderLayout());
		add(P1,BorderLayout.NORTH);
		add(P2,BorderLayout.SOUTH);
    	setVisible(true);
    		
    }
    public static void main(String[]args){
    	new GUI1();
  	
    }
}
/*
public class GUI1 extends Frame{
	Panel P1;//����ø����������ÿһ���ַ������������д��
	Panel P2;
	TextField T;
	Button [][]buttons;
	String[][] strings={{"MC","7","8","9","/","sqrt"},{"MR","4","5","6","*","%"},{"MS","1","2","3","-","1/x"},{"M+","0","+/-",".","+","="}};
	public GUI1(){
		
	     setSize(300,200);
	     setLocation(300,300);
	     setResizable(false);
	     setLayout(new BorderLayout());
	     //��һ����п��ޣ���ΪFrameĬ�ϲ��ֹ���������BorderLayout
	     setTitle("Calculator");
	     
	     T=new TextField();	     
	     P1=new Panel();
	     P1.setLayout(new BorderLayout());
	     //��һ�䲻�����٣���Ϊ���Ĭ�Ϲ�������FlowLayout
	     //ȱ�ٵĻ��ı���Ͳ��ǳ��ģ����Ǿ��е�һС��
	     P1.add(T);
	    
	      P2=new Panel();
	      P2.setLayout(new GridLayout(4,6));
	     for(int i=0;i<4;i++){
	    	 for(int j=0;j<6;j++){
	    		 buttons=new Button[4][6];
	    		 buttons[i][j]=new Button(strings[i][j]);
	  //buttons[i][j].setLabel(strings[i][j]);���Ǻܶ�Ϊʲô��һ��Ϊʲô�����������һ��
	    		 
	    		 P2.add(buttons[i][j]);
	    	 }
	     }
	   
	     
	    
//	     P2=new Panel();
//	      P2.setLayout(new GridLayout(4,6));
//	     for(int k=0;k<buttons.length;k++){
//	    	 for(int l=0;l<buttons[k].length;l++){
//	           P2.add(buttons[i][j]); 
//	    	 }
//	     }֮ǰ��P2��add�������buttons�������̷ֿ������޷�����P2
//	                               ��Ȼ����δ�����Ϊʲô���������һ�����ʾ�п�ָ�룬��˼�������ѽ
	      
	     setLayout(new BorderLayout());
	     add(P1,BorderLayout.NORTH);
	     add(P2,BorderLayout.CENTER);
	     setVisible(true);}
	
	public static void main(String[]args){
		new GUI1();
	}
}
*/






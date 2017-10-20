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
	Panel P1;//定义好各组件，并把每一个字符串数组的数据写好
	Panel P2;
	TextField T;
	Button [][]buttons;
	String[][] strings={{"MC","7","8","9","/","sqrt"},{"MR","4","5","6","*","%"},{"MS","1","2","3","-","1/x"},{"M+","0","+/-",".","+","="}};
	public GUI1(){
		
	     setSize(300,200);
	     setLocation(300,300);
	     setResizable(false);
	     setLayout(new BorderLayout());
	     //上一句可有可无，因为Frame默认布局管理器就是BorderLayout
	     setTitle("Calculator");
	     
	     T=new TextField();	     
	     P1=new Panel();
	     P1.setLayout(new BorderLayout());
	     //上一句不可以少，因为面板默认管理器是FlowLayout
	     //缺少的话文本框就不是长的，而是居中的一小个
	     P1.add(T);
	    
	      P2=new Panel();
	      P2.setLayout(new GridLayout(4,6));
	     for(int i=0;i<4;i++){
	    	 for(int j=0;j<6;j++){
	    		 buttons=new Button[4][6];
	    		 buttons[i][j]=new Button(strings[i][j]);
	  //buttons[i][j].setLabel(strings[i][j]);不是很懂为什么这一句为什么不能替代上面一句
	    		 
	    		 P2.add(buttons[i][j]);
	    	 }
	     }
	   
	     
	    
//	     P2=new Panel();
//	      P2.setLayout(new GridLayout(4,6));
//	     for(int k=0;k<buttons.length;k++){
//	    	 for(int l=0;l<buttons[k].length;l++){
//	           P2.add(buttons[i][j]); 
//	    	 }
//	     }之前把P2的add过程与把buttons命名过程分开导致无法出现P2
//	                               ，然而还未能想出为什么会这样而且还会提示有空指针，百思不得其解呀
	      
	     setLayout(new BorderLayout());
	     add(P1,BorderLayout.NORTH);
	     add(P2,BorderLayout.CENTER);
	     setVisible(true);}
	
	public static void main(String[]args){
		new GUI1();
	}
}
*/






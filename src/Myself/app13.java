package Myself;
//import java.awt.Color;
//import java.awt.Image;
//import javax.swing.*;
//public class app13{
//static JFrame jfrm=new JFrame("这是个Swing程序");
//public static void main(String[]args){
//    JLabel lab=new JLabel("我是一个标签");
//    Image im=(new ImageIcon("中国心.jpg")).getImage();
//    jfrm.setIconImage(im);
//    jfrm.setSize(250,140);
//    jfrm.setBackground(Color.YELLOW);
//    jfrm.setLocation(260,150);
//    jfrm.add(lab);
//    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    jfrm.setVisible(true);
//  }
//}

import java.awt.*;
import javax.swing.*;
public class app13 extends Frame{
	Panel P1;
	Panel P2;
	Button[] a=new Button[3];
	Frame F;
    public app13(){
    
    	F = new Frame("");
		F.setSize(300,200);
		F.setLocation(300,300);
		F.setLayout(null);
		F.setResizable(false);
    	
		
		
		
		P1=new Panel();
		P1.setBackground(Color.YELLOW);
		//P1.add(a[0],a[1]);
		
		P2=new Panel();
		P2.setBackground(Color.GREEN);
		//P2.add(a[2],a[3]);
		
		F.add(P1,BorderLayout.NORTH);
		F.add(P2,BorderLayout.SOUTH);
    	F.setVisible(true);
    		
    }
    public static void main(String[]args){
    	new app13();
  	
    }
}
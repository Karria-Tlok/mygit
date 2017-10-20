package Myself;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
public class GUI extends JFrame{		
	JPanel P1;
	JPanel P2;
	JPanel P3;
	JLabel L=new JLabel("学生成绩文件：");
	JButton B1=new JButton("浏览");
	JButton B2=new JButton("导入");
	JTextField T=new JTextField(15);
	JTable table=null;
    public GUI(){
      setSize(500,320);
	  setLocation(300,300);
	  setTitle("成绩表");
	  setResizable(false);
	  T.setEditable(true);
	  P1=new JPanel();
	  FlowLayout flow=new FlowLayout(FlowLayout.CENTER,5,10);
	  P1.setLayout(flow);
	  P1.add(L);
	  P1.add(T);
	  P1.add(B1);
      P2=new JPanel();
      P2.add(B2);
      P3=new JPanel();
            
      B1.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    		  JFileChooser chooser=new JFileChooser();    	
    		  chooser.showOpenDialog(null);
    		 T.setText((chooser.getSelectedFile().getPath()));
    	  }
    	  });
      B2.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    		 
    		  String[]columnNames=new String[]{"姓名","英语","数学","计算机"};
    		 
    		  String file=T.getText()+"";
			String[] stuLine =MyReader.readString(file.replace("/", "//"));     //将成绩文件中的每行数据读出，放入字符串数组stuLine中
  			  int count = stuLine.length;
  			  String[][] student = new String[stuLine.length][4];      //此二维数组保存每条学生记录按分隔符'#'分隔后的各项值		
  										
  			for(int i=0;i<count;i++){
  				student[i] = stuLine[i].split("#");
  			}         
              table=new JTable(student,columnNames);             
              JScrollPane pane=new JScrollPane(table);
              add(pane,BorderLayout.CENTER);    		  
    	  }
      });
     
      setLayout(new BorderLayout());
      add(P1,BorderLayout.NORTH);
      add(P2,BorderLayout.SOUTH);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true); 
    	}        
      public static void main(String[]args){    	  
    	  new GUI();    	  
      }
}
class MyReader{
public static String[] readString(String file){
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<String> strList = new ArrayList<String>();
		try{
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(br.ready()){
				strList.add(br.readLine());					
			}
			strList.trimToSize();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return strList.toArray(new String[strList.size()]);
	}
}


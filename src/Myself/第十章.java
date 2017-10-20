package Myself;


	//import java.io.*;
	//public class 第十章{
//	       public static void main(String[]args)throws IOException{
//	    	   FileInputStream fin=null;;
//	    	   FileOutputStream fout = null;
//	    	  
//	    	   try{
//	    		   String str="Hello World";
//	    		   File txt=new File("F:\\My java\\test.txt");
//	    		   if(!txt.exists()){
//	    		   txt.createNewFile();
//	    	        }
//	    		   byte bytes[]=new byte[str.length()];
//	    		   bytes=str.getBytes();
//	    		   int b=str.length();
//	    	       fout=new FileOutputStream(txt,true);
//	               fout.write(bytes);             
//	    	 
//	               
//	               int i;
//	    	       fin =new FileInputStream("F:\\My java\\test.txt");
//	    	      
//	    	       do{ 
//	    	    	   i=fin.read();
//	    	    	   if(i!=-1)
//	    	    	   System.out.print((char)i);
//	    	    	   
//	    	       }while(i!=-1);
//	    	       
//	    	     
//	    	       
//	    	   }
//	    	   catch(Exception e){}
//	    	   finally{
//	    	    fout.close();
//	    	       fin.close();
//	    	      
//	    		  }
//	       }
	//}


	//import java.io.*;
	//import java.text.DecimalFormat;
	//public class 第十章{
//		public static void main(String[]args)throws IOException{
	//	
//			try{
//				BufferedReader in=
//						new BufferedReader(
//										new FileReader("F:\\My java\\成绩.txt"));
//				String thisLine;
//				int Max1,Max2,Max3;
//				int Min1,Min2,Min3;
//			    DecimalFormat df=new DecimalFormat("#.00");
//				
//				String Line1=in.readLine();
//			    String[]part =new String[3];
//			    part=Line1.split("#");
//			    Max1=Min1=Integer.parseInt(part[1]); 
//			    Max2=Min2=Integer.parseInt(part[2]);
//			    Max3=Min3=Integer.parseInt(part[3]);
//			    double total1=Integer.parseInt(part[1]),total2=Integer.parseInt(part[2]),total3=Integer.parseInt(part[3]);
//			    double average1,average2,average3;
//			    int i=1;
//				while((thisLine=in.readLine())!=null){
//					   i+=1;
//				       String str=thisLine;
//				       String[]stu=new String[3];
//				       stu=str.split("#");
//				       
//				       
//				     if(Min1>Integer.parseInt(stu[1])){Min1=Integer.parseInt(stu[1]);}
//				     if(Max1<Integer.parseInt(stu[1])){Max1=Integer.parseInt(stu[1]);}
//				     if(Min2>Integer.parseInt(stu[2])){Min2=Integer.parseInt(stu[2]);}
//				     if(Max2<Integer.parseInt(stu[2])){Max2=Integer.parseInt(stu[2]);}
//				     if(Min3>Integer.parseInt(stu[3])){Min3=Integer.parseInt(stu[3]);}
//				     if(Max3<Integer.parseInt(stu[3])){Max3=Integer.parseInt(stu[3]);}
//				     total1+=Integer.parseInt(stu[1]);
//				     total2+=Integer.parseInt(stu[2]);
//				     total3+=Integer.parseInt(stu[3]);
//				     
//				}
//				average1=total1/i;
//				average2=total2/i;
//				average3=total3/i;
//				System.out.println("英语、数学、计算机成绩的最小值分别是"+Min1+"、"+Min2+"、"+Min3);
//				System.out.println("英语、数学、计算机成绩的最大值分别是"+Max1+"、"+Max2+"、"+Max3);
//				System.out.println("英语、数学、计算机成绩的平均值分别是"+df.format(average1)+"、"+df.format(average2)+"、"+df.format(average3));
//				in.close();
//			}
//			catch(IOException e){}
//			finally{}	
//		}
	//}
	//import java.util.Scanner;
	//import java.io.*;
	//public class 第十章{
//		public static void main(String[]args)throws IOException{
//		  try{ 
//		  String thisLine;
//		  System.out.println("请输入一个年份，如2006"); 
//		  Scanner input=new Scanner(System.in);
//		   
//		   int str;
//		   str=input.nextInt();
//		   String country=null;
//		   BufferedReader in =new BufferedReader(new FileReader("F:\\My java\\worldcup.txt"));
//		   while((thisLine=in.readLine())!=null){
//			  
//		       String s=thisLine;
//		       String[]year=new String[1];
//		       year=s.split("/");
//		       if(str==Integer.parseInt(year[0])){
//		    	   country=year[1];
//		    	    }
//		       
//		   }in.close();
//		   if(country==null){System.out.println("没有举行世界杯");}
//		   else{System.out.println(country); } 
//		  
//		  }   
//		  catch(IOException e){}
//		  finally{}
//		}
	//	
	//}
//实验50
	//import java.io.*;
	//public class 第十章{
	//public static void main(String args[]) throws Exception{
	//FileWriter fw = new FileWriter("F:\\My java\\test1.txt");
	//BufferedWriter bw = new BufferedWriter(fw);
	//String str = "Hello World";
	//
	//bw.write(str);
	//bw.close();
	//}
//	//}
//	import java.io.*;
//	public class 第十章{
//		public static void main(String[]args)throws IOException{
//			int i;
//			FileInputStream fin;
//			fin=new FileInputStream("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\Myself\\myfile.txt");
//			do{
//				i=fin.read();
//				if(i!=1)
//					System.out.print((char)i);
//				}while(i!=1);
//			fin.close();
//			}
//		}
//实验51
//import java.io.*;
//public class 第十章{
//	public static void main(String[]args)throws IOException{
//		int i;
//		FileInputStream fin;
//		FileOutputStream fout;
//		fin=new FileInputStream("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\Myself\\myfile.txt");
//		fout=new FileOutputStream("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\Myself\\yourfile.txt");
//		do{
//			i=fin.read();
//			if(i!=-1)
//				fout.write(i);
//		}while(i!=-1);
//		fin.close();
//		fout.close();
//		System.out.println("myfile.txt内容已经被复制到yourfile。txt文件中");
//	}
//}
//实验52
//import java.io.*;
//public class 第十章
//{
//   public static void main(String[]args)throws IOException{
//	   char[]c=new char[50];
//	   FileReader fr=new FileReader("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\Myself\\myfile.txt");
//	   int num=fr.read(c);
//	   String str=new String(c,0,num);
//	   System.out.println("读取的字符个数为："+num+"，其内容如下：");
//	   System.out.println(str);
//   }	
//}
//实验53
//import java.io.*;
//public class 第十章{
//	public static void main(String[] args)throws IOException{
//		   FileWriter fw=new FileWriter("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\Myself\\test.txt");
//		   String str1="广东金融学院";
//		   String str2="欢迎使用Java";
//		   fw.write(str1);
//		   fw.write(str2);
//		   fw.close();
//		   System.out.println("内容已写入到文件test。txt中");   
//	}
//}
//import java.io.*;
//public class 第十章{
//	public static void main(String[]args)throws IOException{
//		if(args.length==0){
//			System.out.println("没有需要创建的文件");
//			System.exit(1);
//		}
//		for(int i=0;i<args.length;i++)
//		new File(args[i]).createNewFile();
//	}
//}
//import java.io.*;
//public class 第十章{
//	public static void main(String[]args)throws IOException{
//		BufferedWriter out =new BufferedWriter(new FileWriter("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\Myself\\a.txt"));
//		out.write("广东金融学院");
//		out.newLine();
//		out.write("Java程序设计");
//		out.flush();
//		out.close();
//	}
//}
//实验57
//import java.util.Scanner;
//import java.io.*;
//public class 第十章{
//	public static void main(String[]args){
//		File f=new File("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\RandomFile.txt");
//		try{
//			f.createNewFile();
//			}
//		catch(IOException e){
//			System.out.println(e);
//		}
//		String str="abcdefghijklmnopqrstuvwxyz";
//		try{
//			FileWriter fw=new FileWriter(f);
//			fw.write(str);
//			fw.close();
//		}
//		catch(IOException e){
//			System.out.println(e);
//		}
//		int a=-1;
//		Scanner reader=new Scanner(System.in);
//		while(a<0|a>25){
//			System.out.println("从键盘输入一个0~25的整数：");
//			a=reader.nextInt();
//		}
//		try{
//			RandomAccessFile inFile=new RandomAccessFile("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\RandomFile.txt","r");
//			inFile.seek(a);
//			char c= (char)(a+97);
//			inFile.close();
//			System.out.println("RandomFile.txt文件中第"+a+"个字符是"+c);
//		}
//		catch(IOException e){
//			System.out.println(e);
//		}
//		
//		
//	}
//}
//import java.io.*;
//public class 第十章{
//	public static void main(String[]args){
//		try{
//			File x1=new File("C:\\Java\\eclipse-java-neon-3-win32-x86_64\\eclipse\\workspace\\shiyan\\src\\MyText.txt");
//			FileReader x2=new FileReader(x1);
//			BufferedReader x4=new BufferedReader(x2);
//			String x3=null;
//			while((x3=x4.readLine())!=null){
//				System.out.println(x3);
//			}
//			x4.close();
//		}
//		catch(Exception ex){
//			ex.printStackTrace();
//		}
//	}
//}
//import java.io.*;
//public class 第十章{
//	public static void main(String args[]){
//		File file = new File("chp7/corejava.txt");
//		}
//}
//import java.io.*;
//public class 第十章{
//	public static void main(String[]args)throws Exception{
//		File file;
//		file=new File("C:\\Java\\MyJava\\hello.txt");
//		while(file.exists()){
//			System.out.println(file.getPath());
//		}
//		
//	}
//}
//import java.io.*;
//class MyReader{
//	public static  void read(String file){
//	FileReader fr = null;
//	BufferedReader br = null;
//	FileWriter fw = null;
//	BufferedWriter bw = null;
//	String thisLine;
//	try{
//		fr = new FileReader(file);
//		br = new BufferedReader(fr);
//		fw = new FileWriter("C:\\Java\\MyJava\\file3.txt");
//		bw = new BufferedWriter(fw);
//	    while((thisLine=br.readLine())!=null){
//	    	System.out.println(thisLine);
//	    	bw.write(thisLine);
//	    	bw.newLine();
//	    }	bw.close();
//	}
//	catch(IOException ioe){
//		ioe.printStackTrace();
//	}finally{
//		try {
//			br.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	}
//}
//
//public class 第十章{
//	public  void main(String[]args){
//	   MyReader.read("C:\\Java\\MyJava\\file2.txt");
//	   MyReader.read("C:\\Java\\MyJava\\file1.txt");
//	}
//}
//随机读取两个文件
//import java.io.*;
//public class 第十章{
//	
//	public static void main(String[]args)throws IOException{
//	StringBuffer stfDir=new StringBuffer();
//    System.out.println("请输入文件1所在的路径");
//    char ch;
//    while((ch=(char)System.in.read())!='\r')
//    stfDir.append(ch);
//    File dir=new File(stfDir.toString());
//    System.out.println("请输入欲读取的文件名");
//    StringBuffer stfFileName=new StringBuffer();
//    char c;
//    while((c=(char)System.in.read())!='\r')
//    	stfFileName.append(c);
//    stfFileName.replace(0, 1, "");
//    File readForm=new File(dir,stfFileName.toString());
//    if(readForm.isFile()&&readForm.canWrite()&&readForm.canRead()){
//    	RandomAccessFile rafFile=new RandomAccessFile(readForm,"rw");
//    	
//    	while(rafFile.getFilePointer()<rafFile.length())
//    		System.out.println(rafFile.readLine());
//    	
//    	    rafFile.close();
//    	    
//    }
//   
//    else 
//    	System.out.println("文件不可读!");
//	}
//}

//import java.io.*;
//public class 第十章{
//    public static void main(String[] args) throws IOException
//    {
//        //输入流1
//        BufferedReader bufr1 = 
//            new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Java\\MyJava\\file1.txt")));
//        //输出流
//        BufferedWriter bufw = 
//            new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Java\\MyJava\\file3.txt")));
//     
//        String line = null;
//        //将输入流写进输出流
//        while ((line=bufr1.readLine())!=null)
//        {
//            bufw.write(line.toUpperCase());
//            bufw.newLine();
//            bufw.flush();
//        }
////输入流2
//        BufferedReader bufr2 = 
//            new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Java\\MyJava\\file2.txt")));
//        while ((line=bufr2.readLine())!=null)
//        {
//            bufw.write(line.toUpperCase());
//            bufw.newLine();
//            bufw.flush();
//        }
//    
//        //关闭资源
//        bufr1.close();
//        bufr2.close();
//        bufw.close();
//    }
//}
//import java.io.*;
//import java.util.Scanner;
//public class 第十章{
//	public static void main(String[]args)throws Exception{
//		
//		try{
//		System.out.println("请输入文件1的文件路径");
//		Scanner file1=new Scanner(System.in);
//		String f1=file1.nextLine();
//		
//		System.out.println("请输入文件2的文件路径");
//		Scanner file2=new Scanner(System.in);
//		String f2=file2.nextLine();
//		BufferedReader br1=new BufferedReader(new FileReader(f1.toString()));
//		BufferedReader br2=new BufferedReader(new FileReader(f2.toString()));
//		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Java\\MyJava\\file3.txt"));
//		String s1;
//		String s2;
//		while((s1=br1.readLine())!=null)
//		{
//			bw.write(s1);
//			bw.newLine();
//		}
//		while((s2=br2.readLine())!=null){
//			bw.write(s2);
//			bw.newLine();
//		}bw.close();
//		br1.close();
//		br2.close();
//		}
//		catch(Exception e){
//			
//		}
//		finally{
//			
//			
//		}
//		
//	}
//}


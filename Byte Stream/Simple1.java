import java.io.*;  
class Simple{  
 public static void main(String args[])throws Exception{  
  FileReader fr=new FileReader("abc.txt");  
  int i;  
  while((i=fr.read())!=-1)  
  System.out.println(i);  
  
  fr.close();  
 }  
}  
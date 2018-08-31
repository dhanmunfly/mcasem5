package rpcPro;



import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
class ser
{ 
 public static void main(String[] args) throws Exception 
 { 
  ServerSocket sersock = new ServerSocket(3000); 
  System.out.println("Server ready"); 
  Socket sock = sersock.accept( ); 
  BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
  OutputStream ostream = sock.getOutputStream(); 
  PrintWriter pwrite = new PrintWriter(ostream, true);  
  InputStream istream = sock.getInputStream(); 
  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
  String receiveMessage, sendMessage,fun;
  int a,b,c;
  while(true) 
  {
   fun = receiveRead.readLine();
   if(fun != null)
   {
   
	   
   if(fun.compareTo("date")==0)
   {
	   final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	   LocalDateTime now = LocalDateTime.now();
       System.out.println("Current date"+dtf.format(now));
   }
   if(fun.compareTo("time")==0)
   {
	   final DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" HH:mm:ss");
	   LocalDateTime now = LocalDateTime.now();
       System.out.println("Current time"+dtf.format(now));
   }
   
   System.out.flush();
   }
  } 
 } 
}



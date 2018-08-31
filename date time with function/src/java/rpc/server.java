/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Student
 */
public class server {
    
    
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
       date();
       pwrite.write(date());
       pwrite.close(); 
	   //final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	  // LocalDateTime now = LocalDateTime.now();
         
   } 
   if(fun.compareTo("time")==0)
   {
	//   final DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" HH:mm:ss");
	 //  LocalDateTime now = LocalDateTime.now();
       time();
       pwrite.write(time());
       pwrite.close(); 
   }
 
   System.out.flush();
   }
  } 
  
 } 
    public static String date()
   {
            Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat (" yyyy.MM.dd ");
     // pwrite.write(ft.format(dNow));
      System.out.println("Current Date: " + ft.format(dNow));
     //  System.out.println("Current date"+dtf.format(now));
      return ft.format(dNow);
      
   } 
    public static String time()
    {
          Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat (" hh:mm:ss ");
  //    pwrite.write(ft.format(dNow));
      System.out.println("Current time: " + ft.format(dNow));
     //  System.out.println("Current date"+dtf.format(now));
  //    pwrite.close();
       return ft.format(dNow); 
    }
}

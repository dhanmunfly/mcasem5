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
import java.net.Socket;

/**
 *
 * @author Student
 */
public class client {
    public static void main(String[] args) throws Exception
 {
  Socket sock = new Socket("localhost", 3000); 
  BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
  OutputStream ostream = sock.getOutputStream(); 
  PrintWriter pwrite = new PrintWriter(ostream, true); 
  InputStream istream = sock.getInputStream(); 
  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
  System.out.println("Client ready, type and press Enter key");
  String receiveMessage, sendMessage,temp; 
  while(true) 
  {
   System.out.println("\nEnter date or time");
   temp = keyRead.readLine();
   sendMessage=temp.toLowerCase(); 
   pwrite.println(sendMessage);
  
   System.out.flush(); 
   if((receiveMessage = receiveRead.readLine()) != null) 
    System.out.println(receiveMessage); 
  }
 }
}

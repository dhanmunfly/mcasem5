/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpc;

/**
 *
 * @author hp
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
 
public class server
{
    public static void main(String args[]) throws IOException
    {
 
        // Step 1: Establish the socket connection.
        ServerSocket ss = new ServerSocket(4444);
        System.out.println("server");
        Socket s = ss.accept();
 
        // Step 2: Processing the request.
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 
        while (true)
        {
            // wait for input
            String input = dis.readUTF();
 
            if(input.equals("bye"))
                break;
 
            System.out.println("first name :- " + input);
            dos.writeUTF(input);
            String input1 = dis.readUTF();
            System.out.println("last  :- " + input);
           
 
            // Use StringTokenizer to break the equation into operand and
            // operation
            StringTokenizer st = new StringTokenizer(input);
            String firstname= st.nextToken();
            StringTokenizer st1 = new StringTokenizer(input1);
            String lastname= st1.nextToken();
             String result= firstname + " " + lastname;
           // int oprnd1 = Integer.parseInt(st.nextToken());
           // String operation = st.nextToken();
            //int oprnd2 = Integer.parseInt(st.nextToken());
 
            // perform the required operation.
            
            System.out.println("Sending the result...");
 
            // send the result back to the client.
            dos.writeUTF(result);
        }
    }
}
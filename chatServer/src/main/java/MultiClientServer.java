
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class MultiClientServer {
    private static ServerSocket ServerSocket = null;
    private static Socket ClientSocket = null;
    private static final int MaxClients = 10;
    private static clientThread[] threads=new clientThread[MaxClients];
    public static void main(String args[]) throws IOException
    {
        int portNumber=2222;
        try{
        ServerSocket = new ServerSocket(portNumber);
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }
}

import java.net.*;
import java.io.*;

class Main extends Thread 
{
	public static Socket server;

	public static void main(String[] args) 
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(8088);
			serverSocket.setSoTimeout(0);

			//String ip = Console.readLine("");
			System.out.println("Aspetto un client...");
			server = serverSocket.accept();
			System.out.println("Un client si è connesso!");

			Read reader = new Read();
			reader.start();

			Write writer = new Write();
			writer.start();
		}
		catch (Exception e) 
		{
			System.out.println(e);	
		}


	}
	
}
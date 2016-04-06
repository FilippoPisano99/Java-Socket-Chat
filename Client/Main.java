import java.net.*;
import java.io.*;

class Main extends Thread 
{
	public static Socket client;

	public static void main(String[] args) 
	{
		try
		{
			String ip = Console.readLine("IP:");
			client = new Socket(ip,8088);

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
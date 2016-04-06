import java.net.*;
import java.io.*;

class Write extends Thread 
{
	static DataOutputStream out;

	Write()
	{

	}

	public void run() 
	{
		try
		{
			out = new DataOutputStream(Main.client.getOutputStream());
			write();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	static int write() throws IOException 
	{
		String msg = "";
		do
		{
			msg = Console.readLine("[Client]:");
			out.writeUTF(msg);
		}while(!msg.equals("EXIT"));
		return 1;
	}
	
}
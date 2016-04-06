import java.net.*;
import java.io.*;

class Read extends Thread  
{
	static DataInputStream in ;

	Read ()
	{

	}

	public void run() 
	{
		try
		{
			in = new DataInputStream(Main.client.getInputStream());
			read();
		}
		catch (IOException e) 
		{
			System.out.println(e);	
		}
	}

	void read() throws IOException 
	{
		while(true)
		{
			System.out.println("[Server]:" + in.readUTF());			
		}
	}
}
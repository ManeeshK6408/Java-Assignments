package sample;

import java.io.*;
public class FileWriter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Administrator\\Desktop\\java programs\\sample file.txt");
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			PrintWriter out = new PrintWriter(new FileWriter(file));
			String s;
			System.out.println("Enter the file text");
			System.out.println("Type ctrl+d to stop");
			while((s=in.readLine())!=null)
			{
				out.println(s);
			}
			in.close();
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

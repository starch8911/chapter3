import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class code 
{

	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J���");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println("�z��J���Ʀr�O"+num);
	}

}

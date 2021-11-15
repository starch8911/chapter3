import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class code 
{

	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println("您輸入的數字是"+num);
	}

}

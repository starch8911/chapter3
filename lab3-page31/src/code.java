public class code 
{
	public static void main(String[] args) 
	{
		Car.showSum();
		
		Car car1;
		car1 = new Car(1234,20.5);
		car1.show();
		
		Car car2;
		car2 = new Car(4567,30.5);
		car2.show();
	}	
}
		 
class Car
{
public static int sum=0;	
	
	private int num;
	private double gas;
	
	public Car()
	{
		
		num=0;
		gas=0.0;
		sum++;
		System.out.println("�Ͳ��F���l");	
	}
	public Car(int n,double g)
	{
		
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");	
	}
	public static void showSum()
	{
		System.out.println("���l�`�@��"+sum+"�x");
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
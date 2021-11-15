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
		System.out.println("生產了車子");	
	}
	public Car(int n,double g)
	{
		
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");	
	}
	public static void showSum()
	{
		System.out.println("車子總共有"+sum+"台");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
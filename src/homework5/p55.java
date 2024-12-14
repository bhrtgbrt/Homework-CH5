package homework5;

public class p55 
{
	public static void main(String[] args) 
	{
		Company1 cmp = new Company1();
		
		Driver1 drv1 = new Driver1(cmp);
		drv1.start();
		
		Driver1 drv2 = new Driver1(cmp);
		drv2.start();
	}
}

class Company1
{
	private int sum = 0;
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("目前的合計金額是"+ tmp +"元");
		System.out.println("賺到"+ a +"元了。");
		tmp = tmp+a;
		System.out.println("合計金額是"+ tmp +"元");
		sum = tmp;
	}
}

class Driver1 extends Thread
{
	private Company1 comp;
	public Driver1(Company1 c){
		comp = c;
	}
	
	public void run() 
	{
		for(int i=0;i<3;i++) 
		{
			comp.add(50);
		}
	}
}
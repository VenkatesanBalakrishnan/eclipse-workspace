package practiceAtOffice;

public class LoopsDemo {
	
	int num =1;
	int mind=0;
	
	public void printSum()
	{
while(num<=10)
{
	mind=num+ mind;
	
	num++;
	
	System.out.println(mind);
	}
	}
	
	public void printSumFor()
	{
for(int num1=1;num1<=10;num++)
{
	mind=num1+mind;
	num1++;
	System.out.println(mind);
}
	}
	
	public static void main(String[] args) {
		
		LoopsDemo l = new LoopsDemo();
		//l.printSum();
		l.printSumFor();
		
		
		
	}

}

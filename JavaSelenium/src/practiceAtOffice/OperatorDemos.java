package practiceAtOffice;

public class OperatorDemos {
	
	int var1=24;
	int var2=21;
	
	public void arithmeticOps()
	{
		System.out.println(var1+var2);
		System.out.println(var1-var2);
		System.out.println(var1/var2);
		System.out.println(var1*var2);
		System.out.println(var1%var2);
	}
	public void relationalOps()
	{
		System.out.println(var1>var2);//f
		System.out.println(var1<var2);//t
		System.out.println(var1>=var2);//f
		System.out.println(var1<=var2);//t
		System.out.println(var1==var2);//f
		System.out.println(var1!=var2);//t
	}
	public void logicalOps()
	{
		System.out.println((var1>var2)&&(var1<=var2));//f
		System.out.println((var1<var2)||(var1<var2));//t
		System.out.println(!(var1>var2));//t
	}
	public void assinmentOps()
	{
		int A=var1;
		System.out.println(A);
	
	}
	
	public void ShorthandOps()
	{
		var1 += var2;
		System.out.println(var1);
	
	}
	
	public void incrementdecrementOps()
	{
		var1++;
		System.out.println(var1);
	
	}
	
	public void conditianalOps()
	{
	
		System.out.println((var1>=18)?"Eligible for Vote":"Not eligible");
	
	}
	
		
	
	public static void main(String[]args)
	{
		OperatorDemos a = new OperatorDemos();
//		a.arithmeticOps();
//		a.relationalOps();
//		a.logicalOps();
//		a.assinmentOps();
//		a.ShorthandOps();
//		a.incrementdecrementOps();
		a.conditianalOps();
	}

}

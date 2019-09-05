//class ArrayTest 
//{
	//int arr[];//declaration
	//char[] a=new char[];//array creating
	
//	public static void main(String[] args) 
//	{
//			int arr[]={0,1,2,3};
//			int ab[][]=new int[3][4];//{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//	             ab={1,2,3};
//			//ab[][]
//		System.out.println("Hello World!");
//		System.out.println("AB:"+ab.length);
//		System.out.println("A:"+arr.length);
//		System.out.println("A:"+arr[0]);
//	
//		System.out.println("AB:"+ab[0].length);
//		System.out.println("AB:"+ab[0]);
		
//	}
//}
interface Interface12
{
	public void abc()throw IOException;
}
interface Interface13
{
	public void abc();//throw FileNotFoundException;
}
public class ArrayTest implements Interface12,Interface13
{
	public void abc()
	{

		System.out.println("abc()");
	}

public static void main(String[] args)
	{
ArrayTest in=new ArrayTest();
try
{
	in.abc();
}
catch (IOException e)
{
	System.out.println(e);
}
	
	}
}


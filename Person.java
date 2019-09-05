class Person 
{
	static int eyes=1;
	int legs;
	int ear;
	void eat()
	{
		System.out.println("Eating................");
	}
}
class Student extends Person
   {
	String name;
	int id;
	public static void main(java.lang.String[] args) 
	{
		//Person p1=new P();
		Student s1=new Student();
		System.out.println("Result..."+eyes);

	}
}



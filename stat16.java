class stat16
{
static void put()
{	System.out.println("Static in base");	}
public static void main(String[] ar)
{	put();show();	}
}
class next extends stat16
{
static void show()
{
System.out.println("Static in derived");
}
}
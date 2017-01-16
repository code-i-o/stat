class stat14
{
static void show()
{	System.out.println("Static in base");	}
public static void main(String[] ar)
{
show();
next.show1();
}
}
class next //extends stat14
{
static void show1()
{	System.out.println("Static in derived");	}
}
class stat15
{
static void put()
{	System.out.println("Static in base");	}
}
class next extends stat15
{
static void show()
{	System.out.println("Static in derived");	}
public static void main(String[] ar)
{
put();
show();
}
}
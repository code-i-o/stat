class stat13
{
static void show()
{	System.out.println("Static in base");	}
}
class next extends stat13
{
static void show()//overhiding
{	System.out.println("Static in derived");	}
public static void main(String[] ar)
{
show();
stat13.show();
}
}
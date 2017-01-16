class stat5
{
static
{	System.out.println("Static Block1");
//System.exit(0);
	}

public static void main(String[] ar)
{
System.out.println("Main Block");
}

static
{
System.out.println("Static Block2");
}
}
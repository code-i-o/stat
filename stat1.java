class stat1
{
public static void main()
{
System.out.println("Main2");
}

public  static void main(String[] arg)
{
System.out.println("Main before calling");
main();
System.out.println("Main after calling");
}


}
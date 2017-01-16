class stat8
{
static int a;
int b;
void show()
{
System.out.println(a);
System.out.println(b);
}
public static void main(String[] ar)
{
stat8 ob1=new stat8();
ob1.show();
new stat8().show();
}
}
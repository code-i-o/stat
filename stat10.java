class stat10
{
static int a;
int b;
stat10(int a,int b){	a=a;	b=b;	}
void show()
{
System.out.println(a);System.out.println(b);
}
public static void main(String[] ar)
{
stat10 ob1=new stat10(100,200);
stat10 ob2=new stat10(1000,2000);
ob1.show();
ob2.show();
}
}
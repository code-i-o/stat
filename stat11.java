class stat11
{
static int a;
int b;
stat11(int a,int b){	this.a=a;	this.b=b;	}
void show()
{
System.out.println(a);System.out.println(b);
}
public static void main(String[] ar)
{
stat11 ob1=new stat11(100,200);
stat11 ob2=new stat11(1000,2000);
ob1.show();
ob2.show();
}
}
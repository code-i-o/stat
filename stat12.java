class stat12
{
static void show()
{
System.out.println("Static in base");
}
}
class next extends stat12
{
void show()
{
System.out.println("Static in derived");
}
}
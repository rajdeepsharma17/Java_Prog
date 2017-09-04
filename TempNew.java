class TempNew
{
int x =getX();
int getX()
{
System.out.println(x);
return 40;
}

TempNew()
{
System.out.println(x+"From Temp");
}

public static  void main(String...  s)
{
new TempNew();
}
}
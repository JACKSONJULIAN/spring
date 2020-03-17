package spring;
public class A implements ABS
{
static ABS getA()
{
	return new A();
}
public void disp()
{
	System.out.println("hello user");
}
}

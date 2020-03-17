package spring;

public class Employee 
{
private int id=20;
private String name;
public Employee()
{
	System.out.println(" def cons");
}
public Employee(int id)
{
	this.id=id;
}
public Employee(String name)
{
	this.name=name;
}
void show()
{
	System.out.println(id+" "+name);
}
}

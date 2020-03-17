package spring;

public class Student 
{
private String name;
public String GetName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public void displayinfo()
{
	System.out.println("hello:"+name);
}
}
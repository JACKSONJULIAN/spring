package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class D 
{
	@Autowired
C c;
D()
{
	System.out.println(" d is created");
}
public C getC()
{
	return c;
}
public void setC(C c)
{
	this.c=c;

}
void print()
{
	System.out.println("hello d");
}
void display()
{
	print();
	c.print();
}
}

package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test4 
{
public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring/A2.xml");
	D a=(D)context.getBean("d");
	a.display();	
}
}

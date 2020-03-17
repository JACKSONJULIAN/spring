package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test3 
{
public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring/A.xml");
	ABS a=(ABS)context.getBean("a");
	a.disp();
}
}

package spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class TestByDeployCons 
{
public static void main(String[] args)
{
	Resource r=new ClassPathResource("spring/appDepByCons.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	Employee s=(Employee)factory.getBean("e5");
	s.show();
	Employee s1=(Employee)factory.getBean("e6");
	s1.show();
	Employee s2=(Employee)factory.getBean("e7");
	s2.show();
	}
}

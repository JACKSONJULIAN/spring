package spring;

//test class
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.CollectionFactory.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.*;
public class TestByDeinConsAggr
{
public static void main(String[] args)
{
Resource r=new ClassPathResource("spring/appDepByConsAqqr.xml");
BeanFactory factory=new XmlBeanFactory(r);

EmpAddr s=(EmpAddr)factory.getBean("e");
s.show();
}
}

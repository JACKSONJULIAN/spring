package spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test 
{
public static void main(String[] args) 
{
	Resource resource=new ClassPathResource("spring/applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	//Student student=(Student)factory.getBean("studentbean");
	//student.setName("Tilaka");
	//student.displayinfo();
	Student objB=(Student)factory.getBean("studentbean");
		objB.displayinfo();	
		Student obj=(Student)factory.getBean("studentbean1");
		obj.displayinfo();	
}
}

package spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test2 
{
	public static void main(String[] args) 
	{
		Resource resource=new ClassPathResource("spring/applicationcontext2.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Question q=(Question)factory.getBean("q");
		q.displayinfo();
	}
}

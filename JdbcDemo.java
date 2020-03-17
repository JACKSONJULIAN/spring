package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class JdbcDemo
{
public static void main(String[] args)
{
String confFile	= "spring/Employee.xml";
ConfigurableApplicationContext context= new ClassPathXmlApplicationContext(confFile);
EmployeeDAO empDao=(EmployeeDAO) context.getBean("employeeDAO");
Employeesql emp=empDao.findemployeesqlById(846765);
System.out.println(emp.getName()+" "+emp.getSalary()+" "+ emp.getDept());
}
}

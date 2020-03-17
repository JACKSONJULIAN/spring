package spring;
import org.springframework.jdbc.core.JdbcTemplate;
public class EmployeeDao2 
{
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
{
	this.jdbcTemplate = jdbcTemplate;
}
public int saveEmployee(Employee2 e)
{
	String query="insert into emp values('"+e.getId()+"', '"+e.getName()+"'+'"+e.getSalary()+"')";
	return jdbcTemplate.update(query);
}
public int updateEmployee(Employee2 e)
{
	String query="update emp set(name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"')";
	return jdbcTemplate.update(query);
}
public int deleteEmployee(Employee2 e)
{
	String query="delete from emp where id='"+e.getId()+"'";
	return jdbcTemplate.update(query);
}
}
package spring;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
public class EmployeeImpJ implements EmployeeDAO
{
private DataSource dataSource;
public void setDataSource(DataSource dataSource) 
{
	this.dataSource = dataSource;
}
@Override
public Employeesql findemployeesqlById(int empId)
{
	Employeesql emp=null;
	
	String query ="select * from emp where empId=?";
	Connection conn=null;
	PreparedStatement prepStmt=null;
	ResultSet rsltSet=null;
	try
	{
		conn=dataSource.getConnection();
		prepStmt=conn.prepareStatement(query);
		prepStmt.setInt(1, empId);
		rsltSet= prepStmt.executeQuery();
		emp=new Employeesql();
		while(rsltSet.next())
		{
			emp.setEmpId(empId);
			emp.setName(rsltSet.getString("name"));
			emp.setSalary(rsltSet.getInt("salary"));
			emp.setDept(rsltSet.getString("dept"));
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	finally 
	{
			try {
		if(rsltSet!=null) 
			rsltSet.close();
		if(prepStmt!=null)
			prepStmt.close();
			}
			catch(Exception ex)
			{
				
			}
		
	}
	return emp;
}
}




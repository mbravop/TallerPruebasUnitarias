import static org.junit.Assert.*;
import org.junit.Test;
import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class PruebasCS {

	@Test
	public void workerUSDmesImpar() {

		Employee empleado = new Employee(100, "USD", 5, EmployeeType.Worker);
		assertEquals(164.33, empleado.cs(),0.01);
	}
	@Test
	public void workerUSDmesPar() {

		Employee empleado = new Employee(100, "USD", 5, EmployeeType.Worker);
		assertEquals(100.00, empleado.cs(),0.01);
	}
	
	@Test
	public void supervisorUSDmesImpar() {
	
		Employee empleado = new Employee(100, "USD", 10, EmployeeType.Supervisor);
		assertEquals(167.83, empleado.cs(),0.01);
	}
	@Test
	public void supervisorUSDmesPar() {
	
		Employee empleado = new Employee(100, "USD", 10, EmployeeType.Supervisor);
		assertEquals(103.50, empleado.cs(),0.01);
	}
	
	@Test
	public void managerUSDmesImpar() {
	
		Employee empleado = new Employee(100, "USD", 20, EmployeeType.Manager);
		assertEquals(178.33, empleado.cs(),0.01);
	}
	@Test
	public void managerUSDmesPar() {
	
		Employee empleado = new Employee(100, "USD", 20, EmployeeType.Manager);
		assertEquals(114.00, empleado.cs(),0.01);
	}
	
	@Test
	public void noUSDmesImpar() {
	
		Employee empleado = new Employee(100, "EUR", 40, EmployeeType.Supervisor);
		assertEquals(173.33 , empleado.cs(),0.01);
	}
	

}

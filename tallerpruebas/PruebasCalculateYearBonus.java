import static org.junit.Assert.*;

import org.junit.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class PruebasCalculateYearBonus {

	@Test
	public void bonusWorkerUSD() {
		Employee empleado = new Employee(100, "USD", 5, EmployeeType.Worker);
		assertEquals(386.00, empleado.CalculateYearBonus(),0.01);
	}
	
	@Test
	public void bonusSupervisorUSD() {
		
		Employee empleado = new Employee(100, "USD", 10, EmployeeType.Supervisor);
		assertEquals(293.00, empleado.CalculateYearBonus(),0.01);
	}

	@Test
	public void bonusManagerUSD() {
		
		Employee empleado = new Employee(100, "USD", 20, EmployeeType.Manager);
		assertEquals(486.00, empleado.CalculateYearBonus(),0.01);
	}
	
	@Test
	public void bonusNoUSD() {
		
		Employee empleado = new Employee(100, "EUR", 10, EmployeeType.Supervisor);
		assertEquals(288.00, empleado.CalculateYearBonus(),0.01);
	}
	

	
}

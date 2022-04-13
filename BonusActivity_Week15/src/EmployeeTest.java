import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPay() {
		Employee pay1 = new Employee("Arun",30);
		
		assertEquals(450,pay1.getTotalPay());
		
		Employee pay2 = new Employee("Arun",45);
		
		assertEquals(682.5,pay2.getTotalPay());
	}

}

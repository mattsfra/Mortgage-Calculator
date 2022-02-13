import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// the critical function needed to test is the mortgage calculator
public class prospectTest {
	
	
	
	@Test
	void test1() {
		
		Prospect prospect1 = new Prospect();
	
		prospect1.setName("Richard Johnson");
		prospect1.setInterest(1);
		prospect1.setTotal(1000000);
		prospect1.setYears(10);
		

		assertEquals(8760.41213735,prospect1.getFixedPayment());
	}

}

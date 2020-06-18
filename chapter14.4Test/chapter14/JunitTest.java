package chapter14;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

@Test
void StringComparison() {
	String firstString ="";
	String secondString="";
	
	
	boolean result = firstString.regionMatches(true, 0,secondString, 0,1);
	assertFalse(result);
	
	result = firstString.regionMatches(true, 0,secondString, 0,5);

	assertFalse(result);

}

}

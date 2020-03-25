package hometask8.hometask8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckFirst2CharsTest {

	/*		TODO list
	*	“ABCD” => “BCD” 
	    “AACD” => “CD”  
	    “BACD” => “BCD” 
	    “BBAA” => “BBAA”        
	    “AABAA” => “BAA” 
	* 
	*/
	
	@Test
	void test1Aat1character(){
		CheckFirst2Chars obj = new CheckFirst2Chars();
		String actual = obj.Remove("ABCD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test2Aas2characters(){
		CheckFirst2Chars obj = new CheckFirst2Chars();
		String actual = obj.Remove("AACD");
		assertEquals("CD",actual);
	}
   @Test
	void test1Aat2character(){
		CheckFirst2Chars obj = new CheckFirst2Chars();
		String actual = obj.Remove("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void testnoAcharacters(){
		CheckFirst2Chars obj = new CheckFirst2Chars();
		String actual = obj.Remove("BBAA");
		assertEquals("BBAA",actual);
	}
	void characters2Awithdifferentlength(){
		CheckFirst2Chars obj = new CheckFirst2Chars();
		String actual = obj.Remove("AABBAA");
		assertEquals("BBAA",actual);
	}

}

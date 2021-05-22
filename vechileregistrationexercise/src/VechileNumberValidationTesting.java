import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class VechileNumberValidationTesting {
	private static VechileNumberValidation vechileNumber;
	@BeforeClass
	public static void setup() {
		// setup methods runs, before every test case runs
		// This method is used to initialize the required variables
		vechileNumber = new VechileNumberValidation();
	}
	@AfterClass
	public static void teardown() {
		// teardown method runs, after every test case run
		// This method is to clear the initialized variables
		vechileNumber = null;
	}
	@Test
	public void test() {
		assertEquals("test():Extraction failed. Check checkluckyNumber() method.", "It's a Lucky Number",
				vechileNumber.characterArrayeckluckyNumber("KA05SS3456"));
		assertEquals("test(): Extraction failed. Check checkluckyNumber() method.", "It's a Lucky Number",
				vechileNumber.characterArrayeckluckyNumber("DL03DL0987"));
		assertEquals("test(): Extraction failed. Check checkluckyNumber() method.", "It's not Lucky Number",
				vechileNumber.characterArrayeckluckyNumber("KL03DL0980"));
		assertEquals("test(): Extraction failed. Check checkluckyNumber() method.", "It's not Lucky Number",
				vechileNumber.characterArrayeckluckyNumber("DI03DL0080"));
	}
	@Test
	public void testNumber() {
		assertEquals("testNumber():Extraction failed. Check checkluckyNumber() method.", "It's Invalid number",
				vechileNumber.characterArrayeckluckyNumber("KA5CC3456"));
		assertEquals("testNumber(): Extraction failed. Check checkluckyNumber() method.", "It's Invalid number",
				vechileNumber.characterArrayeckluckyNumber("KA055C3456"));
		assertEquals("testNumber(): Extraction failed. Check checkluckyNumber() method.", "It's Invalid number",
				vechileNumber.characterArrayeckluckyNumber("DL03CC789"));
		assertEquals("testNumber(): Extraction failed. Check checkluckyNumber() method.", "It's Invalid number",
				vechileNumber.characterArrayeckluckyNumber(" "));
	}
	@Test
	public void testReturnValue() {
		assertNotEquals("testReturnValue():Failed. Check checkluckyNumber() method.", "Its Invalid number",
				vechileNumber.characterArrayeckluckyNumber(" "));
		assertNotNull("testReturnValue():Failed. Check checkluckyNumber() method.", vechileNumber.characterArrayeckluckyNumber(" "));
	}
}
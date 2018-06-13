import static org.junit.Assert.*;

import org.itstep.model.Model;
import org.junit.Test;
import java.util.Scanner;
import java.util.Scanner;
public class EEETest {

	@Test
	public void inputWordByScaner1() {
		Scanner scanner = new Scanner (System.in);
		Model model = new Model();
		String result1 = model.inputWordByScaner1(scanner);
		assertEquals("Hello", result1);	
	}
	
	@Test
	public void inputWordByScaner2() {
		Scanner scanner = new Scanner (System.in);
		Model model = new Model();
		String result2 = model.inputWordByScaner2(scanner);
		assertEquals("world", result2);	
	}
	
	@Test
	public void writeSentence () {
		String name1 = "Hello";
		String name2 = "world";
		Model model = new Model();
		String result3 = model.writeSentence(name1,name2);
		assertEquals("Hello" + " " + "world", result3);	
	}
	
	@Test
	public void testInputWordByScanner1ResultNull () {
		Scanner scanner = new Scanner (System.in);
		Model model = new Model();
		String result4 = model.inputWordByScaner1(scanner);
		assertNotNull(result4);
	}
	
	@Test
	public void testInputWordByScanner2ResultNull () {
		Scanner scanner = new Scanner (System.in);
		Model model = new Model();
		String result5 = model.inputWordByScaner2(scanner);
		assertNotNull(result5);
	}
	
	
}



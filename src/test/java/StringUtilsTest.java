import static org.junit.Assert.*;
import org.junit.Test;
import fr.diginamic.utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
		int result = StringUtils.levenshteinDistance("Chat", "Chats");
		assertEquals(1, result);
		result = StringUtils.levenshteinDistance("Machins", "Machine");
		assertEquals(1, result);
		result = StringUtils.levenshteinDistance("Avion", "Aviron");
		assertEquals(1, result);
		result = StringUtils.levenshteinDistance("Distance", "Instance");
		assertEquals(2, result);
		result = StringUtils.levenshteinDistance("Chien", "Chine");
		assertEquals(2, result);
		result = StringUtils.levenshteinDistance("", "");
		assertEquals(0, result);
		result = StringUtils.levenshteinDistance(null, "Ours");
		assertEquals(-1,result);
	}
	
}

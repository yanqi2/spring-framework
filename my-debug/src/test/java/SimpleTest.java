import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author Yan
 * @version 1.0
 * @since 2020/12/30 17:51
 */
public class SimpleTest {
	public static final String MULTI_VALUE_ATTRIBUTE_DELIMITERS = ",; ";

	@Test
	public void test() {
		String[] strings = StringUtils.tokenizeToStringArray("a,b;c", MULTI_VALUE_ATTRIBUTE_DELIMITERS);
		Arrays.stream(strings).forEach(System.out::println);
	}
}

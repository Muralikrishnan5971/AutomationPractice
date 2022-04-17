package javaForTesters;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.BDDAssertions;
import org.testng.annotations.Test;

public class AssertionsUsingAssetJ {

	@Test
	public void testValidation() {

		String temp = "Muralikrishnan";
		String a = "";
		String b = "   ";

		Assertions.assertThat(temp).isNotBlank().isNotEmpty().isEqualTo("Muralikrishnan").hasSize(14);

		BDDAssertions.then(temp);
	}

}

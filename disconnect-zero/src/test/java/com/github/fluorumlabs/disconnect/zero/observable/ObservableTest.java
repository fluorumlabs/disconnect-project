package com.github.fluorumlabs.disconnect.zero.observable;

import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;

/**
 * Created by Artem Godin on 4/21/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class ObservableTest {

	@Test
	public void testOf() {
		Assert.assertThat("Haha", "Something", is("Someting"));
	}
}
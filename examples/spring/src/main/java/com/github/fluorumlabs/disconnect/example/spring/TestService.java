package com.github.fluorumlabs.disconnect.example.spring;

import com.github.fluorumlabs.disconnect.core.annotations.AllowClientCalls;
import com.github.fluorumlabs.disconnect.example.spring.client.BasicExampleEntryPoint;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Artem Godin on 2/11/2020.
 */
@Service
public class TestService {
	@AllowClientCalls
	public String hello() {
		return "Hello from server";
	}

	@AllowClientCalls
	public int getNumber() {
		return 5;
	}

	@AllowClientCalls
	public Double getDouble() {
		return 142.857;
	}

	@AllowClientCalls
	public int count(List<String> list) {
		return list.size();
	}

	@AllowClientCalls
	public List<String> getStrings() {
		return Arrays.asList("aaa", "bbb");
	}

	@AllowClientCalls
	public String helloInt(int value1, int value2) {
		return "Hello from Server, I got " + (value1 + value2);
	}

	@AllowClientCalls
	public String helloBean(BasicExampleEntryPoint.DummyBean value) {
		return "Hello from Server, I got " + value.value1;
	}

}

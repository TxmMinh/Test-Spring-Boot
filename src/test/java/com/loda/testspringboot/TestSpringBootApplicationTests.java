package com.loda.testspringboot;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testUserMockFunction() {
		List mockList = Mockito.mock(List.class);

		Mockito.when(mockList.size()).thenReturn(2);

		assertEquals(2, mockList.size());
	}
}

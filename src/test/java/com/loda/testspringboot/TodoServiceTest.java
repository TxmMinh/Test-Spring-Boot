package com.loda.testspringboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class) // Tạo context chứa các bean
@SpringBootTest // Đưa các toàn bộ bean trong App vào
public class TodoServiceTest {
    /**
     * Cách này sử dụng @SpringBootTest
     * Nó sẽ load toàn bộ Bean trong app của bạn lên,
     * Giống với việc chạy App.java vậy
     */

    /**
     * Đối tượng TodoRepository sẽ được mock, chứ không phải bean trong context
     */
    @MockBean
    TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;

    @BeforeEach
    public void setUp() {
        Mockito.when(todoRepository.findAll())
                .thenReturn(IntStream.range(0, 10)
                        .mapToObj(i -> new Todo(i, "title-" + i, "detail-" + i))
                        .collect(Collectors.toList()));

    }

    @Test
    public void testCount() {
        assertEquals(10, todoService.countTodo());
    }


}

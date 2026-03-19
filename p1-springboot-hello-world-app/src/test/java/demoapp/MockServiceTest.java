package demoapp;

import demoapp.service.PalindromeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MockServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PalindromeService palindromeService;

    @Test
    public void palindromeMockShouldReturnCustomMessage() throws Exception {
        when(palindromeService.isPalindrome("test")).thenReturn(true);

        this.mockMvc.perform(post("/palindrome").param("word", "test"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("It is a palindrome")));
    }
}
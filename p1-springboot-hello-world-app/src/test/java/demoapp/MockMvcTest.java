package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    // Homepage
    @Test
    public void homeShouldReturnHello() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello")));
    }

    // Saludo form
    @Test
    public void saludoFormShouldWork() throws Exception {
        this.mockMvc.perform(post("/saludoform")
                        .param("nombre", "Juan"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Juan")));
    }

    // Palindrome
    @Test
    public void palindromeShouldWork() throws Exception {
        this.mockMvc.perform(post("/palindrome").param("word", "madam"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("It is a palindrome")));
    }

    // Even
    @Test
    public void evenShouldWork() throws Exception {
        this.mockMvc.perform(post("/even").param("number", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Even number")));
    }

    // Square
    @Test
    public void squareShouldWork() throws Exception {
        this.mockMvc.perform(post("/square")
                        .param("a", "4")
                        .param("b", "16"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Correct square")));
    }

    // Calculator
    @Test
    public void calculatorShouldWork() throws Exception {
        this.mockMvc.perform(post("/calculator")
                        .param("a", "2")
                        .param("b", "3")
                        .param("operation", "+"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Result: 5")));
    }
}
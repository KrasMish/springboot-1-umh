package demoapp;

import demoapp.service.PalindromeService;
import demoapp.service.EvenService;
import demoapp.service.SquareService;
import demoapp.service.CalculatorService;
import demoapp.service.SaludoService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ServiceTest {

    // Тестируем существующий сервис
    @Autowired
    SaludoService saludo;

    // Новые сервисы
    private final PalindromeService palindromeService = new PalindromeService();
    private final EvenService evenService = new EvenService();
    private final SquareService squareService = new SquareService();
    private final CalculatorService calculatorService = new CalculatorService();

    // Проверка SaludoService
    @Test
    public void contextLoads() {
        assertThat(saludo).isNotNull();
    }

    @Test
    public void serviceSaludo() {
        assertThat(saludo.saluda("Juan")).isEqualTo("Hola Juan");
    }

    // Palindrome
    @Test
    public void testPalindrome() {
        assertThat(palindromeService.isPalindrome("madam")).isTrue();
        assertThat(palindromeService.isPalindrome("hello")).isFalse();
    }

    // Even
    @Test
    public void testEven() {
        assertThat(evenService.isEven(4)).isTrue();
        assertThat(evenService.isEven(3)).isFalse();
    }

    // Square
    @Test
    public void testSquare() {
        assertThat(squareService.isSquare(4, 16)).isTrue();
        assertThat(squareService.isSquare(5, 20)).isFalse();
    }

    // Calculator
    @Test
    public void testCalculator() {
        assertThat(calculatorService.calculate(2, 3, "+")).isEqualTo(5);
        assertThat(calculatorService.calculate(5, 3, "-")).isEqualTo(2);
        assertThat(calculatorService.calculate(2, 3, "*")).isEqualTo(6);
        assertThat(calculatorService.calculate(6, 3, "/")).isEqualTo(2);
    }
}
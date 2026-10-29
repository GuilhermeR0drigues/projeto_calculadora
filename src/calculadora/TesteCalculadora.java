package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Testes unitários da classe Calculadora.
    @author Guilherme Rodrigues Pereira de Oliveira
    @version 1.0
 */
public class TesteCalculadora {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testarSoma() {
        // Entrada: 10 + 5
        // Esperado: O resultado é: 15
        assertEquals("O resultado é: 15",
                calculadora.calc(10, 5, "+"));
    }

    @Test
    public void testarSubtracao() {
        // Entrada: 10 - 5
        // Esperado: O resultado é: 5
        assertEquals("O resultado é: 5",
                calculadora.calc(10, 5, "-"));
    }

    @Test
    public void testarMultiplicacao() {
        // Entrada: 10 * 5
        // Esperado: O resultado é: 50
        assertEquals("O resultado é: 50",
                calculadora.calc(10, 5, "*"));
    }

    @Test
    public void testarDivisao() {
        // Entrada: 10 / 5
        // Esperado: O resultado é: 2
        assertEquals("O resultado é: 2",
                calculadora.calc(10, 5, "/"));
    }

    @Test
    public void testarDivisaoPorZero() {
        // Entrada: 10 / 0
        // Esperado: mensagem de erro
        assertEquals("Não é possível divisão por 0",
                calculadora.calc(10, 0, "/"));
    }

    @Test
    public void testarOperadorInvalido() {
        // Entrada: 10 % 5
        // Esperado: mensagem de operador inválido
        assertEquals("Operador inválido, tente (+, -, / ou *)",
                calculadora.calc(10, 5, "%"));
    }
}

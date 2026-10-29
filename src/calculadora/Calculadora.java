
package calculadora;

/**
 * Realiza operações matemáticas básicas.
 *
 * @author Guilherme Rodrigues Pereira de Oliveira
 * @version 2.0
 */
public class Calculadora {

    private static final String MENSAGEM_RESULTADO =
            "O resultado é: ";

    /**
     * Executa uma operação matemática entre dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param op operador matemático
     * @return resultado ou mensagem de erro
     */
    public String calc(int a, int b, String op) {

        if (op == null) {
            return mensagemOperadorInvalido();
        }

        switch (op) {
            case "+":
                return formatarResultado(a + b);

            case "-":
                return formatarResultado(a - b);

            case "*":
                return formatarResultado(a * b);

            case "/":
                if (b == 0) {
                    return "Não é possível divisão por 0";
                }
                return formatarResultado(a / b);

            default:
                return mensagemOperadorInvalido();
        }
    }

    /**
     * Formata o resultado de uma operação.
     *
     * @param resultado valor calculado
     * @return resultado acompanhado da mensagem padrão
     */
    private String formatarResultado(int resultado) {
        return MENSAGEM_RESULTADO + resultado;
    }

    /**
     * Retorna a mensagem para operadores inválidos.
     *
     * @return mensagem de erro
     */
    private String mensagemOperadorInvalido() {
        return "Operador inválido, tente (+, -, / ou *)";
    }
}


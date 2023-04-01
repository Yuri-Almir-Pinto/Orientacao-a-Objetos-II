public class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException() { // Substitui o método construtor da classe "Exception", substituindo sua mensagem de erro.
        super("Impossivel dividir por zero.");
    }
}

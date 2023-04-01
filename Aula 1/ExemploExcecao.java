public class ExemploExcecao {
    public static void main (String[] args) {
        calcular();
    }

    public static void calcular () {
        try {
            float res;
            meth m = new meth();
            res = m.dividir(3,2);
            System.out.println(res);
            res = m.dividir(1,0);
            System.out.println(res);
        }
        catch (DivisaoPorZeroException e1) { // Caso a exceção seja pega, executa o bloco abaixo.
            System.out.println("Erro identificado: " + e1.getMessage());
        } // o método "getMessage" retorna e mensagem de erro.
    }
}

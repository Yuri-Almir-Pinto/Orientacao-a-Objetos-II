import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lancaExcecoes {
    public static void main (String[] args) throws Exception { // Caso algo dentro da função de qualquer exceção, joga para a função que o chamou. Nesse caso, como é a main, nenhuma função a chamou, então joga ao console.
        lerArquivo();
    }

    public static void lerArquivo () throws FileNotFoundException, IOException { // Caso o arquivo não tenha sido encontrado, ou esteja corrompido, joga um erro para a função que o chamou.
        String arqEntrada = "Arquiv.txt";
        BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
        String linha;
        while ((linha = arq.readLine()) != null) {
            System.out.print(linha + "\n");
        }
        arq.close();
    }


}
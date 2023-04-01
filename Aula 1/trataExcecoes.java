import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class trataExcecoes {
    public static void main (String[] args) throws Exception {
        lerArquivo();
    }

    public static void lerArquivo () throws FileNotFoundException, IOException {
        try { // Tenta executar esse bloco de código.
            String arqEntrada = "Arquivo.txt";
            BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
            String linha;
            while ((linha = arq.readLine()) != null) {
                System.out.print(linha + "\n");
            }
            arq.close();
        }
        catch (FileNotFoundException e1) { // Caso o arquivo não seja encontrado, executa esse bloco de código.
            System.out.println ("Arquivo nao encontrado.");
        }
        catch (IOException e1) { // Caso o arquivo seja invalido ou corrompido, executa esse bloco de código.
            System.out.println ("Arquivo invalido ou corrompido.");
        }
        catch (Exception e1) { // Caso haja qualquer outra exceção, executa esse bloco de código.
            System.out.println ("Erro desconhecido.");
        }
        finally { // Executado sempre.
            System.out.println ("Encerrando.");
        }
    } // Normalmente, se vai do erro mais específico ao mais genérico, visto que se cair logo no primeiro, não irá executar nenhum dos mais adiantes.


}
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class tarefa {

    public static void main (String[] args) throws Exception {
        formatarData("21/07/2005");
    }

    public static void lerArquivo () throws FileNotFoundException, IOException, ParseException{
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do arquivo: ");
        String arq = re.readLine();
        BufferedReader reF = new BufferedReader(new FileReader(arq));
        String linha;
        while ((linha = reF.readLine()) != null) {
            if (linha != null) {
                String[] vetor = linha.split(";");
                String data = formatarData(vetor[1]);
                System.out.println("Nome: " + vetor[0] + " | Limite de entrega: " + data);
            }
        }
    }

    public static String formatarData (String data) throws ParseException {
        /*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate atual = LocalDate.parse(data, format);
        atual = atual.plusDays(7);*/
        String[] vetor = data.split("/");
        GregorianCalendar date = new GregorianCalendar();
        date.set(Calendar.YEAR, Integer.parseInt(vetor[2]));
        date.set(Calendar.MONTH, Integer.parseInt(vetor[1]));
        date.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetor[0]));

    }
    
}

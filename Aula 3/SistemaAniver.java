import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ArrayList;

public class SistemaAniver {
    
    public static BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
    public static HashMap<String, ArrayList<String>> ani = new HashMap<String, ArrayList<String>>();

    public static void main (String[] Aargs) throws IOException {
        menu();
    }

    public static void menu () throws IOException { // Menuzin, simples.
        int sel = 0;
        while (sel != 4) {
            try {
                System.out.println("------ Menu ------");
                System.out.println("1 - Adicionar Aniversariante");
                System.out.println("2 - Listar Datas");
                System.out.println("3 - Consultar Datas");
                System.out.println("4 - Sair");
                System.out.println("Selecione a opçao desejada: ");
                sel = Integer.parseInt(re.readLine());
    
                switch (sel) {
                    case 1:
                        System.out.println("Informe a data de aniversario: ");
                        String data = re.readLine();
                        System.out.println("Agora informe o nome: ");
                        String nome = re.readLine(); // Coleta informações
                        adicionarAniver(data, nome);
                        break;
                    case 2:
                        listarAniver();
                        break;
                    case 3:
                        System.out.println("Digite a data: ");
                        String data2 = re.readLine(); // Coleta informações
                        consultarAniver(data2);
                        break;
                    case 4:
                        break;
    
                }
            }
            catch (Exception e) {
                System.out.println ("Erro: " + e.getMessage());
            }

        }
    }

    public static void adicionarAniver (String data, String nome) throws IOException {
        if (ani.containsKey(data)) { // Se já tem informação nessa data, apenas adiciona mais um nome a lista
            ani.get(data).add(nome);
        }
        else if (!ani.containsKey(data)) { // Se não tem, cria um novo hash e ArraList, e insere.
            ArrayList<String> inserir = new ArrayList<String>(); // Cria o ArrayList
            inserir.add(nome); // Insere o nome no ArrayList
            ani.put(data, inserir); // Insere a data (como Hash) e o nome no HashMap.
        }
    }

    public static void listarAniver () {
        System.out.println("");

        for (String hash : ani.keySet()) { // Pega todas as keys do Hash, e percorre elas.
            System.out.println(hash + ": " + ani.get(hash));
        }
    }

    public static void consultarAniver (String data) throws IOException{
        if(ani.containsKey(data)) { // Se já existe essa data no Hash, apenas printa seu conteudo.
            System.out.println(ani.get(data));
        }
        else if (!ani.containsKey(data)) { // Se não existe, da um aviso.
            System.out.println("Nenhuma pessoa faz aniversario nesta data.");
        }
    }
 
    /*public static LocalDate FormatCalendar () throws IOException {

        System.out.println("Informe a data: ");
        String dataString = re.readLine();
        
        LocalDate local = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM"));
        System.out.println(local);
        return local;
    }*/
}

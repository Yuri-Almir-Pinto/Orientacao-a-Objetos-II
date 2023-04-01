import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class atividadeArrayList {
    public static BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<clienteAtividade> clientes = new ArrayList<>();
    public static void main (String[] Args) throws IOException {
        menu();
    }

    public static void menu () throws IOException {
        int sel = 0;
        while (sel != 5) {
            System.out.println("------ Menu ------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Orçamento");
            System.out.println("4 - Listar Orçamentos");
            System.out.println("5 - Sair");
            System.out.println("Selecione a opçao desejada: ");
            sel = Integer.parseInt(re.readLine());

            switch (sel) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarCliente();
                    break;
                case 3:
                    cadastrarOrçamento();
                    break;
                case 4:
                    listarOrçamento();
                    break;

            }

        }
    }

    public static int contarOrçamentos (ArrayList<Float> orçamentos) {
        try {
            Iterator<Float> it = orçamentos.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
            }
            return i;
        }
        catch (NullPointerException a) {
            return 0;
        }

    }

    public static clienteAtividade selCliente (int idProcurado) {
        try {
            Iterator<clienteAtividade> it = clientes.iterator();
            while (true) {
                clienteAtividade cliente = it.next();
                if (idProcurado == cliente.getId()) {
                    return cliente;
                }
            }
        }
        catch (NullPointerException a) {
            return null;
        }
        catch (NoSuchElementException b) {
            return null;
        }

    }

    public static void cadastrarCliente () throws IOException {
        clienteAtividade cliente = new clienteAtividade();
        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(re.readLine());
        System.out.println("Digite a idade do cliente: ");
        cliente.setIdade(Integer.parseInt(re.readLine()));
        clientes.add(cliente);
    }

    public static void listarCliente () {
        Iterator<clienteAtividade> it = clientes.iterator();
        while (it.hasNext()) {
            clienteAtividade cliente = it.next();
            
            System.out.println("--------------------");
            System.out.println("Id: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Quantia de orçamentos: " + contarOrçamentos(cliente.getOrçamentos()));
        }
        System.out.println("--------------------\n\n");

    }

    public static void listarOrçamento () throws IOException {
        System.out.println("--------------------");
        System.out.println("Informe o id do cliente: ");
        clienteAtividade cliente = selCliente(Integer.parseInt(re.readLine()));
        if (cliente == null) {
            System.out.println("Id invalido.");
            return;
        }
        Iterator<Float> it = cliente.getOrçamentos().iterator();
        int i = 1;
        System.out.println("------ " + cliente.getNome() +" ------");
        if (contarOrçamentos(cliente.getOrçamentos()) == 0) {
            System.out.println(cliente.getNome() + " Nao possui orçamentos.");
        }
        else {
            while(it.hasNext()) {
                float orçamento = it.next();
                System.out.println("Orçamento " + i + ": " + orçamento);
                System.out.println("---------");
                i++;
            }
        }
        System.out.println("\n");
    }

    public static void cadastrarOrçamento () throws IOException {
        System.out.println("--------------------");
        System.out.println("Informe o id do cliente: ");
        clienteAtividade cliente = selCliente(Integer.parseInt(re.readLine()));
        if (cliente == null) {
            System.out.println("Id invalido.");
            return;
        }
        System.out.println("Informe o orçamento (Um float): ");
        Float orçamento = Float.parseFloat(re.readLine());
        cliente.setOrçamento(orçamento);

    }
}

import java.util.ArrayList;
import java.util.Iterator;

public class CadCliente {
    public static void main (String[] args) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();  // Declarando array

        Cliente c1 = new Cliente();
        c1.setNome("Yuri");
        c1.setEmail("f@gmail.com");
        c1.setFone("99765543");
        c1.setCpf("666.666.666-66");
        lista.add(c1);
        
        Cliente c2 = new Cliente();
        c2.setNome("Jamesson");
        c2.setEmail("j@gmail.com");
        c2.setFone("99665543");
        c2.setCpf("616.666.666-66");
        lista.add(c2);
        
        Cliente c3 = new Cliente();
        c3.setNome("Luth");
        c3.setEmail("l@gmail.com");
        c3.setFone("99865543");
        c3.setCpf("626.666.666-66");
        lista.add(c3);
        
        Cliente c4 = new Cliente();
        c4.setNome("Mateus");
        c4.setEmail("m@gmail.com");
        c4.setFone("99965543");
        c4.setCpf("636.666.666-66");
        lista.add(c4); // Adicionando diversos objetos ao array.

        System.out.println("Percorrendo lista");
        Iterator<Cliente> it = lista.iterator(); // Declarando iterador

        while (it.hasNext()) { // Verifica se tem próximo elemento.
            Cliente cli = it.next(); // Vai para o próximo elemento (Começando do nada)
            System.out.println("Cliente: " + cli.getNome());
            System.out.println("Cliente: " + cli.getEmail());
            System.out.println("Cliente: " + cli.getFone());
            System.out.println("Cliente: " + cli.getCpf()); 
            System.out.println("------------------------------"); // Imprime as informações e repete, até terminar tudo.

        }

        Iterator<Cliente> remover = lista.iterator(); 
        Cliente rem = new Cliente();
        rem.setCpf("626.666.666-66");
        while(remover.hasNext()) {
            if ((remover.next().getCpf().equals(rem.getCpf()))) { // Pega o próximo item, pega o CPF, e compara com um dado CPF para encontrar.
                System.out.println("Removendo Cliente.");
                remover.remove(); // Ao encontrar, remove o objeto.
            }
        }

        Iterator<Cliente> it2 = lista.iterator(); // Imprime tudo de novo.
        while (it2.hasNext()) {
            Cliente cli = it2.next();
            System.out.println("Cliente: " + cli.getNome());
            System.out.println("Cliente: " + cli.getEmail());
            System.out.println("Cliente: " + cli.getFone());
            System.out.println("Cliente: " + cli.getCpf());
            System.out.println("------------------------------");

        }

        /*for (Cliente cli : lista) {
            if (cli.getCpf().equals("636.666.666-66")) {
                lista.remove(cli);
            }
        } -- Retorna exceção: ConcurrentModificationException | Por tentar modificar a lista enquanto percorre ela com foreach. */
    }
    
}

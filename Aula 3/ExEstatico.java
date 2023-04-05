public class ExEstatico {

    public static void main (String[] Args) {
        Cliente c1 = new Cliente();
        c1.setNome("Jamesson");
        c1.setEmail("Jamesson@gmail.com");
        System.out.println("Quantidade de Clientes: " + Cliente.qtdeClientes);

        Cliente c2 = new Cliente();
        c2.setNome("TheLuth");
        c2.setEmail("TheLuth@gmail.com");
        System.out.println("Quantidade de Clientes: " + Cliente.qtdeClientes);

        Cliente c3 = new Cliente();
        c3.setNome("Mateusrrpg");
        c3.setEmail("Mateusrrpg@gmail.com");
        System.out.println("Quantidade de Clientes: " + Cliente.qtdeClientes);

        Cliente c4 = new Cliente();
        c4.setNome("Yipeekiyaay");
        c4.setEmail("Yipeekiyaay@gmail.com");
        System.out.println("Quantidade de Clientes: " + Cliente.qtdeClientes);
    }
    
}

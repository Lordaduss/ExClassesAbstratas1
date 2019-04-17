

public class TestaContasBancarias{
    public static void main(String[] args){
        ContaSimples conta1 = new ContaSimples("Marcelo");
        ContaEspecial conta2 = new ContaEspecial("Godoi",5000);
        
        conta1.deposita(10);
        conta2.deposita(10000);
        
        System.out.println("Nome conta1: " + conta1.getNome() + "\nSaldo conta1: " + conta1.getSaldo());
        System.out.println("\n");
        System.out.println("Nome conta2: " + conta2.getNome() + "\nSaldo conta1: " + conta2.getSaldo());
        
        conta1.retira(5);
        conta2.retira(5000);
        
        System.out.println("Nome conta1: " + conta1.getNome() + "\nSaldo conta1: " + conta1.getSaldo());
        System.out.println("\n");
        System.out.println("Nome conta2: " + conta2.getNome() + "\nSaldo conta1: " + conta2.getSaldo());
    }
}

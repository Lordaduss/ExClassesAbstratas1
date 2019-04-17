public abstract class ContaBancaria{
    private String nome;
    public double saldo;
    
    public ContaBancaria(String nome1){
        this.nome=nome1;
        this.saldo=0;
    }

    public abstract void retira(double valor);
    
    public void deposita(double valor){
        saldo+=valor;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo1){
        this.saldo=saldo1;
    }
}

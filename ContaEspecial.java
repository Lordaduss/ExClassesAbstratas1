public class ContaEspecial extends ContaBancaria{
    private double adicional;
    
    public ContaEspecial(String nome1,double adicional1){
        super(nome1);
        adicional=adicional1;
    }
    public void retira(double valor){
        if(valor<=saldo+adicional){
            saldo-=valor;
        }
    }
}

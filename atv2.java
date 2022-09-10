import java.text.DecimalFormat;
public class prova2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = 1000;
        int ano = 1995;
        int atual = 2022;
        int diferenca = atual-ano;
        double [] percentual = new double[diferenca];
        percentual[0]=1.5;
        for(int i =0; i<diferenca; i++){
            if(i>0){
                percentual[i]=percentual[i-1]*2;
            }
            salario=salario+(salario*percentual[i])/100;
        }
        System.out.println("O salario atual é de: R$"+df.format(salario));
    }
}

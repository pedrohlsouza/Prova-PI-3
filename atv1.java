import java.util.Scanner;

public class prova1 {
    public static void main(String[] args) {

        int maior = 0;
        int menor = 0;

        int[] valor = new int[5];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor " + i);
            valor[i] = sc.nextInt();

            if (maior < valor[i] ) {
                maior = valor[i];
            }if(i==0){
                menor = valor[1];

            }
            if(menor>valor[i]){
                menor=valor[i];
            }

        }
        System.out.println("a maior e " + maior);

        System.out.println("O menor é " + menor);
    }



}

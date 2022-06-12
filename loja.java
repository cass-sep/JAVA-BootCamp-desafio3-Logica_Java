import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imposto = 0, lucro = 0, cTotal = 0, eTotal = 0, vTotal = 0;

        for(int i = 0; i < 15; i++){
            System.out.println("\n-------------------------------");
            System.out.println("Informe a categoria do produto:");
            System.out.println("c - Cama, mesa e banho");
            System.out.println("e - Eletrodoméstico");
            System.out.println("v - Vestuário");
            String categoria = sc.next();

            System.out.println("\nInforme a quantidade do produto:");
            int quantidade = sc.nextInt();
            
            System.out.println("\nInforme o preço unitário do produto:");
            double preco = sc.nextDouble();


            switch(categoria){
                case "c":
                    imposto = preco * (37.41 / 100);
                    cTotal += preco * quantidade;
                    lucro = (preco - imposto) * (30.0 / 100);
                    break;
                case "e":
                    imposto = preco * (43.14 / 100);
                    eTotal += preco * quantidade;
                    lucro = (preco - imposto) * (35.0 / 100);
                    break;
                case "v":
                    imposto = preco * (38.42 / 100);
                    vTotal += preco * quantidade;
                    lucro = (preco - imposto) * (50.0 / 100);
                    break;
                default:
                    System.out.println("Valor Incorreto.");
                    i = 15;
            }
            System.out.printf("\nO valor do imposto da unidade deste produto é R$%.2f.\n", imposto);
            System.out.printf("O valor do lucro da unidade deste produto é R$%.2f.\n", lucro);

        }

        System.out.println("\n---------------------------------------------------------");
        System.out.printf("\nO valor total dos produtos de Cama, mesa e banho é R$%.2f.", cTotal);
        System.out.printf("\nO valor total dos produtos de Eletrodomésticos é R$%.2f.", eTotal);
        System.out.printf("\nO valor total dos produtos de Vestuário é R$%.2f.", vTotal);


        sc.close();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Insira o seu nome");
        String nome = Scan.next();
        System.out.println("insira sua idade");
        Integer idade = Scan.nextInt();
        System.out.println("Olá "+ nome + " sua idade é " + idade);

    }
}
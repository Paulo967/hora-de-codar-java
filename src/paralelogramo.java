//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class paralelogramo {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("insira o valor da base do retângulo");
        Float base = Scan.nextFloat();
        System.out.println("insira o valor da altura do retângulo");
        Float altura = Scan.nextFloat();
        Float area = base * altura;
        System.out.println("O valor da area é: " + area);
        
    }
}
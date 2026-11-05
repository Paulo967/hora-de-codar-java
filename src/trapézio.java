//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class trapézio {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("insira o valor da base maior");
        Float base1 = Scan.nextFloat();
        System.out.println("insira o valor da base menor");
        Float base2 = Scan.nextFloat();
        System.out.println("insira a altura do trapézio");
        Float altura = Scan.nextFloat();
        Float area = ((base1 + base2) * altura) / 2;
        System.out.println("A area do Trapézio é " + area);
        
    }
}
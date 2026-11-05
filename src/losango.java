//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class losango {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("insira o valor da maior diagonal");
        Float diagonal1 = Scan.nextFloat();
        System.out.println("insira o valor da menor diagonal");
        Float diagonal2 = Scan.nextFloat();
        Float area = (diagonal1 * diagonal2) / 2;
        System.out.println("A area do losango é " + area);
        
    }
}
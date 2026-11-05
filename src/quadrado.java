//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.geom.Area;
import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("insira o valor do lado do quadrado");
        Float lado = Scan.nextFloat();
        Float area = lado * lado;
        System.out.println("O valor do quadrado é igual a:" + area);
        
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite seguno número:");
        int numero2 = sc.nextInt();

        int somar = cal.somar(numero1, numero2);
        System.out.println(somar);

        int divi = cal.divi(numero1, numero2);
        System.out.println(divi);

        int sub = cal.sub(numero1, numero2);
        System.out.println(sub);

        int mult = cal.mult(numero1, numero2);
        System.out.println(mult);
    }
}
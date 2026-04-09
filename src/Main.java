import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double Weight, Height, IMC;

        System.out.println("Informe seu peso");
        Weight = sc.nextDouble();

        System.out.println("Agora sua altura");
        Height = sc.nextDouble();

        IMC = Weight / (Height * Height);

        System.out.println("Calculando ...");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.printf("%.2f\n", IMC);

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso ideal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30 && IMC <= 39.9) {
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade mórbida");
        }

        sc.close();
    }
}
package Program;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double Weight = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
        double Height = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));

        double IMC = Weight / (Height * Height);
        String Format = String.format("%.2f", IMC);

        JOptionPane.showMessageDialog(null,"Calculando ...");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "O IMC é " + Format + "\nAbaixo do Peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, "O IMC é " + Format + "\nPeso ideal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, "O IMC é " + Format + "\nSobrepeso");
        } else if (IMC >= 30 && IMC <= 39.9) {
            JOptionPane.showMessageDialog(null, "O IMC é " + Format + "\nObesidade");
        } else {
            JOptionPane.showMessageDialog(null, "O IMC é " + Format + "\nObesidade mórbida");
        }

        sc.close();
    }
}
// p02_AreaCirculo - Calcular el área de un círculo

import java.util.Scanner;

public class p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un círculo\n");
        System.out.print("Dame el radio ? ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2); 

        System.out.println("\nEl circulo de radio " + radio + " tiene un área de " + area);
    }
}
// p03_AreaTriangulo - Calcula el área de un triángulo

import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el área de un triángulo:\n");
        System.out.print("Dame la base ? ");
        base = obj.nextInt();
        System.out.print("Dame la altura ? ");
        altura = obj.nextInt();

        area = ( base * altura ) / 2;

        System.out.println("Para un triángulo de base " + base + " y altura de " + altura + " el area es " + area);
        System.out.println(String.format("Para un triángulo de base %d y una altura de %d el area es %.2f",base,altura,area));

    }
}

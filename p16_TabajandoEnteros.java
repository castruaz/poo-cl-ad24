/**
 * p16_TabajandoEnteros - Trabajando con variables y literales enteras
 */
public class p16_TabajandoEnteros {
    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 0x2A;
        int num3 = 0b00101010;     
        
        byte val1 = 120, val2 = 1;
        short horas = 24, dias = 9099;
        long ganancia = 9223372036854733307l;

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nUso de String.format para foramateo de numeros enteros:");
        System.out.println(String.format("num1 en base decimal          : %d", num1));
        System.out.println(String.format("num1 en base octal            : %o", num1));
        System.out.println(String.format("num1 en base hexad            : %x", num1));
        System.out.println(String.format("La ganancia anual             : %,d", ganancia));

        System.out.println("\nUso de Integer.toString para formateo de numeros enterros:");
        System.out.println("num2 en base decimal                 : " + Integer.toString(num2));
        System.out.println("num2 en base octal                   : " + Integer.toString(num2,8));
        System.out.println("num2 en base hexadecimal             : " + Integer.toString(num2,16));
        System.out.println("num2 en base binaria                 : " + Integer.toString(num2,2));
        System.out.println("num3 en base binaria                 : " + Integer.toString(num3,2));

        System.out.println("\nUso de System.out.printf para dar formato a numeros enteros");
        System.out.printf("val1, val2 en formato decimal         : %d  -  %d \n", val1, val2);
        System.out.printf("horas, dias en formato decimal        : %d  -  %d \n", horas, dias);
        System.out.printf("horas, dias en formato octal          : %o  -  %o \n", horas, dias);
        System.out.printf("horas, dias en formato hexadecimal    : %x  -  %x \n", horas, dias);

        System.out.println("\nUso de MIN_VALUE y MAX_VALUE para conocer los rangos de los numeros enteros");
        System.out.println(String.format("\nTipo byte      Min: %d   Max: %d",Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println(String.format("\nTipo short     Min: %d   Max: %d",Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println(String.format("\nTipo int       Min: %d   Max: %d",Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(String.format("\nTipo long      Min: %d   Max: %d",Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
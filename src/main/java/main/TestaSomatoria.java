package main;

public class TestaSomatoria {
    public static void main(String[] args) {
        Integer contador = 0;
        Integer total = 0;
        while (contador <= 10) {

            total = total + contador;

            System.out.println(total);
            contador++;

        }
        System.out.println(total);
    }
}

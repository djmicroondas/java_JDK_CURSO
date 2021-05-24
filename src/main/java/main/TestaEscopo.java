package main;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        Integer quantidadePessoas = 3;
        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        if (idade >= 18 && acompanhado) {
            System.out.println("voce tem mais de 18 anos");

        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar pois está acompanhado");
            } else {
                System.out.println("entrada negada");
            }
        }
    }
}

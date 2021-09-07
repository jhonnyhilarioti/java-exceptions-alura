package br.com.senai.stack.lancamentodeexcecoes;

public class Fluxo2 {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
            ex.printStackTrace();
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo2");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Erro!");
    }
}

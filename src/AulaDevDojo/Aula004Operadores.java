package AulaDevDojo;

import java.util.Scanner;

public class Aula004Operadores {
    public static void main(String[] args) {
        // Operadores (+ - / *)
//        Scanner entrada = new Scanner(System.in);

//        System.out.println("Informe um numero");
//        int numero1 = entrada.nextInt();
//        System.out.println("Informe outro numero");
//        int numero2 = entrada.nextInt();
//
//        System.out.println("Subtração: "+(numero1-numero2));
//        System.out.println("Multiplicação: "+(numero1*numero2));
//        System.out.println("Adição: "+(numero1+numero2));
//        System.out.println("Divisão: "+(numero1/numero2));

        //Operador de Resto %
//
//        int resto = 23 % 2;
//        System.out.println("Resto da divisão "+resto);

        // Operador Lógica que retorna valores Booleanos = TRUE OU FALSE
        // (< >) -> Menor ou Maior (<= >=) -> Menor ou Igual, Maior ou Igual (=!) -> Dirente (==) -> Operador de Comparação

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorOuIgualVinte = 10 >= 20;
        boolean isDezMenorOuIGualVinte = 10 <= 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezDiferenteDeDez = 10 != 10;
        boolean isDezComparadoCom10 = 10 == 10;
        boolean isDezComparadoCom = 10 == 20;

        System.out.println("Dez é Maior que vinte? "+isDezMaiorQueVinte);
        System.out.println("Dez é Menor que vinte? "+isDezMenorQueVinte);
        System.out.println("Dez é Maior Ou Igual a vinte? "+isDezMaiorOuIgualVinte);
        System.out.println("Dez é Menor Ou Igual a vinte? "+isDezMenorOuIGualVinte);
        System.out.println("Dez é Dirente de 20: "+isDezDiferenteDeVinte);
        System.out.println("Dez é diferente de 10: "+isDezDiferenteDeDez);
        System.out.println("Dez 10 comparado com 20: "+isDezComparadoCom10);
        System.out.println("Dez 10 comparado com 20: "+isDezComparadoCom);
    }
}

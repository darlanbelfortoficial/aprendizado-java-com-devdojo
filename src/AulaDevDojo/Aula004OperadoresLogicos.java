package AulaDevDojo;

public class Aula004OperadoresLogicos {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 20;

        System.out.println("Resultado: "+(numero1 + numero2));

        //Operador de Resto %
//
        int resto = 23 % 2;
        System.out.println("Resto da divisão "+resto);

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

        //Operador Lógico (and = &&) (or = ||) (logical not = !)

        int idade = 29;
        float salario = 3555F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta --> "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta --> "+isDentroDaLeiMenorQueTrinta);

    }
}

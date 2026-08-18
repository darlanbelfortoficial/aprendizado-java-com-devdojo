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

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlaystationCincoCompravel --> "+isPlaystationCincoCompravel);

        //Operadores de Atribuição ( =, +=, -=, *=, /= and %= )

        double bonus = 1800;
        bonus = bonus + 100;
//            ^
//            |   Formas de Atribuir iguais porém com menos código
//            |   Melhora a organização
//            v
        bonus += 1000;
        bonus -= 500; // Comente cada um e execute para ver o funcionamento
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Bonus: "+bonus);

        // (++ --)

        int contador = 0;
        contador += 1; // Contador Receber contador Mais 1
       //     ^
//            |   Formas de abreviar a primeira parte de cima
//            |
//            v
        contador ++;

        contador -= 1;
//            ^
//            |   Formas de abreviar a primeira parte de cima
//            |
//            v
        contador --;
        ++contador;
        --contador;

        System.out.println("Contador: "+contador);

        int contador2 = 0;
//                                           |
        System.out.println(contador2++); //  v Use breakpoint e debug para entender
        System.out.println(contador2);   //  Imprime o resultado do primeiro com a adição de mais 1
    }
}

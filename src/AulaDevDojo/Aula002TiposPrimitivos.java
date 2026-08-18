package AulaDevDojo;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {

        // =====================================================
        // 1. byte
        // =====================================================
        // Armazena números inteiros pequenos.
        // Valores possíveis: -128 até 127.
        byte idade = 25;


        // =====================================================
        // 2. short
        // =====================================================
        // Armazena números inteiros maiores que o byte.
        // Valores possíveis: -32.768 até 32.767.
        short ano = 2026;


        // =====================================================
        // 3. int
        // =====================================================
        // É o tipo inteiro mais utilizado no dia a dia.
        // Valores possíveis: -2.147.483.648 até 2.147.483.647.
        int populacao = 220000000;


        // =====================================================
        // 4. long
        // =====================================================
        // Utilizado para números inteiros muito grandes.
        // O 'L' no final indica que o valor é do tipo long.
        long distancia = 9223372036854775807L;


        // =====================================================
        // 5. float
        // =====================================================
        // Armazena números com casas decimais.
        // O 'f' no final indica que o valor é float.
        float altura = 1.75f;


        // =====================================================
        // 6. double
        // =====================================================
        // Também armazena números decimais.
        // Possui maior precisão que o float.
        double salario = 3500.50;


        // =====================================================
        // 7. char
        // =====================================================
        // Armazena apenas UM caractere.
        // O valor deve estar entre aspas simples.
        char inicial = 'D';


        // =====================================================
        // 8. boolean
        // =====================================================
        // Representa apenas dois estados:
        // true  = verdadeiro
        // false = falso
        boolean estudante = true;


        // =====================================================
        // Exibindo os valores
        // =====================================================

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População: " + populacao);
        System.out.println("Distância: " + distancia);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("É estudante? " + estudante);
    }
}
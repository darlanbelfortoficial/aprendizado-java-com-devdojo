package AulaDevDojo;

public class Aula005EstruturasCondicionais {

    public static void main(String[] args) {
        //Condicionais
        // (if -> SE)
        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // Só será executado se a condição dentro for verdadeira

        // (!) <--- Operador de Negação
        if (idade >= 20){
            System.out.println("Acesso Liberado para comprar bebida alcolica");
        }
        if (isAutorizadoComprarBebida){
            System.out.println("Acesso Liberado para comprar bebida alcolica");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Acesso não Liberado para comprar bebida alcolica");
        }
        boolean c = false;

        if (c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}

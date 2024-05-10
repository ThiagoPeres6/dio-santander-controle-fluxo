package repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                //trocar por break para verificar resultado
                continue;

            System.out.println(numero);

        }

    }
}

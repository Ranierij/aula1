// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
public class Main {
    public static void main(String[] args) {
        boolean opcao = false;
        // A variável opcao é definida como false.

        int numero = 1;
        // A variável numero é definida como 1.

        String texto = "1";
        // A variável texto é definida como a String "1".

        boolean resultado = (opcao && !opcao);
        // A expressão (opcao && !opcao) será false && true, que resultará em false. Então, resultado será false.

        numero = numero + 2;
        // numero agora será 1 + 2, resultando em 3.

        resultado = (numero >= 2) || resultado;
        // A expressão (numero >=2) é verdadeira (3 >= 2), então o resultado é true. Como true || false é true, resultado agora é true.

        numero = 1;
        // numero é redefinido como 1.

        resultado = (numero == Integer.parseInt(texto)) && resultado;
        // texto é convertido para int usando Integer.parseInt(). Como 1 == 1 é verdadeiro, e true && true é true, resultado permanece como true.

        System.out.println(resultado);
        // A função System.out.println() é chamada para imprimir o valor de resultado.
    }
}
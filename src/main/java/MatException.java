//Matheus Ferreira Alphonse dos Anjos 2454220

public class MatException extends Exception {

    public MatException() {
        super("\nO material deve ser bronze/ouro/diamante/prata");
    }

    public void impMatException() {
        System.out.println(getMessage());
    }
}


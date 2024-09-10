//Matheus Ferreira Alphonse dos Anjos 2454220

public class ValorGrdException extends Exception{

	public ValorGrdException(){
            super("\nO valor deve estar entre 1000 e 9999");
	}
	public void impMsgValorGrd(){
		System.out.println(getMessage());
	}
}

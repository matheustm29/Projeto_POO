//Matheus Ferreira Alphonse dos Anjos 2454220


public class Corrente extends Joia{

	private int comprimento;
	private String pingente;

	public Corrente(){
		comprimento = 0;
		pingente = "";
	}
	//Sobrecarga
	public Corrente(int comprimento, String pingente){
		this.comprimento = comprimento;
		this.pingente = pingente;
	}	



	public int getComprimento(){
		return comprimento;
	}

	public String getPingente(){
		return pingente;
	}

	public void setComprimento(int comprimento){
		this.comprimento = comprimento;
	}
	
	public void setPingente(String pingente){
		this.pingente = pingente;
	}

}
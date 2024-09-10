//Matheus Ferreira Alphonse dos Anjos 2454220


public class Anel extends Joia{

	private int aro;
	private String tipo;
      

	public Anel(){
		aro = 0;
		tipo = "";
	}
	//Sobrecarga
	public Anel(int aro, String tipo){
		this.aro = aro;
		this.tipo = tipo;
	}	
        
        
	public int getAro(){
		return aro;
	}

	public String getTipo(){
		return tipo;
	}

	public void setAro(int aro){
		this.aro = aro;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
        

}
//Matheus Ferreira Alphonse dos Anjos 2454220


public class Pulseira extends Joia{

	private int circunferencia;
	private String design;

	public Pulseira(){
		circunferencia = 0;
		design = "";
	}
	//Sobrecarga
	public Pulseira(int circunferencia, String design){
		this.circunferencia = circunferencia;
		this.design = design;
	}	



	public int getCircunferencia(){
		return circunferencia;
	}

	public String getDesign(){
		return design;
	}

	public void setCircunferencia(int circunferencia){
		this.circunferencia = circunferencia;
	}
	
	public void setDesign(String design){
		this.design = design;
	}
}
//Matheus Ferreira Alphonse dos Anjos 2454220

public class Joia implements DescontoJoia{

	private int valor;
	private String material;
	private Info i = new Info();

	public Joia(){
		valor = 0;
		material = "";
	}

	//Sobrecarga
	public Joia(int valor, String material){
		this.valor = valor;
		this.material = material;
	}
	
	public Info getI(){
		return i;
	}

	public void setI(Info i){
		this.i  = i;
	}
		

	public int getValor(){
		return valor;
	}

	public String getMaterial(){
		return material;
	}

	public void setValor(int valor) throws ValorGrdException{
		if(valor>= 1000 && valor<=10000){
			this.valor = valor;
		}
		else{
			throw new ValorGrdException();
		}
	}
	public void setMaterial(String material) throws MatException {
        	if (material.equalsIgnoreCase("ouro") || material.equalsIgnoreCase("prata") || material.equalsIgnoreCase("bronze") || material.equalsIgnoreCase("diamante")) {
            		this.material = material;
        	} 
		else {
            		throw new MatException();
        	}
	}
	
	public double calcularDesconto() {
        	return valor * 0.05;
    	}
	//Sobreescrita
   	public String toString() {

        	return "Joia [valor=" + valor + ", material=" + material + ", marca=" + i.getMarca() + ", codigo=" + i.getCod() + "]";

   	 }
}

public class CIRCULO {
	int radio;
	/*public CIRCULO(){
		this.radio=178054;
	}
	   public CIRCULO(int radio2) {
		this.radio=radio2;
	}*/
	CIRCULO(){
		this(178054);
	}
	CIRCULO(int radio2){
		this.radio=radio2;
	}
	public double calcularCircunferencia(){
		return 2*Math.PI*radio;
	}
	public double calcularArea() {
		return Math.PI*(Math.pow(radio, 2));
	}
	public void cambiarRadio(int radio2) {
		radio=radio2;
	}

}

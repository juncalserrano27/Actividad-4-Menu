
public class CIRCULO {
	double radio;
	/*public CIRCULO(){
		this.radio=178054;
	}
	   public CIRCULO(int radio2) {
		this.radio=radio2;
	}*/
	CIRCULO(){
		this(178054);
	}
	CIRCULO(double radio2){
		this.radio=radio2;
	}
	public double calcularCircunferencia(){
		return 2*Math.PI*radio;
	}
	public double calcularArea() {
		return Math.PI*(Math.pow(radio, 2));
	}
	public void cambiarRadio(double radio2) {
		radio=radio2;
	}

}


public class CUADRADO {
	public double longitudL;
	
	//public CUADRADO() {
	//this.longitudL=178054;
	//public CUADRADO (int longitudL2) {
		//this.longitudL=longitudL2;
		CUADRADO(){
			this(178054);
		}
		CUADRADO (double longitudL2){
			this.longitudL=longitudL2;
		}
		
	public double calcularPerimetroCu() {
		return longitudL*4.0;
	}
	public double calculaAreaCu() {
		return Math.pow(longitudL,2);
	}
	public double calculaDiagonalCu() {
		return Math.sqrt(2*(Math.pow(longitudL,2 )));
	}
	public void cambiarLongitudL(double longitudL2) {
		longitudL=longitudL2;
	}

}


public class CUADRADO {
	public int longitudL;
	
	//public CUADRADO() {
	//this.longitudL=178054;
	//public CUADRADO (int longitudL2) {
		//this.longitudL=longitudL2;
		CUADRADO(){
			this(178054);
		}
		CUADRADO (int longitudL2){
			this.longitudL=longitudL2;
		}
		
	public int calcularPerimetroCu() {
		return longitudL*4;
	}
	public double calculaAreaCu() {
		return Math.pow(longitudL,2);
	}
	public double calculaDiagonalCu() {
		return Math.sqrt(2*(Math.pow(longitudL,2 )));
	}
	public void cambiarLongitudL(int longitudL2) {
		longitudL=longitudL2;
	}

}

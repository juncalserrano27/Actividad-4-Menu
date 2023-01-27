import java.util.Scanner;
public class programa {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("¡¡¡Bienvenido!!!");
		System.out.println("1. Cuadrado");
		System.out.println("2. Circulo");
		System.out.println("Indica con un numero cual de las anteriores opciones quieres crear:");
		int opcion =scan.nextInt();
		if (opcion==1) {
			CUADRADO uno=new CUADRADO();
			System.out.println("Indique de que longitud sera el lado del cuadrado:");
			double lado =scan.nextDouble();
			uno.cambiarLongitudL(lado);
			System.out.println("1. Calcular diagonal");
			System.out.println("2. Calcular perimetro");
			System.out.println("3. Calcular el área");
			System.out.println("Elija lo que desea calcular:");
			int opcionDos =scan.nextInt();
			if (opcionDos==1) {
				System.out.println("La diagonal vale "+uno.calculaDiagonalCu()+"");
			}if (opcionDos==2) {
				System.out.println("El perimetro es "+uno.calcularPerimetroCu()+"");
			}if (opcionDos==3) {
				System.out.println("El área es "+uno.calculaAreaCu()+"");
			}else {
				
			}
			
		}if (opcion==2) {
		CIRCULO unoC=new CIRCULO();
		System.out.println("Indique de que longitud sera el radio del circulo:");
		double radio =scan.nextDouble();
		unoC.cambiarRadio(radio);
		System.out.println("1. Calcular circunferencia");
		System.out.println("2. Calcular el área");
		System.out.println("Elija lo que desea calcular:");
		int opcionDos =scan.nextInt();
		if (opcionDos==1) {
			System.out.println("La circunferencia es "+unoC.calcularCircunferencia()+"");
		}if (opcionDos==2) {
			System.out.println("El área es "+unoC.calcularArea()+"");
		}else {
			
		}
	}

}
}

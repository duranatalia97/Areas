//Este trabajo es de Braulio y Ricky
import java.io.*;

public class AreaTarea {
	private static BufferedReader stdIn= new BufferedReader (new InputStreamReader (System.in));
	private static PrintWriter stdOut= new PrintWriter(System.out,true);
	public static void main (String []args)throws IOException{		
	   int forma;
	   
		double Base, altura, base, radio;
		boolean x=true;
		String y=null;  
		stdOut.println("Que quieres calcular: Circulo(1), Cuadrado(2), Rectangulo(3), Trapecio(4), Triangulo(5), Trapezoide(6)");
		
		forma= Integer.parseInt(stdIn.readLine());
		switch(forma){
		case 1:
			System.out.println("Dame el valor del radio");
			radio= Double.parseDouble(stdIn.readLine());
			double areaCirculo = AreaCirculo(radio);
			System.out.println("El area del circulo es: " + areaCirculo);
			break;
		case 2:
			System.out.println("Dame el valor de la base");
			Base= Double.parseDouble(stdIn.readLine());
			double areaCuadrado= AreaCuadrado(Base);
			System.out.println("El area del cuadrado es: " + areaCuadrado);
			break;
		case 3:
			System.out.println("Dame el valor de la base");
			Base= Double.parseDouble(stdIn.readLine());
			System.out.println("Dame el valor de la altura");
			altura=Double.parseDouble(stdIn.readLine());
			double areaRectangulo= AreaRectangulo(Base, altura);
			System.out.println("El area del rectangulo es: " + areaRectangulo);
			break;
		case 4:
			System.out.println("Dame valor de la base chica");
			base=Double.parseDouble(stdIn.readLine());
			System.out.println("Dame valor de la base grande");
			Base=Double.parseDouble(stdIn.readLine());
			System.out.println("dame valor de la altura");
			altura=Double.parseDouble(stdIn.readLine());
			double areaTrapecio= AreaTrapecio(base, Base, altura);
			System.out.println("El area del trapecio es: " + areaTrapecio);
			break;
		case 5:
			System.out.println("dame valor de la base");
			Base= Double.parseDouble(stdIn.readLine());
			System.out.println("Dame valor de la altura");
			altura= Double.parseDouble(stdIn.readLine());
			double areaTriangulo= AreaTriangulo(Base,altura);
			System.out.println("El area del triangulo es: " + areaTriangulo);
			break;
		case 6:
			System.out.println("dame valor de la base");
			Base=Double.parseDouble(stdIn.readLine());
			System.out.println("dame valor de altura");
			altura= Double.parseDouble(stdIn.readLine());
			double areaTrapezoide= AreaRectangulo(Base,altura);
			System.out.println("El area del trapezoide es: " + areaTrapezoide);
			break;
		}
		System.out.println("Gracias por usar este programa");
	}
public static double AreaCirculo(double radio){ 
	double area;
	area=Math.PI*(radio*radio);
	return area;
}
public static double AreaCuadrado(double base){
	double  area;
	area=base*base;
	return area;
}
public static double AreaRectangulo(double base, double altura) {
	double area;
	area=base*altura;
	return area;
}
public static double AreaTrapecio(double basechica, double base, double altura){
	double area;
	area=((basechica+base)*altura)/2;
	return area;
}
public static double AreaTriangulo(double base, double altura) {
	double area;
	area=(base*altura)/2;
	return area;
	
}
}

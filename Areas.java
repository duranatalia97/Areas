//Este trabajo es de Alex y Miguel
import java.io.*;

public class Areas {
	private static BufferedReader stdIn= new BufferedReader (new InputStreamReader (System.in));
	private static PrintWriter stdOut= new PrintWriter(System.out,true);
	public static void main (String []args)throws IOException{		
	   int figura;
	   
		double base, altura, basechica, radio;
		boolean x=true;
		String y=null;  
		stdOut.println("Que quieres calcular: Circulo(1), Cuadrado(2), Rectangulo(3), Trapecio(4), Triangulo(5), Trapezoide(6)");
		
		figura= Integer.parseInt(stdIn.readLine());
		switch(figura){
		case 1:
			System.out.println("Dame el valor del radio");
			radio= Double.parseDouble(stdIn.readLine());
			double areaCirculo = AreaCirculo(radio);
			System.out.println(areaCirculo);
			break;
		case 2:
			System.out.println("Dame el valor de la base");
			base= Double.parseDouble(stdIn.readLine());
			double areaCuadrado= AreaCuadrado(base);
			System.out.println(areaCuadrado);
			break;
		case 3:
			System.out.println("Dame el valor de la base");
			base= Double.parseDouble(stdIn.readLine());
			System.out.println("Dame el valor de la altura");
			altura=Double.parseDouble(stdIn.readLine());
			double areaRectangulo= AreaRectangulo(base, altura);
			System.out.println(areaRectangulo);
			break;
		case 4:
			System.out.println("Dame valor de la base chica");
			basechica=Double.parseDouble(stdIn.readLine());
			System.out.println("Dame valor de la base grande");
			base=Double.parseDouble(stdIn.readLine());
			System.out.println("dame valor de la altura");
			altura=Double.parseDouble(stdIn.readLine());
			double areaTrapecio= AreaTrapecio(basechica, base, altura);
			System.out.println(areaTrapecio);
			break;
		case 5:
			System.out.println("dame valor de la base");
			base= Double.parseDouble(stdIn.readLine());
			System.out.println("Dame valor de la altura");
			altura= Double.parseDouble(stdIn.readLine());
			double areaTriangulo= AreaTriangulo(base,altura);
			System.out.println(areaTriangulo);
			break;
		case 6:
			System.out.println("dame valor de la base");
			base=Double.parseDouble(stdIn.readLine());
			System.out.println("dame valor de altura");
			altura= Double.parseDouble(stdIn.readLine());
			double areaTrapezoide= AreaRectangulo(base,altura);
			System.out.println(areaTrapezoide);
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

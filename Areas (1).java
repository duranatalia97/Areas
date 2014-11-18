//Removed import java.io.*; because the program deemed it necessary.
//Carolina Cárdenas y Jessica Villarreal 

public class Areas {
	
	public static void main(String [] args){ 
		
		output("El programa ayuda a sacar las áreas de diferentes polígonos");
		output("Elija el polígono del cual quiera sacar el área y anota el número que le corresponda a la figura.");
		output("Nota: Si es un trapezoide no simétrico, visualize el punto de la esquina inferior izquierda como el punto A, el de la esquina inferior derecha como el punto B, el de la esquina superior derecha como el punto C y el último como D.");
		
		int poligono = inputInt("Si es un cuadrado = 1; círculo = 2; triangulo = 3; trapecio = 4; trapezoide no simétrico = 5, trapezoide simétrico = 6 ó rectangulo = 7"); 
		
	if(poligono == 1){
		double a1 = AreaCuadrado (inputDouble("¿Cuál es la base?"),inputDouble("¿Cuál es la altura?"));
		output (a1);
		}
		
	else if(poligono == 2){
		double a2 = AreaCirculo (inputDouble("¿Cuál es el radio?"));
		output (a2);
		
	}
	
	else if(poligono == 3){
		double a3 = AreaTriangulo (inputDouble("¿Cuál es la base?"),inputDouble("¿Cuál es la altura?"));
		output (a3);	
		
		}
	
	else if(poligono == 4){
		double a4 = AreaTrapecio (inputDouble("¿De cuánto es la base más pequeña?"),inputDouble("¿Cuánto mide la base más grande?"), inputDouble("¿Cuál es la altura?"));
		output (a4);
	}
	
	else if(poligono == 5){
		double a5 = AreaTrapezoide(inputDouble("Para el área de esta figura, se deben formar dos triángulos, siguiendo las instrucciones, ¿cuál es la longitud de la recta que va del punto B al D? Esa será la base de ambos triángulos."), inputDouble("¿Cuál es la altura del primer triángulo?"), inputDouble("¿La altura del segundo triángulo?"));
		output (a5);
	}
	
	else if(poligono == 6){
		double a6 = AreaTrapezoidesimetrico (inputDouble("¿Cuánto mide la base?"), inputDouble("¿Cuánto mide la altura?"));
		output (a6);
		
	}
	
	else if(poligono == 7){
		double a7 = AreaRectangulo(inputDouble("¿Cuál es la base?"), inputDouble("¿Cuál es la altura?"));
		output (a7);
	}
	
	}
	public static double AreaCuadrado (double b, double h) {
	double area = b * h;
	return area;

		
	}
	
	public static double AreaCirculo (double r){
		double area = r*r*3.14;
		return area;
		
	}
	
	public static double AreaTriangulo (double b, double h) {
		double area = (b * h) / 2;
		return area;
		
	}
	
	public static double AreaTrapecio (double b1, double b2, double h){
		double area = ((b1+b2)*h)/2;
		return area;
		
	}
	
	public static double AreaTrapezoide (double b, double a1, double a2){
		double area = ((b*a1)/2)+((b*a2)/2);
		return area;
	}

	public static double AreaTrapezoidesimetrico (double b, double h){
		double area = ((b*h)/2);
		return area;
	
}
	
	public static double AreaRectangulo (double b, double h){
		double area = b*h;
		return area;
	}
	

//===========================================================
//IBIO Standard Input and Output
//===========================================================

static void output(String info)
{ System.out.println(info);   }

static void output(char info)
{ System.out.println(info);   }

static void output(byte info)
{ System.out.println(info);   }

static void output(int info)
{ System.out.println(info);   }

static void output(long info)
{ System.out.println(info);   }

static void output(double info)
{ System.out.println(info);   }

static void output(boolean info)
{ System.out.println(info);   }

static String input(String prompt)
{  String inputLine = "";
System.out.print(prompt);
try
{inputLine = (new java.io.BufferedReader(
new java.io.InputStreamReader(System.in))).readLine();
}
catch (Exception e)
{ String err = e.toString();
System.out.println(err);
inputLine = "";
}
return inputLine;
}

static String inputString(String prompt)
{ return input(prompt);   }

static String input()
{ return input("");       }

static int inputInt()
{  return inputInt(""); }

static double inputDouble()
{ return inputDouble(""); }

static char inputChar(String prompt)
{  char result=(char)0;
try{result=input(prompt).charAt(0);}
catch (Exception e){result = (char)0;}
return result;
}

static byte inputByte(String prompt)
{  byte result=0;
try{result=Byte.valueOf(input(prompt).trim()).byteValue();}
catch (Exception e){result = 0;}
return result;
}

static int inputInt(String prompt)
{  int result=0;
try{result=Integer.valueOf(
input(prompt).trim()).intValue();}
catch (Exception e){result = 0;}
return result;
}

static long inputLong(String prompt)
{  long result=0;
try{result=Long.valueOf(input(prompt).trim()).longValue();}
catch (Exception e){result = 0;}
return result;
}

static double inputDouble(String prompt)
{  double result=0;
try{result=Double.valueOf(
input(prompt).trim()).doubleValue();}
catch (Exception e){result = 0;}
return result;
}

static boolean inputBoolean(String prompt)
{  boolean result=false;
try{result=Boolean.valueOf(
input(prompt).trim()).booleanValue();}
catch (Exception e){result = false;}
return result;
}
//=========== end IBIO ===========================================//
}


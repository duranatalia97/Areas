import java.io.*;


public class Areas {
	private static BufferedReader stdIn= new BufferedReader (new InputStreamReader (System.in));
	private static PrintWriter stdOut= new PrintWriter(System.out, true);
	
	
	public static void main (String []args)throws IOException{
		int correrprograma2;
		do{
		double area = 0, base, hight, bigbase, circulo;
		System.out.println("De estas formas geometricas a cual le quieres sacar el area: circulo, cuadrado, rectangulo, trapecio, triangulo o trapezoide?");
		String quequierehacer;
		quequierehacer = stdIn.readLine();
		
		if(quequierehacer.equals("circulo")){
		System.out.println("Dame el radio del circulo del cual quieres sacar el area.");
		double radio;
		radio = Double.parseDouble(stdIn.readLine());
		area = radio*radio*3.14;
		
		}
		if(quequierehacer.equals("cuadrado")){
			System.out.println("Dame un lado del cuadrado del cual quieres sacar el area.");
			double lado;
			lado = Double.parseDouble(stdIn.readLine());
			area=lado*lado;
			
		}
		
		if(quequierehacer.equals("rectangulo")){
			System.out.println("Dame el lado mayor de tu rectangulo.");
			double ladoMayor;
			ladoMayor = Double.parseDouble(stdIn.readLine());
			
			System.out.println("Dame el lado menor de tu rectangulo.");
			double ladoMenor;
			ladoMenor = Double.parseDouble(stdIn.readLine());
			area= ladoMayor*ladoMenor;
		}
		
		if(quequierehacer.equals("trapecio")){
			System.out.println("Dame la base mayor de tu trapecio.");
			double baseMayor;
			baseMayor = Double.parseDouble(stdIn.readLine());
			
			System.out.println("Dame la base menor de tu trapecio.");
			double baseMenor;
			baseMenor = Double.parseDouble(stdIn.readLine());
			
			System.out.println("Dame la altura de tu trapecio.");
			double altura;
			altura = Double.parseDouble(stdIn.readLine());
			
			area= ((baseMayor*baseMenor)/2)*altura ;
		}
		
		if(quequierehacer.equals("triangulo")){
			System.out.println("Dame la altura de tu triangulo.");
			double ladoMayor;
			ladoMayor = Double.parseDouble(stdIn.readLine());
			
			System.out.println("Dame la base de tu triangulo.");
			double ladoMenor;
			ladoMenor = Double.parseDouble(stdIn.readLine());
			area= (ladoMayor*ladoMenor)/2 ;
			
		}
		
		if(quequierehacer.equals("trapezoide")){
			System.out.println("Dame la base mayor de tu trapezoide.");
			double baseMayor;
			baseMayor = Double.parseDouble(stdIn.readLine());
			
			System.out.println("Dame la base menor de tu trapezoide.");
			double baseMenor;
			baseMenor = Double.parseDouble(stdIn.readLine());
			
			System.out.println("Dame la altura de tu trapezoide.");
			double altura;
			altura = Double.parseDouble(stdIn.readLine());
			
			area= ((baseMayor*baseMenor)/2)*altura ;
		}
			
		System.out.println(area);
			System.out.println("ÀQuieres correr de nuevo el programa? ÀSi o No?");
			String correrprograma = stdIn.readLine();
			
		
			if (correrprograma.equals("Si"));{
				correrprograma2 = 1;
			} 
			 if (!correrprograma.equals("Si")){
				correrprograma2 = 2; 
			}
			}while (correrprograma2 == 1 );
			

	}

}

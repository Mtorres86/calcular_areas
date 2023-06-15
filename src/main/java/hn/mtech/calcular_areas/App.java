package hn.mtech.calcular_areas;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu principal:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Calcular área de un triángulo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                   double area = obtenerAreaCirculo();
                   System.out.println("El area del cirulo es: "+ area);
                    break;
                
            }

            switch (opcion) {
                case 2:
                   double area = obtenerLadoCuadrado();
                   System.out.println("El area del cuadrado es: "+ area);
                    break;
                
            }
            switch (opcion) {
            case 3:
               double area = obtenerAreaRectangulo();
               System.out.println("El area del cuadrado es: "+ area);
                break;
            
        }
        }while (opcion != 0);
    
    	
 }
    	
    
    //Area de un circulo
	public static Double calcularArea(double radio) {
		// TODO Auto-generated method stub
		double resultado =0.0;
		if (radio <= 0) {
	        System.err.println("El radio debe ser un valor positivo mayor que cero.");
	        
	    }else {
	    	resultado = Math.PI * radio * radio;
	    }
		return resultado;
	}
	
	//solicitamos el radio para calcular el area
	public static double obtenerAreaCirculo() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingresa el radio del círculo: ");
	    double radio = scanner.nextDouble();
	    //llamamos el metodo calculararea y le pasamos el radio
	    double area = calcularArea(radio);

	    return area;
	}
//****************************************8

	//Area de un cuadrado
	public static double areaCuadrado(double lado) {
		double resultado =0.0;
		if (lado <= 0) {
	        System.err.println("El lado debe ser un valor positivo mayor que cero.");
	        
	    }else {
	    	resultado = Math.PI * lado * lado;
	    }
		return resultado;
	}
	public static double obtenerLadoCuadrado() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingresa el lado del cuadrado: ");
	    double lado = scanner.nextDouble();
	    //llamamos el metodo calculararea y le pasamos el radio
	    double area = areaCuadrado(lado);

	    return area;
	}

//*******************Area del rectangulo**********8
	public static double areaRectangulo(double base, double altura) {
		double resultado = 0.00;
		if (base <=0 && altura<=0) {
			System.err.println("La base y el lado deben ser >0");
		}else if(base==0) {
			System.err.println("No se puede dejar calcular con base a 0");
		}else if(altura==0) {
			System.err.println("No se puede dejar calcular con altura a 0");
		}else {
			resultado = base*altura;
		}
		return resultado;
	}
	
	public static double obtenerAreaRectangulo() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingresa la base de rectangulo ");
	    double base = scanner.nextDouble();
	    System.out.print("Ingresa la altura de rectangulo ");
	    double altura = scanner.nextDouble();
	    //llamamos el metodo calculararea y le pasamos el radio
	    double area = areaRectangulo(base,altura);

	    return area;
	}


	

	
    
    
    }



  
 
  
   

   

    



    
   

	




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
                   double areaCirculo = obtenerAreaCirculo();
                   System.out.println("El area del cirulo es: "+ areaCirculo);
                    break;
            
            

                case 2:
                   double areaCuadrado = obtenerLadoCuadrado();
                   System.out.println("El area del cuadrado es: "+ areaCuadrado);
                    break;
            
            
            
            case 3:
               double areaRectangulo = obtenerAreaRectangulo();
               System.out.println("El area del cuadrado es: "+ areaRectangulo);
                break;
            
            
           
            case 4:
               double areaTraingulo = obtenerAreaTriangulo();
               System.out.println("El area del triangulo es: "+ areaTraingulo);
                break;
            
            
           
            case 0:
               
            	System.out.println("Saliendo de la aplicacion");
                break;
            default:
             	 System.out.println("Opcion no valida");
             
            	 
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
			System.err.println("La base y la altura no deben ser <=0");
		}else if(base==0) {
			System.err.println("No se puede calcular con base a <=0");
		}else if(altura==0) {
			System.err.println("No se puede  calcular con altura a <=0");
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


	
//************Area Traingulo **********8

	public static double areaTriangulo(double base, double altura) {
		double resultado = 0.00;
		if (base <=0 && altura<=0) {
			System.err.println("La base y la altura no deben ser <=0");
		}else if(base==0) {
			System.err.println("No se puede  calcular con base a 0");
		}else if(altura==0) {
			System.err.println("No se puede  calcular con altura a 0");
		}else {
			resultado = (base*altura)/2;
		}
		return resultado;
	}
	
	public static double obtenerAreaTriangulo() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingresa la base del triangulo ");
	    double base = scanner.nextDouble();
	    System.out.print("Ingresa la altura del triangulo ");
	    double altura = scanner.nextDouble();
	    //llamamos el metodo calculararea y le pasamos el radio
	    double area = areaRectangulo(base,altura)/2;

	    return area;
	}


	
	
	


	

	
    
    
    }



  
 
  
   

   

    



    
   

	




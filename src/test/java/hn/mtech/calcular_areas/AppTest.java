package hn.mtech.calcular_areas;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	//Area del circulo
	@Test
	public void testAreaCirculo()
	{
		double radio =5.0;
		double areaDeseada = Math.PI * radio * radio;
		double areaCalculada = App.calcularArea(radio);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	
	@Test
	public void testAreaCirculo1()
	{
		double radio =10.0;
		double areaDeseada = Math.PI * radio * radio;
		double areaCalculada = App.calcularArea(radio);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	
	@Test
	public void testAreaCirculo2()
	{
		double radio =0.0;
		double areaDeseada = Math.PI * radio * radio;
		double areaCalculada = App.calcularArea(radio);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	
	//area de un cuadrado
	@Test
	public void testAreaCuadrado()
	{
		double lado =13.0;
		double areaDeseada = Math.PI * lado * lado;
		double areaCalculada = App.areaCuadrado(lado);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	@Test
	public void testAreaCuadrado1()
	{
		double lado =14.0;
		double areaDeseada = Math.PI * lado * lado;
		double areaCalculada = App.areaCuadrado(lado);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	
	@Test
	public void testAreaCuadrado2()
	{
		double lado =0.00;
		double areaDeseada = Math.PI * lado * lado;
		double areaCalculada = App.areaCuadrado(lado);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	
	@Test
	public void testAreaRectangulo()
	{
		double base =10.00;
		double altura = 0.00;
		double areaDeseada = base * altura;
		double areaCalculada = App.areaRectangulo(base,altura);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	@Test
	public void testAreaRectangulo1()
	{
		double base =0.00;
		double altura = 10.00;
		double areaDeseada = base * altura;
		double areaCalculada = App.areaRectangulo(base,altura);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	
	@Test
	public void testAreaRectangulo2()
	{
		double base =10.00;
		double altura = 10.00;
		double areaDeseada = base * altura;
		double areaCalculada = App.areaRectangulo(base,altura);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	@Test
	public void testAreaRectangulo3()
	{
		double base =0.00;
		double altura = 0.00;
		double areaDeseada = base * altura;
		double areaCalculada = App.areaRectangulo(base,altura);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
	}
	
	@Test
	public void testAreaTriangulo() {
		double base = 0.00;
		double altura = 0.00;
		double areaDeseada = (base * altura)/2;
		double areaCalculada = App.areaTriangulo(base,altura);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
		
	}
	@Test
	public void testAreaTriangulo1() {
		double base = 0.00;
		double altura = 3.00;
		double areaDeseada = (base * altura)/2;
		double areaCalculada = App.areaTriangulo(base,altura);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
		
	}
	
	@Test
	public void testAreaTriangulo2() {
		double base = 0.00;
		double altura = 3.00;
		double areaDeseada = (base * altura)/2;
		double areaCalculada = App.areaTriangulo(base,altura);
		
		assertEquals(areaDeseada,areaCalculada,0.0001);
		
		
	}
	

   
}

 
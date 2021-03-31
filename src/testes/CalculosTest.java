package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import codigos.Calculos;

@DisplayName("Teste de calculos do salario")
public class CalculosTest {
	
	@Test
	@DisplayName("Salario por Horas")
	void testSalario() {
		System.out.println("Testando Salario !!!");
		
		Calculos calc = new Calculos();
		double resultado = calc.valor(6, 10);
		assertEquals(60, resultado);
	}
}

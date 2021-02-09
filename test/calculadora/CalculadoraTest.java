package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}

	@DisplayName("Testa a subtracao de dois n�meros")
	@Test
	public void testSubtracaoDoisNumeros() {
		int result = calc.subtracao(9, 5);
		Assertions.assertEquals(4, result);
	}

	@DisplayName("Testa a multiplicacao de dois n�meros")
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int result = calc.multiplicacao(3, 6);
		Assertions.assertEquals(18, result);
	}

	@DisplayName("Testa o somatorio ate x")
	@Test
	public void testSomatorio() {
		int result = calc.somatoria( 6);
		Assertions.assertEquals(21, result);
	}

	@DisplayName("Testa o eh positivo sendo positivo")
	@Test
	public void testEhPositivo() {
		boolean result = calc.ehPositivo( 6);
		Assertions.assertEquals(true, result);
	}

	@DisplayName("Testa o eh positivo sendo negativo")
	@Test
	public void testEhNegativo() {
		boolean result = calc.ehPositivo( -6);
		Assertions.assertEquals(false, result);
	}

	@DisplayName("Testa o compara iguais")
	@Test
	public void testComparaIguais() {
		int result = calc.compara( 1,1);
		Assertions.assertEquals(0, result);
	}

	@DisplayName("Testa o compara a maior que b")
	@Test
	public void testComparaMaior() {
		int result = calc.compara( 2,1);
		Assertions.assertEquals(1, result);
	}

	@DisplayName("Testa o compara a menor que b")
	@Test
	public void testComparaMenor() {
		int result = calc.compara( 2,3);
		Assertions.assertEquals(-1, result);
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

}

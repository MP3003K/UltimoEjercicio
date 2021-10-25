package EjerciciosClase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacionesTest {

	Operaciones operaciones;

	@BeforeEach
	public void setUp() {
		operaciones = new Operaciones();
	}

	// V1 = validation N°1
	@Test
	public void UltimoV1() {
		// Arrange
		int n1 = 8, n2 = 18;
		// Act
		boolean resultado = operaciones.ultimoNumero(n1, n2);
		// Assert
		assertTrue(resultado);
	}

	@Test
	public void UltimoV2() {
		// Arrange
		int n1 = 3, n2 = 113;

		// Act
		boolean resultado = operaciones.ultimoNumero(n1, n2);
		// Assert
		assertTrue(resultado);
	}

	@Test
	public void UltimoV3() {
		// Arrange
		int n1 = 6, n2 = 117;

		// Act
		boolean resultado = operaciones.ultimoNumero(n1, n2);
		// Assert
		assertFalse(resultado);
	}

}

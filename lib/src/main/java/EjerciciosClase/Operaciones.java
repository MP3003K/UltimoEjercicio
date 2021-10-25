package EjerciciosClase;

public class Operaciones {
	
	public boolean ultimoNumero(int n1, int n2) {
		double ultimoDigito=n2%10;
		if (n1==ultimoDigito) {
			return true;
		} else {
return false;
		}
	}
	
}

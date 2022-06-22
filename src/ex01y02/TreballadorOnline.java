package ex01y02;

public class TreballadorOnline extends Treballador {
	
	private final double tarifaInternet=40;
	public TreballadorOnline (String nom, String cognom, double preuHora) {
		super(nom,cognom,preuHora);
	}
	
	@Deprecated
	
	public String getCognom() {
		return cognom;
	}
	
	@Override

	public double calcularSou(double hores) {
		
		return super.calcularSou(hores)+tarifaInternet;
	}
}

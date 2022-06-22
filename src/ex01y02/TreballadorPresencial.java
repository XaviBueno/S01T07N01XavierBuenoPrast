package ex01y02;
public class TreballadorPresencial extends Treballador {
	
	private static double benzina;
	
	public TreballadorPresencial (String nom, String cognom, double preuHora,double benzina) {
		super(nom,cognom,preuHora);
		TreballadorPresencial.benzina=benzina;
	}
	
	@Deprecated
	
	public void setPreuHora(double preuHora) {
		super.preuHora=preuHora;
	}
	@Override

	public double calcularSou(double hores) {
		
		return super.calcularSou(hores)+benzina;
	}
}
package ex01y02;

public class Principal {
	@ SuppressWarnings ("deprecation") //Anul·la Warnings
	public static void main(String[] args) {
		
		Treballador treballador=new Treballador("Josep","Garcia", 20);
		System.out.println(treballador.calcularSou(200));
		TreballadorOnline treballadorOnline=new TreballadorOnline("Josep","Garcia", 20);
		System.out.println(treballadorOnline.calcularSou(200));
		TreballadorPresencial treballadorPresencial=new TreballadorPresencial("Josep","Garcia", 20,200);
		System.out.println(treballadorPresencial.calcularSou(200));
		
		
		treballadorOnline.getCognom();
		treballadorPresencial.setPreuHora(10.5);
		
		
		
	}

}

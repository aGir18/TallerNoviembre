public class AppTallerNov {

	public static void main(String[] args) {
		
		Taller taller01 = new Taller();
		CocheNov coche01 = new CocheNov("Seat", "Azul");
		coche01.averiado();
		coche01.averiado();
		coche01.averiado();
		System.out.println("El vehículo tiene " + coche01.getNumeroDeAverias() + " averías");
		System.out.println(taller01.estimaPresupuesto(coche01, 10, 2));
		System.out.println(taller01.generaPresupuesto(coche01, 20, 3));
//		System.lineSeparator();
		coche01.reparado();
		coche01.reparado();
		System.out.println("El vehículo tiene " + coche01.getNumeroDeAverias() + " averías");
		System.out.println("¿Está el coche averiado? " + coche01.estaAveriado);
		System.lineSeparator();
		System.out.println(taller01.ingresaVehiculo(coche01, 25, 30));
		
		
	}

}


public class Taller {

	int precioHora = 10;
	int precioPieza = 50;

	public void ingresaVehiculo(VehiculoConRuedasNov vehiculoAveriado) {
		vehiculoAveriado.setEstaAveriado(true);
		
	}

	public String estimaPresupuesto(VehiculoConRuedasNov vehiculoAveriado, float numeroDeHorasEstimadas,
			int numeroDePiezasRepuestoEstimadas) {
		return "El vehículo estará un total de " + numeroDeHorasEstimadas + " horas estimadas y la factura será de "
				+ numeroDeHorasEstimadas * precioHora + numeroDePiezasRepuestoEstimadas * precioPieza
				+ "€ estimadamente";
	}

	public String generaPresupuesto(VehiculoConRuedasNov vehiculoAveriado, float numeroDeHorasTrabajadas,
			int numeroDePiezasRepuestoUsadas) {
		return "La factura final es de " + numeroDeHorasTrabajadas * precioHora
				+ numeroDePiezasRepuestoUsadas * precioPieza + "€.";
	}

	public void arreglaVehiculo(VehiculoConRuedasNov vehiculo) {
		vehiculo.reparado();
	}

}

//public String estimaPresupuestoVariasAverias(int numeroDeAverias) {
//	float presupuestoFinal;
//	for (int i = 0; i < numeroDeAverias; i++) {
//		presupuestoFinal += estimaPresupuesto(null, i, i);
//	}
//	return "El vehículo estará un total de " + numeroDeHorasEstimadas + " horas estimadas y la factura será de "
//			+ numeroDeHorasEstimadas * precioHora + numeroDePiezasRepuestoEstimadas * precioPieza
//			+ "€ estimadamente";
//}

//public double estimaPresupuesto(VehiculoConRuedasNov vehiculoAveriado, double numeroDeHorasEstimadas, int numeroDePiezasRepuestoEstimadas) {
//	return numeroDeHorasEstimadas * precioHora + numeroDePiezasRepuestoEstimadas * precioPieza; 
//}

//public double generaPresupuesto(VehiculoConRuedasNov vehiculoAveriado, double numeroDeHorasTrabajadas,
//		int numeroDePiezasRepuestoUsadas) {
//	return numeroDeHorasTrabajadas * precioHora + numeroDePiezasRepuestoUsadas * precioPieza;
//}
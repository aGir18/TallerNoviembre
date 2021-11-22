public class Taller {

	int precioHora = 10;
	int precioPieza = 50;

	public String ingresaVehiculo(VehiculoConRuedasNov vehiculoAveriado, float numeroDeHorasEstimadas,
			int piezasEstimadas) {
		vehiculoAveriado.setEstaAveriado(true);

		return this.estimaPresupuesto(vehiculoAveriado, numeroDeHorasEstimadas, piezasEstimadas);

	}

	public String estimaPresupuesto(VehiculoConRuedasNov vehiculoAveriado, float numeroDeHorasEstimadas,
			int numeroDePiezasRepuestoEstimadas) {

		return "El vehículo estará un total de " + numeroDeHorasEstimadas
				+ " horas estimadas y la factura será  estimadamente de " + numeroDeHorasEstimadas * precioHora
				+ numeroDePiezasRepuestoEstimadas * precioPieza + "€.";
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
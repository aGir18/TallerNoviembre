public abstract class VehiculoConRuedasNov extends VehiculoNov implements ArrancableNov, Averiable {

	protected boolean estaAveriado;
	
	protected int numeroDeAverias;

	public abstract int getNumeroDeRuedas();
	
	public void setEstaAveriado(boolean estaAveriado) {
		this.estaAveriado = estaAveriado;
	}

	public int getNumeroDeAverias() {
		
		return numeroDeAverias;
	}

	@Override
	public void arrancar() {
		System.out.println("VehiculoNov arrancado");
	}
	
	public void averiado() {
		this.setEstaAveriado(true);
		this.numeroDeAverias ++;
	}
	
	public void reparado() {
		if (numeroDeAverias <= 0) {
			
		} else {
			this.numeroDeAverias --;
			if (numeroDeAverias == 0) {
				this.setEstaAveriado(false);
			}
		
		}
	}

	public double presupuesto(double numeroDeHoras, int numeroDePiezasRepuesto) {
		double precioHora = 10;
		double precioPieza = 5;

		return numeroDeHoras * precioHora + numeroDePiezasRepuesto * precioPieza;
	}

	public VehiculoConRuedasNov(String modelo, String color) {
		super(modelo, color);
	}
	
	@Override
	public String toString() {

		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}

}
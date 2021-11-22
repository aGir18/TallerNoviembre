public class MotoNov extends VehiculoConRuedasNov {

	private boolean estaAveriado;
	
	public MotoNov(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

	public void setEstaAveriado(boolean estaAveriado) {
		this.estaAveriado = estaAveriado;
	}

	public boolean isEstaAveriado() {
		return estaAveriado;
	}
	
	@Override
	public void averiado() {
		this.estaAveriado = true;
		
	}

	@Override
	public void reparado() {
		this.estaAveriado = false;
		
	}
	
	@Override
	public double presupuesto(double numeroDeHoras, int numeroDePiezasRepuesto) {
		double precioHora = 10;
		double precioPieza = 5;

		return numeroDeHoras * precioHora + numeroDePiezasRepuesto * precioPieza;		
	}
	
	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}


}

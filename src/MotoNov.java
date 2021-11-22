public class MotoNov extends VehiculoConRuedasNov {

	public MotoNov(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

//	public void setEstaAveriado(boolean estaAveriado) {
//		this.estaAveriado = estaAveriado;
//	}
//
//	public boolean isEstaAveriado() {
//		return estaAveriado;
//	}

//	@Override
//	public void averiado() {
//		this.setEstaAveriado(true);
//		this.numeroDeAverias++;
//	}
//
//	@Override
//	public void reparado() {
//		if (numeroDeAverias <= 0) {
//
//		} else {
//			this.numeroDeAverias--;
//			if (numeroDeAverias == 0) {
//				this.setEstaAveriado(false);
//			}
//		}
//	}

	@Override
	public double presupuesto(double numeroDeHoras, int numeroDePiezasRepuesto) {
		return super.presupuesto(numeroDeHoras, numeroDePiezasRepuesto);
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}

}

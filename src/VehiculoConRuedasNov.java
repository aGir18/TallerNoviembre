public abstract class VehiculoConRuedasNov extends VehiculoNov implements ArrancableNov, Averiable {
	
	public abstract int getNumeroDeRuedas();

	public VehiculoConRuedasNov(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public void arrancar() {
		System.out.println("VehiculoNov arrancado");
	}

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}

}
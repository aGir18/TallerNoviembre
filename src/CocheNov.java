import java.util.Objects;

public class CocheNov extends VehiculoConRuedasNov implements ArrancableNov {

	protected int numeroDeRuedas;
	private String matricula;
	private boolean estaAveriado;

	@Override
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}

	void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public CocheNov(String modelo, String color) {
//        this(color);
		super(modelo, color);
//        this.modelo = modelo;
		numeroDeRuedas = 4;
	}

	public void setEstaAveriado(boolean estaAveriado) {
		this.estaAveriado = estaAveriado;
	}

	public boolean isEstaAveriado() {
		return estaAveriado;
	}

	@Override
	public void arrancar() {
		System.out.println("CocheNov arrancado");
	}

	@Override
	public void averiado() {
		this.setEstaAveriado(true);
	}
	
	@Override
	public void reparado() {
		this.setEstaAveriado(true);
	}

	@Override
	public double presupuesto(double numeroDeHoras, int numeroDePiezasRepuesto) {
		double precioHora = 10;
		double precioPieza = 5;

		return numeroDeHoras * precioHora + numeroDePiezasRepuesto * precioPieza;
	}

	@Override
	public String toString() {
		return "Placa " + matricula + " - " + super.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula, getModelo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CocheNov other = (CocheNov) obj;
		return Objects.equals(matricula, other.matricula) && Objects.equals(getModelo(), other.getModelo());
	}




}

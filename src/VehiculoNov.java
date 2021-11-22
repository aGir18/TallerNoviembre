public class VehiculoNov implements Comparable<VehiculoNov> {

	private String modelo;
	private String color;

	protected String getModelo() {
		return modelo;
	}

	public String getColor() {
	    return color;
	}

	public void setColor(String color) {
	    this.color = color;
	}
	
	public VehiculoNov(String modelo, String color) {
	    this.modelo = modelo;
	    setColor(color);
	}
	
    @Override
    public String toString() {
        return getModelo() + " (" + getColor() + ")";
    }

	@Override
	public int compareTo(VehiculoNov otro) {
		return getModelo().compareTo(otro.getModelo());
	}

}
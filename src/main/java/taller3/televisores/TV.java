package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	Control control;
	private static int numTV;
	
	//constructor
	public TV(Marca mc, boolean est) {
		this.marca=mc;
		this.estado=est;
		numTV++;
	}
	
	// get y set marca
	public void setMarca(Marca mrc) {
		this.marca=mrc;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	// get y set control (?)
	public void setControl(Control con1) {
		this.control=con1;
	}
	public Control getControl() {
		return this.control;
	}
	
	// get y set precio
	public void setPrecio(int pr1) {
		this.precio=pr1;
	}
	public int getPrecio() {
		return this.precio;
	}
	
	// get y set volumen
	public void setVolumen(int vol) {
		if (this.estado==true) {
			if (vol>=0 & vol<=7) {
				this.volumen=vol;
			}
		}
	}
	public int getVolumen() {
		return this.volumen;
	}
	
	// get y set canal
	public void setCanal(int can) {
		if (this.estado==true) {
			if (can>=1 & can<=120) {
				this.canal=can;
			}
		}
	}
	public int getCanal() {
		return this.canal;
	}
	
	//metodo get y set numTV
	
	public void setNumTV(int num) {
		numTV=num;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	//metodos turnOn y turnOff
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	
	//get estado
	public boolean getEstado() {
		return this.estado;
	}
	
	//canalUp y canalDown
	public void canalUp() {
		if (this.estado==true) {
			if (this.canal!=120) {
				this.canal++;
			}
		}
	}
	public void canalDown() {
		if (estado==true) {
			if (canal!=1) {
				canal--;
			}
		}
	}
	
	//volumenUp y volumenDown
	public void volumenUp() {
		if (estado==true) {
			if (volumen!=7) {
				volumen++;
			}
		}
	}
	public void volumenDown() {
		if (estado==true) {
			if (volumen!=0) {
				volumen--;
			}
		}
	}
	
	
}
package taller3.televisores;

public class TV {
//	Los atributos: marca (Marca), canal(int), precio(int), estado(boolean), volumen(int) y
//	control (Control).
//	• Tendrá un constructor que tiene como parámetros la marca y el estado (si el televisor
//	este encendido o no)
//	• Por defecto el valor de los atributos canal, volumen y precio serán: 1, 1 y 500
//	respectivamente.
//	• Tendrá los métodos set y get para los atributos marca, control, precio, volumen y canal.
//	• Como somos una fabrica y queremos llevar las cuentas de la fabricación de televisores,
//	implementar el conteo de televisores creados (objetos creados de la clase) para lo cual
//	se debe implementar el atributo numTV (de tipo clase y no de instancia) y el método
//	correspondiente para acceder a este valor.
	
//	• Definir los métodos para cambiar el estado de encendido a apagado llamados turnOn y
//	turnOff, que respectivamente se encargaran de encender y apagar el televisor.
//	• Implementar el método getEstado que retornara el valor del atributo estado.
//
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	public Control control;
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
	
	public String getMarca() {
		return this.marca.getNombre();
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
		precio=pr1;
	}
	public int getPrecio() {
		return precio;
	}
	
	// get y set volumen
	public void setVolumen(int vol) {
		if (estado==true) {
			if (vol>=0 & vol<=7) {
				volumen=vol;
			}
		}
	}
	public int getVolumen() {
		return volumen;
	}
	
	// get y set canal
	public void setCanal(int can) {
		if (estado==true) {
			if (can>=1 & can<=120) {
				canal=can;
			}
		}
	}
	public int getCanal() {
		return canal;
	}
	
	//metodo numTV
	public int getNumTV() {
		return numTV;
	}
	
	//metodos turnOn y turnOff
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	
	//get estado
	public boolean getEstado() {
		return estado;
	}
	
	//canalUp y canalDown
	public void canalUp() {
		if (estado==true) {
			if (canal!=120) {
				canal++;
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
	
	
//	Otro requerimiento en nuestros televisores es que implementemos el cambio de canal y el
//	cambio de volumen, para esto definimos los métodos canalUp y canalDown, que se encargaran
//	de cambiar el canal aumentándolo o disminuyéndolo, y los métodos volumenUp, y
//	volumenDown que se encargan de cambiar el volumen aumentándolo o disminuyéndolo.
	
//	Una de las dos limitaciones que se afronta en estos televisores, es que los canales disponibles
//	solo van del canal 1 al canal 120 y para cambiar de canal necesariamente debe estar encendido
//	el televisor, por obvias razones, así que en este diseño que se está construyendo, se debe
//	implementar las condiciones que sean necesarias para representar lo anterior. También ocurre lo
//	mismo con el volumen, esta ira de 0 a 7 y para que este cambie debe estar encendido el
//	televisor. Para ambos casos, cambio de canal o subir volumen, en caso de un valor por encima o
//	debajo de sus valores límites o que no se cumpla que esté encendido, no se debe hacer nada.
	
	
}
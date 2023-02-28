package taller3.televisores;

public class Control {
	
	private TV tv;
	
	//aquí, en la primera línea, se le asigna un valor al atributo televisor de la clase Control,
	//en la segunda línea, el método se va al método setcontrol de la clase TV, y la variable control 
	//del televisor sería el objeto de clase control actual.
	
	public void enlazar(TV tele) {
		this.tv = tele;
		tele.setControl(this);
	}
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int can) {
		tv.setCanal(can);
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
}

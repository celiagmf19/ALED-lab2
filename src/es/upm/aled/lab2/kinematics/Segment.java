package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;


// Clase que contiene todos los parámetros para formar un segmento
public class Segment {
	
	// Definición de atributos
	private double length;
	private double angle;
	private List<Segment> children;
	
	// Esto es el constructor que inicializa todos los atributos
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<Segment>();
	}
	
	// Nos devuelve la longitud
	public double getLength() {
		return this.length;
	}
	
	// Nos devuelve el ángulo
	public double getAngle() {
		return this.angle;
	}
	
	// Modificamos el ángulo por un ángulo dado
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	// Nos devuelve la lista de niños
	public List<Segment> getChildren(){
		return this.children;
	}
	
	// Si un niño no está en la lista, lo añadimos
	public void addChild(Segment child) {
		if(!children.contains(child)) {
			children.add(child);
		}
	}
}

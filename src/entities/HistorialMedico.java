package entities;

import java.util.ArrayList;

public class HistorialMedico {
	
	public ArrayList <Control> controles;
	
	public HistorialMedico() {
		super();
	}

	public HistorialMedico(ArrayList<Control> controles) {
		super();
		this.controles = controles;
	}

	public ArrayList<Control> getControles() {
		return controles;
	}

	public void setControles(ArrayList<Control> controles) {
		this.controles = controles;
	}
	
	

	
	
	

}

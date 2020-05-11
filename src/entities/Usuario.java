package entities;

import java.util.ArrayList;

public class Usuario {
	
	public long cedula;
	public String contraseña;
	public String email;
	public String medico;
	public HistoriaClinica historiaClinica;
	public ArrayList <Terapias> terapias;
	public Control control;
	public HistorialMedico historialMedico;
	
	
	public ArrayList <Usuario> auxUsuarios;
	
	
	
	public Usuario() {
		super();
	}


	public Usuario(long cedula, String contraseña, String email, String medico, HistoriaClinica historiaClinica, ArrayList<Terapias> terapias, Control control, HistorialMedico historialMedico) {
		super();
		this.cedula = cedula;
		this.contraseña = contraseña;
		this.email = email;
		this.medico = medico;
		this.historiaClinica = historiaClinica;
		this.terapias = terapias;
		this.control = control;
		this.historialMedico = historialMedico;
	}


	public long getCedula() {
		return cedula;
	}


	public void setCedula(long cedula) {
		this.cedula = cedula;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMedico() {
		return medico;
	}


	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	
	public ArrayList<Terapias> getTerapias() {
		return terapias;
	}


	public void setTerapias(ArrayList<Terapias> terapias) {
		this.terapias = terapias;
	}


	public Control getControl() {
		return control;
	}


	public void setControl(Control control) {
		this.control = control;
	}

	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}


	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}


	public HistorialMedico getHistorialMedico() {
		return historialMedico;
	}


	public void setHistorialMedico(HistorialMedico historialMedico) {
		this.historialMedico = historialMedico;
	}


	
	
	
	
	

}

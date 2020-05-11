package entities;

public class HistoriaClinica {
	
	public String primerDiagonostico;
	public HistorialMedico resumenHistorial;
	public String estadoPaciente;
	
	
	public HistoriaClinica() {
		super();
	}


	public HistoriaClinica(String primerDiagonostico, HistorialMedico resumenHistorial, String estadoPaciente) {
		super();
		this.primerDiagonostico = primerDiagonostico;
		this.resumenHistorial = resumenHistorial;
		this.estadoPaciente = estadoPaciente;
	}


	public String getPrimerDiagonostico() {
		return primerDiagonostico;
	}


	public void setPrimerDiagonostico(String primerDiagonostico) {
		this.primerDiagonostico = primerDiagonostico;
	}


	public HistorialMedico getResumenHistorial() {
		return resumenHistorial;
	}


	public void setResumenHistorial(HistorialMedico resumenHistorial) {
		this.resumenHistorial = resumenHistorial;
	}


	public String getEstadoPaciente() {
		return estadoPaciente;
	}


	public void setEstadoPaciente(String estadoPaciente) {
		this.estadoPaciente = estadoPaciente;
	}
	
	
	
	
	
}

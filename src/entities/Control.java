package entities;

import java.util.ArrayList;

public class Control {
	public String necesidades;
	public boolean estado;
	public String avances;
	public String registrosProtesis;
	public String recomendaciones;
	public String localizacion;
	public long fechaInicio;
	public long fechaFin;
	public int cantidadTerapias;
	public ArrayList <String> analgesicos;
	
	
	public Control() {
		super();
	}


	public Control(String necesidades, boolean estado, String avances, String registrosProtesis, String recomendaciones,
			String localizacion, long fechaInicio, long fechaFin, int cantidadTerapias, ArrayList<String> analgesicos) {
		super();
		this.necesidades = necesidades;
		this.estado = estado;
		this.avances = avances;
		this.registrosProtesis = registrosProtesis;
		this.recomendaciones = recomendaciones;
		this.localizacion = localizacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadTerapias = cantidadTerapias;
		this.analgesicos = analgesicos;
	}


	public String getNecesidades() {
		return necesidades;
	}


	public void setNecesidades(String necesidades) {
		this.necesidades = necesidades;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public String getAvances() {
		return avances;
	}


	public void setAvances(String avances) {
		this.avances = avances;
	}


	public String getRegistrosProtesis() {
		return registrosProtesis;
	}


	public void setRegistrosProtesis(String registrosProtesis) {
		this.registrosProtesis = registrosProtesis;
	}


	public String getRecomendaciones() {
		return recomendaciones;
	}


	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	public long getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(long fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public long getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(long fechaFin) {
		this.fechaFin = fechaFin;
	}


	public int getCantidadTerapias() {
		return cantidadTerapias;
	}


	public void setCantidadTerapias(int cantidadTerapias) {
		this.cantidadTerapias = cantidadTerapias;
	}


	public ArrayList<String> getAnalgesicos() {
		return analgesicos;
	}


	public void setAnalgesicos(ArrayList<String> analgesicos) {
		this.analgesicos = analgesicos;
	}
	
	
	
	
	
	
}

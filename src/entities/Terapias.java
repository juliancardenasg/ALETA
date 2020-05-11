package entities;

public class Terapias {
	
	public String tipo;  		//Terapias basicas o Nuevas creaciones
	public String nombre;
	public boolean anexada;
	public int dia;
	public String nivel;
	public String explicacion;
	public String repeticiones;
	public String razones;
	public boolean aprobacionEPS;
	
	
	public Terapias() {
		super();
	}


	public Terapias(String tipo, String nombre, boolean anexada, int dia, String nivel, String explicacion,
			String repeticiones, String razones, boolean aprobacionEPS) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.anexada = anexada;
		this.dia = dia;
		this.nivel = nivel;
		this.explicacion = explicacion;
		this.repeticiones = repeticiones;
		this.razones = razones;
		this.aprobacionEPS = aprobacionEPS;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isAnexada() {
		return anexada;
	}


	public void setAnexada(boolean anexada) {
		this.anexada = anexada;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public String getExplicacion() {
		return explicacion;
	}


	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}


	public String getRepeticiones() {
		return repeticiones;
	}


	public void setRepeticiones(String repeticiones) {
		this.repeticiones = repeticiones;
	}


	public String getRazones() {
		return razones;
	}


	public void setRazones(String razones) {
		this.razones = razones;
	}


	public boolean isAprobacionEPS() {
		return aprobacionEPS;
	}


	public void setAprobacionEPS(boolean aprobacionEPS) {
		this.aprobacionEPS = aprobacionEPS;
	}
	
	
	
	
	

}

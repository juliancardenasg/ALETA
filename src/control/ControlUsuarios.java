package control;

import java.util.ArrayList;

import entities.Usuario;

public class ControlUsuarios {
	
	public ArrayList <Usuario> auxUsuarios = new ArrayList<>();	
	
	
	public ControlUsuarios() {
		super();
	}
	
	
	public ControlUsuarios(ArrayList<Usuario> auxUsuarios) {
		super();
		this.auxUsuarios = auxUsuarios;
	}
	
	
	public ArrayList<Usuario> getAuxUsuarios() {
		return auxUsuarios;
	}
	

	public void setAuxUsuarios(ArrayList<Usuario> auxUsuarios) {
		this.auxUsuarios = auxUsuarios;
	}


	
	public boolean crearUsuario (String email, String contraseña, long cedula, String medico) {
		Usuario usuarioAux = null;
		for(Usuario aux : this.auxUsuarios) {
			if(aux.getEmail() == email) {
				return false;
			}
			else {
				usuarioAux.setCedula(cedula);
				usuarioAux.setContraseña(contraseña);
				usuarioAux.setEmail(email);
				usuarioAux.setMedico(medico);
				this.auxUsuarios.add(usuarioAux);
				return true;
			}
		}
		return false;
	}
	
	public Usuario buscarUsuario (long cedula) {
		for(Usuario aux : this.auxUsuarios) {
			if(aux.getCedula() == cedula) {
				return aux;
			}
		}
		return null;
	}
	
	public boolean eliminarUsuario (long cedula, String contraseña) {
		
		if(buscarUsuario(cedula) != null) {
			if(buscarUsuario(cedula).getContraseña() == contraseña) {
				if(this.auxUsuarios.remove(buscarUsuario(cedula)) == true){
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean autenticacionUsuario (long cedula, String contraseña) {
		if(buscarUsuario(cedula) != null) {
			if(buscarUsuario(cedula).getContraseña() == contraseña) {
				return true;
			}
		}
		return false;
	}

}

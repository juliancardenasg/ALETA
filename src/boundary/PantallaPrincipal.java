package boundary;

import entities.*;
import control.*;

import java.util.Scanner;
import java.util.ArrayList;


public class PantallaPrincipal {

	public static void main(String[] args) {

		ArrayList <Usuario> listaUsuarios = new ArrayList<>();
		ControlUsuarios admin = new ControlUsuarios();

		Scanner obj = new Scanner(System.in);


		System.out.println("Bienvenido");
		System.out.println("Bienvenido al menu inicial. Elija una opcion");
		System.out.println("(1) Ingreso");
		System.out.println("(1) Nuevo Usuario");
		int opPrincipal = obj.nextInt();

		if(opPrincipal == 1) {					//USUARIO REGISTRADO
			System.out.println("INGRESO");
			System.out.println("Ingrese la cedula del paciente");
			long auxCedula = obj.nextLong();
			System.out.println("Ingrese la contraseña");
			String auxContraseña = obj.nextLine();

			if(admin.autenticacionUsuario(auxCedula, auxContraseña) == true) {
				System.out.println("HOME");
				System.out.println("Elija una opción a continuacion");
				System.out.println("(1) Historia Clinica");
				System.out.println("(2) Control");
				System.out.println("(3) Historial");
				System.out.println("(4) Tipos de terapia");
				int opSemiPrincipal = obj.nextInt();
				if(opSemiPrincipal == 1) {
					System.out.println("HISTORIA CLINICA");
				}
				if(opSemiPrincipal == 2) {
					System.out.println("CONTROL");
				}
				if(opSemiPrincipal == 3) {
					System.out.println("HISTORIAL");
				}
				if(opSemiPrincipal == 4) {
					System.out.println("TIPOS DE TERAPIA");
					System.out.println("Elija una opción a continuación");
					System.out.println("(1) TERAPIAS BASICAS");
					System.out.println("(2) NUEVAS CREACIONES");
					int op44 = obj.nextInt();
					if(op44 == 1) {

					}
					else {

					}
				}
			}
			else {
				System.out.println("Error, usuario no encontrado. Intente de nuevo mas tarde");
			}









		}
		else {									//USUARIO NO REGISTRADO
			System.out.println("USUARIO NUEVO");
			System.out.println("Ingrese un correo electronico");
			String auxEmail = obj.nextLine();
			System.out.println("Ingrese una contraseña");
			String auxContraseña = obj.nextLine();
			System.out.println("Ingrese su numero de cedula");
			long auxCedula = obj.nextLong();
			System.out.println("Ingrese el nombre de su medico");
			String auxMedico = obj.nextLine();
			if(admin.crearUsuario(auxEmail, auxContraseña, auxCedula, auxMedico) == true) {
				System.out.println("HOME");
				System.out.println("Elija una opción a continuacion");
				System.out.println("(1) Historia Clinica");
				System.out.println("(2) Control");
				System.out.println("(3) Historial");
				System.out.println("(4) Tipos de terapia");
				int opSemiPrincipal = obj.nextInt();
				if(opSemiPrincipal == 1) {
					System.out.println("HISTORIA CLINICA");
				}
				if(opSemiPrincipal == 2) {
					System.out.println("CONTROL");
				}
				if(opSemiPrincipal == 3) {
					System.out.println("HISTORIAL");
				}
				if(opSemiPrincipal == 4) {
					System.out.println("TIPOS DE TERAPIA");
				}

			}
			else {
				System.out.println("Usuario no creado. Intente de nuevo mas tarde");
			}

		}



	}

}

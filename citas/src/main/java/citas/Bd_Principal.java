package citas;

import java.util.Date;
import java.util.List;

import org.orm.PersistentException;
import java.io.Serializable;
import java.time.LocalDate;

public class Bd_Principal implements iAdministrador, iUsuario, Serializable {

	Bd_Citas citas = new Bd_Citas();
	Bd_Asuntos asuntos = new Bd_Asuntos();
	Bd_Clientes clientes = new Bd_Clientes();

	public static void main(String[] args) {

	};

	public Cliente Cargar_Informacion_Cliente(int Cita) {
		Cliente cl = null;
		try {
			cl = clientes.Cargar_Informacion_Cliente(Cita);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	};

	public void Crear_Cita(LocalDate fecha, int Cliente, int Asunto) {
		try {
			citas.Crear_Cita(fecha, Cliente, Asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Baja_Cita_Activa(int ID) {
		try {
			citas.Baja_Cita_Activa(ID);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Baja_Cita_Realizada(int ID) {
		try {
			citas.Baja_Cita_Realizada(ID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Crear_Cita_Nuevo_Asunto(LocalDate fecha, String Asunto, int Cliente) {

		try {
			int Id_asunto = asuntos.Crear_Asunto(Asunto);
			citas.Crear_Cita(fecha, Cliente, Id_asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Crear_Cita_Nuevo_Cliente(LocalDate fecha, String Nombre, String Direccion, String Telefono, int Asunto) {

		try {
			int Id_cliente = clientes.Nuevo_Cliente(Nombre, Direccion, Telefono);
			citas.Crear_Cita(fecha, Id_cliente, Asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Crear_Cita_Asunto_Cliente_Nuevos(LocalDate fecha, String Asunto, String Nombre, String Direccion,
			String Telefono) {
		int Id_asunto;
		try {
			Id_asunto = asuntos.Crear_Asunto(Asunto);
			int Id_cliente = clientes.Nuevo_Cliente(Nombre, Direccion, Telefono);
			citas.Crear_Cita(fecha, Id_cliente, Id_asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List Cargar_Clientes() {
		List cls = null;
		try {
			cls = this.clientes.Cargar_Clientes();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cls;
	}

	public List Cargar_Asuntos() {
		List asuntos = null;
		try {
			asuntos = this.asuntos.Cargar_Asuntos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return asuntos;
	}

	public void Cita_Realizada(int ID) {
		try {
			citas.Cita_Realizada(ID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Cita_Pospuesta(int ID, LocalDate fecha) {
		try {
			citas.Cita_Pospuesta(ID, fecha);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Cliente Cargar_Cliente(int Cita) {

		Cliente cl = null;

		try {
			cl = citas.Cargar_Cliente(Cita);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cl;
	}

	public Asunto Cargar_Asunto(int Cita) {
		Asunto as = null;

		try {
			as = citas.Cargar_Asunto(Cita);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return as;
	}

	public Fecha Cargar_Fecha(int Cita) {

		Fecha f = null;

		try {
			f = citas.Cargar_Fecha(Cita);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f;
	}

	public List Cargar_Citas_Pendientes() {
		List citas_activas = null;
		try {
			citas_activas = citas.Cargar_Citas_Pendientes();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return citas_activas;
	}

	public List Cargar_Citas_Realizadas() {
		List citas_realizadas = null;
		try {
			citas_realizadas = citas.Cargar_Citas_Realizadas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return citas_realizadas;
	}

	 
}

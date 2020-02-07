package citas;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface iAdministrador {

	void Crear_Cita(LocalDate fecha, int Cliente, int Asunto);

	void Baja_Cita_Activa(int ID);

	void Baja_Cita_Realizada(int ID);

	void Crear_Cita_Nuevo_Asunto(LocalDate fecha, String Asunto, int Cliente);

	void Crear_Cita_Nuevo_Cliente(LocalDate fecha, String Nombre, String Direccion, String Telefono, int Asunto);

	void Crear_Cita_Asunto_Cliente_Nuevos(LocalDate localDate, String Asunto, String Nombre, String Direccion, String Telefono);

	List Cargar_Citas_Realizadas();

	List Cargar_Citas_Pendientes();

	List Cargar_Clientes();

	List Cargar_Asuntos();

	Cliente Cargar_Cliente(int id);

	Asunto Cargar_Asunto(int id);

	Fecha Cargar_Fecha(int id);

	Cliente Cargar_Informacion_Cliente(int id);
}

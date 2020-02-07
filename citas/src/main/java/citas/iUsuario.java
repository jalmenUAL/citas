package citas;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.*;

public interface iUsuario {

	void Cita_Realizada(int ID);

	void Cita_Pospuesta(int ID, LocalDate fecha);

	 
}

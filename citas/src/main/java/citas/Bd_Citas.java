package citas;

import java.util.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Bd_Citas implements Serializable {

	public void Cita_Realizada(int ID) throws PersistentException {

		Fecha fe = null;
		Asunto as = null;
		Cliente cl = null;
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cita_Activa c = citas.Cita_ActivaDAO.getCita_ActivaByORMID(ID);
			fe = c.getFecha();
			as = c.getEs_para();
			cl = c.getCliente();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Baja_Cita_Activa(ID);

		Crear_Cita_Realizada(fe.getAnyo(), fe.getMes(), fe.getDia(), cl.getID(), as.getID());
		citas.GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	public void Cita_Pospuesta(int ID, LocalDate fecha) throws PersistentException {
		Asunto as = null;
		Cliente cl = null;
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cita_Activa c = citas.Cita_ActivaDAO.getCita_ActivaByORMID(ID);

			as = c.getEs_para();
			cl = c.getCliente();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Baja_Cita_Activa(ID);

		Crear_Cita(fecha, cl.getID(), as.getID());
		citas.GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	public void Crear_Cita(LocalDate fecha, int Cliente, int Asunto) throws PersistentException {
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cliente cl = citas.ClienteDAO.getClienteByORMID(Cliente);
			Asunto as = citas.AsuntoDAO.getAsuntoByORMID(Asunto);
			Fecha f = citas.FechaDAO.createFecha();
			citas.Cita_Activa Cita_Activa = citas.Cita_ActivaDAO.createCita_Activa();
			Calendar cal = Calendar.getInstance();
			Date date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
			cal.setTime(date);
			f.setDia(cal.get(Calendar.DAY_OF_MONTH));
			f.setMes(cal.get(Calendar.MONTH));
			f.setAnyo(cal.get(Calendar.YEAR));
			f.setCliente(cl);
			f.setCita(Cita_Activa);
			Cita_Activa.setEs_para(as);
			Cita_Activa.setFecha(f);
			citas.FechaDAO.save(f);
			citas.Cita_ActivaDAO.save(Cita_Activa);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public void Crear_Cita_Realizada(int a, int m, int d, int Cliente, int Asunto) throws PersistentException {
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cliente cl = citas.ClienteDAO.getClienteByORMID(Cliente);
			Asunto as = citas.AsuntoDAO.getAsuntoByORMID(Asunto);
			Fecha f = citas.FechaDAO.createFecha();
			citas.Cita_Realizada Cita_Realizada = citas.Cita_RealizadaDAO.createCita_Realizada();
			Calendar cal = new GregorianCalendar(a, m, d);
			f.setDia(cal.get(Calendar.DAY_OF_MONTH));
			f.setMes(cal.get(Calendar.MONTH));
			f.setAnyo(cal.get(Calendar.YEAR));
			f.setCliente(cl);
			f.setCita(Cita_Realizada);
			Cita_Realizada.setEs_para(as);
			Cita_Realizada.setFecha(f);
			citas.FechaDAO.save(f);
			citas.Cita_RealizadaDAO.save(Cita_Realizada);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public void Baja_Cita_Activa(int ID) throws PersistentException {
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = citas.CitaDAO.loadCitaByORMID(ID);

			Fecha f = citas.FechaDAO.loadFechaByORMID(c.getFecha().getID());
			citas.FechaDAO.delete(f);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		PersistentTransaction t2 = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita_Activa ca = citas.Cita_ActivaDAO.loadCita_ActivaByORMID(ID);
			Cita c = citas.CitaDAO.loadCitaByORMID(ID);
			citas.Cita_ActivaDAO.delete(ca);
			citas.CitaDAO.delete(c);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		citas.GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	public void Baja_Cita_Realizada(int ID) throws PersistentException {
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = citas.CitaDAO.loadCitaByORMID(ID);

			Fecha f = citas.FechaDAO.loadFechaByORMID(c.getFecha().getID());
			citas.FechaDAO.delete(f);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		PersistentTransaction t2 = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita_Realizada ca = citas.Cita_RealizadaDAO.loadCita_RealizadaByORMID(ID);
			Cita c = citas.CitaDAO.loadCitaByORMID(ID);
			citas.Cita_RealizadaDAO.delete(ca);
			citas.CitaDAO.delete(c);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		citas.GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	public Cliente Cargar_Cliente(int cita) throws PersistentException {

		Cliente cl = null;
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = citas.CitaDAO.loadCitaByORMID(cita);
			cl = c.getCliente();

		} catch (Exception e) {
			t.rollback();
		}

		return cl;
	}

	public Asunto Cargar_Asunto(int cita) throws PersistentException {
		Asunto as = null;

		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = citas.CitaDAO.loadCitaByORMID(cita);
			as = c.getEs_para();

		} catch (Exception e) {
			t.rollback();
		}

		return as;

	}

	public Fecha Cargar_Fecha(int cita) throws PersistentException {
		Fecha f = null;
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = citas.CitaDAO.loadCitaByORMID(cita);
			f = c.getFecha();

		} catch (Exception e) {
			t.rollback();
		}

		return f;
	}

	public List Cargar_Citas_Pendientes() throws PersistentException {
		List<Cita_Activa> citas_act = null;

		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			citas_act = citas.Cita_ActivaDAO.queryCita_Activa(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return citas_act;
	}

	public List Cargar_Citas_Realizadas() throws PersistentException {
		List citas_rel = null;

		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			citas_rel = citas.Cita_RealizadaDAO.queryCita_Realizada(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return citas_rel;
	}

}

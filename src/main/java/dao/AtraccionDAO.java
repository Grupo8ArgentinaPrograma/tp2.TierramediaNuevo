package dao;

import model.Atraccion;


public interface AtraccionDAO extends GenericDAO<Atraccion> {
	
	public abstract Atraccion encontrarPorNombre(String nombre);
	public abstract Atraccion encontrarPorID(int ID);
}

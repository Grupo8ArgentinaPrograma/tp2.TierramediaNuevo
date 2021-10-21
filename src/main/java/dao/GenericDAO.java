package dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {

	public List<T> encontrarTodos()     throws SQLException;
	public  int    contarTodos()   throws SQLException;
	public  int    insertar(T t)  throws SQLException;
	public  int    actualizarDatos(T t)  throws SQLException;
	public  int    borrar(T t)  throws SQLException;
	
}

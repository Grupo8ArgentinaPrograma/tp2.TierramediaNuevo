
package testTierraMedia;

import static org.junit.Assert.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import dao.PromocionDAOImpl;
import model.Atraccion;
import model.PromoAbsoluta;
import model.Promocion;


public class TestPromocionDAOImpl {
	
	
	@Test
	public void queSeCreaPromocionDaoImpl() throws SQLException {
		PromocionDAOImpl promoRecuperado = new PromocionDAOImpl();
		assertNotNull(promoRecuperado);
}

	@Test
	public void queBuscaTodo() throws SQLException {
		PromocionDAOImpl promoRecuperado = new PromocionDAOImpl();
		List<Promocion> promociones = new ArrayList<Promocion>();
		promociones.addAll(promoRecuperado.encontrarTodos());
		int cantidad = 9;
		assertEquals(promociones.size(), cantidad);
	}
	
	@Test
	public void queCuentaTodo() throws SQLException {
		PromocionDAOImpl promoContar= new PromocionDAOImpl();
		int total = promoContar.contarTodos();
		assertEquals(total,9);
	}
	
	
	
	@Test
	public void queEncuentraPorID() throws SQLException {
		PromocionDAOImpl promoRecuperado = new PromocionDAOImpl();
		Promocion promoEncontrada = promoRecuperado.encontrarPorID(9);
		assertNotNull(promoEncontrada); //CHEQUEAR QUE ESTE EN LA BASE DE DATO
		assertEquals(promoEncontrada.getId(),9); 
		
	}
	
/*	@Test
	public void queInsertaNuevaPromo() {
	PromocionDAOImpl pro  = new PromocionDAOImpl();
    Atraccion a1 = new Atraccion("Mordor", 10, 110, 1110, null);
    Atraccion a2 = new Atraccion("Moria", 20, 220, 2220, null);
    Atraccion a3 = new Atraccion("Fangorn", 30, 330, 3330, null);
    Atraccion p []= {a1,a2,a3};
    PromoAbsoluta abs =new PromoAbsoluta("absoluta","pack nuevo absoluto" ,p, "Aventura", 100,39);
    
    pro.insertar(abs);
    assertEquals(pro.contarTodos(),10);
    pro.borrar(abs);
    assertEquals(pro.contarTodos(),9);
	}*/
	
	
	@Test
	public void queModificaPromocion() {
	PromocionDAOImpl pro  = new PromocionDAOImpl();
    PromoAbsoluta abs =(PromoAbsoluta) pro.encontrarPorID(9);
    String descripcionNueva = "descripcion cambiada";
    abs.setDescripcion(descripcionNueva);
    pro.actualizarDatos(abs);
    assertEquals(descripcionNueva,pro.encontrarPorID(9).getDescripcion());
	}
	
	
	
//	@Test
//	public void queBorraPromocion() throws SQLException {
//		PromocionDAOImpl promoRecuperado = new PromocionDAOImpl();
//		
//		Atraccion a1 = new Atraccion("Mordor", 10, 110, 1110, null);
//	    Atraccion a2 = new Atraccion("Moria", 20, 220, 2220, null);
//	    Atraccion a3 = new Atraccion("Fangorn", 30, 330, 3330, null);
//	    Atraccion p []= {a1,a2,a3};
//	    PromoAbsoluta abs =new PromoAbsoluta("absoluta","pack nuevo absoluto" ,p, "Aventura", 100,39);
//		promoRecuperado.insertar(abs);
//		promoRecuperado.borrar(abs);
		
//		Promocion promoEncontrada = promoRecuperado.encontrarPorID(31);
//		promoRecuperado.borrar(promoEncontrada);
//		assertNull(promoEncontrada);
//	}
	
}
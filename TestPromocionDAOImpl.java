
package testTierraMedia;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import dao.PromocionDAOImpl;
import dao.UsuarioDAO;
import dao.AtraccionDAOImpl;
import dao.DAOFactory;
import model.Atraccion;
import model.PromoAbsoluta;
import model.PromoAxB;
import model.Promocion;
import model.Usuario;



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
		assertEquals(promociones.size(), 9);
	}
	@Test
	public void queCuentaTodo() throws SQLException {
		PromocionDAOImpl promoContar= new PromocionDAOImpl();
		int total = promoContar.contarTodos();
		assertEquals(total,9);
	}
	/*@Test
	public void queInsertaNuevaPromo() {
	PromocionDAOImpl pro  = new PromocionDAOImpl();
    Atraccion a1 = new Atraccion("Mordor", 10, 110, 1110, null);
    Atraccion a2 = new Atraccion("Moria", 20, 220, 2220, null);
    Atraccion a3 = new Atraccion("Fangorn", 30, 330, 3330, null);
    Atraccion p []= {a1,a2,a3};
    PromoAbsoluta abs =new PromoAbsoluta("nuevaaaa", p, "Aventura", 100);
    
    pro.insertar(abs);
    assertEquals(pro.contarTodos(),11);
	}*/
	@Test
	public void queEncuentraPorID() throws SQLException {
		PromocionDAOImpl promoRecuperado = new PromocionDAOImpl();
		Promocion promoEncontrada = promoRecuperado.encontrarPorID(9);
		assertNotNull(promoEncontrada); //CHEQUEAR QUE ESTE EN LA BASE DE DATO
		assertEquals(promoEncontrada.getId(),9); 
		
	}
	@Test
	public void queBorraPromocion() throws SQLException {
		PromocionDAOImpl promoRecuperado = new PromocionDAOImpl();
		Promocion promoEncontrada = promoRecuperado.encontrarPorID(9);
		promoRecuperado.borrar(promoEncontrada);
		assertNull(promoEncontrada);
	}
}












/*
package testTierraMedia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Atraccion;
import model.PromoAxB;
import model.Promocion;




public class TestPromociones {

	Promocion promo1;

	@Before
	public void iniciar() {
		Atraccion a1 = new Atraccion("Mordor uno", 25, 10, 5, "Aventura");
		Atraccion a2 = new Atraccion("Mordor dos", 25, 10, 5, "Aventura");
		Atraccion a3 = new Atraccion("Mordor tres", 25, 10, 5, "Aventura");
		Atraccion a4 = new Atraccion("Mordor cuatro", 2500, 10, 5, "Aventura");
		Atraccion atracciones[] = { a1, a2, a3, a4 };
		promo1 = new PromoAxB("nombre",atracciones,"aventra");
	}

	@Test
	public void queSeCreaPromocion() {
		assertNotNull(promo1);
	}

	@Test
	public void queCalculaElcostoTotal() {

		double costo = promo1.getCosto();
		assertEquals(75, costo, 0.0);
	}

}
*/
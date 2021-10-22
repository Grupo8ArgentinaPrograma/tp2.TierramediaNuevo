package dao;

public class DAOFactory {

	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOImpl();
	}

	public static AtraccionDAO getAtraccionDAO() {
		return new AtraccionDAOImpl();
	}

	
	public static PromocionaDAO getPromocionDAO() {
		return new PromocionDAOImpl();
	}

	
	public static ItineraioDAOImpl getItinerarioDaoImpl() {
		return new ItineraioDAOImpl();
	}
}

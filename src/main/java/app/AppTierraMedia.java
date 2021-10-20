package app;

import java.sql.SQLException;
import model.Sistema;

public class AppTierraMedia {

	public static void main(String[] args) throws SQLException {

		Sistema sistema = new Sistema();	
		System.out.println("" 
				+ "\n"
				+ "                                 /\\\r\n"
				+ "                  _/\\           /  \\\r\n"
				+ "              _  /   \\         /    \\/\\\r\n"
				+ "             / \\/   _ \\     /\\/\\  _  _/\\\r\n"
				+ "            /   \\_ / \\/\\_/\\/_/  \\/ \\/   \\\r\n"
				+ "           /\\/\\   \\_   /   \\/            \\\r\n"
				+ "          /    \\___/\\ /     \\             \\\r\n"
				+ "                     \\       \\             \\\r\n"
				+ "                     .-\"---.  \\             \\\r\n"
				+ "          __..---.. /       \\  \\             \\\r\n"
				+ "                   /\\___.-'./\\''--..____..--''\r\n"
				+ "          `-.      \\/ O) (O \\/ ''--.._\r\n"
				+ "              __    |  (_)  |         _.-'-._\r\n"
				+ "             / /  __/\\\\___//\\__ ..--''-._\r\n"
				+ "             | (_/\\ \\/`---'\\/ /\\         `-._\r\n"
				+ "          _.-\\ \\/  \\  \\   /  /  \\.-'-._\r\n"
				+ "             /\\|   /  -| |-  \\   \\     `-._\r\n"
				+ "            | ||  /\\  -| |-  /\\   \\        `-.\r\n"
				+ "             \\/|_/ |  -|_\\-  |/   /\r\n"
				+ "             \\ \\   /  /B_B\\  \\\\  /\r\n"
				+ "             / (   \\_/  _  \\_/ \\/\r\n"
				+ "          .__\\ \\   /    |    \\_/\r\n"
				+ "             ) /''-| __ | __ |\r\n"
				+ "             |(    \\    |    /---...___\r\n"
				+ "             /|    /____|____\\         '-._\r\n"
				+ "             ||     |   ||   |\r\n"
				+ "             \\\\     ///\\\\//\\\\\\\r\n"
				+ "              \\|   oOO(_)(_)OOo"
				+ "");

		System.out.println("   ******************************************************");
		System.out.println("      “Es peligroso, Frodo, cruzar tu puerta.\n"
				+ "     Pones un pie en el camino, y si no cuidas tus pasos,\n"
				+ "     nunca sabes a dónde te puede llevar.”" );	

		System.out.println("   ******************************************************");
		System.out.println("\nBienvenido a la Tierra Media!!!");
		sistema.cargarAtracciones();
		sistema.cargarPromociones();
		sistema.cargarUsuarios();
		System.out.println();
		System.out.println();
		System.err.println("\n");
		System.out.println("                          ************************************");
		System.out.println("                           Comenzamos con las sugerencias!!!");
		System.out.println("                          ************************************");
		System.out.println("\n\n");
		sistema.hacerOfertas();	
		System.out.println("                     ******************************************");
		System.out.println("                       No hay mas visitantes por el dia de hoy");
		System.out.println("                     ******************************************");
	}
}
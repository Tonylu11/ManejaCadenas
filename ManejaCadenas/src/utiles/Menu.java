package utiles;

/**
 * Implementa la clase Menu que sirva para gestionar un men�.
 * 
 * Un ejemplo de men� es:
 ** 
 * Plantilla de la empresa (1) A�adir Becario (2) A�adir Empleado (3) Listar
 * plantilla (4) Listar becarios (5) Listar empleados (6) Contar becarios (7)
 * Contar empleados (8) Salir
 * 
 * B�sicamente, un men� ha de:
 * 
 * Mostrar unas opciones Recoger y devolver las opciones indicadas
 * 
 * A continuaci�n se indican los miembros de la clase Menu:
 * 
 * T�tulo del men�. Se mostrar� al principio del men�. Opciones del men�. Cada
 * una de estas opciones es una cadena que se mostrar� en una l�nea aparte.
 * N�mero de opciones del men�. Un m�todo mostrar() que muestre el men�,
 * a�adi�ndole a cada elemento del men� un n�mero, comenzando por 1. Un m�todo
 * recogeOpcionValida() que recoja una de las opciones v�lidas (entre 1 y n�mero
 * de opciones del men�) Un m�todo gestionar() que gestione el men�. Gestionar
 * un men� consiste en mostrarlo y recoger la opci�n v�lida del men�. Recuerda
 * el constructor, al que se le pasar�n como argumento tanto el t�tulo como las
 * opciones del men�.
 * 
 * Una vez implementada la clase men�, util�zala para gestionar la clase Matriz.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Menu {
	/**
	 * T&iacute;tulo del men&uacute;. Se mostrar&aacute; al principio del
	 * men&uacute;.
	 */
	private String titulo = null;
	/**
	 * Opciones del men&uacute;. Cada una de estas opciones es una cadena que se
	 * mostrar&aacute; en una l&iacute;nea aparte.
	 */
	private String[] opciones = null;
	/**
	 * N&uacute;mero de opciones del men&uacute;.
	 */
	private int numOpciones = 0;

	/**
	 * Constructor, al que se le pasar&aacute;n como argumento tanto el
	 * t&iacute;tulo como las opciones del men&uaucute;.
	 * 
	 * @param titulo
	 *            T&iacute;tulo del men&uacute;.
	 * @param opciones
	 *            Opciones del men&uacute;.
	 */
	public Menu(String titulo, String[] opciones) {
		this.titulo = titulo;
		this.opciones = opciones;
		this.numOpciones = this.opciones.length;
	}

	/**
	 * Gestiona el men&uacute;. Gestionar un men&uacute; consiste en mostrarlo y
	 * recoger la opci&oacute;n v&aacute;lida del men&uacute;.
	 * 
	 * @return devuelve la llamada al metodo recogerOpcion() para la recogida de
	 *         la opci&oacute;n.
	 */
	public int gestionar() {
		mostrarMenu();
		return recogerOpcion();
	}

	/**
	 * recoge una de las opciones v&aacute;lidas (entre 1 y n&uacute;mero de
	 * opciones del men&uacute;)
	 * 
	 * @return Devuelve la opci&oacute;n v&aacute;lida.
	 */
	private int recogerOpcion() {
		int opcionMenu = 0;
		do {
			opcionMenu = Teclado.leerEntero();
		} while (opcionMenu < 1 || opcionMenu > opciones.length);
		return opcionMenu;
	}

	/**
	 * Muestra el men&uacute;, a&ntilde;adi&eacute;ndole a cada elemento del
	 * men&uacute; un n&uacute;mero, comenzando por 1.
	 */
	private void mostrarMenu() {
		int contador = 1;
		System.out.println("------ " + titulo + " ------");
		for (String opcion : opciones) {
			System.out.println("(" + (contador++) + ")- " + opcion);
		}
	}
}

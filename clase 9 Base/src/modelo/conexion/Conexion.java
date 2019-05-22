package modelo.conexion;
import java.sql.*;
public class Conexion {

	/* En esta clase tendremos la cadena de conexion con la que trabajara nuestra aplicacion, en esta se definira
	 * la base de datos, el user, la password y el driver de conexion
	 * por defecto los datos de login de MySql
	 * son 
	 * LOGIN = ROOT 
	 * PASWWORD =  vacio
	 */
	
	
		
		static String db = "persona"; // nombre de mi base de datos
		static String Login = "root"; // nombre de el usuario DB
		static  String password = "";
	static String url = "jdbc:mysql://localhost/"+db;


//creamos un objeto de  tipo conection

Connection conn = null;

/*Constructor de BD Connection*/

public Conexion() {
	
	try {
		//obtener driver para Mysql
		Class.forName("com.mysql.jdbc.Driver");
		//obtenemos nuestra conexion
		conn = DriverManager.getConnection(url, Login, password);
		
		if(conn != null) {
			System.out.println("Conexion exitosa a la db " +db + "Good Enough");}
		}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e) {
	System.out.println(e);
}catch(Exception e) {System.out.println(e);}
	
}
//Metodo que nos retorna la conexion
public Connection getConnection() {
	return conn;
}
//metodo para cerrar la conexion con la db
public void desconectar() {
	conn=null;
	
}


}
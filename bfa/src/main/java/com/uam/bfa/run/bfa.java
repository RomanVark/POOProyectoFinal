package com.uam.bfa.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 */

public class bfa {

	public static void main(String[] args) throws Exception {
		DBServer.start("bfa-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("bfa"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}

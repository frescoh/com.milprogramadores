package com.milprogramadores.Modulo2TP1;

import java.util.ArrayList;

public class testEjercicio {

	public static void main(String[] args) {
		DirectorCine d1 = new DirectorCine("Pedro", "Gómez", 31);
		DirectorCine d2 = new DirectorCine("Juan", "Suárez,", 55);
		DirectorCine d3 = new DirectorCine("Elena", "Albucar,", 29);
		
		ArrayList<DirectorCine> directores = new ArrayList<DirectorCine>();
		
		directores.add(d1);
		directores.add(d2);
		directores.add(d3);

	}

}

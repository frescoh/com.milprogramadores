package com.milprogramadores.Modulo2TP3;

public class TestAlumno {

	public static void main(String[] args) {
		Alumno alumno= new Alumno("Juan", "Gonzalez","12345678", "Avenida Siempre Vida 123");
		alumno.generar_notas();
		alumno.mostrar_notas();
	}

}

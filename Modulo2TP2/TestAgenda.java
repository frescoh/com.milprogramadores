package com.milprogramadores.Modulo2TP2;


import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto contacto;
		String nombre;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la capacidad que desea asignar a la agenda: ");
		int capacidad;
		capacidad = scanner.nextInt();
		Agenda agenda= new Agenda(capacidad);
		System.out.println("Vamos a cargar la agenda con algunos contactos.");
		System.out.print("Indique cuantos contactos desea precargar: ");
		capacidad= scanner.nextInt();
		
		int i=0;
		while(i<capacidad) {
			nombre= "Contacto "+(int)(Math.random()*100);
			int numero = (int)(Math.random()*10000000);
			contacto= new Contacto(nombre,Integer.toString(numero));
			i+=agenda.add(contacto);		
		}
		
		String op;
		do {
			scanner.nextLine();
			menu();
			op = scanner.nextLine().toLowerCase();
			System.out.println(op);
			switch(op) {
			case "1": 
				agenda.add(contactoNuevo());
				break;
			case "2":
				agenda.listarContactos();
				break;
			case "3":
				System.out.println("Ingrese el nombre del contacto que desea buscar: ");
				nombre = scanner.nextLine();
				agenda.buscaContacto(nombre);
				break;
			case "4":
				System.out.println("Ingrese el nombre del contacto que desea eliminar: ");
				nombre = scanner.nextLine();
				agenda.eliminarContacto(nombre);
				break;
			case "5":
				System.out.println("Quedan disponibles "+agenda.contactosLibres()+" contactos libres.");
				break;
			case "s": 
				break;
			default:
				System.out.println("La opcion ingresada no pertenece al menú.");
			}
		}while(op.toLowerCase().compareTo("s")!=0);
		scanner.close();

	}
	private  static void menu() {
		String op;
		System.out.println("Menú");
		System.out.println("1 - Ingrese un contacto");
		System.out.println("2 - Mostrar todos los contactos");
		System.out.println("3 - Buscar contacto");
		System.out.println("4 - Eliminar contacto");
		System.out.println("5 - Ver memoria disponible");		
		System.out.println("s - Salir");
		System.out.print("ingrese una opcion: ");
		Scanner scan = new Scanner(System.in);
		
	}
	private static Contacto contactoNuevo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre del contacto: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el numero: ");
		String numero= sc.nextLine();
		Contacto nuevo = new Contacto(nombre,numero);
		sc.close();
		return nuevo;
	}

}

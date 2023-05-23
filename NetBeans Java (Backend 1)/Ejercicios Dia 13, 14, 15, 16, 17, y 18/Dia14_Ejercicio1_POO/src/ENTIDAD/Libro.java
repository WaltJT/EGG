/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.util.Scanner;

public class Libro {

    public String Autor;
    public String Titulo;
    public int CantPag;
    public String ISBN;

    public Libro(String Autor, String Titulo, int CantPag, String ISBN) {

        this.Autor = Autor;
        this.Titulo = Titulo;
        this.CantPag = CantPag;
        this.ISBN = ISBN;

    }

    public Libro() {

    }

    public void crearLibro() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el autor: ");
        this.Autor = scanner.next();
        System.out.println("Ingrese el titulo: ");
        this.Titulo = scanner.next();
        System.out.println("Ingrese la cantidad de paginas: ");
        this.CantPag = scanner.nextInt();
        System.out.println("Ingrese el codigo ISBN del libro: ");
        this.ISBN = scanner.next();

    }

    public void mostrarDatos() {
        System.out.println("Autor." + this.Autor);
        System.out.println("Titulo." + this.Titulo);
        System.out.println("CantPag." + this.CantPag);
        System.out.println("ISBN." + this.ISBN);

    }

}

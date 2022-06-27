package com.utn2022;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empresa empresa=new Empresa();

        Sillas silla1=new Sillas(1,"Barroca",5000,"no");
        Sillas silla2=new Sillas(2,"Gammer",7000,"si");
        Escritorios escritorio1=new Escritorios(3,"Office",20000,0.80,1.40);
        Notebook notebook1=new Notebook(4,"Acer",100000,"China",4);
        Impresoras impresora1=new Impresoras(5,"Cannon",40000,"India",50);

        List<Productos>productos=new ArrayList<>();

        productos.add(silla1);
        productos.add(silla2);
        productos.add(escritorio1);
        productos.add(notebook1);
        productos.add(impresora1);

        empresa.recorrerConinstancia(productos);

        silla1.descuento(10);
        impresora1.descuento(20);

        empresa.recorrerConinstancia(productos);

        empresa.aumento(productos);

        empresa.recorrerConinstancia(productos);
    }
}

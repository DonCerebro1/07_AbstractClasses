package com.cc.java;


// Abstrakte Klassen
public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0,10.0);
        Triangle triangle = new Triangle(10.0, 10.0);
        Circle circle = new Circle(5.0);

    
     

    
    ausgabe("------  Flächen ------");
         ausgabe("Fläche Rechteck: " + rectangle.area());
         ausgabe("Fläche Dreieck: " + triangle.area());
         ausgabe("Fläche Kreis: " + circle.area());

 

    ausgabe("------  Differenzen ------");
        ausgabe("Diff. r-t: " + areaDiff(rectangle, triangle));
        ausgabe("Diff. r-c: " + areaDiff(rectangle, circle));
        ausgabe("Diff. c-t: " + areaDiff(circle, triangle));
  
    }
    /*  100000x ggf. Überladen

    // Als parameter kann man auch Objekt Referenzen nutzen
    private static double areaDiff(Rectangle r, Triangle t){
        return r.area() - t.area();
    }

     // Überladene Methode
     private static double areaDiff(Rectangle r, Circle c){
        return r.area() - c.area();
    }
        */


    /* Besser Polymorphie */    
    // Als parameter kann man auch Objekt Referenzen nutzen
    // Wir könnten für alles einzelne Methoden machen oder eine aus Shape weil andere Erben und in den Subklassen die Methoden Overriden werden ((Polymorphie))
    private static double areaDiff(Shape r, Shape t){
        return r.area() - t.area();
    }









    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}

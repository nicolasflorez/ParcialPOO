package parcialpoo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
import javax.swing.*;
class Principal
{
public static void main(String arg[])
{ 
String lee;
Punto a,b,c;
lee=JOptionPane.showInputDialog("PRIMERA COORDENADA (- , -)");
a=new Punto(lee);

lee=JOptionPane.showInputDialog("SEGUNDA COORDENADA (- , -)");
b=new Punto(lee);

c=a.equals(b);
JOptionPane.showMessageDialog(null,"La Distancia es: "+c);
System.exit(0);
}
}

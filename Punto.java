/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/**
 *
 * @author Estudiantes
 */
class Punto
{
//atributos privados
private int x;
private int y;

double leeDatos(String v)
{
double n;
try
{
n=Double.parseDouble(v);
}
catch(Exception e)
{
n=0;
}
return n;
}

public Punto(String m)
{
String n[]=m.split(",");
x=(int) leeDatos(n[0]);
y=(int) leeDatos(n[1]);
}

//constructor
public Punto(double v)
{
setX(v);
setY(v);
}

public Punto(Punto otro)
{
setX(otro.getX());
setY(otro.getY());
}

//sets y gets
void setX(double x_)
{
x=(int) x_;
}
void setY(double y_)
{
y=(int) y_;
}
double getX()
{
return x;
}
double getY()
{
return y;
}
//sobre carga
public String toString()
{
return x+"";
}

public Punto equals(Punto otro)
{
    double d = Math.sqrt((getX()-otro.getX())*(getX()-otro.getX())+(getY()-otro.getY())*(getY()-otro.getY()));
Punto tmp=new Punto(d);
return tmp;
}
}

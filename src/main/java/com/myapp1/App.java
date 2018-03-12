package com.myapp1;

public class App 
{
    public static void main( String[] args )
    {
        Fasolka fasolka = new Fasolka("pierwsza", 1);
        System.out.println( fasolka );
        System.out.println("Samo imię fasolki to: " + fasolka.getName());
        System.out.println("Sama wartość fasolki to: " + fasolka.getValue());

    }
}

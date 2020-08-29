package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator kalkulator = new Calculator();
        System.out.println("wynik to :"+kalkulator.dodawanie(100.0 , 200.0));
        System.out.println("wynik to :"+kalkulator.odejmowanie(200.0 , 100.0));
    }

}
class Calculator{
    public double dodawanie(double składnik1 , double składnik2){
        return składnik1 + składnik2 ;
    }
    public double odejmowanie(double odjemna , double odjemnik){
        return odjemna - odjemnik;
    }
}
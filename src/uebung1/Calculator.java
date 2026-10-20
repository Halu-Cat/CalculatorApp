package uebung1;

public class Calculator {

    public int addition(int a, int b) {return a + b;}
    public int subtraction(int a, int b) {return a - b;}
    public int multiplication(int a, int b) {return a * b;}
    public int division(int a, int b) {return a / b;}
    public int quadrat(int x){return x*x;}
    public int potenz(int zahl, int potenz){
        int ausgabe= zahl;
        for (int i = potenz; i>0; i--){
            ausgabe= ausgabe*zahl;
        }
        return ausgabe;
    }

}

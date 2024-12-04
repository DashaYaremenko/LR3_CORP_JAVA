package org.example.lr3_corp_java.beansLogic;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class Calculate {
    private double x;
    private int n;
    private double e1;
    private double e2;

    private double sumN;
    private double sumE1;
    private int countE1;
    private double sumE2;
    private int countE2;
    private double exactValue;

    public void calculate() {
        sumN = 0;
        sumE1 = 0;
        sumE2 = 0;
        countE1 = 0;
        countE2 = 0;
        if (x == 0) {
            exactValue = 1.0;
            sumN = 1.0;
            return;
        }
        exactValue = Math.sin(x) / x;
        double term = 1.0;
        for (int i = 0; i < n; i++) {
            sumN += term;
            if (Math.abs(term) > e1) {
                sumE1 += term;
                countE1++;
            }
            if (Math.abs(term) > e2) {
                sumE2 += term;
                countE2++;
            }
            term *= -x * x / ((2 * i + 2) * (2 * i + 3));
        }
    }
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public int getN() { return n; }
    public void setN(int n) { this.n = n; }
    public double getE1() { return e1; }
    public void setE1(double e1) { this.e1 = e1; }
    public double getE2() { return e2; }
    public void setE2(double e2) { this.e2 = e2; }
    public double getSumN() { return sumN; }
    public double getSumE1() { return sumE1; }
    public int getCountE1() { return countE1; }
    public double getSumE2() { return sumE2; }
    public int getCountE2() { return countE2; }
    public double getExactValue() { return exactValue; }
}



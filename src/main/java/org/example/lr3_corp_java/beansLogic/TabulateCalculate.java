package org.example.lr3_corp_java.beansLogic;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class TabulateCalculate {
    private double a;
    private double b;
    private double h;

    private List<Result> results;

    public void tabulation() {
        results = new ArrayList<>();
        if (a <= 0 || b <= 0 || h <= 0 || a > b) {
            results.add(new Result(0, Double.NaN));
            return;
        }
        for (double x = a; x <= b; x += h) {
            double y = Math.tan(Math.log(x));
            results.add(new Result(x, y));
        }
    }

    public static class Result {
        private final double x;
        private final double y;

        public Result(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {return x;}
        public double getY() {
            return y;
        }
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public List<Result> getResults() {
        return results;
    }

}

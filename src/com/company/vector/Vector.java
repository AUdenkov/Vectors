package com.company.vector;

import java.util.Objects;

public class Vector {
    private double x;
    private double y;
    private double z;


    @Override
    public boolean equals(Object vector1) {
        if (vector1==null){
            return false;
        }
        if (vector1.getClass() == this.getClass()) { // if (null.getClass()==this.getClass())
            Vector vector = (Vector) vector1;
            if (vector.getX() == this.getX() && vector.getY() == this.getY() && vector.getZ() == this.getZ()) {
                return true;
            }
        }
        return false;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Vector vector = (Vector) o;
//        return Double.compare(vector.x, x) == 0 && Double.compare(vector.y, y) == 0 && Double.compare(vector.z, z) == 0;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "" + this.x + " " + this.y + " " + this.z;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double sizeVector() {
        return Math.sqrt(Math.pow(this.getX(),2) + Math.pow(this.getY(),2) + Math.pow(this.getZ(),2));
    }

    public double scalarMultiplication(Vector vector2) {
        return (this.getX() * vector2.getX() + (this.getY() * vector2.getY()) + (this.getZ() * vector2.getZ()));
    }

    public double[] vectorMultiplication(Vector vector2) {
        double[] array = {this.getY() * vector2.getZ() - this.getZ() * vector2.getY(), this.getZ() * vector2.getX() - this.getX() * vector2.getZ(), this.getX() * vector2.getY() - this.getY() * vector2.getX()};
        System.out.print("vectorMultiplication ");
        return array;
    }

    public double[] sumVector(Vector vector2) {
        double[] array = {this.getX() + vector2.getX(), this.getY() + vector2.getY(), this.getZ() + vector2.getZ()};
        System.out.print("Sum vector ");
        return array;
    }

    public double[] subtractionVector(Vector vector2) {
        double [] array={this.getX() - vector2.getX(), this.getY() - vector2.getY(), this.getZ() - vector2.getZ()};
        System.out.print("subtractionVector ");
        return array;
    }

    public double injection(Vector vector2) {
        return  this.scalarMultiplication(vector2)/(this.sizeVector()*vector2.sizeVector());
    }

    public static Vector[] arrayVector(int N) {
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < vectors.length; i++) {
            Vector vector = new Vector(Math.random() * 10, Math.random() * 10, Math.random() * 10);
            vectors[i] = vector;
        }
        return vectors;
    }
}

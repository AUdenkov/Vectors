package com.company.vector;

public class Operation {
    private Vector vector;

    public Vector getVector() {
        return vector;
    }

    public double sizeVector(Vector vector) {
        return Math.sqrt((vector.getX() * vector.getX()) + (vector.getY() * vector.getY()) + (vector.getZ() * vector.getZ()));
    }

    public double scalarMultiplication(Vector vector1, Vector vector2) {
        return (vector1.getX() * vector2.getX() + (vector1.getY() * vector2.getY()) + (vector1.getZ() * vector2.getZ()));
    }

    public double[] vectorMultiplication(Vector vector1, Vector vector2) {
        double[] array = {vector1.getY() * vector2.getZ() - vector1.getZ() * vector2.getY(), vector1.getZ() * vector2.getX() - vector1.getX() * vector2.getZ(), vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX()};
        System.out.print("vectorMultiplication ");
        return array;
    }

    public double[] sumVector(Vector vector1, Vector vector2) {
        double[] array = {vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY(), vector1.getZ() + vector2.getZ()};
        System.out.print("Sum vector ");
        return array;
    }

    public double[] subtractionVector(Vector vector1, Vector vector2) {
        double[] array = {vector1.getX() - vector2.getX(), vector1.getY() - vector2.getY(), vector1.getZ() - vector2.getZ()};
        System.out.print("subtractionVector ");
        return array;
    }

    public double injection(Vector vector1, Vector vector2) {
        return scalarMultiplication(vector1, vector2) / (Math.abs(sizeVector(vector1)) * Math.abs(sizeVector(vector2)));
    }

    public void  arrayVector(int N) {
        Vector [] vectors=new Vector[N];
        for (int i=0;i<vectors.length-1;i++){
            Vector vector = new Vector(Math.random() * 10, Math.random() * 10, Math.random() * 10);
            vectors[i]=vector;
        }
        Operation operation=new Operation();
        for (int i=0;i<vectors.length;i++){
                System.out.println(vector.getX());
            }

        }
//        return vectors;

}

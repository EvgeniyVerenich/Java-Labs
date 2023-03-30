package com.company;

public class Vector {

    public int x;
    public int y;
    public int z;

    public double getLength() {

        double vectorlength = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));

        return vectorlength;
    }

    public void getSum(Vector vector1,Vector vector2){
        x = vector1.x + vector2.x;
        y = vector1.y + vector2.y;
        z = vector1.z + vector2.z;
        System.out.println("The result of the sum is vector ("+x+","+y+","+z+")");
    }

    public void getSumLength(Vector vector1,Vector vector2){
        x = vector1.x + vector2.x;
        y = vector1.y + vector2.y;
        z = vector1.z + vector2.z;
        double vectorsumlength = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        System.out.println("The length of the vector is "+vectorsumlength);
    }

    public void getDif(Vector vector1 ,Vector vector2){
        x = vector1.x - vector2.x;
        y = vector1.y - vector2.y;
        z = vector1.z - vector2.z;
        System.out.println("The result of the difference is vector ("+x+","+y+","+z+")");
    }

    public void getMultiply(Vector vector1, Vector vector2){

        double multyVector = (vector1.x*vector2.x + vector1.y* vector2.y + vector1.z*vector2.z);
        System.out.println("The result of the multiplication is "+ multyVector);
    }

    public void getAngle(Vector vector1, Vector vector2,double a,double b){

        double angleVector = Math.acos((vector1.x*vector2.x + vector1.y* vector2.y + vector1.z*vector2.z)/(a*b))*57.2958;
        System.out.println("Angle is "+ angleVector);
    }

    public void Increment(Vector vector){

        vector.x += 1;
        vector.y += 1;
        vector.z += 1;
        System.out.println("("+vector.x+","+vector.y+","+vector.z+")");
    }

    public void Decrement(Vector vector){

        vector.x -= 1;
        vector.y -= 1;
        vector.z -= 1;
        System.out.println("("+vector.x+","+vector.y+","+vector.z+")");
    }

}

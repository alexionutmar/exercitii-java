package chapter3;

import java.util.Scanner;

public class GeometryIntersectingPoint {
    /*
    * (Geometry: intersecting point)
    * Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4),
    * as shown in Figure 3.8a and b.
    The intersecting point of the two lines can be found by solving the following linear equations:
        (y1 -y2)x-(x1 -x2)y=(y1 -y2)x1 -(x1 -x2)y1 (y3 -y4)x-(x3 -x4)y=(y3 -y4)x3 -(x3 -x4)y3
    This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3).
    * If the equation has no solutions, the two lines are parallel (see Figure 3.8c).
    * Write a program that prompts the user to enter four points and displays the intersecting point.
    *  Here are sample runs:
    *
    * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
    *       The intersecting point is at (2.88889, 1.1111)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x1: ");
        double x1 = scanner.nextDouble();

        System.out.println("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("x2: ");
        double x2 = scanner.nextDouble();

        System.out.println("y2: ");
        double y2 = scanner.nextDouble();

        System.out.println("x3: ");
        double x3 = scanner.nextDouble();

        System.out.println("y3: ");
        double y3 = scanner.nextDouble();

        System.out.println("x4: ");
        double x4 = scanner.nextDouble();

        System.out.println("y4: ");
        double y4 = scanner.nextDouble();

        double a = (y1 - y2);
        double b = - (x1 -x2);
        double c = (y3 -y4);
        double d = - (x3 -x4);
        double e = (y1 -y2) * x1 - (x1 -x2) * y1;
        double f = (y3 -y4) * x3 - (x3 -x4) * y3;

        double x = 0;
        double y = 0;

        if((a * d - b * c) == 0){
            System.out.println("solutie invalida");
        }
        else{
            x = (e * d - b * f) /  (a *d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
        }

        System.out.println(x);
        System.out.println(y);


        System.out.println("punctele sunt: " + x + ", " + y);


    }
}
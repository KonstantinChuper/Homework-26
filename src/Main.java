public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        int friendYear = 1993;
        int age = currentYear-friendYear;
        System.out.println("My friend is "+ age +" years old");

        int number = 6516516;
        int lastdigit = number%10;
        System.out.println("Last digit of the number is " + lastdigit);

        int Joe = 30;
        if (Joe >= 18 & Joe <= 30) {System.out.println("Congratulations! You figured out how IF works!");}

        int x = -1;
        int y = 5;
        if(y>0 & x<0) {System.out.println("The target is in the 1th quarter");}
        else if(y>0 & x>0) {System.out.println("The target is in the 2nd quarter");}
        else if(y<0 & x<0){System.out.println("The target is in the 3rd quarter");}
        else if(y<0 & x>0){System.out.println("The target is in the 4th quarter");}
        else {System.out.println("x or y = 0");}

        int a = 10;
        int b = 10;
        int c = 30;
        if ((a + b) > c & (b + c) > a & (c + a) > b) {System.out.println("The triangle can be built");}
        else { System.out.println("The triangle can't be built");}

    }
}
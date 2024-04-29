/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git.pkg6;

/**
 * SOAL 4
 * Write a Java program to create a class called Shape with a method called getArea(). Create a subclass
 * called Rectangle that overrides the getArea() method to calculate the area of a rectangle
 */

class Shape{
    public static int getArea(int... sides){
        int area = 1;
        for (int side : sides){
            area =  area * side;
        }
        return area;
    }
}

class Rectangle extends Shape{
    public static int getArea(int side1, int side2){
        int area = side1 * side2;
        return area;
    }
}

/**
 * SOAL 5
 * Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
 * Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the
 * area and perimeter of a circle.
 */

class Shape6{
    public static int getArea(int... sides){
        int area = 1;
        for (int side : sides){
            area =  area * side;
        }
        return area;
    }
    public static int getPerimeter(int... sides){
        int perimeter = 0;
        for (int side : sides){
            perimeter = perimeter + side;
        }
        return perimeter;
    }
}

class Circle extends Shape6{
    public static double getArea(double radius){
        double area = 2 * 3.14 * radius;
        return area;
    }
    public static double getPerimeter(double radius){
        double perimeter = 3.14 * radius * radius;
        return perimeter;
    }
}


public class GIT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SOAL 1");
        isOdd(34);
        
        System.out.println("\nSOAL 2");
        String inputString = "Anna";
        System.out.println(Palindrome(inputString));
        
        System.out.println("\nSOAL 3");
        System.out.println(biggestArray(1,34,56,43,58,7));
        
        System.out.println("\nSOAL 4");
        System.out.println(Rectangle.getArea(2, 3));
        
        System.out.println("\nSOAL 5");
        System.out.println(Circle.getArea(7));
        System.out.println(Circle.getPerimeter(14));
    }
    
    /**
     * SOAL 1
     * Buatlah method yang membedakan angka genap dan ganjil. Parameter dari method tersebut adalah sebuah
     * angka (integer) dan output dari method tersebut adalah string (“ganjil” dan “genap”)
     */
    
    static void isOdd(int number){
        if (number % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
    
    /**
     * SOAL 2
     * Buatlah method untuk menentukan apakah sebuah string palindrom atau tidak. Parameter dari method
     * tersebut adalah string dan return dari method tersebut adalah boolean (true jika palindrom dan false jikabukan palindrom)
     */
    
    static boolean Palindrome(String word){
        word = word.replaceAll(" ", "").toLowerCase();
        
        // Create a StringBuilder object to reverse the string
        StringBuilder reversed = new StringBuilder(word).reverse();
        
        // Check if the original string is equal to its reverse
        return word.equals(reversed.toString());
  
   }
    
    /**
    * SOAL 3
    * Buatlah sebuah method untuk mendapatkan nilai terbesar dari sebuah array. Parameter dari methodnya
    * adalah array of integers dan output dari methodnya adalah integer (yang merupakan angka paling besar)
    */
    
    static int biggestArray(int... numbers){
        int Biggest = 0;
        for (int number : numbers){
            if (number > Biggest){
                Biggest = number;
            }
        }
        return Biggest;
    }
    

}

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    static class Product
    {
        private String name;
        private double price;
        private static int counter;

        public void setPrice(double price)
        {
            this.price = price;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public double getPrice()
        {
            return price;
        }

        public Product(String name, double  price)
        {
            this.name = name;
            this.price = price;
            ++counter;
        }

        public Product()
        {
            this.name = "TEST";
            this.price = 0;
            ++counter;
        }
        public static int count()
        {
            return counter;
        }
    }
    public static int century(int year)
    {
        int century  = (year / 100) + 1;
        if (year % 100 == 0)
        {
            century -= 1;
        }
        if (year == 0)
        {
            century = 0;
        }
        return century;
    }

    public static int sumOfDigits(int number)
    {
        int sum = 0;
        while(number != 0)
        {
            sum += (number % 10);
            number /=10;
        }
        return sum;
    }
    public static boolean isLeapYear(int year)
    {
        if (year % 100 == 0 && year % 400 != 0)
        {
            return false;
        }
        if (year % 4 == 0)
        {
            return true;
        }
        return false;
    }

    public  static void main(String[] args)
    {
        Product p1 = new Product("Pen", 2.75);
        Product p2 = new Product();
        Product p3 = new Product("Notebook", 8.25);

        int countOfProducns = Product.count();
        System.out.println("Was created " + countOfProducns + " new products!");
    }
}
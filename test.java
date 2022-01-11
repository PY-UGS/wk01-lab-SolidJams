public class test {
    public static void main(String[] args)
    {
        System.out.println ("Hello, I am James!");

        String currency = "CSC1009";
        switch(currency)
        {
        case "AUD":
        System.out.println("Australian dollar");
        break;
        case "MYR":
        System.out.println("Malaysian ringgit");
        break;
        case "CSC1009":
        System.out.println("Object-Oriented Programming");
        break;
        case "SGD":
        System.out.println("Singapore dollar");
        break;
        default:
        System.out.println("Unknown Currency");
        break;
        }
        System.out.println("After switch"); 

        for(int x = 102; x > 66; x = x - 1) 
        {
            if (x % 2 != 0)
            {
            System.out.println("Values of x: " + x);
            }
        }

    }

    
}

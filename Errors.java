//type of errors corrected and commented next to each line of code where needed down below
public class Errors { 

    public static double FtoC(double fahrenheit) { // error 1 remove the void : syntax error
        // error 2 Change into to double : data type error
        double celsius = (fahrenheit - 32) * 5 / 9; // error 3 changed fomular : logical error
        double roundingOff = Math.round(celsius * 100);
        double finalAnswer = roundingOff / 100;

        return finalAnswer;

    }// error 4 add closing bracket to close the method body : syntax error

    public static void main(String[] args) {

        System.out.println("Fahrenheit to Celsius converter:"); // error 5 added a semi colon : syntax error

        // error 6 change data type to double : data type error
        double degreesFahrenheit = 54.3;

        double degreesCelsius = FtoC(degreesFahrenheit); // error 7 insert degrees fahrenheit : logical error
        System.out.println(degreesFahrenheit + "°F = " + degreesCelsius + "°C");

    }

}

// Once you've corrected all the errors, the answer should be 12.39°C
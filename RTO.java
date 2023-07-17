import java.util.Scanner;

class UnderAgeException extends Exception {
    public String getMessage() {
        return "Your are too Young ,Have pattience!";
    }
}

class OverAgeException extends Exception {
    public String getMessage() {
        return "You are too old,cool down!";
    }
}

class Applicant {
    int age;

    void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        age = scan.nextInt();
    }

    void verify() throws Exception {
        if (age < 18) {
            UnderAgeException U = new UnderAgeException();
            System.out.println(U.getMessage());
            throw U;
        } else if (age > 60) {
            OverAgeException O = new OverAgeException();
            System.out.println(O.getMessage());
            throw O;
        } else {
            System.out.println("collect your license!!");
        }
    }

}

class RTOoffice {
    void Initiate() {
        Applicant A = new Applicant();
        try {
            A.acceptInput();
            A.verify();
        } catch (Exception E) {
            System.out.println("Your not elligible for license");
        }
    }
}

public class RTO {

    public static void main(String[] args) {
        RTOoffice R = new RTOoffice();
        R.Initiate();

    }

}
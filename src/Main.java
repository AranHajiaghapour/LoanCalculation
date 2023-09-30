import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Loan Price"); // Numbers are counted in million
        double LoanPrice = scanner.nextDouble();

        System.out.println("Please Enter Period of Portion Repayment");
        double Repayment = scanner.nextDouble();

        System.out.println("Please Enter Rate of Interest");
        double RateofIntrest =scanner.nextDouble();

        double PercentofLoanInterest = RateofIntrest/(12*100);
        double porstions = Repayment*12;
        double parenthesis = Math.pow((1+PercentofLoanInterest),porstions);
        double EachPortion = LoanPrice * PercentofLoanInterest * parenthesis/(parenthesis-1);
        System.out.println("Each portion is :"+EachPortion);
        }
    }


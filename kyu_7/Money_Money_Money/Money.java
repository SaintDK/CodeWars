package kyu_7.Money_Money_Money;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        double interest1;
        double tax1;
        int count = 0;
        for (double i=principal;i<desired;i++) {
            if (principal>= desired) {return count;}
            interest1 = principal * interest;
            tax1 = interest1 * tax;
            interest1 = interest1 - tax1;
            principal += interest1;
            System.out.println(principal);
            count++;
        }
        return count;
    }
}
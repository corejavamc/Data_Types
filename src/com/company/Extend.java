package com.company;

/*Robert is working on his 5-year goal : To increase his current $62,000 annual income by 10% each year.
Create an application that will calculate his annual income on the fifth year. Follow the example from above. */
public class Extend {

    public static void main(String[] args)
    {
        double annualIncome = 62000;
        double increment, newIncome,fiveYear;
        System.out.println("Annual Income Year 1: "+annualIncome);
       increment = annualIncome *.10;
       newIncome= increment+annualIncome;
       fiveYear=newIncome*5;
        System.out.println("Annual Income Year 5: "+fiveYear);
    }
}




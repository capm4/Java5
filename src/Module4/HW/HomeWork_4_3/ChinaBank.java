package Module4.HW.HomeWork_4_3;

import Module4.HW.HomeWork_4_1.Bank;

import Module4.HW.HomeWork_4_2.Currency;


public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    private Currency currency;
    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commision;

    @Override
    public int getLimitOfWithdrawal() {
        switch (getCurrency().toString()){
            case "USA":limitOfWithdrawal = 100;
                break;
            case "EUR": limitOfWithdrawal = 150;
                break;
            default: limitOfWithdrawal = 0;
                break;
        }
        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        switch (getCurrency().toString()){
            case "USA":limitOfFunding = 10000;
                break;
            case "EUR": limitOfFunding = 5000;
                break;
            default: limitOfFunding = 0;
                break;
        }
        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        switch (getCurrency().toString()){
            case "USA":monthlyRate = 1;
                break;
            case "EUR": monthlyRate = 0;
                break;
            default: monthlyRate = 0;
                break;
        }
        return monthlyRate;
    }

    @Override
    public int getCommission(int summ) {
        if (getCurrency().toString()=="USA" && summ <= 1000)commision = 3;
        else if (getCurrency().toString()=="USA" && summ > 1000)commision = 5;
        else if (getCurrency().toString()=="EUR" && summ <= 1000)commision = 10;
        else if (getCurrency().toString()=="EUR" && summ > 1000)commision = 11;
        return commision;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}

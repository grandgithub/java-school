package com.endava.timbuchalka.s3;

public class S3_40_OperatorSummary {

    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double resultDouble = (firstDouble + secondDouble) * 100;
        double reminderDouble = resultDouble % 40;
        System.out.println("remainder = " + reminderDouble);
        boolean isNoRemainder = reminderDouble == 0;

        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder)
            System.out.println("Got some remainder");
    }
}

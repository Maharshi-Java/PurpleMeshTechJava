package com.PurpleMesh.DataStructurePrograms;

import com.PurpleMesh.Utility.Utility;

public class BankingCaskCounter {

    public static void main(String[] args) {

        GenericQueue<String> queue = new GenericQueue<>();
        double money = 10000;

        System.out.println("Enter How Many people in Queue: ");
        int people = Utility.getNextInt();

        for (int i = 0; i < people; i++) {
            System.out.println("Enter " + (i + 1) + " Person's Name: ");
            String name = Utility.getNextLine();
            queue.enqueue(name);
        }

        while (!queue.isEmpty()) {
            String currentPerson = queue.peek();
            System.out.println(currentPerson + "'s turn");

            System.out.println("Enter 1 For Deposit and 2 For Withdraw:");
            int choose = Utility.getNextInt();

            if (choose == 1) {
                System.out.println("Enter Amount to Deposit:");
                double depositAmount = Utility.getNextDouble();

                money = money + depositAmount;
                System.out.println("Money Deposited Successfully");

            } else if (choose == 2) {
                System.out.println("Enter Amount to Withdraw:");
                double withdrawAmount = Utility.getNextDouble();

                if (money >= withdrawAmount) {
                    money = money - withdrawAmount;
                    System.out.println("Money Withdrawn Successfully");
                } else {
                    System.out.println("Insufficient balance to withdraw that amount.");
                }

            } else {
                System.out.println("Invalid option selected. Please enter 1 or 2.");
            }

            queue.dequeue();
        }

        System.out.println("Remaining amount: " + money);
    }
}

package com.PurpleMesh.OOPS;

import com.PurpleMesh.DataStructurePrograms.GenericStack;

public class TransactionStackManager {
    private GenericStack<String> transactionStack;

    public TransactionStackManager() {
        transactionStack = new GenericStack<>();
    }

    public void recordTransaction(String action, int amount, String symbol) {
        String transaction = action + " " + amount + " shares of " + symbol;
        transactionStack.push(transaction);
        System.out.println("Transaction recorded on stack: " + transaction);
        System.out.println();
    }

    public void printTransactions() {
        System.out.println(" Transaction Stack Last transactions first");
        if (transactionStack.isEmpty()) {
            System.out.println("No transactions recorded.");
            System.out.println();
            return;
        }
        GenericStack<String> tempStack = new GenericStack<>();
        while (!transactionStack.isEmpty()) {
            String transaction = transactionStack.pop();
            System.out.println(transaction);
            System.out.println();
            tempStack.push(transaction);
        }
        while (!tempStack.isEmpty()) {
            transactionStack.push(tempStack.pop());
        }
    }
}

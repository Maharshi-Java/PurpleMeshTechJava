package com.PurpleMesh.OOPS;

import com.PurpleMesh.DataStructurePrograms.GenericQueue;
import java.time.LocalDateTime;

public class TransactionQueueManager {
    private GenericQueue<LocalDateTime> transactionQueue;

    public TransactionQueueManager() {
        transactionQueue = new GenericQueue<>();
    }

    public void recordTransactionTime(LocalDateTime time) {
        transactionQueue.enqueue(time);
        System.out.println("Transaction time recorded in queue: " + time);
        System.out.println();
    }

    public void printTransactionTimes() {
        System.out.println("Transaction Queue Oldest transactions first");
        System.out.println();
        if (transactionQueue.isEmpty()) {
            System.out.println("No transactions recorded.");
            return;
        }
        GenericQueue<LocalDateTime> tempQueue = new GenericQueue<>();
        while (!transactionQueue.isEmpty()) {
            LocalDateTime time = transactionQueue.dequeue();
            System.out.println(time);
            System.out.println();
            tempQueue.enqueue(time);
        }
        while (!tempQueue.isEmpty()) {
            transactionQueue.enqueue(tempQueue.dequeue());
        }
    }
}

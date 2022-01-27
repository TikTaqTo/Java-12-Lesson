package model;

import java.util.Timer;

public class Operation extends Thread {
    public String operationName;
    public int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        try {
            int time = 0;
            while (time < 5) {
                Thread.sleep(1000);
                time++;
                System.out.println(operationName);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


package concurrency;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) {

        ExecutorService executor1 = null;
        ExecutorService executor2 = null;

        try {
            executor1 = Executors.newSingleThreadExecutor();
            executor2 = Executors.newSingleThreadExecutor();
            executor1.execute(() -> {
                for (int i = 1; i <= 500; i++) System.out.println("Executor1: " + i);
            });
            executor2.execute(() -> {
                for (int i = 1; i <= 500; i++) System.out.println("Executor2: " + i);
            });
            if (!executor1.isTerminated() || !executor2.isTerminated()) Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (null != executor1) executor1.shutdown();
            if (null != executor2) executor2.shutdown();
        }

        try {
            executor1 = Executors.newSingleThreadExecutor();
            executor2 = Executors.newSingleThreadExecutor();
            Future future1 = executor1.submit(() -> {
                int res = 0; for (int i = 1; i <= 10; i++) res += i; return res;
            });
            Future future2 = executor2.submit(() -> {
                int res = 1; for (int i = 1; i <= 10; i++) res *= i; return res;
            });
            System.out.println("Future1 = " + future1.get());
            System.out.println("Future2 = " + future2.get());
        } catch (InterruptedException | ExecutionException ie) {
            ie.printStackTrace();
        } finally {
            if (null != executor1) executor1.shutdown();
            if (null != executor2) executor2.shutdown();
        }
    }
}

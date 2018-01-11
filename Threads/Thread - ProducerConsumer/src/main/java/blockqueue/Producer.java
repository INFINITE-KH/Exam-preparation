package blockqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {

    ArrayBlockingQueue<Integer> s1;
    ArrayBlockingQueue<Integer> s2;

    Producer(ArrayBlockingQueue<Integer> s1, ArrayBlockingQueue<Integer> s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public Producer() {
    }

    public void run() {
        Boolean b = true;
        while (b) {
            Integer i = s1.poll();
            if (i == null) 
            {
                b = false;
            } 
            else 
            {
                Integer fibI = fib(i);
                try {
                    s2.put(fibI);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    private Integer fib(Integer n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

}

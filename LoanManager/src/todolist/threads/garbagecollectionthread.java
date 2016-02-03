/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.threads;

/**
 *
 * @author Siyam
 */
public class garbagecollectionthread implements Runnable {

    public garbagecollectionthread() {

        Thread t = new Thread(this, "garbage collection thread");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100000);    // 1 minutes
                System.gc();
            } catch (InterruptedException ex) {

            }
        }

    }

}

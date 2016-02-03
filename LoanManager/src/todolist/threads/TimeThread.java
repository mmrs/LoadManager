/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.threads;

import java.util.Date;
import java.util.TimerTask;
import todolist.customframe.MyFrame;

/**
 *
 * @author Siyam
 */
public class TimeThread extends TimerTask{

    MyFrame temp;

    //Calendar mydate;
    public TimeThread(MyFrame recv) {
     //   Thread t = new Thread(this, "time showing thread");
        temp = recv;
      //  t.start();
    }

    @Override
    public void run() {

        temp.geTtimeLabel().setText(" LoanManager :: SystemTime: " + new Date());

//        while (true) {
//            temp.gettimelabel().setText("ToDoList :: SystemTime: " + new Date());
//            try {
//                Thread.sleep(1000);
//                // System.gc();
//            } catch (InterruptedException ex) {
//
//            }
//        }

    }

}

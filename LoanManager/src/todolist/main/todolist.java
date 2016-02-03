/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Moshiur
 */
package todolist.main;

import todolist.customframe.MyFrame;
import todolist.threads.TimeThread;
import todolist.threads.garbagecollectionthread;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import javax.swing.JFrame;

public class todolist {

  
    public static void main(String[] args) {
        // TODO code application logic here
        final MyFrame mmrs = new MyFrame();
        mmrs.setSize(850, 480);
        mmrs.setMinimumSize(new Dimension(600, 400));
      //  mmrs.setResizable(false);
        mmrs.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dim.getWidth()-mmrs.getWidth())/2);
        int y = 100;
        mmrs.setLocation(x, y);
        mmrs.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
     //   new TimeThread(mmrs);
        Timer timer1 = new Timer();
        TimeThread timerthreadob = new TimeThread(mmrs);
        timer1.schedule(timerthreadob, 1000, 1000);
        
     //   new  garbagecollectionthread();

    }
}

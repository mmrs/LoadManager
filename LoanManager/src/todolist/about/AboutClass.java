/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.about;

/**
 *
 * @author Moshiur
 */

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
public class AboutClass extends JFrame{

    private final JLabel aboutlabel;
    public AboutClass(){
        
        super("About");
        setLayout(new GridLayout(4,1));
        Icon myicon = new ImageIcon(getClass().getResource("me.jpg"));
        aboutlabel = new JLabel();
        aboutlabel.setIcon(myicon);
        Font ff = new Font("Trebuchet MS",Font.BOLD,14);
        aboutlabel.setFont(ff);
        aboutlabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        aboutlabel.setHorizontalTextPosition(SwingConstants.CENTER);
     // add(aboutlabel);
        add(new JLabel(" Myself : ")).setFont(ff);
        add(new JLabel(" Md. Moshiur Rahman ")).setFont(ff);
        //add(new JLabel("Reg No: 2012331049")).setFont(ff);
        add(new JLabel(" CSE'12, SUST. ")).setFont(ff);
        add(new JLabel(" Contact : moshiur.siyam@gmail.com ")).setFont(ff);
      //  add(new JLabel("Under SuperVision of :")).setFont(ff);
      //  add(new JLabel("Md. Eamin Rahman")).setFont(ff);
      //  add(new JLabel("Lecturer,Dept. of CSE,SUST.")).setFont(ff);
        
    } 
    
//    public static void main(String args[]){
//        AboutClass ab= new AboutClass();
//        ab.setSize(300, 400);
//        ab.setVisible(true);
//    }
}

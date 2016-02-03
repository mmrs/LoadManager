/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.listdata;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Siyam
 */
public class data implements Serializable{
    private boolean flag;
    private String title = "";
    private final Date time;
    private String details;
    private String amount;

   public  data(String title, String amount,Date time, String details) {

        this.title = title;
        this.time = time;
        this.details = details;
        this.amount = amount;
        flag = false;
    }
   
   public String getTitle(){
       return title;
   }
   public void setTitle(String st){
       title = st;
   }
   public Date getTime(){
       return time;
   }
  
   public String getDetails(){
       return details;
   }
   public void setDetails(String st){
       details = st;
   }
   public void setFlag(boolean bl){
       flag = bl;
       
   }
   public boolean getFlag(){
       return flag;
   }
   public void setAmount(String amount){
       this.amount = amount;
   }
   public String getAmount(){
       return amount;
   }

    public Object[] getData() {
        
        String time_str = new SimpleDateFormat("MMM dd yyyy, hh:mm aa, zzz").format(time);
        return new Object[]{flag,title,amount,time_str,details};
        
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("deprecation")
    public boolean isPast() {
        if(!flag) {
            return false;
        }
        Date now = new Date();
        if(now.before(time)) {
            return false;
        }
       return (now.getDate() != time.getDate());
      
    }
    
}


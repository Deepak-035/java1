/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class MultiThreadingFive implements Runnable{
        int ThreadNumber;
        MultiThreadingFive(int tNo)
        {
           this.ThreadNumber=tNo;
        }
        public void run()
        {
                for(int i=1;i<6;i++)
                {
                    System.out.println("Task"+i+ " by ThreadNumber "+ ThreadNumber);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        
                    }
                }
        }
}

/**
 *
 * @author smv
 */
public class k113 {
     public static void main(String[] args){
         for(int i=1;i<8;i++)
         {
             MultiThreadingFive mt1=new MultiThreadingFive(i);
             Thread t1=new Thread(mt1);
             t1.start();
         }
     }
}

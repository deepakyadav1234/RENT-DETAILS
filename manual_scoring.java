/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RENT;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Thread.MAX_PRIORITY;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class manual_scoring extends javax.swing.JFrame {

    /**
     * Creates new form manual_scoring
     */
    static Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dim = tk.getScreenSize();
    String startTime, endTime, mdate;
    static String gs = "", scorpath = "";
    static long Gstatus = 1, MM = 0, SS = 0, tdiff = 0, DS = 60, DM = 59;
    static long DifSec = 0;
    static SimpleDateFormat sf;
    static long st, et;
    static int state = 0, up = 0, down = 0, rs = 0;

    public manual_scoring() {
        initComponents();
        this.setBounds(0, 0, 620, 380);
        //this.setBounds(0, 0, 1030, 520);
        this.setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        start1 = new javax.swing.JButton();
        start2 = new javax.swing.JButton();
        start3 = new javax.swing.JButton();
        stop1 = new javax.swing.JButton();
        stop2 = new javax.swing.JButton();
        timer3 = new javax.swing.JTextField();
        txttime1 = new javax.swing.JTextField();
        timer2 = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        txttime2 = new javax.swing.JTextField();
        lbltime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("STOP");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 50));

        start1.setBackground(new java.awt.Color(0, 102, 51));
        start1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        start1.setText("STRAT");
        start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start1ActionPerformed(evt);
            }
        });
        jPanel1.add(start1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 53, 120, 50));

        start2.setBackground(new java.awt.Color(0, 102, 51));
        start2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        start2.setText("STRAT");
        jPanel1.add(start2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 50));

        start3.setBackground(new java.awt.Color(0, 102, 51));
        start3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        start3.setText("STRAT");
        start3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start3ActionPerformed(evt);
            }
        });
        jPanel1.add(start3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 50));

        stop1.setBackground(new java.awt.Color(204, 0, 0));
        stop1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stop1.setText("STOP");
        stop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop1ActionPerformed(evt);
            }
        });
        jPanel1.add(stop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 50));

        stop2.setBackground(new java.awt.Color(204, 0, 0));
        stop2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stop2.setText("STOP");
        jPanel1.add(stop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 50));

        timer3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timer3.setText("00");
        jPanel1.add(timer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, 50));

        txttime1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttime1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txttime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 100, 50));

        timer2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timer2.setText("00");
        jPanel1.add(timer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 100, 50));
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 200, 40));

        txttime2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txttime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 100, 50));

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltime.setText("0");
        jPanel1.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void start3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start3ActionPerformed

    private void start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start1ActionPerformed
        // TODO add your handling code here:
//        state = 2;
//
//        GregorianCalendar ca = new GregorianCalendar();
//        long d = ca.getTimeInMillis();
//        // Date e = ;
//        sf = new SimpleDateFormat("HH:mm:ss:SSSS");
//
//        txttime.setText(sf.format(d));
//        startTime = txttime.getText();
//        st = d;
//        Gstatus = 1;
//        DS = Integer.parseInt(txttime2.getText());
//        DM = Integer.parseInt(txttime1.getText());
//        new timer1(this);

        boolean x = true;
        long displayMinutes = 0;
        long starttime = System.currentTimeMillis();
        System.out.println("Timer:");
        while (x) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(manual_scoring.class.getName()).log(Level.SEVERE, null, ex);
            }
            long timepassed = System.currentTimeMillis() - starttime;
            long secondspassed = timepassed / 1000;
            if (secondspassed == 60) {
                secondspassed = 0;
                starttime = System.currentTimeMillis();
            }
            if ((secondspassed % 60) == 0) {
                displayMinutes++;
            }

            System.out.println(/*displayMinutes + "::" + */secondspassed);
            txttime1.setText(String.valueOf(secondspassed));
            txttime1.repaint();
            txttime.validate();
            //txttime2.setText(secondspassed+" ");

        }
    }//GEN-LAST:event_start1ActionPerformed

    private void stop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop1ActionPerformed
        // TODO add your handling code here:
        Gstatus = 0;
        tdiff = et - st;
        st = et;
    }//GEN-LAST:event_stop1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manual_scoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manual_scoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manual_scoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manual_scoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manual_scoring().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JButton start1;
    private javax.swing.JButton start2;
    private javax.swing.JButton start3;
    private javax.swing.JButton stop1;
    private javax.swing.JButton stop2;
    private javax.swing.JTextField timer2;
    private javax.swing.JTextField timer3;
    private javax.swing.JTextField txttime;
    private javax.swing.JTextField txttime1;
    private javax.swing.JTextField txttime2;
    // End of variables declaration//GEN-END:variables

    class timer extends Thread {

        manual_scoring Ltim;
        int dat = 0;

        timer(manual_scoring tm) {
            Ltim = tm;
            start();
        }

        public void run() {

//            if(Integer.parseInt(txttime1.getText())==Integer.parseInt(half.getText())){
//                Gstatus=0;
//            }
            long d;
            GregorianCalendar cal = new GregorianCalendar();
            int ms = 1000 - cal.get(Calendar.MILLISECOND);
            long mils = 0, mils1 = 0, mils2 = 0, mils3 = 0, s = 0, m = 0;

            mils1 = cal.get(Calendar.MILLISECOND);
            mils2 = mils1;
            mils3 = mils2;
            ms = 0;
            long DifSec = 0;
            while (Gstatus == 1) {

//                if (Integer.parseInt(txttime1.getText()) == Integer.parseInt(half.getText())) {
//                    Gstatus = 0;
//                }
                cal = new GregorianCalendar();
                mils2 = mils3;
                mils3 = cal.get(Calendar.MILLISECOND);
                Date dd = cal.getTime();
                Ltim.txttime.setText(Ltim.sf.format(dd));
                //System.out.println("Mils="+mils2+";"+mils3);
                if ((mils1 > mils3 || mils2 > mils3) && ms == 0) {
                    ms = 1;
                    mils1 = 1000 - mils1;
                }
                if (ms == 1) {
                    if ((DifSec + mils1 + mils3) >= 1000) {
                        Ltim.SS++;
                        if (dat == 0) {
//                            sshow.d.setForeground(new Color(255, 255, 0));
//                            sshow.d1.setForeground(new Color(153, 153, 0));
                            dat = 1;
                        } else if (dat == 1) {
//                            sshow.d.setForeground(new Color(0, 0, 0));
//                            sshow.d1.setForeground(new Color(0, 0, 0));
                            dat = 0;
                        }

                        //     System.out.println("M" + Ltim.MM + "S=" + Ltim.SS);
                        try {
                            //this.finalize();
                            //System.gc();
                        } catch (Throwable e) {

                        }

                        System.out.println("SS=" + Ltim.SS);
                        if (Ltim.SS <= 9) {
                            String usec = String.valueOf(Ltim.SS);
                            Ltim.txttime1.setText("0" + usec);
                            //    sshow.sec.setText("0" + usec);

                            //big_Screen.sec.setText("0" + usec);
                            //big_Screen_1024.sec_label.setText("0" + usec);
                            //                        sshow.sec1.setText("0" + usec);
                        } else {
                            String usec = String.valueOf(Ltim.SS);
                            Ltim.txttime1.setText(usec);
                            //    sshow.sec.setText(usec);

                            //big_Screen.sec.setText(usec);
                            //big_Screen_1024.sec_label.setText(usec);
                            //                        sshow.sec1.setText(usec);
                        }
                        if (Ltim.MM <= 9) {
                            String umint = String.valueOf(Ltim.MM);
                            Ltim.txttime1.setText("0" + umint);
                            //     sshow.min.setText("0" + umint);

                            // big_Screen.min.setText("0" + umint);
                            // big_Screen_1024.min_label.setText("0" + umint);
                            //                        sshow.min1.setText("0" + umint);
                        } else {
                            String umint = String.valueOf(Ltim.MM);
                            Ltim.txttime1.setText(umint);
                            //    sshow.min.setText(umint);

                            //big_Screen.min.setText(umint);
                            //big_Screen_1024.min_label.setText(umint);
                            //                        sshow.min1.setText(umint);
                        }
                        //System.out.println("sec"+ddf)

                        if (Ltim.SS >= 60) {
                            Ltim.SS = 0;
                            Ltim.MM++;

                            //    System.out.println("MM=" + Ltim.MM);
                            if (Ltim.MM <= 9) {
                                String umint = String.valueOf(Ltim.MM);
                                Ltim.txttime1.setText("0" + umint);
                                //        sshow.min.setText("0" + umint);

                                // big_Screen.min.setText("0" + umint);
                                //big_Screen_1024.min_label.setText("0" + umint);
                                //                           sshow.min1.setText("0" + umint);
                            } else {
                                String umint = String.valueOf(Ltim.MM);
                                Ltim.txttime1.setText(umint);
                                //        sshow.min.setText(umint);

                                //big_Screen.min.setText(umint);
                                //big_Screen_1024.min_label.setText(umint);
                                //                           sshow.min1.setText(umint);
                            }
                            Ltim.txttime1.setText("00");
                            //    sshow.sec.setText("00");

                            //big_Screen.sec.setText("00");
                            //big_Screen_1024.sec_label.setText("00");
                            //                       sshow.sec1.setText("00");
                            //    System.out.println("time=" + Ltim.txttime.getText());
                        }
                        DifSec = (DifSec + mils1 + mils3) - 1000;
                        mils1 = mils3;
                        ms = 0;
                    }
                }
            }

        }
    }

    class timer1 extends Thread {

        manual_scoring Ltim;
        int dat = 0;

        timer1(manual_scoring tm) {
            Ltim = tm;
            this.setPriority(MAX_PRIORITY); //satish Added Dec 03 2021
            start();

        }

        public void run() {

            long d;
            GregorianCalendar cal = new GregorianCalendar();
            int ms = 1000 - cal.get(Calendar.MILLISECOND);

            long mils = 0, mils1 = 0, mils2 = 0, mils3 = 0, s = 0, m = 0;

            mils1 = cal.get(Calendar.MILLISECOND);
            //  mils1 =System.currentTimeMillis();  
            mils2 = mils1;
            mils3 = mils2;
            ms = 0;
            int playrun = 0;
            while (Gstatus == 1) {
                cal = new GregorianCalendar();
                mils2 = mils3;
                mils3 = cal.get(Calendar.MILLISECOND);

                Date dd = cal.getTime();

                Ltim.lbltime.setText(Ltim.sf.format(dd));

                if ((mils1 > mils3 || mils2 > mils3) && ms == 0) {
                    ms = 1;
                    mils1 = 1000 - mils1;
                }
                if (ms == 1) {
                    if ((DifSec + mils1 + mils3) >= 1000) {

                        Ltim.DS--;
                        if (dat == 0) {

                            dat = 1;
                        } else if (dat == 1) {

                            dat = 0;
                        }

                        try {
                        } catch (Throwable e) {

                        }

                        //     System.out.println("SS=" + Ltim.DS);
                        if (Ltim.DS <= 9) {
                            int f = 0;
                            if (Ltim.DS < 0) {
                                f = 1;
                                Ltim.DS = 59;
                                if (Ltim.DM != 0) {
                                    Ltim.DM--;
                                }
                                String usec = String.valueOf(Ltim.DS);
                                Ltim.txttime1.setText(usec);

                            }
                            if (f == 0) {
                                String usec = String.valueOf(Ltim.DS);
                                Ltim.txttime1.setText("0" + usec);

                            }
                        } else {
                            String usec = String.valueOf(Ltim.DS);
                            Ltim.txttime1.setText(usec);

                        }
                        if (Ltim.DM <= 9) {
                            String umint = String.valueOf(Ltim.DM);
                            Ltim.txttime1.setText("0" + umint);

                        } else {
                            String umint = String.valueOf(Ltim.DM);
                            Ltim.txttime1.setText(umint);

                        }

                        if (Ltim.DS == 00) {
                            Ltim.DS = 60;

                            if (Ltim.DM <= 9) {
                                String umint = String.valueOf(Ltim.DM);
                                Ltim.txttime1.setText("0" + umint);

                            } else {
                                String umint = String.valueOf(Ltim.DM);
                                Ltim.txttime1.setText(umint);

                            }

                            //  Ltim.txttime1.setText("00");
                            Ltim.txttime1.setText("00");

                            Ltim.DM--;
                            if (Ltim.DM < 0) {
                                Gstatus = 0;
                                String umint = String.valueOf(Ltim.DM);

                                Ltim.txttime1.setText("00");
                                Ltim.txttime1.setText("00");

                            }
                        }
                        DifSec = (DifSec + mils1 + mils3) - 1000;
                        mils1 = mils3;
                        ms = 0;
                    }
                }

            }

        }
    }
}

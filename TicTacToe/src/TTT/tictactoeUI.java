package TTT;

import java.awt.Color;
import javax.swing.JOptionPane;

public class tictactoeUI extends javax.swing.JFrame {

    //coding starts
    private String player = "X";
    //coding ends
    
    public tictactoeUI() {
        initComponents();
        //coding starts
        setSize(400, 400);
        setLocationRelativeTo(null);
        //codings stops
    }
    
    //coding stars
    private void Xwins()
    {
        JOptionPane.showMessageDialog(rootPane, 
                "Player 1 Wins",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        reset();
    }
    
    private void Owins()
    {
        JOptionPane.showMessageDialog(rootPane, 
                "Player 2 Wins",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        reset();
    }
    
    private void Draw()
    {
        JOptionPane.showMessageDialog(rootPane,
                "The Match Is Drawed",
                "Draw",
                JOptionPane.INFORMATION_MESSAGE);
        reset();
    }
    
    private void turn()
    {
        if(player.equalsIgnoreCase("X"))
             player = "O";
        else
            player = "X";
    }
    
    private void reset()
    {
        jButton_1.setText("");
        jButton_2.setText("");
        jButton_3.setText("");
        jButton_4.setText("");
        jButton_5.setText("");
        jButton_6.setText("");
        jButton_7.setText("");
        jButton_8.setText("");
        jButton_9.setText("");
    }
    
    private void win()
    {
        String a = jButton_1.getText();
        String b = jButton_2.getText();
        String c = jButton_3.getText();
        String d = jButton_4.getText();
        String e = jButton_5.getText();
        String f = jButton_6.getText();
        String g = jButton_7.getText();
        String h = jButton_8.getText();
        String i = jButton_9.getText();
        
        if(a=="X"&&b=="X"&&c=="X")
        {
            Xwins();
        }
        else if(d=="X"&&e=="X"&&f=="X")
        {
            Xwins();
        }
        else if(g=="X"&&h=="X"&&i=="X")
        {
            Xwins();
        }
        else if(a=="X"&&d=="X"&&g=="X")
        {
            Xwins();
        }
        else if(b=="X"&&e=="X"&&h=="X")
        {
            Xwins();
        }
        else if(c=="X"&&f=="X"&&i=="X")
        {
            Xwins();
        }
        else if(a=="X"&&e=="X"&&i=="X")
        {
            Xwins();
        }
        else if(c=="X"&&e=="X"&&g=="X")
        {
            Xwins();
        }
        //for O
        if(a=="O"&&b=="O"&&c=="O")
        {
            Owins();
        }
        else if(d == "O" && e == "O" && f == "O")
        {
            Owins();
        }
        else if(g=="O"&&h=="O"&&i=="O")
        {
            Owins();
        }
        else if(a=="O"&&d=="O"&&g=="O")
        {
            Owins();
        }
        else if(b=="O"&&e=="O"&&h=="O")
        {
            Owins();
        }
        else if(c=="O"&&f=="O"&&i=="O")
        {
            Owins();
        }
        else if(a=="O"&&e=="O"&&i=="O")
        {
            Owins();
        }
        else if(c=="O"&&e=="O"&&g=="O")
        {
            Owins();
        }
        else if(a!="" && b!="" && c!="" && d!="" && e!="" && f!="" && g!="" && h!="" && i!="")
        {
            Draw();
        }
    }
    //coding ends
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_border = new javax.swing.JPanel();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setMaximumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel_border.setBackground(new java.awt.Color(204, 204, 255));
        jPanel_border.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel_border.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jButton_1.setBackground(new java.awt.Color(102, 0, 204));
        jButton_1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_1);

        jButton_2.setBackground(new java.awt.Color(102, 0, 204));
        jButton_2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_2);

        jButton_3.setBackground(new java.awt.Color(102, 0, 204));
        jButton_3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_3);

        jButton_4.setBackground(new java.awt.Color(102, 0, 204));
        jButton_4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_4);

        jButton_5.setBackground(new java.awt.Color(102, 0, 204));
        jButton_5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_5);

        jButton_6.setBackground(new java.awt.Color(102, 0, 204));
        jButton_6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_6);

        jButton_7.setBackground(new java.awt.Color(102, 0, 204));
        jButton_7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_7);

        jButton_8.setBackground(new java.awt.Color(102, 0, 204));
        jButton_8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_8ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_8);

        jButton_9.setBackground(new java.awt.Color(102, 0, 204));
        jButton_9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });
        jPanel_border.add(jButton_9);

        jPanel1.add(jPanel_border, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
        //Coding Starts
        jButton_1.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_1.setForeground(Color.green);
        }
        else{
            jButton_1.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        //Coding Starts
        jButton_5.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_5.setForeground(Color.green);
        }
        else{
            jButton_5.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        //Coding Starts
        jButton_2.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_2.setForeground(Color.green);
        }
        else{
            jButton_2.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        //Coding Starts
        jButton_3.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_3.setForeground(Color.green);
        }
        else{
            jButton_3.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        //Coding Starts
        jButton_4.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_4.setForeground(Color.green);
        }
        else{
            jButton_4.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        //Coding Starts
        jButton_6.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_6.setForeground(Color.green);
        }
        else{
            jButton_6.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
        //Coding Starts
        jButton_7.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_7.setForeground(Color.green);
        }
        else{
            jButton_7.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_8ActionPerformed
        //Coding Starts
        jButton_8.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_8.setForeground(Color.green);
        }
        else{
            jButton_8.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_8ActionPerformed

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_9ActionPerformed
        //Coding Starts
        jButton_9.setText(player);
        if(player.equalsIgnoreCase("X")){
            jButton_9.setForeground(Color.green);
        }
        else{
            jButton_9.setForeground(Color.red);
        }
        turn();
        win();
        //Coding ends
    }//GEN-LAST:event_jButton_9ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoeUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_border;
    // End of variables declaration//GEN-END:variables
}

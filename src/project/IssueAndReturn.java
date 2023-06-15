package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class IssueAndReturn extends javax.swing.JFrame {

    public IssueAndReturn() throws SQLException {
        initComponents();
        ManageLibParks lp = new ManageLibParks();
        lp.timechecker();
        Vip v = new Vip();
        v.vipended();
        Defaulter d = new Defaulter();
        d.addstudent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mobinbookidtf = new javax.swing.JTextField();
        mobinstdidtf = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookfield = new javax.swing.JTextField();
        studentfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 72, 116));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("I S S U E  B O O K");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID:");

        combobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combobox.setForeground(new java.awt.Color(255, 255, 255));
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< S E L E C T >", "14 Days", "1 Month" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Issuence Period:");

        jButton4.setBackground(new java.awt.Color(252, 134, 54));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("I S S U E");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 134, 54), 12));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setRolloverEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/back_white.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobinbookidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobinstdidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mobinstdidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mobinbookidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 518));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 134, 54), 3));
        jPanel2.setPreferredSize(new java.awt.Dimension(521, 589));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 72, 116));
        jLabel2.setText("R E T U R N  B O O K");

        jLabel3.setBackground(new java.awt.Color(66, 72, 116));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 72, 116));
        jLabel3.setText("Book ID:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 72, 116));
        jLabel6.setText("Student ID:");

        jButton3.setBackground(new java.awt.Color(252, 134, 54));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("R E T U R N");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 134, 54), 12));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/cross.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setRolloverEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(113, 113, 113))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(177, 177, 177))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bookfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 460, 518));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        LibrarianDashboard ld;
        try {
            ld = new LibrarianDashboard();
            ld.show();
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Cipher cipher = new Cipher();
            Connection con = ConnectionProvider.getconnection();
            String query1 = "SELECT * FROM student WHERE student_id = '" + cipher.encode(mobinstdidtf.getText()) + "'";
            Statement statement1 = con.createStatement();
            String query2 = "SELECT * FROM books WHERE book_id = '" + cipher.encode(mobinbookidtf.getText()) + "'";
            Statement statement2 = con.createStatement();
            String query3 = "SELECT * FROM bookhistory WHERE issued_by = '" + cipher.encode(mobinstdidtf.getText()) + "' AND book_status='" + cipher.encode("pending") + "'";
            Statement statement3 = con.createStatement();
            String query5 = "SELECT book_quantity FROM books WHERE book_id = '" + cipher.encode(mobinbookidtf.getText()) + "'";
            Statement statement4 = con.createStatement();
            Statement statement5 = con.createStatement();
            Statement statement6 = con.createStatement();
            String query7 = "SELECT * FROM defaulter WHERE student_id = '" + cipher.encode(mobinstdidtf.getText()) + "'";
            Statement statement7 = con.createStatement();
            if (combobox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Choose Issue Period to continue.");
            } else {
                if (mobinstdidtf.getText().equals("") || mobinbookidtf.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Fill all the Fields !");
                } else {
                    ResultSet result1 = statement1.executeQuery(query1);
                    ResultSet result2 = statement2.executeQuery(query2);
                    if (result1.next() && result2.next()) {
                        ResultSet result3 = statement3.executeQuery(query3);
                        ResultSet result7 = statement7.executeQuery(query7);
                        if (result7.next()) {
                            JOptionPane.showMessageDialog(this, "This Student is Library Defaulter\nHence can't issue book.");
                        } else {
                            if (result3.next()) {
                                JOptionPane.showMessageDialog(this, "This Student has already issued a book.\nPlease Return previous one first.");
                            } else {
                                ResultSet result5 = statement5.executeQuery(query5);
                                if (result5.next() && result5.getInt(1) == 0) {
                                    JOptionPane.showMessageDialog(this, "This Book is currently not available.");
                                } else {
                                    LocalDateTime date = LocalDateTime.now();
                                    LocalDateTime due_date = null;
                                    if (combobox.getSelectedIndex() == 1) {
                                        due_date = date.plusDays(14);
                                    } else if (combobox.getSelectedIndex() == 2) {
                                        due_date = date.plusMonths(1);
                                    }
                                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");
                                    String now = formatter.format(date);
                                    String duedate = formatter.format(due_date);
                                    String query4 = " INSERT INTO bookhistory VALUES('" + cipher.encode(mobinstdidtf.getText()) + "','" + cipher.encode(mobinbookidtf.getText()) + "','" + now + "','" + duedate + "','" + cipher.encode("pending") + "')";
                                    statement4.executeUpdate(query4);
                                    JOptionPane.showMessageDialog(this, "Book Issued.");
                                    int newquantity = result5.getInt(1) - 1;
                                    String query6 = "UPDATE books SET book_quantity=" + newquantity + " WHERE book_id = '" + cipher.encode(mobinbookidtf.getText()) + "'";
                                    statement6.executeUpdate(query6);
                                    mobinstdidtf.setText("");
                                    mobinbookidtf.setText("");
                                    combobox.setSelectedIndex(0);
                                }
                            }
                        }
                    } else if (!result1.next() && result2.next()) {
                        JOptionPane.showMessageDialog(this, "Student I.D " + mobinstdidtf.getText() + " is not registered.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Book I.D " + mobinbookidtf.getText() + " not found.");
                    }
                }
            }
            con.close();
            statement1.close();
            statement2.close();
            statement3.close();
            statement4.close();
            statement5.close();
            statement6.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "One student can issue a single book in one day.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "something went wrong!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        try {
            Statement statementx = con.createStatement();
            Statement statement = con.createStatement();
            Statement statement1 = con.createStatement();
            Statement statement2 = con.createStatement();
            if (studentfield.getText().equals("") || bookfield.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Fill all the Fields!");
            } else {
                String queryx = "SELECT * FROM student WHERE student_id = '" + cipher.encode(studentfield.getText()) + "'";
                ResultSet resultx = statementx.executeQuery(queryx);
                String query3 = "SELECT * FROM books WHERE book_id='" + bookfield.getText() + "'";
                ResultSet result1 = statement1.executeQuery(query3);
                if (resultx.next() && result1.next()) {
                    String query5 = "SELECT * FROM bookhistory WHERE issued_by=" + Integer.parseInt(studentfield.getText()) + " AND book_id=" + Integer.parseInt(bookfield.getText()) + " AND book_status='" + cipher.encode("Pending") + "'";

                    ResultSet result2 = statement2.executeQuery(query5);
                    if (result2.next()) {
                        LocalDateTime now = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
                        String str = formatter.format(now);
                        Date b = java.sql.Date.valueOf(str);
                        Date c = result2.getDate(4);
                        int d = b.compareTo(c);
                        if (d > 0) {
                            JOptionPane.showMessageDialog(null, "Please pay $5 fine to librarian.");
                        }
                        String query2 = "DELETE FROM defaulter WHERE student_id=" + Integer.parseInt(studentfield.getText()) + " ";
                        statement2.executeUpdate(query2);
                        int a = result1.getInt(5) + 1;//increment in book quantity
                        String query4 = "UPDATE books SET book_quantity=" + a + " WHERE book_id=" + Integer.parseInt(bookfield.getText()) + " ";
                        statement2.executeUpdate(query4);
                        String query1 = "UPDATE bookhistory SET book_status='" + cipher.encode("Returned") + "' WHERE issued_by=" + Integer.parseInt(studentfield.getText()) + " AND book_id=" + Integer.parseInt(bookfield.getText()) + " AND book_status='" + cipher.encode("Pending") + "' ";
                        statement.executeUpdate(query1);//change status to returned.
                        JOptionPane.showMessageDialog(null, "Book returned successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "This book was not issued by this  student.");
                    }
                } else if (!resultx.next() && result1.next()) {
                    JOptionPane.showMessageDialog(this, "Student I.D " + studentfield.getText() + " is not registered.");
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong Book ID.");
                }
            }
            con.close();
            statement.close();
            statementx.close();
            statement1.close();
            statement2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            bookfield.setText("");
            studentfield.setText("");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(IssueAndReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueAndReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueAndReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueAndReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IssueAndReturn().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookfield;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mobinbookidtf;
    private javax.swing.JTextField mobinstdidtf;
    private javax.swing.JTextField studentfield;
    // End of variables declaration//GEN-END:variables
}

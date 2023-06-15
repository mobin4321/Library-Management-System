package project;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageDefaulters extends javax.swing.JFrame {

    String query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id";

    public void printtable() {
        try {
            Defaulter d = new Defaulter();
            ResultSet result = d.getDefaulter(query);
            Cipher c = new Cipher();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            while (result.next()) {
                model.addRow(new String[]{c.decode(Integer.toString(result.getInt(1))),
                    c.decode(result.getString(2)),
                    c.decode(result.getString(3)),
                    c.decode(result.getString(7)),
                    c.decode(result.getString(4)),
                    c.decode(result.getString(6)),
                    c.decode(result.getString(5))});
            }

            if (model.getRowCount() < 15) {
                model.setRowCount(15);
            }
            model.setRowCount(15);
        } catch (Exception e) {
        }

    }

    /**
     * Creates new form ManageDefaulters
     */
    public ManageDefaulters() throws SQLException {
        initComponents();
        ManageLibParks lp = new ManageLibParks();
        lp.timechecker();
        Vip v = new Vip();
        v.vipended();
        Defaulter d = new Defaulter();
        d.addstudent();
        printtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Gender", "Phone", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(51, 51, 51));
        table.setRowHeight(30);
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(110);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(200);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(250);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(300);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(6).setPreferredWidth(300);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("D E F A U L T E R S ");

        searchbtn.setBackground(new java.awt.Color(255, 102, 0));
        searchbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("S E A R C H");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        combobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Search By >", "Student ID", "First Name", "Last Name", "Gender", "Contact number", "Address", "Email", "All Defaulters" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/cross.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(323, 323, 323)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed

    }//GEN-LAST:event_comboboxActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        Cipher c = new Cipher();
        if (searchtf.getText().equals("") && combobox.getSelectedIndex() != 8) {
            JOptionPane.showMessageDialog(this, "Please type in the search bar.");
        } else {
            if (combobox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select a search filter.");
            } else {
                if (combobox.getSelectedIndex() == 1) {
                    query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id WHERE defaulter.student_id='" + c.encode(searchtf.getText()) + "'";
                }
                if (combobox.getSelectedIndex() == 2) {
                    query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id WHERE student_fname='" + c.encode(searchtf.getText()) + "'";
                }
                if (combobox.getSelectedIndex() == 3) {
                    query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id WHERE student_lname='" + c.encode(searchtf.getText()) + "'";
                }
                if (combobox.getSelectedIndex() == 4) {
                    query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id WHERE student_sex='" + c.encode(searchtf.getText()) + "'";
                }
                if (combobox.getSelectedIndex() == 5) {
                    query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id WHERE student_phone='" + c.encode(searchtf.getText()) + "'";
                }
                if (combobox.getSelectedIndex() == 6) {
                    query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id WHERE student_address='" + c.encode(searchtf.getText()) + "'";
                }
                if (combobox.getSelectedIndex() == 7) {
                    query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id WHERE student_email='" + c.encode(searchtf.getText()) + "'";
                }

            }
        }
        if (combobox.getSelectedIndex() == 8) {
            query = "SELECT defaulter.student_id,student_fname,student_lname,student_phone,student_email,student_address,student_sex FROM  defaulter  JOIN student ON student.student_id=defaulter.student_id ";
        }
        printtable();
        searchtf.setText("");
    }//GEN-LAST:event_searchbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new ManageDefaulters().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

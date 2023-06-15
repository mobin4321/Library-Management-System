/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MOBIN
 */
public class History extends javax.swing.JFrame {

    String query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id ORDER BY issue_date DESC";
    String query1 = "SELECT * FROM libparkhistory ORDER BY issuedate DESC";

    /**
     * Creates new form StudentFeedbacks
     */
    public History() throws SQLException {
        initComponents();
        Vip v = new Vip();
        v.vipended();
        Defaulter d = new Defaulter();
        d.addstudent();
        printlib_parkhistory();
        printbookhistory();
        ManageLibParks lp = new ManageLibParks();
        lp.timechecker();
    }

    public void printlib_parkhistory() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            ResultSet result2 = statement.executeQuery(query1);
            DefaultTableModel model = (DefaultTableModel) table2.getModel();
            model.setRowCount(0);
            while (result2.next()) {
                model.addRow(new String[]{cipher.decode(Integer.toString(result2.getInt(1))), cipher.decode(Integer.toString(result2.getInt(2))), cipher.decode(result2.getString(3)), cipher.decode(result2.getString(4)), cipher.decode(result2.getString(5))});
            }
            if (model.getRowCount() < 10) {
                model.setRowCount(10);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            con.close();
            statement.close();
        }
    }

    public void printbookhistory() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            ResultSet result2 = statement.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            while (result2.next()) {
                model.addRow(new String[]{cipher.decode(Integer.toString(result2.getInt(1))), cipher.decode(result2.getString(2)), cipher.decode(Integer.toString(result2.getInt(3))), cipher.decode(result2.getString(4)), cipher.decode(result2.getString(5)), cipher.decode(result2.getString(6)), cipher.decode(result2.getString(7)), cipher.decode(result2.getString(8))});
            }
            if (model.getRowCount() < 10) {
                model.setRowCount(10);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            con.close();
            statement.close();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        searchbtn = new javax.swing.JButton();
        searchtf1 = new javax.swing.JTextField();
        combobox1 = new javax.swing.JComboBox<>();
        searchbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student FeedBacks");
        setUndecorated(true);
        setSize(new java.awt.Dimension(910, 550));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/back_white.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("L I B R A R Y  P A R K S  H I S T O R Y");

        table1.setBackground(new java.awt.Color(153, 153, 153));
        table1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Issued By", "Student's Name", "Book I.D", "Book Title", "Author's Name", "Issue Date", "Due Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setGridColor(new java.awt.Color(0, 0, 0));
        table1.setRowHeight(35);
        table1.setRowSelectionAllowed(false);
        table1.setShowGrid(true);
        table1.getTableHeader().setResizingAllowed(false);
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(0).setPreferredWidth(50);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setPreferredWidth(50);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(5).setResizable(false);
            table1.getColumnModel().getColumn(6).setResizable(false);
            table1.getColumnModel().getColumn(7).setResizable(false);
        }

        table2.setBackground(new java.awt.Color(153, 153, 153));
        table2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Issued By", "Park I.D", "Issue Date", "Issue Time", "Due Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setGridColor(new java.awt.Color(0, 0, 0));
        table2.setRowHeight(35);
        table2.setRowSelectionAllowed(false);
        table2.setShowGrid(true);
        table2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(0).setPreferredWidth(200);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(1).setPreferredWidth(200);
            table2.getColumnModel().getColumn(2).setResizable(false);
            table2.getColumnModel().getColumn(2).setPreferredWidth(380);
            table2.getColumnModel().getColumn(3).setResizable(false);
            table2.getColumnModel().getColumn(3).setPreferredWidth(380);
            table2.getColumnModel().getColumn(4).setResizable(false);
            table2.getColumnModel().getColumn(4).setPreferredWidth(380);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("B O O K S  H I S T O R Y");

        searchtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchtf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });

        combobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Search By : >", "Student I.D", "Book I.D", "Student's Name", "Date Issued", "Due Date", "Return Status", "All Details" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(255, 102, 0));
        searchbtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        searchbtn.setForeground(java.awt.Color.white);
        searchbtn.setText("S E A R C H");
        searchbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 7));
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn.setRolloverEnabled(false);
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        searchtf1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchtf1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtf1ActionPerformed(evt);
            }
        });

        combobox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Search By : >", "Student I.D", "Park I.D", "Issue Date", "All Students" }));
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });

        searchbtn1.setBackground(new java.awt.Color(255, 102, 0));
        searchbtn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        searchbtn1.setForeground(java.awt.Color.white);
        searchbtn1.setText("S E A R C H");
        searchbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 7));
        searchbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn1.setRolloverEnabled(false);
        searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(264, 264, 264)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(270, 270, 270)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(searchtf, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(searchtf1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(searchbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed

    }//GEN-LAST:event_searchtfActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        Cipher cipher = new Cipher();
        if (searchtf.getText().equals("") && combobox.getSelectedIndex() != 7) {
            JOptionPane.showMessageDialog(this, "Please Fill Search Bar!!!");
        } else {
            if (combobox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please Select Option To Filter Result!!!");
            } else {
                if (combobox.getSelectedIndex() == 1) {
                    query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id WHERE student_id='" + cipher.encode(searchtf.getText()) + "' ORDER BY issue_date DESC";
                }
                if (combobox.getSelectedIndex() == 2) {
                    query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id WHERE books.book_id='" + cipher.encode(searchtf.getText()) + "' ORDER BY issue_date DESC";
                }
                if (combobox.getSelectedIndex() == 3) {
                    query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id WHERE student_fname='" + cipher.encode(searchtf.getText()) + "' ORDER BY issue_date DESC";
                }
                if (combobox.getSelectedIndex() == 4) {
                    query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id WHERE issue_date='" + cipher.encode(searchtf.getText()) + "' ORDER BY issue_date DESC";
                }
                if (combobox.getSelectedIndex() == 5) {
                    query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id WHERE due_date='" + cipher.encode(searchtf.getText()) + "' ORDER BY issue_date DESC";
                }
                if (combobox.getSelectedIndex() == 6) {
                    query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id WHERE book_status='" + cipher.encode(searchtf.getText()) + "' ORDER BY issue_date DESC";
                }
            }
        }
        if (combobox.getSelectedIndex() == 7) {
            query = "SELECT bookhistory.issued_by, student.student_fname, bookhistory.book_id, books.book_name, books.book_author,bookhistory.issue_date,bookhistory.due_date, bookhistory.book_status FROM bookhistory JOIN student ON student.student_id=bookhistory.issued_by JOIN books ON bookhistory.book_id=books.book_id  ORDER BY issue_date DESC";
        }
        try {
            printbookhistory();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        searchtf.setText("");
        combobox.setSelectedIndex(0);

    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtf1ActionPerformed

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox1ActionPerformed

    private void searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn1ActionPerformed
        Cipher cipher = new Cipher();
        if (searchtf1.getText().equals("") && combobox1.getSelectedIndex() != 4) {
            JOptionPane.showMessageDialog(this, "Please Fill Search Bar!!!");
        } else {
            if (combobox1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please Select Option To Filter Result!!!");
            } else {
                if (combobox1.getSelectedIndex() == 1) {
                    query1 = "SELECT * FROM libparkhistory WHERE issuedby='" + cipher.encode(searchtf1.getText()) + "' ORDER BY issuedate,issuetime DESC";
                }
                if (combobox1.getSelectedIndex() == 2) {
                    query1 = "SELECT * FROM libparkhistory WHERE libpark_id='" + cipher.encode(searchtf1.getText()) + "' ORDER BY issuedate,issuetime DESC";
                }
                if (combobox1.getSelectedIndex() == 3) {
                    query1 = "SELECT * FROM libparkhistory WHERE issuedate='" + cipher.encode(searchtf1.getText()) + "' ORDER BY issuedate,issuetime DESC";
                }
            }
        }
        if (combobox1.getSelectedIndex() == 4) {
            query1 = "SELECT * FROM libparkhistory ORDER BY issuedate,issuetime DESC";
        }
        try {
            printlib_parkhistory();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        searchtf1.setText("");
        combobox1.setSelectedIndex(0);
    }//GEN-LAST:event_searchbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new History().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton searchbtn1;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTextField searchtf1;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
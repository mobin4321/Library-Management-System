package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MOBIN
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() throws SQLException {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        main = new javax.swing.JTabbedPane();
        loginpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        stdidtf = new javax.swing.JTextField();
        libunTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        studentloginbtn = new javax.swing.JButton();
        librarianloginbtn1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        libpwTF = new javax.swing.JPasswordField();
        stdpwtf = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        signuppanel = new javax.swing.JPanel();
        numtf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        lnametf = new javax.swing.JTextField();
        fnametf = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        maleradio = new javax.swing.JRadioButton();
        femaleradio = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        logincta = new javax.swing.JButton();
        pwtf = new javax.swing.JPasswordField();
        cpwtf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Central Library");
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel2.setText("T H E");

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel3.setText("L I B R A R Y");

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel4.setText("C E N T R A L");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("S p r e a d i n g   A n d   P r o t e c t i n g   K n o w l e d g e  .  .  .");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/contact.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 550));

        loginpanel.setBackground(new java.awt.Color(51, 51, 51));
        loginpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student ID :");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UserName :");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password :");

        stdidtf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        stdidtf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        stdidtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        stdidtf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        stdidtf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdidtfMouseClicked(evt);
            }
        });
        stdidtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdidtfActionPerformed(evt);
            }
        });

        libunTF.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        libunTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        libunTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        libunTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        libunTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libunTFMouseClicked(evt);
            }
        });
        libunTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libunTFActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 204));
        jLabel10.setText(" S T U D E N T  L O G I N");

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 204));
        jLabel11.setText(" L I B R A R I A N  L O G I N");

        studentloginbtn.setBackground(new java.awt.Color(255, 102, 0));
        studentloginbtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        studentloginbtn.setForeground(new java.awt.Color(255, 255, 255));
        studentloginbtn.setText("L O G I N");
        studentloginbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 8));
        studentloginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentloginbtn.setOpaque(true);
        studentloginbtn.setRolloverEnabled(false);
        studentloginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentloginbtnActionPerformed(evt);
            }
        });

        librarianloginbtn1.setBackground(new java.awt.Color(255, 102, 0));
        librarianloginbtn1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        librarianloginbtn1.setForeground(new java.awt.Color(255, 255, 255));
        librarianloginbtn1.setText("L O G I N");
        librarianloginbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 8));
        librarianloginbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        librarianloginbtn1.setOpaque(true);
        librarianloginbtn1.setRolloverEnabled(false);
        librarianloginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianloginbtn1ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Don't have an Account ? ");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("SignUp");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("- - - - - - - - - - - - - - - - - - - - - - - - - -");

        libpwTF.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        libpwTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        libpwTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        libpwTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libpwTFMouseClicked(evt);
            }
        });
        libpwTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libpwTFActionPerformed(evt);
            }
        });

        stdpwtf.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stdpwtf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        stdpwtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        stdpwtf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdpwtfMouseClicked(evt);
            }
        });
        stdpwtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdpwtfActionPerformed(evt);
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

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                                    .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(stdidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stdpwtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(libpwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(libunTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginpanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(librarianloginbtn1)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                        .addComponent(studentloginbtn)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(stdidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stdpwtf))
                .addGap(18, 18, 18)
                .addComponent(studentloginbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(libunTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(libpwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(librarianloginbtn1)
                .addGap(60, 60, 60))
        );

        main.addTab("tab1", loginpanel);

        signuppanel.setBackground(new java.awt.Color(51, 51, 51));
        signuppanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));

        numtf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        numtf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        numtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        numtf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numtfActionPerformed(evt);
            }
        });

        emailtf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        emailtf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        emailtf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtfActionPerformed(evt);
            }
        });

        addresstf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        addresstf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addresstf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        addresstf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addresstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstfActionPerformed(evt);
            }
        });

        lnametf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lnametf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lnametf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        lnametf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnametfActionPerformed(evt);
            }
        });

        fnametf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        fnametf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fnametf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        fnametf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametfActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/cross.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 204));
        jLabel14.setText("S T U D E N T   S I G N U P");

        buttonGroup1.add(maleradio);
        maleradio.setForeground(new java.awt.Color(255, 255, 255));
        maleradio.setSelected(true);
        maleradio.setText("Male");
        maleradio.setRequestFocusEnabled(false);
        maleradio.setRolloverEnabled(false);

        buttonGroup1.add(femaleradio);
        femaleradio.setForeground(new java.awt.Color(255, 255, 255));
        femaleradio.setText("Female");
        femaleradio.setRequestFocusEnabled(false);
        femaleradio.setRolloverEnabled(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("First Name  :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Last Name  :");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Gender  :");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Phone Number :");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Address :");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Email :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Password :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Confirm Password :");

        signupbtn.setBackground(new java.awt.Color(255, 102, 0));
        signupbtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setText("S I G N U P");
        signupbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 7, true));
        signupbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupbtn.setFocusable(false);
        signupbtn.setOpaque(true);
        signupbtn.setRolloverEnabled(false);
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("Already have an Account ?");

        logincta.setBackground(new java.awt.Color(51, 51, 51));
        logincta.setForeground(new java.awt.Color(255, 102, 0));
        logincta.setText("Login");
        logincta.setBorder(null);
        logincta.setBorderPainted(false);
        logincta.setContentAreaFilled(false);
        logincta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logincta.setFocusPainted(false);
        logincta.setFocusable(false);
        logincta.setRolloverEnabled(false);
        logincta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginctaActionPerformed(evt);
            }
        });

        pwtf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        pwtf.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 7));

        cpwtf.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        cpwtf.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 7));

        javax.swing.GroupLayout signuppanelLayout = new javax.swing.GroupLayout(signuppanel);
        signuppanel.setLayout(signuppanelLayout);
        signuppanelLayout.setHorizontalGroup(
            signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signuppanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signuppanelLayout.createSequentialGroup()
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addComponent(maleradio)
                        .addGap(18, 18, 18)
                        .addComponent(femaleradio))
                    .addComponent(pwtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpwtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signuppanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signuppanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logincta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signuppanelLayout.createSequentialGroup()
                        .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        signuppanelLayout.setVerticalGroup(
            signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signuppanelLayout.createSequentialGroup()
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signuppanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleradio)
                    .addComponent(femaleradio)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(pwtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpwtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(logincta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        main.addTab("tab2", signuppanel);

        jPanel2.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, -40, 340, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void libunTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libunTFActionPerformed
    }//GEN-LAST:event_libunTFActionPerformed

    private void librarianloginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianloginbtn1ActionPerformed

        try {
            if (libunTF.getText().equals("") || libpwTF.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "UserName And Password Fields should be Filled!!");
            } else {
                Cipher cipher = new Cipher();
                String query = "Select * FROM librarian WHERE lib_name = '" + cipher.encode(libunTF.getText()) + "' AND lib_password = '" + cipher.encode(libpwTF.getText()) + "'";
                Connection con = ConnectionProvider.getconnection();
                Statement statement = con.createStatement();
                ResultSet result = statement.executeQuery(query);
                if (result.next()) {
                    LibrarianDashboard lhp = new LibrarianDashboard();
                    lhp.show();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong UserName or password.");
                }
                con.close();
                statement.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something went Wrong!");
        }

    }//GEN-LAST:event_librarianloginbtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main.setSelectedIndex(1);
        stdidtf.setText("");
        stdpwtf.setText("");
        libunTF.setText("");
        libpwTF.setText("");
        fnametf.setText("");
        lnametf.setText("");
        numtf.setText("");
        addresstf.setText("");
        emailtf.setText("");
        pwtf.setText("");
        cpwtf.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentloginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentloginbtnActionPerformed
        try {
            if (stdidtf.getText().equals("") || stdpwtf.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "UserName And Password Fields should be Filled.");
            } else {
                Cipher cipher = new Cipher();
                String query = "Select * FROM student WHERE student_id = '" + cipher.encode(stdidtf.getText()) + "' AND student_password = '" + cipher.encode(stdpwtf.getText()) + "'";
                Connection con = ConnectionProvider.getconnection();
                Statement statement = con.createStatement();
                ResultSet result = statement.executeQuery(query);
                if (result.next()) {
                    StudentDashboard lhp = new StudentDashboard();
                    lhp.show();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong UserName or password.");
                }
                con.close();
                statement.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something went Wrong !");
        }
    }//GEN-LAST:event_studentloginbtnActionPerformed

    private void libpwTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libpwTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libpwTFActionPerformed

    private void stdpwtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdpwtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdpwtfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();    }//GEN-LAST:event_jButton2ActionPerformed

    private void stdidtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdidtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdidtfActionPerformed

    private void numtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numtfActionPerformed

    private void emailtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtfActionPerformed

    private void addresstfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstfActionPerformed

    private void lnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnametfActionPerformed

    private void fnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametfActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();    }//GEN-LAST:event_jButton3ActionPerformed

    private void loginctaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginctaActionPerformed
        main.setSelectedIndex(0);    }//GEN-LAST:event_loginctaActionPerformed


    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        if (fnametf.getText().equals("") || lnametf.getText().equals("") || numtf.getText().equals("") || addresstf.getText().equals("") || emailtf.getText().equals("") || pwtf.getText().equals("") || cpwtf.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Fields Should be Filled.");
        } else {
            boolean val1 = false;
            boolean val2 = false;
            boolean val3 = false;
            boolean val4 = false;
            boolean val5 = false;
            if (emailtf.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
                val1 = true;
            } else {
                JOptionPane.showMessageDialog(this, "Email should be in this format\ncentrallibrary@gmail.com");
            }
            if (fnametf.getText().matches("^[A-Za-z. ]*$") && lnametf.getText().matches("^[A-Za-z. ]*$")) {
                val2 = true;
            } else {
                JOptionPane.showMessageDialog(this, "Name Field can only contain a-z or period( . )");
            }
            if (numtf.getText().matches("^[0-9]*$")) {
                val3 = true;
            } else {
                JOptionPane.showMessageDialog(this, "Phone Number field can only contain 0-9");
            }
            if (numtf.getText().length() < 11) {
                JOptionPane.showMessageDialog(this, "Phone Number Should Contain 11 numbers.");
            } else {
                val5 = true;
            }
            if (pwtf.getText().length() < 6) {
                JOptionPane.showMessageDialog(this, "Password Should Contain atleast 6 characters.");
            } else {
                val4 = true;
            }
            if (val1 && val2 && val3 && val4 && val5) {
                try {
                    signup();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
        }
     }//GEN-LAST:event_signupbtnActionPerformed

    private void libunTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libunTFMouseClicked
        stdidtf.setText("");
        stdpwtf.setText("");
    }//GEN-LAST:event_libunTFMouseClicked

    private void libpwTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libpwTFMouseClicked
        stdidtf.setText("");
        stdpwtf.setText("");
    }//GEN-LAST:event_libpwTFMouseClicked

    private void stdidtfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdidtfMouseClicked
        libunTF.setText("");
        libpwTF.setText("");
    }//GEN-LAST:event_stdidtfMouseClicked

    private void stdpwtfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdpwtfMouseClicked
        libunTF.setText("");
        libpwTF.setText("");
    }//GEN-LAST:event_stdpwtfMouseClicked
    public void signup() throws SQLException {
        String sex = "";
        if (maleradio.isSelected()) {
            sex = "Male";
        }
        if (femaleradio.isSelected()) {
            sex = "Female";
        }
        if (pwtf.getText().equals(cpwtf.getText())) {
            Student s = new Student(fnametf.getText(), lnametf.getText(), numtf.getText(), addresstf.getText(), emailtf.getText(), sex, pwtf.getText());
            s.addstudent();
            fnametf.setText("");
            lnametf.setText("");
            numtf.setText("");
            addresstf.setText("");
            emailtf.setText("");
            pwtf.setText("");
            cpwtf.setText("");
            maleradio.setSelected(true);
            main.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Password Doesn't Match.");
        }
    }

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginPage().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField cpwtf;
    private javax.swing.JTextField emailtf;
    private javax.swing.JRadioButton femaleradio;
    private javax.swing.JTextField fnametf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField libpwTF;
    private javax.swing.JButton librarianloginbtn1;
    private javax.swing.JTextField libunTF;
    private javax.swing.JTextField lnametf;
    private javax.swing.JButton logincta;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JTabbedPane main;
    private javax.swing.JRadioButton maleradio;
    private javax.swing.JTextField numtf;
    private javax.swing.JPasswordField pwtf;
    private javax.swing.JButton signupbtn;
    private javax.swing.JPanel signuppanel;
    public static javax.swing.JTextField stdidtf;
    private javax.swing.JPasswordField stdpwtf;
    private javax.swing.JButton studentloginbtn;
    // End of variables declaration//GEN-END:variables
}

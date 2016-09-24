/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.info;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author APCL
 */
public class CreateNewAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateNewAccount
     */
    public CreateNewAccount() {
        initComponents();
       this. setDefaultCloseOperation(HIDE_ON_CLOSE);
        PromptSupport.setPrompt("Enter name", nameCreatAccount);
        PromptSupport.setPrompt("Enter Father name", ftNameCreatAccount);
        PromptSupport.setPrompt("099999999999", phnCreatAccount);
        PromptSupport.setPrompt("aaa@gmail.com", emlCreatAccount);
        PromptSupport.setPrompt("image size 150*150px", imgCreatAccount);
        PromptSupport.setPrompt("aaa@gmail.com", uSCreatAccount);
        PromptSupport.setPrompt("Enter Password", passCreatAccount);

    }

    public void id() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameCreatAccount = new javax.swing.JTextField();
        ftNameCreatAccount = new javax.swing.JTextField();
        phnCreatAccount = new javax.swing.JTextField();
        uSCreatAccount = new javax.swing.JTextField();
        emlCreatAccount = new javax.swing.JTextField();
        disCreatAccount = new javax.swing.JComboBox();
        maleCreatAccount = new javax.swing.JRadioButton();
        FemCreatAccount = new javax.swing.JRadioButton();
        imgCreatAccount = new javax.swing.JTextField();
        submitCreatAccount = new javax.swing.JButton();
        passCreatAccount = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("5.  Phone No :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("4.  Gender :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("6.  Email :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("7.  Image:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("8.  User name:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("9.  Password :");

        nameCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ftNameCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        phnCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        uSCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        emlCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        disCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disCreatAccount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select distric-----", "Bogra", "Barisal", "Khulna", "Rajshahi", "Joypurhat", "Rangpur", "Dinajpur", "Sirajganj", "Pabna", "Dhaka", "Tangile", "Chitagang", "Syleht" }));

        buttonGroup1.add(maleCreatAccount);
        maleCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        maleCreatAccount.setText("Male");

        buttonGroup1.add(FemCreatAccount);
        FemCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FemCreatAccount.setText("Female");
        FemCreatAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemCreatAccountActionPerformed(evt);
            }
        });

        imgCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        submitCreatAccount.setBackground(new java.awt.Color(0, 255, 0));
        submitCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        submitCreatAccount.setText("submit");
        submitCreatAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitCreatAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCreatAccountActionPerformed(evt);
            }
        });

        passCreatAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Create New Account");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("1.  Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("2.  Father Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("3.  Distric  :  ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Choose image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("image size 150*150px");

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("View");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        image1.setBackground(new java.awt.Color(204, 255, 255));
        image1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        jLabel5.setBackground(new java.awt.Color(0, 255, 51));
        jLabel5.setFont(new java.awt.Font("Gabriola", 2, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Tree Super Shop");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emlCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(maleCreatAccount)
                                    .addGap(34, 34, 34)
                                    .addComponent(FemCreatAccount))
                                .addComponent(nameCreatAccount)
                                .addComponent(ftNameCreatAccount)
                                .addComponent(disCreatAccount, 0, 231, Short.MAX_VALUE)
                                .addComponent(phnCreatAccount))
                            .addComponent(imgCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uSCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(25, 25, 25))
                            .addComponent(image1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(submitCreatAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftNameCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(maleCreatAccount)
                                    .addComponent(FemCreatAccount)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(disCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(phnCreatAccount)))
                        .addGap(9, 9, 9))
                    .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emlCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uSCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passCreatAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitCreatAccount)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String sn1,sp2;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      JFileChooser jc = new JFileChooser("pictures");
        FileNameExtensionFilter fne = new FileNameExtensionFilter("Image", "jpg", "png");
        jc.setFileFilter(fne);

        int returnval = jc.showOpenDialog(null);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            sn1 = jc.getSelectedFile().getName();
            sp2 = jc.getSelectedFile().getPath();
        }
            try {

                BufferedImage imgp = ImageIO.read(new File(sp2));

                ImageIO.write(imgp, "jpg", new File("mypic\\" + sn1));
                ImageIcon icn = new ImageIcon(sp2);
                Image img1 = icn.getImage();
                Image newimg = img1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                //ImageIcon iconS = new ImageIcon(newimg);
                image1.setIcon(new ImageIcon(newimg));
                imgCreatAccount.setText(sn1);
                

            } catch (Exception e) {
            }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitCreatAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCreatAccountActionPerformed
        String nam1, nam2, fnam1, fnam2, phn1, phn2, eml1, eml2, usn1, usn2, pas1, pas2;

        nam1 = nameCreatAccount.getText();
        nam2 = "^[A-Z a-z._]{6,15}+$";
        fnam1 = ftNameCreatAccount.getText();
        fnam2 = "^[A-Z a-z._]{6,15}+$";
        phn1 = phnCreatAccount.getText();
        phn2 = "^[0-9._]{11}+$";
        eml2 = "^[A-za-z]+[A-za-z0-9._]*\\@[A-za-z]+\\.[A-za-z]{2,3}$";
        eml1 = emlCreatAccount.getText();
        usn2 = "^[A-za-z]+[A-za-z0-9._]*\\@[A-za-z]+\\.[A-za-z]{2,3}$";
        usn1 = uSCreatAccount.getText();
        pas1 = passCreatAccount.getText();
        pas2 = "^[A-Za-z0-9._]{8,20}+$";

        if (!nameCreatAccount.getText().isEmpty()) {
            if (nam1.matches(nam2)) {
                if (!ftNameCreatAccount.getText().isEmpty()) {
                    if (fnam1.matches(fnam2)) {
                        if ((maleCreatAccount.isSelected()) || (maleCreatAccount.isSelected())) {

                            if (!phnCreatAccount.getText().isEmpty()) {
                                if (phn1.matches(phn2)) {
                                    if (!emlCreatAccount.getText().isEmpty()) {
                                        if (eml1.matches(eml2)) {
                                            if (!imgCreatAccount.getText().isEmpty()) {

                                                if (!uSCreatAccount.getText().isEmpty()) {
                                                    if (usn1.matches(usn2)) {
                                                        if (!passCreatAccount.getText().isEmpty()) {
                                                            if (pas1.matches(pas2)) {
                                                                /**
                                                                 *
                                                                 */
                                                                try {
                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
                                                                    String s1 = nameCreatAccount.getText();
                                                                    String s2 = ftNameCreatAccount.getText();
                                                                    String s3 = disCreatAccount.getSelectedItem().toString();
                                                                    String s4 = "";
                                                                    if (maleCreatAccount.isSelected()) {
                                                                        s4 = maleCreatAccount.getText();
                                                                    } else if (FemCreatAccount.isSelected()) {
                                                                        s4 = FemCreatAccount.getText();
                                                                    }
                                                                    String s5 = phnCreatAccount.getText();
                                                                    String s6 = emlCreatAccount.getText();
                                                                    String s7 = imgCreatAccount.getText();
                                                                    String s8 = uSCreatAccount.getText();
                                                                    String s9 = passCreatAccount.getText();
                                                                    String ins = "insert into createlogin values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','" + s9 + "');";
                                                                    PreparedStatement ps = con.prepareStatement(ins);
                                                                    int n = ps.executeUpdate();
                                                                    if (n > 0) {
                                                                        JOptionPane.showMessageDialog(this, "Account create successful");

                                                                    } else {
                                                                        JOptionPane.showMessageDialog(this, "wrong");
                                                                    }
                                                                    ps.close();
                                                                    con.close();
                                                                    File f1 = new File("robi.txt");
                                                                    FileOutputStream fos = new FileOutputStream(f1);
                                                                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                                                                    oos.writeObject(s1);
                                                                    oos.writeObject(s2);
                                                                    oos.writeObject(s3);
                                                                    oos.writeObject(s4);
                                                                    oos.writeObject(s5);
                                                                    oos.writeObject(s6);
                                                                    oos.writeObject(s7);
                                                                    oos.writeObject(s8);
                                                                    oos.writeObject(s9);
                                                                    oos.flush();
                                                                    oos.close();

                                                                } catch (Exception e) {
                                                                    e.printStackTrace();
                                                                }

                                                            } else {
                                                                JOptionPane.showMessageDialog(this, "Password Min 8 to Maximum 15 Charachter");
                                                            }

                                                        } else {
                                                            JOptionPane.showMessageDialog(this, "password Empty");
                                                        }

                                                    } else {
                                                        JOptionPane.showMessageDialog(this, "user name must be email type");
                                                    }

                                                } else {
                                                    JOptionPane.showMessageDialog(this, "User Name Empty");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(this, "plese choos Image");
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(this, "Email not valid");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(this, "Email is Empty");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(this, "Phone must 11 number");
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "Phone Number Empty");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, " plese Choose Gender");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Father Name is Alphabet Charachter");
                    }
                } else {

                    JOptionPane.showMessageDialog(this, "Father Name Empty");
                }
            } else {
                JOptionPane.showMessageDialog(this, " Name is Alphabet Charachter");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Name Empty");
        }
    }//GEN-LAST:event_submitCreatAccountActionPerformed

    private void FemCreatAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemCreatAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemCreatAccountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        ViewCreateAcoount vca= new ViewCreateAcoount();
        vca.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FemCreatAccount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox disCreatAccount;
    private javax.swing.JTextField emlCreatAccount;
    private javax.swing.JTextField ftNameCreatAccount;
    private javax.swing.JLabel image1;
    private javax.swing.JTextField imgCreatAccount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleCreatAccount;
    private javax.swing.JTextField nameCreatAccount;
    private javax.swing.JPasswordField passCreatAccount;
    private javax.swing.JTextField phnCreatAccount;
    private javax.swing.JButton submitCreatAccount;
    private javax.swing.JTextField uSCreatAccount;
    // End of variables declaration//GEN-END:variables
}

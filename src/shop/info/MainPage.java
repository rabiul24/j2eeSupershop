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
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author APCL
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {//constructor
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        updateEmp();
        deleteEmp();
        updatepro();
        deletePro();
        sell();
    }

    /**
     * Sales Table***
     */
    public void sell() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("select * from products");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBoxSell.addItem(rs.getString(2));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Employee Table***
     */
    public void updateEmp() {
        try {
            jComboBoxUpdate.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from treeemployee";
            PreparedStatement ps = con.prepareStatement(qury);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBoxUpdate.addItem(rs.getInt(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteEmp() {
        try {
            jComboBoxdelete.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from treeemployee";
            PreparedStatement ps = con.prepareStatement(qury);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBoxdelete.addItem(rs.getInt(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void updatejob() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from treeemployee";
            PreparedStatement ps = con.prepareStatement(qury);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox_Ejbt1.addItem(rs.getString(4));
                jComboBoxEDep1.addItem(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deletejob() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from treeemployee";
            PreparedStatement ps = con.prepareStatement(qury);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox_Ejbt2.addItem(rs.getString(4));
                jComboBoxEDep2.addItem(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Product Table**
     */
    public void updatepro() {
        try {
            jCombProIdup.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from products";
            PreparedStatement ps = con.prepareStatement(qury);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jCombProIdup.addItem(rs.getInt(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void updateProCatgory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from products";
            PreparedStatement ps = con.prepareStatement(qury);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jCombCatProup2.addItem(rs.getString(6));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletePro() {
        try {
            jCombProId4.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from products";
            PreparedStatement ps = con.prepareStatement(qury);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jCombProId4.addItem(rs.getInt(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
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

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_eid = new javax.swing.JTextField();
        jTextField_Ename = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jComboBox_Ejbt = new javax.swing.JComboBox();
        jComboBoxEDep = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_Esal = new javax.swing.JTextField();
        jTextField_Ephn = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldEeml = new javax.swing.JTextField();
        jButtonEaad = new javax.swing.JButton();
        jLabel_img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Img = new javax.swing.JButton();
        jTextField_Eimg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField_Eimg1 = new javax.swing.JTextField();
        jButton_Img1 = new javax.swing.JButton();
        jLabel_img1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField_Ename1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jComboBox_Ejbt1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBoxEDep1 = new javax.swing.JComboBox();
        jTextField_Esal1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField_Ephn1 = new javax.swing.JTextField();
        jTextFieldEeml1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButtonEaad1 = new javax.swing.JButton();
        jComboBoxUpdate = new javax.swing.JComboBox();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel_img2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField_Ename2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jComboBox_Ejbt2 = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBoxEDep2 = new javax.swing.JComboBox();
        jTextField_Esal2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField_Ephn2 = new javax.swing.JTextField();
        jTextFieldEeml2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jButtonEaad2 = new javax.swing.JButton();
        jComboBoxdelete = new javax.swing.JComboBox();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jTextFielddl = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableemp = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchEmp = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        searchlebeEmp = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TxtProUrl = new javax.swing.JTextField();
        Pro_Cuntry = new javax.swing.JTextField();
        protype = new javax.swing.JTextField();
        pro_Category = new javax.swing.JComboBox();
        Pro_Price = new javax.swing.JTextField();
        Pro_Quantity = new javax.swing.JTextField();
        Pro_Date = new com.toedter.calendar.JDateChooser();
        pro_Name = new javax.swing.JTextField();
        Pro_Id = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        proImgLebel = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jCombProIdup = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtProUrlup = new javax.swing.JTextField();
        txtProCountryup = new javax.swing.JTextField();
        txtProTypeup = new javax.swing.JTextField();
        txtQuanpProUp = new javax.swing.JTextField();
        txtProNameup = new javax.swing.JTextField();
        jCombCatProup2 = new javax.swing.JComboBox();
        txtPriceProup = new javax.swing.JTextField();
        jDateChooserproUp = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabelproUp = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jCombProId4 = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtProUrl3 = new javax.swing.JTextField();
        txtProName3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        proSearchTable = new javax.swing.JTable();
        jLabel100 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        SearchBox = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel4145 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        txtTotalItem = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtTotalPro = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jTextFieldsellpro = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTextFieldSellQuantity = new javax.swing.JTextField();
        jTextFieldSellDiscount = new javax.swing.JTextField();
        jTextFieldSellNetPrice = new javax.swing.JTextField();
        jTextFieldSellvat = new javax.swing.JTextField();
        jTextFieldSellId = new javax.swing.JTextField();
        jTextFieldSellPrice = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextFieldSellTotal = new javax.swing.JTextField();
        jComboBoxSell = new javax.swing.JComboBox();
        jLabelSellProductpicture = new javax.swing.JLabel();
        jDateChooserpurchaseDate = new com.toedter.calendar.JDateChooser();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jDateChooserselldate = new com.toedter.calendar.JDateChooser();
        jButton10 = new javax.swing.JButton();
        jTextFieldUrlsel = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSellAdd = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreasellCopy = new javax.swing.JTextArea();

        jButton4.setText("jButton1");

        jButton1.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1360, 730));

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1355, 725));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1270, 680));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(1350, 710));

        jLabel9.setFont(new java.awt.Font("Gabriola", 2, 100)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 0));
        jLabel9.setText("Wellcome To");

        jLabel40.setFont(new java.awt.Font("Gabriola", 2, 120)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 153, 0));
        jLabel40.setText("Tree Super Shop");

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/info/2222.jpg"))); // NOI18N
        jLabel104.setText("jLabel104");

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 51, 255));
        jButton9.setText("Information");

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 255));
        jButton13.setText("Create New Account  ?");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 51, 255));
        jButton14.setText("Log In");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(51, 51, 255));
        jButton15.setText("Log Out");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton9)
                .addGap(17, 17, 17)
                .addComponent(jButton13)
                .addGap(22, 22, 22)
                .addComponent(jButton14)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(593, 593, 593)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(707, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 1285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );

        jTabbedPane2.addTab("  Home                  ", jPanel1);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel5.setBackground(new java.awt.Color(102, 51, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Join Employee");

        jTextField_eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_eidActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Name :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Id :");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Female");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Male");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Job Title :");

        jComboBox_Ejbt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chief executive Officer", "Markating Manager", "Chif Financial Officer", "Information Sevice Manager", "Vice President Of production", "Vice President Of Slaes", "Vice President Of Engineearing", "Accounts Manager", "Sales Manager", "Production Superviser", "Sales Man", "Superviser" }));
        jComboBox_Ejbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EjbtActionPerformed(evt);
            }
        });

        jComboBoxEDep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CEO", "Makating", "Production", "Administration", "Sales", " " }));
        jComboBoxEDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEDepActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Department :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Salary :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Phone :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email :");

        jButtonEaad.setText("Add");
        jButtonEaad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEaadActionPerformed(evt);
            }
        });

        jLabel_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Image");

        jButton_Img.setText("Chosse......");
        jButton_Img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImgActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Image Size 150*150 px");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Gender :");

        jLabel15.setFont(new java.awt.Font("Gabriola", 2, 60)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tree Super Shop");

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/info/AAAEE.jpg"))); // NOI18N
        jLabel93.setText("jLabel93");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(471, Short.MAX_VALUE)
                        .addComponent(jButtonEaad)
                        .addGap(401, 401, 401))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Ephn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxEDep, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jRadioButton4)
                                        .addGap(39, 39, 39)
                                        .addComponent(jRadioButton3))
                                    .addComponent(jTextField_Esal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Ename, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jComboBox_Ejbt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(jTextField_Eimg, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(jButton_Img))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(276, 276, 276)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel_img, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldEeml, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel_img, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Eimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Img)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(25, 25, 25)
                                .addComponent(jTextField_Ename, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jLabel92))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Ejbt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxEDep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Esal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Ephn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEeml, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(30, 30, 30)
                        .addComponent(jButtonEaad)
                        .addGap(137, 137, 137))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Join                                  ", jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 255, 204));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jButton_Img1.setText("Chosse......");
        jButton_Img1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Img1ActionPerformed(evt);
            }
        });

        jLabel_img1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Image Size 150*150 px");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Image");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(" Updata Employee");

        jLabel22.setText("Id :");

        jLabel23.setText("Name :");

        jLabel24.setText("Gender :");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Male");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Female");

        jComboBox_Ejbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Ejbt1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Job Title");

        jLabel26.setText("Department");

        jComboBoxEDep1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CEO", "Makating", "Production", "Administration", "Sales", " " }));
        jComboBoxEDep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEDep1ActionPerformed(evt);
            }
        });

        jLabel27.setText("Salary :");

        jLabel28.setText("Phone :");

        jLabel29.setText("Email :");

        jButtonEaad1.setText("Update");
        jButtonEaad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEaad1ActionPerformed(evt);
            }
        });

        jComboBoxUpdate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUpdateItemStateChanged(evt);
            }
        });
        jComboBoxUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUpdateActionPerformed(evt);
            }
        });

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/info/UP.jpg"))); // NOI18N
        jLabel94.setText("jLabel94");

        jLabel95.setFont(new java.awt.Font("Gabriola", 2, 60)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 102, 0));
        jLabel95.setText("Tree Super Shop");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEeml1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Ephn1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Esal1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel27)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel28)
                                                    .addComponent(jLabel29)))
                                            .addComponent(jLabel25))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_Ename1)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jRadioButton5)
                                                .addGap(35, 35, 35)
                                                .addComponent(jRadioButton6))
                                            .addComponent(jComboBox_Ejbt1, 0, 192, Short.MAX_VALUE)
                                            .addComponent(jComboBoxEDep1, 0, 192, Short.MAX_VALUE)
                                            .addComponent(jComboBoxUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(214, 214, 214)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(176, 176, 176)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jButton_Img1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jTextField_Eimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jButtonEaad1))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jComboBoxUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Ename1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton6))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jComboBox_Ejbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(jComboBoxEDep1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jTextField_Esal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(jTextField_Ephn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(jTextFieldEeml1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jButtonEaad1))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel21))
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Eimg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Img1))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update                            ", jPanel6);

        jPanel17.setPreferredSize(new java.awt.Dimension(1300, 600));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(1300, 578));

        jLabel_img2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Image");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 0));
        jLabel30.setText("Delete Employee");

        jLabel31.setText("Id :");

        jLabel32.setText("Name :");

        jLabel33.setText("Gender :");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Male");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Female");

        jComboBox_Ejbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Ejbt2ActionPerformed(evt);
            }
        });

        jLabel34.setText("Job Title");

        jLabel35.setText("Department");

        jComboBoxEDep2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CEO", "Makating", "Production", "Administration", "Sales" }));
        jComboBoxEDep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEDep2ActionPerformed(evt);
            }
        });

        jLabel36.setText("Salary :");

        jLabel37.setText("Phone :");

        jLabel38.setText("Email :");

        jButtonEaad2.setText("Delete");
        jButtonEaad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEaad2ActionPerformed(evt);
            }
        });

        jComboBoxdelete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxdeleteItemStateChanged(evt);
            }
        });
        jComboBoxdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxdeleteActionPerformed(evt);
            }
        });

        jLabel96.setBackground(new java.awt.Color(255, 153, 0));
        jLabel96.setFont(new java.awt.Font("Gabriola", 2, 60)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 153, 0));
        jLabel96.setText("Tree Super Shop");

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/info/570.jpg"))); // NOI18N
        jLabel97.setText("jLabel97");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEeml2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Ephn2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jButtonEaad2))
                                            .addComponent(jTextField_Esal2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(jLabel30)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)))
                            .addComponent(jLabel34))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Ename2)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton8))
                            .addComponent(jComboBox_Ejbt2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxEDep2, 0, 192, Short.MAX_VALUE)
                            .addComponent(jComboBoxdelete, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jTextFielddl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(48, 48, 48)))))
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel30)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jComboBoxdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Ename2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jComboBox_Ejbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jComboBoxEDep2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextField_Esal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTextField_Ephn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jTextFieldEeml2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonEaad2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFielddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Delete                            ", jPanel7);

        jPanel32.setBackground(new java.awt.Color(153, 153, 153));

        jTableemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "JobTitle", "Department", "salary", "Phone", "Email"
            }
        ));
        jScrollPane3.setViewportView(jTableemp);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel101.setBackground(new java.awt.Color(255, 153, 0));
        jLabel101.setFont(new java.awt.Font("Gabriola", 2, 70)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 102, 0));
        jLabel101.setText("Tree Super Shop");

        jPanel33.setBackground(new java.awt.Color(204, 0, 204));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id OR Name OR Email  :");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        searchEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchEmpKeyReleased(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Search Employee");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(searchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        searchlebeEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel103.setText("Image");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)
                        .addComponent(searchlebeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel103)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchlebeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search                            ", jPanel9);

        jTabbedPane2.addTab("Employee                  ", jTabbedPane1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1340, 645));

        jPanel22.setBackground(new java.awt.Color(0, 153, 51));
        jPanel22.setForeground(new java.awt.Color(0, 153, 51));
        jPanel22.setPreferredSize(new java.awt.Dimension(897, 550));

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Type:");

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Category:");

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Price:");

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Quantity:");

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Purchase Date:");

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Product Name:");

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Country:");

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Image URL:");

        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pro_Category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT CATEGORY", "FOOD", "Milk", "Soap", "Cream", "Detergent Powder", "CLOTH", "TOY", "GIFT ITEM", "OTHERS", " " }));

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Product");

        jButton6.setText("Brows.....");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        proImgLebel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Produc Picture");

        jLabel85.setFont(new java.awt.Font("Gabriola", 2, 60)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 153, 51));
        jLabel85.setText("Tree Super Shop");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62)
                    .addComponent(jLabel61)
                    .addComponent(jLabel60)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53)
                    .addComponent(jLabel55)
                    .addComponent(jLabel59)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(158, 158, 158))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(protype, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pro_Cuntry, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtProUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Pro_Price, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pro_Quantity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pro_Category, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                                    .addComponent(pro_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pro_Id, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGap(175, 175, 175)
                            .addComponent(proImgLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(141, 141, 141)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(Pro_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(173, 173, 173))))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel41))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pro_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))))
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel60)
                                    .addComponent(pro_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel53)
                            .addComponent(pro_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(Pro_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Pro_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59)))
                    .addComponent(proImgLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54)
                            .addComponent(Pro_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(protype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pro_Cuntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtProUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)))
                    .addComponent(jButton6))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/info/ttttt.jpg"))); // NOI18N
        jLabel91.setText("jLabel91");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 175, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Add                         ", jPanel2);

        jPanel10.setBackground(new java.awt.Color(204, 102, 255));

        jCombProIdup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombProIdupItemStateChanged(evt);
            }
        });
        jCombProIdup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCombProIdupMouseClicked(evt);
            }
        });

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("ID:");

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Product Name:");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Purchase Date:");

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Quantity:");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Price:");

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Category:");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Type:");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Country:");

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Image URL:");

        jCombCatProup2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT CATEGORY", "FOOD", "BEVARAGE", "CLOTH", "TOY", "GIFT ITEM", "OTHERS", " " }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Update Product");

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelproUp.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jButton5.setText("Brows.....");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Produc Picture");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Image Size 150*150 px");

        jPanel24.setBackground(new java.awt.Color(204, 204, 255));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/info/33333.jpg"))); // NOI18N
        jLabel89.setText("jLabel89");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel86.setFont(new java.awt.Font("Gabriola", 2, 60)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 153, 0));
        jLabel86.setText("Tree Super Shop");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43)))
                .addGap(112, 112, 112)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtProNameup, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPriceProup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuanpProUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserproUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabelproUp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtProTypeup, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jButton5))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jCombCatProup2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jCombProIdup, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel10))
                    .addComponent(txtProCountryup, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProUrlup, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)))
                .addGap(394, 394, 394))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(652, 652, 652))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(603, 603, 603)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel45)
                        .addComponent(jLabel44))
                    .addContainerGap(912, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43)
                                    .addComponent(jCombProIdup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtProNameup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jDateChooserproUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtQuanpProUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPriceProup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47)))
                            .addComponent(jLabelproUp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jCombCatProup2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jLabel49)
                                    .addComponent(txtProTypeup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel50)
                                    .addComponent(txtProCountryup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(txtProUrlup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)))
                .addGap(37, 37, 37))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(jLabel44)
                    .addGap(29, 29, 29)
                    .addComponent(jLabel45)
                    .addContainerGap(590, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Update                       ", jPanel10);

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        jCombProId4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombProId4ItemStateChanged(evt);
            }
        });
        jCombProId4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCombProId4MouseClicked(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Product Id:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Product Name:");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Purchase Date:");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Image URL:");

        jButton7.setText("Brows.....");

        jLabel73.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Produc Picture");

        jButton8.setText("Delete ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Delete Product");

        jLabel87.setFont(new java.awt.Font("Gabriola", 2, 70)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 153, 0));
        jLabel87.setText("Tree Super Shop");

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/info/DP.jpg"))); // NOI18N
        jLabel98.setText("jLabel98");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel66)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel65)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addGap(75, 75, 75)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCombProId4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProUrl3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProName3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addGap(21, 21, 21)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel74))
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addGap(29, 29, 29))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jCombProId4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProUrl3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65))
                                .addGap(24, 24, 24)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel72))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtProName3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(181, 315, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel98)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Delete                          ", jPanel11);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        proSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Name", "Parchase Date", "Quantity", "Price", "Category", "Type", "Country"
            }
        ));
        jScrollPane2.setViewportView(proSearchTable);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel100.setFont(new java.awt.Font("Gabriola", 2, 70)); // NOI18N
        jLabel100.setText("Tree Super Shop");

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setPreferredSize(new java.awt.Dimension(813, 300));

        jLabel99.setFont(new java.awt.Font("MingLiU", 1, 30)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 102, 0));
        jLabel99.setText("Search  Product    ");
        jLabel99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        SearchBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 204)));
        SearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBoxKeyReleased(evt);
            }
        });

        jLabel102.setBackground(new java.awt.Color(153, 0, 153));
        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setText("Product Id OR Name :   ");
        jLabel102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel99))
                .addGap(74, 74, 74))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel4145.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 255), 2));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Product Image");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4145, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(516, 516, 516))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel39)
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4145, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Search                           ", jPanel12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane2.addTab("Product                    ", jPanel4);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1411, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1274, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Customer Coppy", jPanel15);

        jLabel56.setText("Total Item:");

        txtTotalItem.setEditable(false);

        jLabel57.setText("Total Product:");

        txtTotalPro.setEditable(false);

        jLabel58.setText("Total Price:");

        txtTotalPrice.setEditable(false);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalItem)
                    .addComponent(txtTotalPro)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtTotalPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(785, 785, 785)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1073, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Sales Products", jPanel13);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2211, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setPreferredSize(new java.awt.Dimension(1310, 660));

        jLabel67.setText("Sales Id :");

        jLabel68.setText("Product Id :");

        jLabel69.setText("Product Name :");

        jLabel70.setText("Price :");

        jLabel71.setText("Quantity :");

        jLabel76.setText("Net Price :");

        jLabel77.setText("Discount :");

        jLabel78.setText("Vat  :");

        jTextFieldSellQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSellQuantityKeyReleased(evt);
            }
        });

        jTextFieldSellDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSellDiscountKeyReleased(evt);
            }
        });

        jTextFieldSellvat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSellvatKeyReleased(evt);
            }
        });

        jLabel79.setBackground(new java.awt.Color(204, 51, 255));
        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 153, 0));
        jLabel79.setText("Sales Product");

        jLabel80.setText("Total Price :");

        jComboBoxSell.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSellItemStateChanged(evt);
            }
        });

        jLabelSellProductpicture.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSellProductpicture.setForeground(new java.awt.Color(204, 204, 204));
        jLabelSellProductpicture.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel82.setText("PurChase Date");

        jLabel83.setText("Product Picture");

        jLabel84.setText("Sales Date :");

        jButton10.setText("Save");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setText("Sell");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel84))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSellTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSellId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSellQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSellNetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSellDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSellvat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldsellpro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxSell, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserselldate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTextFieldUrlsel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabelSellProductpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                    .addComponent(jDateChooserpurchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldsellpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jTextFieldSellId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(jComboBoxSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70))
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel71))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSellQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jTextFieldSellNetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSellProductpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextFieldUrlsel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooserpurchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSellDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSellvat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSellTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80))))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addComponent(jDateChooserselldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addComponent(jButton10))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jLabel81.setBackground(new java.awt.Color(51, 153, 0));
        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 153, 0));
        jLabel81.setText("Sales Coppy");

        jTableSellAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Id", "Product Id", "Name", "Price", "Quantity", "Netprice", "Discount", "Vat", "Total Price", "purchase Date", "Sales Date", "Photo"
            }
        ));
        jScrollPane4.setViewportView(jTableSellAdd);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton16.setText("Generate Total Price  : ");

        jButton11.setText("View");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton17.setText("Delete");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(jButton16)
                        .addGap(49, 49, 49)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jTextField1)
                    .addComponent(jButton11)
                    .addComponent(jButton17))
                .addContainerGap())
        );

        jTextAreasellCopy.setColumns(20);
        jTextAreasellCopy.setRows(5);
        jScrollPane1.setViewportView(jTextAreasellCopy);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Sales                         ", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_EjbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EjbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_EjbtActionPerformed

    private void jComboBoxEDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEDepActionPerformed

    private void jButtonEaadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEaadActionPerformed
        String eid1, eid2, nam1, nam2, sal1, sal2, phn1, phn2, eml1, eml2;

        eid1 = jTextField_eid.getText();
        eid2 = "^[0-9]+$";
        nam1 = jTextField_Ename.getText();
        nam2 = "^[A-Z a-z._]+$";
        sal1 = jTextField_Esal.getText();
        sal2 = "^[0-9]+$";
        phn1 = jTextField_Ephn.getText();
        phn2 = "^[0-9._]{11}+$";

        eml1 = jTextFieldEeml.getText();
        eml2 = "^[A-za-z]+[A-za-z0-9._]*\\@[A-za-z]+\\.[A-za-z]{2,3}$";

        if (!jTextField_eid.getText().isEmpty()) {
            if (eid1.matches(eid2)) {
                if (!jTextField_Ename.getText().isEmpty()) {
                    if (nam1.matches(nam2)) {
                        if ((jRadioButton4.isSelected()) || (jRadioButton3.isSelected())) {
                            if (!jTextField_Esal.getText().isEmpty()) {
                                if (sal1.matches(sal2)) {
                                    if (!jTextField_Ephn.getText().isEmpty()) {
                                        if (phn1.matches(phn2)) {
                                            if (!jTextFieldEeml.getText().isEmpty()) {
                                                if (eml1.matches(eml2)) {
                                                    if (!jTextField_Eimg.getText().isEmpty()) {
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
                                                            int s1 = Integer.parseInt(jTextField_eid.getText());
                                                            String s2 = jTextField_Ename.getText();

                                                            String s3 = "";
                                                            if (jRadioButton4.isSelected()) {
                                                                s3 = jRadioButton4.getText();
                                                            } else if (jRadioButton3.isSelected()) {
                                                                s3 = jRadioButton3.getText();
                                                            }
                                                            String s4 = jComboBox_Ejbt.getSelectedItem().toString();
                                                            String s5 = jComboBoxEDep.getSelectedItem().toString();

                                                            double s6 = Double.parseDouble(jTextField_Esal.getText());

                                                            String s7 = jTextField_Ephn.getText();
                                                            String s8 = jTextFieldEeml.getText();

                                                            String s9 = jTextField_Eimg.getText();

                                                            String ins = "insert into treeemployee values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "'," + s6 + ",'" + s7 + "','" + s8 + "','" + s9 + "');";
                                                            PreparedStatement ps = con.prepareStatement(ins);
                                                            int n = ps.executeUpdate();
                                                            if (n > 0) {
                                                                JOptionPane.showMessageDialog(this, "Employee Registration successful");

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
                                                        JOptionPane.showMessageDialog(this, "plese choos Image");
                                                    }

                                                } else {
                                                    JOptionPane.showMessageDialog(this, "Email not valid");
                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(this, "Email is Empty");
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(this, "Phone must 11 number & Numeric Charachter");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(this, "Phone Number Empty");

                                    }

                                } else {
                                    JOptionPane.showMessageDialog(this, "salary Numeric Charachter");
                                }

                            } else {

                                JOptionPane.showMessageDialog(this, "plese salary input");
                            }
                        } else {

                            JOptionPane.showMessageDialog(this, " plese Choose Gender");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Name Alphabet Charachter");
                    }
                } else {

                    JOptionPane.showMessageDialog(this, "Name Empty");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Id Numeric Charachter");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Id Empty");
        }
    }//GEN-LAST:event_jButtonEaadActionPerformed

    private void jTextField_eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_eidActionPerformed
    String sn1, sp2;
    private void jButton_ImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImgActionPerformed

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
            jLabel_img.setIcon(new ImageIcon(newimg));
            jTextField_Eimg.setText(sn1);

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton_ImgActionPerformed

    private void jButton_Img1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Img1ActionPerformed
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
            jLabel_img1.setIcon(new ImageIcon(newimg));
            jTextField_Eimg1.setText(sn1);

        } catch (Exception e) {
        }
        /* String s1, s2;
         JFileChooser jc = new JFileChooser();
         FileNameExtensionFilter fne = new FileNameExtensionFilter("Image", "jpg", "png");
         jc.setFileFilter(fne);

         jc.showOpenDialog(null);

         s1 = jc.getSelectedFile().getName();
         s2 = jc.getSelectedFile().getPath();

         jTextField_Eimg1.setText(s1);
         jLabel_img1.setIcon(new ImageIcon(s2));

         */
    }//GEN-LAST:event_jButton_Img1ActionPerformed

    private void jComboBox_Ejbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Ejbt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Ejbt1ActionPerformed

    private void jComboBoxEDep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEDep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEDep1ActionPerformed

    private void jButtonEaad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEaad1ActionPerformed
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            int s1 = Integer.parseInt(jComboBoxUpdate.getSelectedItem().toString());
            String s2 = jTextField_Ename1.getText();

            String s3 = "";
            if (jRadioButton5.isSelected()) {
                s3 = jRadioButton5.getText();
            } else if (jRadioButton6.isSelected()) {
                s3 = jRadioButton6.getText();
            }
            String s4 = jComboBox_Ejbt1.getSelectedItem().toString();
            String s5 = jComboBoxEDep1.getSelectedItem().toString();

            double s6 = Double.parseDouble(jTextField_Esal1.getText());

            String s7 = jTextField_Ephn1.getText();
            String s8 = jTextFieldEeml1.getText();
            String s9 = jTextField_Eimg1.getText();

            ImageIcon h = new ImageIcon("mypic\\" + s9 + "");
            jLabel_img1.setIcon(h);
            String up = "update treeemployee set Name='" + s2 + "',Gender='" + s3 + "', JobTitle='" + s4 + "', Department='" + s5 + "', "
                    + "Salary=" + s6 + ", Phone='" + s7 + "',Email='" + s8 + "',Image ='" + s9 + "' where Id=" + s1 + ";";
            PreparedStatement ps = con.prepareStatement(up);
            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Employee Update successful");

            } else {
                JOptionPane.showMessageDialog(this, "wrong");
            }
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonEaad1ActionPerformed

    private void jComboBoxUpdateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUpdateItemStateChanged

        updatejob();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from treeemployee where Id=?;";
            PreparedStatement ps = con.prepareStatement(qury);
            ps.setInt(1, Integer.parseInt(jComboBoxUpdate.getSelectedItem().toString()));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                jTextField_Ename1.setText(rs.getString(2));
                String gender = rs.getString(3);
                if (gender.equals("Male")) {
                    jRadioButton5.setSelected(true);
                } else {
                    jRadioButton6.setSelected(true);
                }
                jComboBox_Ejbt1.setSelectedItem(rs.getString(4));
                jComboBoxEDep1.setSelectedItem(rs.getString(5));

                jTextField_Esal1.setText(Double.toString(rs.getDouble(6)));
                jTextField_Ephn1.setText(rs.getString(7));
                jTextFieldEeml1.setText(rs.getString(8));
                jTextField_Eimg1.setText(rs.getString(9));
                String im = rs.getString(9);
                ImageIcon h = new ImageIcon(new ImageIcon("mypic\\" + rs.getString(9)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                jLabel_img1.setIcon(h);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBoxUpdateItemStateChanged

    private void jComboBoxUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUpdateActionPerformed

    private void jComboBox_Ejbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Ejbt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Ejbt2ActionPerformed

    private void jComboBoxEDep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEDep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEDep2ActionPerformed

    private void jButtonEaad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEaad2ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            int id = Integer.parseInt(jComboBoxdelete.getSelectedItem().toString());

            String del = "delete from treeemployee where Id=" + id + ";";

            PreparedStatement ps = con.prepareStatement(del);
            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(rootPane, "Employee cancle Success");
            } else {
                System.out.println(" not Delete");
                JOptionPane.showMessageDialog(rootPane, "Employee not cancle");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_jButtonEaad2ActionPerformed

    private void jComboBoxdeleteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxdeleteItemStateChanged
        deletejob();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from treeemployee where Id=?;";
            PreparedStatement ps = con.prepareStatement(qury);
            ps.setInt(1, Integer.parseInt(jComboBoxdelete.getSelectedItem().toString()));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                jTextField_Ename2.setText(rs.getString(2));
                String gender = rs.getString(3);
                if (gender.equals("Male")) {
                    jRadioButton6.setSelected(true);
                } else {
                    jRadioButton7.setSelected(true);
                }
                jComboBox_Ejbt2.setSelectedItem(rs.getString(4));
                jComboBoxEDep1.setSelectedItem(rs.getString(5));

                jTextField_Esal2.setText(Double.toString(rs.getDouble(6)));
                jTextField_Ephn2.setText(rs.getString(7));
                jTextFieldEeml2.setText(rs.getString(8));
                jTextFielddl.setText(rs.getString(9));
                String im = rs.getString(9);
                ImageIcon h = new ImageIcon(new ImageIcon("mypic\\" + rs.getString(9)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                jLabel_img2.setIcon(h);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBoxdeleteItemStateChanged

    private void jComboBoxdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxdeleteActionPerformed

    }//GEN-LAST:event_jComboBoxdeleteActionPerformed

    private void jCombProIdupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombProIdupItemStateChanged
        updateProCatgory();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from products where Id=?;";
            PreparedStatement ps = con.prepareStatement(qury);
            ps.setInt(1, Integer.parseInt(jCombProIdup.getSelectedItem().toString()));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                txtProNameup.setText(rs.getString(2));
                jDateChooserproUp.setDate(rs.getDate(3));
                txtQuanpProUp.setText(Integer.toString(rs.getInt(4)));

                txtPriceProup.setText(Double.toString(rs.getDouble(5)));

                jCombCatProup2.setSelectedItem(rs.getString(6));

                txtProTypeup.setText(rs.getString(7));
                txtProCountryup.setText(rs.getString(8));
                txtProUrlup.setText(rs.getString(9));
                //ImageIcon icon = new ImageIcon("images\\" + rs.getString(1));
                ImageIcon h = new ImageIcon(new ImageIcon("mypic\\" + rs.getString(9)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                jLabelproUp.setIcon(h);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jCombProIdupItemStateChanged

    private void jCombProIdupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCombProIdupMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jCombProIdupMouseClicked

    private void jCombProId4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombProId4ItemStateChanged

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from products where Id=?;";
            PreparedStatement ps = con.prepareStatement(qury);
            ps.setInt(1, Integer.parseInt(jCombProId4.getSelectedItem().toString()));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                txtProUrl3.setText(rs.getString(2));
                jDateChooser3.setDate(rs.getDate(3));

                txtProName3.setText(rs.getString(9));
                String im = rs.getString(9);
                ImageIcon h = new ImageIcon(new ImageIcon("mypic\\" + rs.getString(9)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                jLabel73.setIcon(h);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jCombProId4ItemStateChanged

    private void jCombProId4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCombProId4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombProId4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
            proImgLebel.setIcon(new ImageIcon(newimg));
            TxtProUrl.setText(sn1);

        } catch (Exception e) {
        }

        /* String pad1, pad2;
         JFileChooser jc = new JFileChooser();
         FileNameExtensionFilter fne = new FileNameExtensionFilter("Image", "jpg", "png");
         jc.setFileFilter(fne);

         jc.showOpenDialog(null);

         pad1 = jc.getSelectedFile().getName();
         pad2 = jc.getSelectedFile().getPath();

         TxtProUrl.setText(pad1);
         proImgLebel.setIcon(new ImageIcon(pad2));
         */
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pid1, pid2, pnam1, pnam2, sal1, sal2, phn1, phn2, eml1, eml2;

        pid1 = Pro_Id.getText();
        pid2 = "^[0-9]+$";
        pnam1 = pro_Name.getText();
        pnam2 = "^[A-Z & a-z._]+$";
        phn1 = jTextField_Ephn.getText();
        phn2 = "^[0-9._]{11}+$";
        eml1 = jTextFieldEeml.getText();
        eml2 = "^[A-za-z]+[A-za-z0-9._]*\\@[A-za-z]+\\.[A-za-z]{2,3}$";

        if (!Pro_Id.getText().isEmpty()) {
            if (pid1.matches(pid2)) {
                if (!pro_Name.getText().isEmpty()) {
                    if (pnam1.matches(pnam2)) {

                        if (!Pro_Quantity.getText().isEmpty()) {

                            if (!Pro_Price.getText().isEmpty()) {

                                if (!protype.getText().isEmpty()) {

                                    if (!Pro_Cuntry.getText().isEmpty()) {
                                        if (!TxtProUrl.getText().isEmpty()) {
                                            java.util.Date d = Pro_Date.getDate();
                                            DateFormat df = new SimpleDateFormat("mm-dd-yyyy");
                                            String d1 = df.format(d);

                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
                                                int p1 = Integer.parseInt(Pro_Id.getText());
                                                String p2 = pro_Name.getText();
                                                java.util.Date dd = df.parse(d1);
                                                java.sql.Date p3 = new java.sql.Date(dd.getTime());

                                                int p4 = Integer.parseInt(Pro_Quantity.getText());

                                                double p5 = Double.parseDouble(Pro_Price.getText());
                                                String p6 = pro_Category.getSelectedItem().toString();
                                                String p7 = protype.getText();
                                                String p8 = Pro_Cuntry.getText();

                                                String p9 = TxtProUrl.getText();

                                                String padd = "insert into products values(" + p1 + ",'" + p2 + "','" + p3 + "'," + p4 + "," + p5 + ",'" + p6 + "','" + p7 + "','" + p8 + "','" + p9 + "');";
                                                PreparedStatement ps = con.prepareStatement(padd);
                                                int n = ps.executeUpdate();
                                                if (n > 0) {
                                                    JOptionPane.showMessageDialog(this, "Product Add successful");

                                                } else {
                                                    JOptionPane.showMessageDialog(this, "wrong");
                                                }
                                                ps.close();
                                                con.close();
                                                File f1 = new File("robi.txt");
                                                FileOutputStream fos = new FileOutputStream(f1);
                                                ObjectOutputStream oos = new ObjectOutputStream(fos);
                                                oos.writeObject(p1);
                                                oos.writeObject(p2);
                                                oos.writeObject(p3);
                                                oos.writeObject(p4);
                                                oos.writeObject(p5);
                                                oos.writeObject(p6);
                                                oos.writeObject(p7);
                                                oos.writeObject(p8);
                                                oos.writeObject(p9);
                                                oos.flush();
                                                oos.close();

                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(this, "Plese Choose Product Picture");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Country Empty");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(this, "Product Type Empty");
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "Price Empty");

                            }

                        } else {

                            JOptionPane.showMessageDialog(this, "Quantity empty");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Name Alphabet Charachter");
                    }
                } else {

                    JOptionPane.showMessageDialog(this, "Name Empty");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Id Numeric Charachter");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Id Empty");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        java.util.Date d = jDateChooserproUp.getDate();
        DateFormat df = new SimpleDateFormat("mm-dd-yyyy");
        String d1 = df.format(d);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String p1 = jCombProIdup.getSelectedItem().toString();
            String p2 = txtProNameup.getText();
            java.util.Date dd = df.parse(d1);
            java.sql.Date p3 = new java.sql.Date(dd.getTime());

            int p4 = Integer.parseInt(txtQuanpProUp.getText());

            double p5 = Double.parseDouble(txtPriceProup.getText());
            String p6 = jCombCatProup2.getSelectedItem().toString();
            String p7 = txtProTypeup.getText();
            String p8 = txtProCountryup.getText();

            String p9 = txtProUrlup.getText();

            ImageIcon h = new ImageIcon("mypic\\" + p9 + "");
            jLabelproUp.setIcon(h);
            String up = "update products set Name='" + p2 + "',Purchase_Date='" + p3 + "', Quantity=" + p4 + ", Price=" + p5 + ", "
                    + "Category='" + p6 + "', Type='" + p7 + "',Country='" + p8 + "',Images ='" + p9 + "' where Id=" + p1 + ";";
            PreparedStatement ps = con.prepareStatement(up);
            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Update successful");

            } else {
                JOptionPane.showMessageDialog(this, "wrong");
            }
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            int id = Integer.parseInt(jCombProId4.getSelectedItem().toString());

            String del = "delete from products where Id=" + id + ";";

            PreparedStatement ps = con.prepareStatement(del);
            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(rootPane, "Product Delete Success");
            } else {
                System.out.println(" not Delete");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }//GEN-LAST:event_jButton8ActionPerformed
    double sellpri;
    private void jComboBoxSellItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSellItemStateChanged
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            String qury = "select * from products where Name=?;";
            PreparedStatement ps = con.prepareStatement(qury);
            ps.setString(1, jComboBoxSell.getSelectedItem().toString());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                jTextFieldSellId.setText(Integer.toString(rs.getInt(1)));
                jDateChooserpurchaseDate.setDate(rs.getDate(3));
                jTextFieldSellPrice.setText(Double.toString(rs.getDouble(5)));
                jTextFieldUrlsel.setText(rs.getString(9));
               
                 ImageIcon h = new ImageIcon(new ImageIcon("mypic\\" + rs.getString(9)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                jLabelSellProductpicture.setIcon(h);
                sellpri = rs.getDouble(5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jComboBoxSellItemStateChanged

    private void jTextFieldSellQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSellQuantityKeyReleased
        if (jTextFieldSellQuantity.getText().length() > 0) {
            double quantity = (Integer.parseInt(jTextFieldSellQuantity.getText()) * sellpri);
//        double spri = sellpri;
//        double netPrice = spri * quantity;
            jTextFieldSellNetPrice.setText(String.valueOf(quantity));
        }

    }//GEN-LAST:event_jTextFieldSellQuantityKeyReleased

    private void jTextFieldSellDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSellDiscountKeyReleased
        if ((jTextFieldSellDiscount.getText().length() > 0)) {
            double netp = Double.parseDouble(jTextFieldSellNetPrice.getText());
            double discount = Double.parseDouble(jTextFieldSellDiscount.getText());
            double disless = (discount / 100);
            double disles = netp * disless;
            double disl = netp - disles;
            jTextFieldSellTotal.setText(String.valueOf(disl));
        }
    }//GEN-LAST:event_jTextFieldSellDiscountKeyReleased

    private void jTextFieldSellvatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSellvatKeyReleased

        if (jTextFieldSellvat.getText().length() > 0) {
//        double netp = Double.parseDouble(jTextFieldSellNetPrice.getText());
//        double discount = Double.parseDouble(jTextFieldSellDiscount.getText());
//        double disless = (discount / 100);
////        double disles = netp * disless;
////        double disl = netp - disles;
//
            double tot = Double.parseDouble(jTextFieldSellTotal.getText());
            double vat = Double.parseDouble(jTextFieldSellvat.getText());
            double vattot = tot * (vat / 100);
            double totalp = tot + vattot;
            jTextFieldSellTotal.setText(null);

            jTextFieldSellTotal.setText(String.valueOf(totalp));

        }
    }//GEN-LAST:event_jTextFieldSellvatKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

//        if (!jTextFieldsellpro.getText().isEmpty()) {
//            DateFormat df = new SimpleDateFormat("mm-dd-yyyy");
//            java.util.Date pd = jDateChooserpurchaseDate.getDate();
//            String pd1 = df.format(pd);
//            DateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
//            java.util.Date sd = jDateChooserselldate.getDate();
//            String sd1 = sdf.format(sd);
//
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
//                int salId = Integer.parseInt(jTextFieldsellpro.getText());
//                int ProId = Integer.parseInt(jTextFieldSellId.getText());
//                String proName = jComboBoxSell.getSelectedItem().toString();
//                double price = Double.parseDouble(jTextFieldSellPrice.getText());
//
//                int quant = Integer.parseInt(jTextFieldSellQuantity.getText());
//
//                double netprice = Double.parseDouble(jTextFieldSellNetPrice.getText());
//                int dis = Integer.parseInt(jTextFieldSellDiscount.getText());
//                int vat = Integer.parseInt(jTextFieldSellvat.getText());
//                double totprice = Double.parseDouble(jTextFieldSellTotal.getText());
//
//                java.util.Date pdd = df.parse(pd1);
//                java.sql.Date purchasedate = new java.sql.Date(pdd.getTime());
//
//                java.util.Date sdd = sdf.parse(sd1);
//                java.sql.Date salesdate = new java.sql.Date(sdd.getTime());
//                String proImg = jTextFieldUrlsel.getText();
//                String padd = "insert into sales values(" + salId + "," + ProId + ",'" + proName + "'," + price + "," + quant
//                        + "," + netprice + "," + dis + "," + vat + "," + totprice + ",'" + purchasedate + "','" + salesdate + "','" + proImg + "');";
//                PreparedStatement ps = con.prepareStatement(padd);
//                int n = ps.executeUpdate();
//                if (n > 0) {
//                    JOptionPane.showMessageDialog(this, "Save success");
//
//                } else {
//                    JOptionPane.showMessageDialog(this, "not save");
//                }
//                ps.close();
//                con.close();
//                File f1 = new File("sales.txt");
//                FileOutputStream fos = new FileOutputStream(f1);
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
//                oos.writeObject(salId);
//                oos.writeObject(ProId);
//                oos.writeObject(proName);
//                oos.writeObject(price);
//                oos.writeObject(quant);
//                oos.writeObject(netprice);
//                oos.writeObject(dis);
//                oos.writeObject(vat);
//                oos.writeObject(totprice);
//                oos.writeObject(purchasedate);
//                oos.writeObject(salesdate);
//                oos.writeObject(proImg);
//                oos.flush();
//                oos.close();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Plese Sales Id Enter");
//        }
        saveJtable();
    }//GEN-LAST:event_jButton10ActionPerformed
    void saveJtable() {
        try {
            DefaultTableModel m = (DefaultTableModel) jTableSellAdd.getModel();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");
            PreparedStatement stm = con.prepareStatement("INSERT INTO sales values(?,?,?,?,?,?,?,?,?,?,?,?)");
            for (int i = 0; i < m.getRowCount(); i++) {
                stm.setInt(1, Integer.parseInt((String) m.getValueAt(i, 0)));
                stm.setInt(2, Integer.parseInt((String) m.getValueAt(i, 1)));
                stm.setString(3, ((String) m.getValueAt(i, 2)));
                stm.setDouble(4, Double.parseDouble((String) m.getValueAt(i, 3)));
                stm.setInt(5, Integer.parseInt((String) m.getValueAt(i, 4)));
                stm.setDouble(6, Double.parseDouble((String) m.getValueAt(i, 5)));
                stm.setDouble(7, Double.parseDouble((String) m.getValueAt(i, 6)));
                stm.setDouble(8, Double.parseDouble((String) m.getValueAt(i, 7)));
                stm.setDouble(9, Double.parseDouble((String) m.getValueAt(i, 8)));
                String date = String.valueOf(m.getValueAt(i, 9));
                String date2 = String.valueOf(m.getValueAt(i, 10));

                System.out.println(date);
                stm.setDate(10, Date.valueOf(date));
                stm.setDate(11, Date.valueOf(date2));
                stm.setString(12, ((String) m.getValueAt(i, 11)));
                int n= stm.executeUpdate();
                if (n>0) {
                    JOptionPane.showMessageDialog(this, "save Success");
                } else {
                     JOptionPane.showMessageDialog(this, " not save ");
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 DefaultTableModel m = (DefaultTableModel) jTableSellAdd.getModel();
     jTextAreasellCopy.append("  \t\t\t      Date :  "  +m.getValueAt(0,10).toString()+"\n\n");  
      jTextAreasellCopy.append("Salse id"  + "\tProduct Name "+"\t\tQuantity "+"\t Price \n\n");    
           
for (int i = 0; i < m.getRowCount(); i++) {
    jTextAreasellCopy.append(m.getValueAt(i, 1).toString()+"\t"+m.getValueAt(i, 2).toString()+"\t\t"+m.getValueAt(i, 4).toString()+"\t"+m.getValueAt(i, 8).toString()+"\n");
                     
    }
    String a=jTextField1.getText();
    jTextAreasellCopy.append("________________________________________________________"+"\n                 \t\t\t     Total Price = "+a);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        DateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
        DateFormat sdf2 = new SimpleDateFormat("mm-dd-yyyy");
        java.util.Date sd = jDateChooserpurchaseDate.getDate();
        java.util.Date sd2 = jDateChooserselldate.getDate();
        String sd1 = sdf.format(sd);
        String sd22 = sdf2.format(sd2);
        try {

            String s1 = jTextFieldsellpro.getText();
            String s2 = jTextFieldSellId.getText();
            String s3 = jComboBoxSell.getSelectedItem().toString();
            String s4 = jTextFieldSellPrice.getText();
            String s5 = jTextFieldSellQuantity.getText();
            String s6 = jTextFieldSellNetPrice.getText();
            String s7 = jTextFieldSellDiscount.getText();
            String s8 = jTextFieldSellvat.getText();
            String s9 = jTextFieldSellTotal.getText();

            java.util.Date sdd = sdf.parse(sd1);
            java.sql.Date s10 = new java.sql.Date(sdd.getTime());

            java.util.Date sdd2 = sdf.parse(sd22);
            java.sql.Date s11 = new java.sql.Date(sdd.getTime());

            DefaultTableModel dtm = (DefaultTableModel) jTableSellAdd.getModel();
            int rowCount = jTableSellAdd.getRowCount();

            double sum = Double.parseDouble(jTextFieldSellTotal.getText());
            double rr = 0;
            for (int i = 0; i < rowCount; i++) {
                sum += Double.parseDouble(jTableSellAdd.getValueAt(i, 8).toString());
            }
            String s12 = jTextFieldUrlsel.getText();

            dtm.addRow(new Object[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12});

            rr = Math.round(sum);
            jTextField1.setText(String.valueOf(sum));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void SearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyReleased
        try {
            DefaultTableModel dtm = (DefaultTableModel) proSearchTable.getModel();

            if (dtm.getRowCount() > 0) {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    dtm.removeRow(i);

                }
            }

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");

            PreparedStatement ps = con.prepareStatement("select * from products where Id=? || Name=?");
            if (SearchBox.getText().length() > 0) {
                ps.setString(1, SearchBox.getText());
                ps.setString(2, SearchBox.getText());

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
                    ImageIcon ic = new ImageIcon(new ImageIcon("mypic\\" + rs.getString(9)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                    jLabel4145.setIcon(ic);

                }
            }
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();

        }


    }//GEN-LAST:event_SearchBoxKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
            jLabelproUp.setIcon(new ImageIcon(newimg));
            txtProUrlup.setText(sn1);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchEmpKeyReleased
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTableemp.getModel();

            if (dtm.getRowCount() > 0) {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    dtm.removeRow(i);

                }
            }

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/treesupershop", "root", "apcl123456");

            PreparedStatement ps = con.prepareStatement("select * from treeemployee where Id=? || Name=? || Email=?");
            if (searchEmp.getText().length() > 0) {
                ps.setString(1, searchEmp.getText());
                ps.setString(2, searchEmp.getText());
                ps.setString(3, searchEmp.getText());

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
                    ImageIcon ic = new ImageIcon(new ImageIcon("mypic\\" + rs.getString(9)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                    searchlebeEmp.setIcon(ic);

                }
            }
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_searchEmpKeyReleased

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        CreateNewAccount cna = new CreateNewAccount();
        cna.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       DefaultTableModel dtm=(DefaultTableModel)jTableSellAdd.getModel();
       int []r=jTableSellAdd.getSelectedRows();
        if (r.length>=1) {
            for (int i = 0; i < r.length; i++) {
                dtm.removeRow(r[i]-i);
                
            }
            
        }
    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pro_Cuntry;
    private com.toedter.calendar.JDateChooser Pro_Date;
    private javax.swing.JTextField Pro_Id;
    private javax.swing.JTextField Pro_Price;
    private javax.swing.JTextField Pro_Quantity;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JTextField TxtProUrl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonEaad;
    private javax.swing.JButton jButtonEaad1;
    private javax.swing.JButton jButtonEaad2;
    private javax.swing.JButton jButton_Img;
    private javax.swing.JButton jButton_Img1;
    private javax.swing.JComboBox jCombCatProup2;
    private javax.swing.JComboBox jCombProId4;
    private javax.swing.JComboBox jCombProIdup;
    private javax.swing.JComboBox jComboBoxEDep;
    private javax.swing.JComboBox jComboBoxEDep1;
    private javax.swing.JComboBox jComboBoxEDep2;
    private javax.swing.JComboBox jComboBoxSell;
    private javax.swing.JComboBox jComboBoxUpdate;
    private javax.swing.JComboBox jComboBox_Ejbt;
    private javax.swing.JComboBox jComboBox_Ejbt1;
    private javax.swing.JComboBox jComboBox_Ejbt2;
    private javax.swing.JComboBox jComboBoxdelete;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooserproUp;
    private com.toedter.calendar.JDateChooser jDateChooserpurchaseDate;
    private com.toedter.calendar.JDateChooser jDateChooserselldate;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel4145;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelSellProductpicture;
    private javax.swing.JLabel jLabel_img;
    private javax.swing.JLabel jLabel_img1;
    private javax.swing.JLabel jLabel_img2;
    private javax.swing.JLabel jLabelproUp;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTableSellAdd;
    private javax.swing.JTable jTableemp;
    private javax.swing.JTextArea jTextAreasellCopy;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldEeml;
    private javax.swing.JTextField jTextFieldEeml1;
    private javax.swing.JTextField jTextFieldEeml2;
    private javax.swing.JTextField jTextFieldSellDiscount;
    private javax.swing.JTextField jTextFieldSellId;
    private javax.swing.JTextField jTextFieldSellNetPrice;
    private javax.swing.JTextField jTextFieldSellPrice;
    private javax.swing.JTextField jTextFieldSellQuantity;
    private javax.swing.JTextField jTextFieldSellTotal;
    private javax.swing.JTextField jTextFieldSellvat;
    private javax.swing.JTextField jTextFieldUrlsel;
    private javax.swing.JTextField jTextField_Eimg;
    private javax.swing.JTextField jTextField_Eimg1;
    private javax.swing.JTextField jTextField_Ename;
    private javax.swing.JTextField jTextField_Ename1;
    private javax.swing.JTextField jTextField_Ename2;
    private javax.swing.JTextField jTextField_Ephn;
    private javax.swing.JTextField jTextField_Ephn1;
    private javax.swing.JTextField jTextField_Ephn2;
    private javax.swing.JTextField jTextField_Esal;
    private javax.swing.JTextField jTextField_Esal1;
    private javax.swing.JTextField jTextField_Esal2;
    private javax.swing.JTextField jTextField_eid;
    private javax.swing.JTextField jTextFielddl;
    private javax.swing.JTextField jTextFieldsellpro;
    private javax.swing.JLabel proImgLebel;
    private javax.swing.JTable proSearchTable;
    private javax.swing.JComboBox pro_Category;
    private javax.swing.JTextField pro_Name;
    private javax.swing.JTextField protype;
    private javax.swing.JTextField searchEmp;
    private javax.swing.JLabel searchlebeEmp;
    private javax.swing.JTextField txtPriceProup;
    private javax.swing.JTextField txtProCountryup;
    private javax.swing.JTextField txtProName3;
    private javax.swing.JTextField txtProNameup;
    private javax.swing.JTextField txtProTypeup;
    private javax.swing.JTextField txtProUrl3;
    private javax.swing.JTextField txtProUrlup;
    private javax.swing.JTextField txtQuanpProUp;
    private javax.swing.JTextField txtTotalItem;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtTotalPro;
    // End of variables declaration//GEN-END:variables
}

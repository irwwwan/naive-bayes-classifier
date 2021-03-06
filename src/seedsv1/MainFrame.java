/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seedsv1;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irwansyah
 */
public class MainFrame extends javax.swing.JFrame {

    private NaiveBayes naiveBayesTarget1;
    private NaiveBayes naiveBayesTarget3;
    private NaiveBayes naiveBayesTarget2;
    private double ProbabilityTarget1ForDataSet;
    private double ProbabilityTarget2ForDataSet;
    private double ProbabilityTarget3ForDataSet;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        methode = new javax.swing.JComboBox();
        fileLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnTraining = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accuration = new javax.swing.JTextField();
        error = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTesting = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Seeds Classification"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(244, 105, 5));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Area", "Perimeter", "Compactness", "Length of kernel", "Width of kernel", "Asymmetry Coefficient", "Length of Kernel Groove", "Varieties of wheat (Target)", "Varieties of wheat "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setMinWidth(5);
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            dataTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("File Location");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Method");

        methode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Naive Bayes" }));
        methode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                methodeItemStateChanged(evt);
            }
        });
        methode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodeActionPerformed(evt);
            }
        });

        fileLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileLocationActionPerformed(evt);
            }
        });

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTraining.setFont(new java.awt.Font("Microsoft NeoGothic", 0, 13)); // NOI18N
        btnTraining.setForeground(new java.awt.Color(255, 77, 0));
        btnTraining.setText("Start Training");
        btnTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainingActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setBackground(new java.awt.Color(240, 93, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 66, 3));
        jLabel3.setText("Accuration");

        jLabel4.setBackground(new java.awt.Color(240, 93, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 66, 3));
        jLabel4.setText("Error");

        accuration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accuration.setText("     0 %");
        accuration.setEnabled(false);
        accuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accurationActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        error.setText("     0 %");
        error.setEnabled(false);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seeds");

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Classification");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTesting.setFont(new java.awt.Font("Microsoft NeoGothic", 0, 13)); // NOI18N
        btnTesting.setForeground(new java.awt.Color(255, 77, 0));
        btnTesting.setText("Start Testing");
        btnTesting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnTraining)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(methode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(methode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1023, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //Pilih File dari Direktori 
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(this);
            String location = fileChooser.getSelectedFile() + "";
            if ("null".equals(location)) {
                location = "";
            }
            fileLocation.setText(location);

            //Hapus row tabel, jika tabel masih berisi data
            DefaultTableModel df = (DefaultTableModel) dataTable.getModel();
            if (df.getRowCount() > 0) {
                for (int i = df.getRowCount() - 1; i > -1; i--) {
                    df.removeRow(i);
                }
            }

            // Load Data dari Excel ke Table
            ExcelData dataTraining = new ExcelData();
            ArrayList<ArrayList> data = dataTraining.readXLSXFile(fileLocation.getText());
            insertDataToTable(data);
        } catch (HeadlessException | IOException ex) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fileLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileLocationActionPerformed

    private void methodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_methodeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_methodeItemStateChanged

    private void methodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_methodeActionPerformed

    private void accurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accurationActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorActionPerformed

    private void btnTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainingActionPerformed
        switch (methode.getSelectedItem().toString()) {
            case "Naive Bayes":
                if (dataTable.getRowCount() != 0) {
                    naiveBayesTarget1 = new NaiveBayes();
                    naiveBayesTarget2 = new NaiveBayes();
                    naiveBayesTarget3 = new NaiveBayes();

                    int jumlahTarget1 = 0;
                    int jumlahTarget2 = 0;
                    int jumlahTarget3 = 0;

                    ArrayList<String> dataTarget1 = new ArrayList<>();
                    ArrayList<String> dataTarget2 = new ArrayList<>();
                    ArrayList<String> dataTarget3 = new ArrayList<>();

                    // Hitung Standar Deviasi untuk setiap atribut. 1 target = 8 standar deviasi
                    for (int atributSekarang = 1; atributSekarang < 8; atributSekarang++) {
                        for (int barisDataSekarang = 0; barisDataSekarang < dataTable.getRowCount(); barisDataSekarang++) {
                            switch (dataTable.getValueAt(barisDataSekarang, 8).toString()) {
                                case "1.0":
                                    dataTarget1.add(dataTable.getValueAt(barisDataSekarang, atributSekarang).toString());
                                    break;
                                case "2.0":
                                    dataTarget2.add(dataTable.getValueAt(barisDataSekarang, atributSekarang).toString());
                                    break;
                                case "3.0":
                                    dataTarget3.add(dataTable.getValueAt(barisDataSekarang, atributSekarang).toString());
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Target Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        //Hitung Standar Deviasi Untuk setiap target pada atribut ke-i
                        double stdev1 = naiveBayesTarget1.getDeviationStandard(dataTarget1);
                        double stdev2 = naiveBayesTarget2.getDeviationStandard(dataTarget2);
                        double stdev3 = naiveBayesTarget3.getDeviationStandard(dataTarget3);

                        //Tambahkan standar deviasi yang telah diperoleh ke List Standard Deviasi
                        naiveBayesTarget1.addStandardDeviationToList(stdev1);
                        naiveBayesTarget2.addStandardDeviationToList(stdev2);
                        naiveBayesTarget3.addStandardDeviationToList(stdev3);

                        //Hitung Mean Untuk setiap target pada atribut ke-i
                        double mean1 = naiveBayesTarget1.getMean(dataTarget1);
                        double mean2 = naiveBayesTarget2.getMean(dataTarget2);
                        double mean3 = naiveBayesTarget3.getMean(dataTarget3);

                        //Tambahkan Mean yang telah diperoleh ke List Standard Deviasi
                        naiveBayesTarget1.addMeanToList(mean1);
                        naiveBayesTarget2.addMeanToList(mean2);
                        naiveBayesTarget3.addMeanToList(mean3);

                    }

                    for (int barisDataSekarang = 0; barisDataSekarang < dataTable.getRowCount(); barisDataSekarang++) {
                        // Hitung Jumlah Targat untuk menghitung Probabilitas target terhadap dataset 
                        switch (dataTable.getValueAt(barisDataSekarang, 8).toString()) {
                            case "1.0":
                                jumlahTarget1++;
                                break;
                            case "2.0":
                                jumlahTarget2++;
                                break;
                            case "3.0":
                                jumlahTarget3++;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Target Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    //Show Standard Deviasi
                    System.out.println("Standard Deviasi");
                    System.out.println(naiveBayesTarget1.getListOfDeviationStandard());
                    System.out.println(naiveBayesTarget2.getListOfDeviationStandard());
                    System.out.println(naiveBayesTarget3.getListOfDeviationStandard());

                    //Show Mean
                    System.out.println("Mean");
                    System.out.println(naiveBayesTarget1.getListOfMean());
                    System.out.println(naiveBayesTarget2.getListOfMean());
                    System.out.println(naiveBayesTarget3.getListOfMean());
                    
                    
                    System.out.println("");
                    System.out.println("jumlahTarget1" + jumlahTarget1);
                    System.out.println("jumlahTarget2" + jumlahTarget2);
                    System.out.println("jumlahTarget3" + jumlahTarget3);

                    int totalData = jumlahTarget1 + jumlahTarget2 + jumlahTarget3;
                    
                    ProbabilityTarget1ForDataSet = (double) jumlahTarget1 / totalData;
                    ProbabilityTarget2ForDataSet = (double) jumlahTarget2 / totalData;
                    ProbabilityTarget3ForDataSet = (double) jumlahTarget3 / totalData;

                    System.out.println("Probability Target For DataSet");
                    System.out.println(ProbabilityTarget1ForDataSet);
                    System.out.println(ProbabilityTarget2ForDataSet);
                    System.out.println(ProbabilityTarget3ForDataSet);

                    JOptionPane.showMessageDialog(null, "Training Success!", "Info", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Please insert data before start!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }//GEN-LAST:event_btnTrainingActionPerformed

    private void btnTestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestingActionPerformed
        switch (methode.getSelectedItem().toString()) {
            case "Naive Bayes":
                if (dataTable.getRowCount() != 0) {
                    double akurasi = 0;

                    for (int barisDataSekarang = 0; barisDataSekarang < dataTable.getRowCount(); barisDataSekarang++) {
                        //Insert data pada baris data sekarang ke listDataPerBaris
                        ArrayList<Double> listDataPerBaris = new ArrayList();
                        for (int atributSekarang = 1; atributSekarang < 8; atributSekarang++) {
                            listDataPerBaris.add(Double.parseDouble(dataTable.getValueAt(barisDataSekarang, atributSekarang).toString()));
                        }

                        double Probability1 = naiveBayesTarget1.countProbability(listDataPerBaris) * ProbabilityTarget1ForDataSet;
                        double Probability2 = naiveBayesTarget2.countProbability(listDataPerBaris) * ProbabilityTarget2ForDataSet;
                        double Probability3 = naiveBayesTarget3.countProbability(listDataPerBaris) * ProbabilityTarget3ForDataSet;

                        //Show Probability
//                        System.out.println("Probability of Target");
//                        System.out.println(Probability1);
//                        System.out.println(Probability2);
//                        System.out.println(Probability3);

                        if (Probability1 > Probability2 && Probability1 > Probability3) {
                            dataTable.setValueAt("1.0", barisDataSekarang, 9);
                        } else if (Probability2 > Probability1 && Probability2 > Probability3) {
                            dataTable.setValueAt("2.0", barisDataSekarang, 9);
                        } else {
                            dataTable.setValueAt("3.0", barisDataSekarang, 9);
                        }
                        if (dataTable.getValueAt(barisDataSekarang, 8).equals(dataTable.getValueAt(barisDataSekarang, 9))) {
                            akurasi++;
                        }
                    }
                    //Hitung Akurasi
                    akurasi /= dataTable.getRowCount();
                    accuration.setText((akurasi * 100 + "").substring(0, 4) + "%");
                    error.setText((100 - (akurasi * 100) + "").substring(0, 4) + "%");

                } else {
                    JOptionPane.showMessageDialog(null, "Please insert data before start!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }//GEN-LAST:event_btnTestingActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void insertDataToTable(ArrayList<ArrayList> data) {
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        int i = 1;
        for (int row = 0; row < data.size() - 1; row++) {
            model.addRow(new Object[]{"", "", "", "", "", "", "", "", "", ""});
            int col = 0;
            dataTable.setValueAt(i + "", row, col++);
            for (int j = 0; j < 8; j++) {
                dataTable.setValueAt(data.get(i).get(j), row, col++);
            }
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accuration;
    private javax.swing.JButton btnTesting;
    private javax.swing.JButton btnTraining;
    private javax.swing.JTable dataTable;
    private javax.swing.JTextField error;
    private javax.swing.JTextField fileLocation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox methode;
    // End of variables declaration//GEN-END:variables

}

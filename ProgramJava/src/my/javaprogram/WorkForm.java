package my.javaprogram;

import java.awt.Desktop;
import javax.swing.ButtonGroup;
import java.util.*;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Row;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// класс, описывающий создание формы "Надежность информационных систем"
public class WorkForm extends javax.swing.JFrame {
    static String host,database,userlogin,password;
    int[] R = new int[8];
    int[] Tsumi = new int[8];
    double gamma, Tgamma, Treq1, Treq2,Ez;
    int n,m_max;
    public WorkForm(String phost,String pdatabase,String puserlogin,String ppassword) throws  Exception{
         host=phost;
         database=pdatabase;
         userlogin=puserlogin;
         password=ppassword;
         
         mdbc=new MyDBConnection(host,database,userlogin,password);
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
        
         initComponents();
         groupButton();
    }
    
    private void groupButton() {

        ButtonGroup bg1 = new ButtonGroup();

        bg1.add(jRadioButton1);
        bg1.add(jRadioButton2);
        bg1.add(jRadioButton3);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_for_n = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        box_for_y = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        box_for_Ty = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        box_for_Treq1 = new javax.swing.JTextField();
        box_for_Treq2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        box_for_R1 = new javax.swing.JTextField();
        box_for_R2 = new javax.swing.JTextField();
        box_for_R3 = new javax.swing.JTextField();
        box_for_R4 = new javax.swing.JTextField();
        box_for_R5 = new javax.swing.JTextField();
        box_for_R6 = new javax.swing.JTextField();
        box_for_R7 = new javax.swing.JTextField();
        box_for_R8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        box_for_T1 = new javax.swing.JTextField();
        box_for_T2 = new javax.swing.JTextField();
        box_for_T3 = new javax.swing.JTextField();
        box_for_T4 = new javax.swing.JTextField();
        box_for_T5 = new javax.swing.JTextField();
        box_for_T6 = new javax.swing.JTextField();
        box_for_T7 = new javax.swing.JTextField();
        box_for_T8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        input_box_for_m = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_box_for_E = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        box_for_Ti1 = new javax.swing.JTextField();
        box_for_Ti2 = new javax.swing.JTextField();
        box_for_Ti3 = new javax.swing.JTextField();
        box_for_Ti4 = new javax.swing.JTextField();
        box_for_Ti5 = new javax.swing.JTextField();
        box_for_Ti6 = new javax.swing.JTextField();
        box_for_Ti7 = new javax.swing.JTextField();
        box_for_Ti8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        box_for_T = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        box_for_Ts = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        box_M_after_ex = new javax.swing.JTextField();
        box_E_after_ex = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        box_for_Ts1_after_ex = new javax.swing.JTextField();
        box_for_Ts2_after_ex = new javax.swing.JTextField();
        box_for_Ts3_after_ex = new javax.swing.JTextField();
        box_for_Ts4_after_ex = new javax.swing.JTextField();
        box_for_Ts5_after_ex = new javax.swing.JTextField();
        box_for_Ts6_after_ex = new javax.swing.JTextField();
        box_for_Ts7_after_ex = new javax.swing.JTextField();
        box_for_Ts8_after_ex = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        box_for_T_after_ex = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        box_for_Tmin = new javax.swing.JTextField();
        box_for_Tmax = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        box_for_Tb = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        box_for_Ttop = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        box_for_gamma1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        box_for_gamma2 = new javax.swing.JTextField();
        btn_execute = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Надежность информационных систем");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setText("Расчетно-экспериментальный метод оценки показателей надежности изделися по результатам кратковременных испытаний");

        jLabel2.setText("Количество блоков изделия (n)");

        box_for_n.setEditable(false);
        box_for_n.setMinimumSize(new java.awt.Dimension(15, 30));

        jLabel3.setText("Вероятность точечной оценки (Y)");

        box_for_y.setEditable(false);
        box_for_y.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_y.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel4.setText("Ty");

        box_for_Ty.setEditable(false);
        box_for_Ty.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ty.setPreferredSize(new java.awt.Dimension(15, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Выбор задачи", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jRadioButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jRadioButton1.setText("Задание 1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jRadioButton2.setText("Задание 2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jRadioButton3.setText("Задание 3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jRadioButton2.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setText("Требуемое значение показателя надежности (Ттреб)");

        box_for_Treq1.setEditable(false);
        box_for_Treq1.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Treq1.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Treq2.setEditable(false);
        box_for_Treq2.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Treq2.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel6.setText("Число зафиксированных отказов блоков (Ri)");

        box_for_R1.setEditable(false);
        box_for_R1.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_R2.setEditable(false);
        box_for_R2.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_R3.setEditable(false);
        box_for_R3.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_R4.setEditable(false);
        box_for_R4.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_R5.setEditable(false);
        box_for_R5.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_R6.setEditable(false);
        box_for_R6.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_R7.setEditable(false);
        box_for_R7.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_R8.setEditable(false);
        box_for_R8.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel7.setText("Наработка блоков за период испытания (Tsi) j=0");

        box_for_T1.setEditable(false);
        box_for_T1.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_T2.setEditable(false);
        box_for_T2.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_T3.setEditable(false);
        box_for_T3.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_T4.setEditable(false);
        box_for_T4.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_T5.setEditable(false);
        box_for_T5.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_T6.setEditable(false);
        box_for_T6.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_T7.setEditable(false);
        box_for_T7.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_T8.setEditable(false);
        box_for_T8.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Максимально допустимое число проведенных статистических экспериментов (m max)");

        input_box_for_m.setToolTipText("");
        input_box_for_m.setPreferredSize(new java.awt.Dimension(20, 30));
        input_box_for_m.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                input_box_for_mInputMethodTextChanged(evt);
            }
        });
        input_box_for_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_box_for_mKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("Требуемая точность оценки (E задан)");

        input_box_for_E.setPreferredSize(new java.awt.Dimension(20, 30));
        input_box_for_E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_box_for_EKeyPressed(evt);
            }
        });

        jLabel10.setText("Средняя наработка блоков на отказ (Ti)");

        box_for_Ti1.setEditable(false);
        box_for_Ti1.setPreferredSize(new java.awt.Dimension(20, 30));

        box_for_Ti2.setEditable(false);
        box_for_Ti2.setPreferredSize(new java.awt.Dimension(20, 30));

        box_for_Ti3.setEditable(false);
        box_for_Ti3.setPreferredSize(new java.awt.Dimension(20, 30));

        box_for_Ti4.setEditable(false);
        box_for_Ti4.setPreferredSize(new java.awt.Dimension(20, 30));

        box_for_Ti5.setEditable(false);
        box_for_Ti5.setPreferredSize(new java.awt.Dimension(20, 30));
        box_for_Ti5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_for_Ti5ActionPerformed(evt);
            }
        });

        box_for_Ti6.setEditable(false);
        box_for_Ti6.setPreferredSize(new java.awt.Dimension(20, 30));

        box_for_Ti7.setEditable(false);
        box_for_Ti7.setPreferredSize(new java.awt.Dimension(20, 30));

        box_for_Ti8.setEditable(false);
        box_for_Ti8.setPreferredSize(new java.awt.Dimension(20, 30));

        jLabel11.setText("Cредняя наработка на отказ всего изделия (T) j=0");

        box_for_T.setEditable(false);
        box_for_T.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_T.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel12.setText("Общая наработка изделия (Ts)");

        jLabel13.setText("Число проведенных статистических экспериментов (m)");

        box_for_Ts.setEditable(false);
        box_for_Ts.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel14.setText("Точность оценки (E)");

        box_M_after_ex.setEditable(false);
        box_M_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_M_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        box_E_after_ex.setEditable(false);
        box_E_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_E_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel15.setText("Наработка блоков за период испытания (Tsi) j=m");

        box_for_Ts1_after_ex.setEditable(false);
        box_for_Ts1_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts1_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Ts2_after_ex.setEditable(false);
        box_for_Ts2_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts2_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));
        box_for_Ts2_after_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_for_Ts2_after_exActionPerformed(evt);
            }
        });

        box_for_Ts3_after_ex.setEditable(false);
        box_for_Ts3_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts3_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Ts4_after_ex.setEditable(false);
        box_for_Ts4_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts4_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Ts5_after_ex.setEditable(false);
        box_for_Ts5_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts5_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Ts6_after_ex.setEditable(false);
        box_for_Ts6_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts6_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Ts7_after_ex.setEditable(false);
        box_for_Ts7_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts7_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Ts8_after_ex.setEditable(false);
        box_for_Ts8_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_Ts8_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel16.setText("Средняя наработка на отказ всего изделия (T) j=m");

        box_for_T_after_ex.setEditable(false);
        box_for_T_after_ex.setMinimumSize(new java.awt.Dimension(15, 30));
        box_for_T_after_ex.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel17.setText("Смоделированные значения наработки на отказ");

        jLabel18.setText("Tsmin");

        jLabel19.setText("Tsmax");

        box_for_Tmin.setEditable(false);
        box_for_Tmin.setPreferredSize(new java.awt.Dimension(15, 30));

        box_for_Tmax.setEditable(false);
        box_for_Tmax.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel20.setText("Границы доверительного интервала");

        jLabel21.setText("ТН");

        box_for_Tb.setEditable(false);
        box_for_Tb.setPreferredSize(new java.awt.Dimension(15, 30));

        jLabel22.setText("ТВ");

        box_for_Ttop.setEditable(false);

        jLabel23.setText("Вероятность определения верхней и нижней границы интервальной оценки");

        jLabel24.setText("Y1");

        box_for_gamma1.setEditable(false);

        jLabel25.setText("Y2");

        box_for_gamma2.setEditable(false);

        btn_execute.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_execute.setText("Вычислить");
        btn_execute.setEnabled(false);
        btn_execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_executeActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setText("Ручной ввод");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Добавить в БД");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Отобразить БД");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel26.setText("Комментарий");

        Description.setColumns(20);
        Description.setRows(5);
        Description.setEnabled(false);
        jScrollPane1.setViewportView(Description);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox2.setText("Загрузка из БД");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setEnabled(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Номер задачи");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Загрузить");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addGap(18, 18, 18)
                                            .addComponent(box_for_Tb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel22)
                                            .addGap(29, 29, 29)
                                            .addComponent(box_for_Ttop, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_Tmin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(box_for_Tmax, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(571, 571, 571))
                                .addComponent(jLabel20))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_Treq1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_Treq2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_n, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_y, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_Ty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel26)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(26, 26, 26)
                                            .addComponent(box_for_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_T1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(box_for_T2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_T3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_T4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_T5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_T6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_T7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_T8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(box_for_R2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_R3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_R4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_R5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_R6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_R7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_R8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(input_box_for_m, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(input_box_for_E))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_Ti1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_for_Ti2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_for_Ti3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_for_Ti4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_for_Ti5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_for_Ti6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_for_Ti7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(box_for_Ti8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_for_T, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_for_Ts, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(218, 218, 218)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_gamma1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(box_for_gamma2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(15, 15, 15)
                                        .addComponent(box_for_Ts1_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_Ts2_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(box_for_Ts3_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_Ts4_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_M_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_T_after_ex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_E_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(box_for_Ts5_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_Ts6_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(box_for_Ts7_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_Ts8_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCheckBox2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_execute, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {box_for_R1, box_for_R2, box_for_R3, box_for_R4, box_for_R5, box_for_R6, box_for_R7, box_for_R8, box_for_T1, box_for_T2, box_for_T3, box_for_T4, box_for_T5, box_for_T6, box_for_T7, box_for_T8, box_for_T_after_ex, box_for_Ti1, box_for_Ti2, box_for_Ti3, box_for_Ti4, box_for_Ti5, box_for_Ti6, box_for_Ti7, box_for_Ti8, box_for_Treq1, box_for_Treq2, box_for_Ts1_after_ex, box_for_Ts2_after_ex, box_for_Ts3_after_ex, box_for_Ts4_after_ex, box_for_Ts5_after_ex, box_for_Ts6_after_ex, box_for_Ts7_after_ex, box_for_Ts8_after_ex, box_for_Ty});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(box_for_Ts1_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_Ts2_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_Ts3_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_Ts4_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_Ts5_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_Ts6_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_Ts7_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_Ts8_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(box_for_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(box_for_Ty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_for_n, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(box_for_Treq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_for_Treq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(box_for_R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(box_for_T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(input_box_for_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(input_box_for_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(box_for_Ti1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Ti2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Ti3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Ti4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Ti5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Ti6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Ti7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Ti8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(box_for_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(box_for_Ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_E_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box_M_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(box_for_T_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(box_for_Tmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Tmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_gamma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(box_for_gamma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(box_for_Tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(box_for_Ttop)
                    .addComponent(btn_execute, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {box_M_after_ex, box_for_R1, box_for_R2, box_for_R3, box_for_R4, box_for_R5, box_for_R6, box_for_R7, box_for_R8, box_for_T, box_for_T1, box_for_T2, box_for_T3, box_for_T4, box_for_T5, box_for_T6, box_for_T7, box_for_T8, box_for_T_after_ex, box_for_Tb, box_for_Ti1, box_for_Ti2, box_for_Ti3, box_for_Ti4, box_for_Ti5, box_for_Ti6, box_for_Ti7, box_for_Ti8, box_for_Tmax, box_for_Tmin, box_for_Treq1, box_for_Treq2, box_for_Ts, box_for_Ts1_after_ex, box_for_Ts2_after_ex, box_for_Ts3_after_ex, box_for_Ts4_after_ex, box_for_Ts5_after_ex, box_for_Ts6_after_ex, box_for_Ts7_after_ex, box_for_Ts8_after_ex, box_for_Ttop, box_for_Ty, box_for_gamma1, box_for_gamma2, box_for_n, box_for_y, input_box_for_E, input_box_for_m});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void box_for_Ts2_after_exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_for_Ts2_after_exActionPerformed

    }//GEN-LAST:event_box_for_Ts2_after_exActionPerformed

    // начальная инициализация выбранным набором данных
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
     
        R[0] = 4;
        R[1] = 3;
        R[2] = 0;
        R[3] = 0;
        R[4] = 1;
        R[5] = 0;
        R[6] = 0;
        R[7] = 1;

        Tsumi[0] = 377;
        Tsumi[1] = 381;
        Tsumi[2] = 320;
        Tsumi[3] = 327;
        Tsumi[4] = 336;
        Tsumi[5] = 387;
        Tsumi[6] = 375;
        Tsumi[7] = 329;
        if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()) {   //проверяем , введены ли значения для m или E 
            btn_execute.setEnabled(true);                                                     //чтобы сделать кнопку "Выполнить" активной
        }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        R[0] = 3;
        R[1] = 0;
        R[2] = 2;
        R[3] = 4;
        R[4] = 2;
        R[5] = 0;
        R[6] = 1;
        R[7] = 1;

        Tsumi[0] = 180;
        Tsumi[1] = 144;
        Tsumi[2] = 169;
        Tsumi[3] = 143;
        Tsumi[4] = 162;
        Tsumi[5] = 167;
        Tsumi[6] = 143;
        Tsumi[7] = 176;

        if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()) {
            btn_execute.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        R[0] = 3;
        R[1] = 1;
        R[2] = 0;
        R[3] = 0;
        R[4] = 0;
        R[5] = 1;
        R[6] = 3;
        R[7] = 2;

        Tsumi[0] = 160;
        Tsumi[1] = 187;
        Tsumi[2] = 143;
        Tsumi[3] = 129;
        Tsumi[4] = 126;
        Tsumi[5] = 121;
        Tsumi[6] = 200;
        Tsumi[7] = 157;

        if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()) {
            btn_execute.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    // проверка на заполнение данными поля для максимального числа статистических экспериментов
    private void input_box_for_EKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_box_for_EKeyPressed
        // действие  при введении данных в поля n и E
        if (jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()) {  // проверяем или выбран вариант

            if (input_box_for_E.getText().toString() == "" || input_box_for_m.getText().toString() == "") {  //проверяем не пусты ли  поля   m и E
                btn_execute.setEnabled(true);                                                           //и делаем кнопку доступной
            } else {
                btn_execute.setEnabled(false);
            }
        }
    }//GEN-LAST:event_input_box_for_EKeyPressed

    // действия по нажатию кнопки "Выполнить"
    private void btn_executeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_executeActionPerformed
        // Заполение данными
        double Eps = 0, F, T;
        int i, j, s, m;
        j = 0;  // номер эксперемента . фиксируем 0 
        double[] Tsum, Ti, Tlast_sumi;   // 
        Tsum = new double[8];
        Ti = new double[8];
        Tlast_sumi = new double[8];
        List<Double> Tsumj = new ArrayList<Double>();
        if (!input_box_for_E.getText().isEmpty()) {
            Ez = Double.parseDouble(input_box_for_E.getText());  // читаем из поля ввода значение для E
        } else {
            Ez = 1;
        }
        if (Ez == 0) {
            Ez = 1;
        }
        if (!input_box_for_m.getText().isEmpty()) {
            m_max = Integer.parseInt(input_box_for_m.getText());  // читаем из поля ввода значение для m
        } else {
            m_max = 50000;
        }
        T = 0;
        if (jCheckBox1.isSelected())
        {
           fill_initial_hand_forms();
        }
        else
        {
        n=8;
        gamma = 0.85;
        Tgamma = 1.4;
        Treq1 = 200;
        Treq2 = 400;
        fill_initial_forms();    // вставляем в поля начальные значения
        }
        for (i = 0; i < n; i++) {     // Вычисляем значения  для массива T(i)  по формуле (1)
            if (R[i] > 0) {
                Ti[i] = Tsumi[i] / R[i];
            } else {
                Ti[i] = Tsumi[i] * 1.44;
            }
            T = T + 1 / Ti[i];     // формула (1)
        }
        T = 1 / T;  // формула (1)
        Tsumj.add(0, T);   // добавляем  значение   в массив Tsum(i) 
        fill_forms_after_first_interation(Ti, T);   // записываем значения T(i) и T в поля формы
        do {   // теперь выполняется условие из пункта (2) , начинаем цикл , пока не достигнем одного из показателей
            j += 1;   //пункт (14)
            for (i = 0; i < n; i++) {  // пункт (4)  
                if (R[i] == 0) {
                    Tlast_sumi[i] = Ti[i];   // чтобы не создавать двойной массив T(i,j)  создаём одномерный массив T(i) для текущего j
                } else {
                    s = 1;    // пункт 5
                    F = 0;
                    do {
                        F += Math.log((Math.random())); //пункт 6 
                        s = s + 1;
                    } while (s < R[i]);  //пункт 7
                    Tlast_sumi[i] = (-1) * Ti[i] / F;  // пункт 8 
                }

            }
            Tsumj.add(0.); // доваляем новый элемент в массив для j
            for (i = 0; i < n; i++) {
                Double b = 1 / Tlast_sumi[i] + Tsumj.get(j);  // формула(3) пункт (10) 
                Tsumj.set(j, b);                     // присваиваем созданному элементу значение 
            }
            Tsumj.set(j, 1 / Tsumj.get(j));    // переводим в -1 степень  в формуле (3)
            if (j % 100 == 0) {                       //пункт (12)
                Double Temp1, Temp2;
                Temp1 = Temp2 = 0.;
                for (i = 1; i <= j; i++) {
                    Temp1 = Tsumj.get(i) + Temp1;   //  из  формулы (4)  вычисляем первую сумму
                    Temp2 += Tsumj.get(i) * Tsumj.get(i);    // из (4) вычисляем сумму квадратов 
                }
                Eps = Tgamma * Math.sqrt((Math.pow(Temp1, -2) * Temp2 - 1 / j) * (j / (j - 1)));   // формула (4)
            }
        } while (Eps <= Ez && j < m_max);     // условие выхода из цикла   пункт 13
        m = j;   //пункт  14
        T = 0;
        for (s = 0; s < n; s++) {
            T += 1 / Tlast_sumi[s];   // формула (1)  для последнего j 
        }
        T = 1 / T;   // формула (1)
        fill_forms_after_last_iteration(Tlast_sumi, T);   // заполняем поля в форме для последнего  T(i) и T
        Collections.sort(Tsumj);   // пункт 16 , сортируем массив 
        //       Arrays.sort(Tsumj, 0, m);
        double gamma1, gamma2;    // вероятности определения верхней(gamma2) и нижней(gamma1) границы  интервальной оценки 
        Double Tb, Tt;
        gamma1 = (1 - gamma) / 2;  //формула 5  пункт  17
        gamma2 = (1 + gamma) / 2;   //формула 5  пункт  17
        int bottom = ((Double) (m * gamma1)).intValue();   //верхняя и нижняя  границы доверительного интервала  пункт 18  
        int top = ((Double) (m * gamma2)).intValue();
        Tb = Tsumj.get(bottom);              // значения  верхней и нижней границ интервала 
        Tt = Tsumj.get(top);
        box_for_gamma1.setText(String.valueOf(round(gamma1,4)));    // заполняем поля соответсвующие значениям 
        box_for_gamma2.setText(String.valueOf(round(gamma2,4)));    // заполняем поля соответсвующие значениям 
        box_for_Tmin.setText(String.valueOf(round(Tsumj.get(0),4)));        // заполняем поля соответсвующие значениям 
        Double max = Collections.max(Tsumj);    // находим максимальный элемент массива 
        box_for_Tmax.setText(String.valueOf(round(max,4)));    // заполняем поля соответсвующие значениям 
        box_for_Tb.setText(String.valueOf(round(Tb,4)));       // заполняем поля соответсвующие значениям 
        box_for_Ttop.setText(String.valueOf(round(Tt,4)));      // заполняем поля соответсвующие значениям 
        box_M_after_ex.setText(String.valueOf(m));     // заполняем поля соответсвующие значениям 
        box_E_after_ex.setText(String.valueOf(round(Eps,4)));    // заполняем поля соответсвующие значениям 
        Double stepT = (max - Tsumj.get(0)) / 20;         //   находим разницу между max i min элементами массива и делим на 20 чтобы   
        // найти шаг прохода по  вариационному ряду ,чтобы получить равные значения интервалов
        double[] T_diagram = new double[20];             // границы интервалов из вариационного ряда 
        T_diagram[0] = Tsumj.get(0) + stepT;             //  граница первого интервала
        for (i = 1; i < 20; i++) {
            T_diagram[i] = T_diagram[i - 1] + stepT;     // заполняем массив интервалами         
        }
        int[] count = new int[20];                      //   массив для записей  чисел  реализаций статистических испытаний, в которых было получено 
        // время из  одного интервала
        j = 0;
        int j1 = Tsumj.size() - 1;                          // размер массива
        for (i = 0; i < j1; i++) {
            if (Tsumj.get(i) > T_diagram[j]) {                // проверяем , не выходят ли значения за интервал            
                j += 1;
            }
            count[j] += 1;
        }
        insert_to_Excel(T_diagram, count);    // передаём значения  двух столбцов   для последующей  передачи в Excel 
        infoBox("Executing!","Message");
        empty_text();
    }//GEN-LAST:event_btn_executeActionPerformed

    // проверка на заполнение данными поля для точности оценки
    private void input_box_for_mKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_box_for_mKeyPressed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()) {  // проверяем или выбран вариант

            if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()) {  //проверяем не пусты ли  поля  У n и E
                btn_execute.setEnabled(true);
            } else {
                btn_execute.setEnabled(false);
            }
        }

    }//GEN-LAST:event_input_box_for_mKeyPressed

    private void box_for_Ti5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_for_Ti5ActionPerformed

    }//GEN-LAST:event_box_for_Ti5ActionPerformed

    private void input_box_for_mInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_input_box_for_mInputMethodTextChanged

    }//GEN-LAST:event_input_box_for_mInputMethodTextChanged

    //активация ручного ввода
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected())
        {
            jComboBox1.setEnabled(false);
            jButton3.setEnabled(false);
            jCheckBox2.setEnabled(false);
            Description.setEnabled(true);
            jButton1.setEnabled(true);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jRadioButton3.setEnabled(false);
            box_for_n.setEditable(true);
            box_for_y.setEditable(true);
            box_for_Ty.setEditable(true);
            box_for_Treq1.setEditable(true);
            box_for_Treq2.setEditable(true);
            box_for_R1.setEditable(true);
            box_for_R2.setEditable(true);
            box_for_R3.setEditable(true);
            box_for_R4.setEditable(true);
            box_for_R5.setEditable(true);
            box_for_R6.setEditable(true);
            box_for_R7.setEditable(true);
            box_for_R8.setEditable(true);
            box_for_T1.setEditable(true);
            box_for_T2.setEditable(true);
            box_for_T3.setEditable(true);
            box_for_T4.setEditable(true);
            box_for_T5.setEditable(true);
            box_for_T6.setEditable(true);
            box_for_T7.setEditable(true);
            box_for_T8.setEditable(true);
            btn_execute.setEnabled(true);
            empty_text();
        }
        else
        {
            jCheckBox2.setEnabled(true);
            Description.setEnabled(false);
            jButton1.setEnabled(false);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
            jRadioButton3.setEnabled(true);
            box_for_n.setEditable(false);
            box_for_y.setEditable(false);
            box_for_Ty.setEditable(false);
            box_for_Treq1.setEditable(false);
            box_for_Treq2.setEditable(false);
            box_for_R1.setEditable(false);
            box_for_R2.setEditable(false);
            box_for_R3.setEditable(false);
            box_for_R4.setEditable(false);
            box_for_R5.setEditable(false);
            box_for_R6.setEditable(false);
            box_for_R7.setEditable(false);
            box_for_R8.setEditable(false);
            box_for_T1.setEditable(false);
            box_for_T2.setEditable(false);
            box_for_T3.setEditable(false);
            box_for_T4.setEditable(false);
            box_for_T5.setEditable(false);
            box_for_T6.setEditable(false);
            box_for_T7.setEditable(false);
            box_for_T8.setEditable(false);
            btn_execute.setEnabled(false);
            empty_text();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    //функция добавления в БД введенных данных
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        btn_execute.setEnabled(true);
        String Descr=Description.getText();
        int N=Integer.parseInt(box_for_n.getText());      
        float Y=Float.parseFloat(box_for_y.getText());
        float Ty=Float.parseFloat(box_for_Ty.getText());
        float Ttreb1=Float.parseFloat(box_for_Treq1.getText());
        float Ttreb2=Float.parseFloat(box_for_Treq2.getText());
        int R1=Integer.parseInt(box_for_R1.getText());
        int R2=Integer.parseInt(box_for_R2.getText());
        int R3=Integer.parseInt(box_for_R3.getText());
        int R4=Integer.parseInt(box_for_R4.getText());
        int R5=Integer.parseInt(box_for_R5.getText());
        int R6=Integer.parseInt(box_for_R6.getText());
        int R7=Integer.parseInt(box_for_R7.getText());
        int R8=Integer.parseInt(box_for_R8.getText());
        int Ts1=Integer.parseInt(box_for_T1.getText());
        int Ts2=Integer.parseInt(box_for_T2.getText());
        int Ts3=Integer.parseInt(box_for_T3.getText());
        int Ts4=Integer.parseInt(box_for_T4.getText());
        int Ts5=Integer.parseInt(box_for_T5.getText());
        int Ts6=Integer.parseInt(box_for_T6.getText());
        int Ts7=Integer.parseInt(box_for_T7.getText());
        int Ts8=Integer.parseInt(box_for_T8.getText());
        int Mmax=Integer.parseInt(input_box_for_m.getText());
        double Ezadan=Double.parseDouble(input_box_for_E.getText());
        
        String insertStr="";
        
        try{
            
            insertStr="insert into task (Description,N, Y, Ty, Ttreb1, Ttreb2,R1,R2,R3,R4,R5,R6,R7,R8,Ts1,Ts2,Ts3,Ts4,Ts5,Ts6,Ts7,Ts8,Mmax,Ezadan) values("
                    + "'" + Descr + "'" + "," + N +"," + Y + "," + Ty + "," + Ttreb1 + "," + Ttreb2 + "," + R1 + "," + R2 + "," 
                    + R3 + "," + R4 + "," + R5 + "," + R6 + "," + R7 + "," + R8 + "," + Ts1 + "," 
                    + Ts2 + "," + Ts3 + "," + Ts4 + "," + Ts5 + "," + Ts6 + "," + Ts7 + "," + Ts8 + "," + Mmax + "," + Ezadan + ")";

            
            int done=stmt.executeUpdate(insertStr);
            infoBox("1 row inserted","Message");
        
        }
        catch(Exception e){
            infoBox("Error occurred in inserting data","Alert");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        mdbc.close(stmt);
        mdbc.destroy();        
    }//GEN-LAST:event_formWindowClosing

     //функция отображения формы с данными БД
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            TaskTableView win = new TaskTableView(host,database,userlogin,password);
            win.setLocationRelativeTo(null);
            win.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(WorkForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //функция активации загрузки из БД
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) 
        {
            fillComboBox();
            jComboBox1.setEnabled(true);
            jButton3.setEnabled(true);
            input_box_for_m.setEditable(false);
            input_box_for_E.setEditable(false);
            btn_execute.setEnabled(true);
        }
        else {
            btn_execute.setEnabled(false);
            jComboBox1.removeAllItems();
            jComboBox1.setEnabled(false);
            jButton3.setEnabled(false);
            input_box_for_m.setEditable(true);
            input_box_for_E.setEditable(true);
            empty_text();
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    
    //функция загрузки БД в comboBox
    private void fillComboBox()
    {
        try{
            String sql = "Select NumberTask from task";
            ResultSet rs=null;
           // mdbc=new MyDBConnection(host,database,userlogin,password);
           // mdbc.init();
            Connection conn=mdbc.getMyConnection();
            stmt= conn.createStatement();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery(sql);
            
            while(rs.next())
            {
                int value = rs.getInt("NumberTask");
                jComboBox1.addItem(Integer.toString(value));
            }
            //mdbc.close(stmt);
        }
        catch(Exception e){
            infoBox("Error occurred in loading data","Alert");
            e.printStackTrace();
        }
    }
    
    //загрузка данных из БД
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            int numberTask = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            String sql = "Select * from task where NumberTask="+numberTask;
            ResultSet rs=null;
            Connection conn=mdbc.getMyConnection();
            stmt= conn.createStatement();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery(sql);
            
            while(rs.next())
            {
                Description.setText(String.valueOf(rs.getString("Description")));
                box_for_n.setText(String.valueOf(rs.getInt("N")));
                box_for_Treq1.setText(String.valueOf(rs.getDouble("Ttreb1")));
                box_for_Treq2.setText(String.valueOf(rs.getDouble("Ttreb2")));
                box_for_y.setText(String.valueOf(rs.getDouble("Y")));
                box_for_Ty.setText(String.valueOf(rs.getDouble("Ty")));

                box_for_R1.setText(String.valueOf(rs.getInt("R1")));
                box_for_R2.setText(String.valueOf(rs.getInt("R2")));
                box_for_R3.setText(String.valueOf(rs.getInt("R3")));
                box_for_R4.setText(String.valueOf(rs.getInt("R4")));
                box_for_R5.setText(String.valueOf(rs.getInt("R5")));
                box_for_R6.setText(String.valueOf(rs.getInt("R6")));
                box_for_R7.setText(String.valueOf(rs.getInt("R7")));
                box_for_R8.setText(String.valueOf(rs.getInt("R8")));

                box_for_T1.setText(String.valueOf(rs.getInt("Ts1")));
                box_for_T2.setText(String.valueOf(rs.getInt("Ts2")));
                box_for_T3.setText(String.valueOf(rs.getInt("Ts3")));
                box_for_T4.setText(String.valueOf(rs.getInt("Ts4")));
                box_for_T5.setText(String.valueOf(rs.getInt("Ts5")));
                box_for_T6.setText(String.valueOf(rs.getInt("Ts6")));
                box_for_T7.setText(String.valueOf(rs.getInt("Ts7")));
                box_for_T8.setText(String.valueOf(rs.getInt("Ts8"))); 
                
                input_box_for_m.setText(String.valueOf(rs.getInt("Mmax"))); 
                input_box_for_E.setText(String.valueOf(rs.getDouble("Ezadan")));
                
                n=Integer.parseInt(box_for_n.getText());
                Treq1=Double.parseDouble(box_for_Treq1.getText());
                Treq2=Double.parseDouble(box_for_Treq2.getText());
                gamma=Double.parseDouble(box_for_y.getText());
                Tgamma=Double.parseDouble(box_for_Ty.getText());

                R[0]=Integer.parseInt(box_for_R1.getText());
                R[1]=Integer.parseInt(box_for_R2.getText());
                R[2]=Integer.parseInt(box_for_R3.getText());
                R[3]=Integer.parseInt(box_for_R4.getText());
                R[4]=Integer.parseInt(box_for_R5.getText());
                R[5]=Integer.parseInt(box_for_R6.getText());
                R[6]=Integer.parseInt(box_for_R7.getText());
                R[7]=Integer.parseInt(box_for_R8.getText());

                Tsumi[0]=Integer.parseInt(box_for_T1.getText());
                Tsumi[1]=Integer.parseInt(box_for_T2.getText());
                Tsumi[2]=Integer.parseInt(box_for_T3.getText());
                Tsumi[3]=Integer.parseInt(box_for_T4.getText());
                Tsumi[4]=Integer.parseInt(box_for_T5.getText());
                Tsumi[5]=Integer.parseInt(box_for_T6.getText());
                Tsumi[6]=Integer.parseInt(box_for_T7.getText());
                Tsumi[7]=Integer.parseInt(box_for_T8.getText());
                
                m_max=Integer.parseInt(input_box_for_m.getText());
                Ez=Double.parseDouble(input_box_for_E.getText());
            }
        }
           
        catch(Exception e){
            infoBox("Error occurred in loading data","Alert");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
   
    // очистка полей ввода и вывода
    private void empty_text()
    {   
            Description.setText("");
            box_for_n.setText("");
            box_for_y.setText("");
            box_for_Ty.setText("");
            box_for_Treq1.setText("");
            box_for_Treq2.setText("");
            box_for_R1.setText("");
            box_for_R2.setText("");
            box_for_R3.setText("");
            box_for_R4.setText("");
            box_for_R5.setText("");
            box_for_R6.setText("");
            box_for_R7.setText("");
            box_for_R8.setText("");
            box_for_T1.setText("");
            box_for_T2.setText("");
            box_for_T3.setText("");
            box_for_T4.setText("");
            box_for_T5.setText("");
            box_for_T6.setText("");
            box_for_T7.setText("");
            box_for_T8.setText("");
            input_box_for_m.setText("");
            input_box_for_E.setText("");
            box_for_Ti1.setText("");
            box_for_Ti2.setText("");
            box_for_Ti3.setText("");
            box_for_Ti4.setText("");
            box_for_Ti5.setText("");
            box_for_Ti6.setText("");
            box_for_Ti7.setText("");
            box_for_Ti8.setText("");
            box_for_T.setText("");
            box_for_Ts.setText("");
            box_M_after_ex.setText("");
            box_E_after_ex.setText("");
            box_for_Ts1_after_ex.setText("");
            box_for_Ts2_after_ex.setText("");
            box_for_Ts3_after_ex.setText("");
            box_for_Ts4_after_ex.setText("");
            box_for_Ts5_after_ex.setText("");
            box_for_Ts6_after_ex.setText("");
            box_for_Ts7_after_ex.setText("");
            box_for_Ts8_after_ex.setText("");
            box_for_T_after_ex.setText("");
            box_for_Tmin.setText("");
            box_for_Tmax.setText("");
            box_for_Tb.setText("");
            box_for_Ttop.setText("");
            box_for_gamma1.setText("");
            box_for_gamma2.setText("");
    }
    
    // округление чисел до заданной величины
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    //заполнение полей в последней итерации
    private void fill_forms_after_last_iteration(double[] Tlast, double T) {
        box_for_Ts1_after_ex.setText(String.valueOf(round(Tlast[0],2)));
        box_for_Ts2_after_ex.setText(String.valueOf(round(Tlast[1],2)));
        box_for_Ts3_after_ex.setText(String.valueOf(round(Tlast[2],2)));
        box_for_Ts4_after_ex.setText(String.valueOf(round(Tlast[3],2)));
        box_for_Ts5_after_ex.setText(String.valueOf(round(Tlast[4],2)));
        box_for_Ts6_after_ex.setText(String.valueOf(round(Tlast[5],2)));
        box_for_Ts7_after_ex.setText(String.valueOf(round(Tlast[6],2)));
        box_for_Ts8_after_ex.setText(String.valueOf(round(Tlast[7],2)));
        box_for_T_after_ex.setText(String.valueOf(round(T,2)));
    }
    
    // заполнение полей в первой итерации
    private void fill_forms_after_first_interation(double[] Ti, double T) {
        box_for_Ti1.setText(String.valueOf(round(Ti[0],2)));
        box_for_Ti2.setText(String.valueOf(round(Ti[1],2)));
        box_for_Ti3.setText(String.valueOf(round(Ti[2],2)));
        box_for_Ti4.setText(String.valueOf(round(Ti[3],2)));
        box_for_Ti5.setText(String.valueOf(round(Ti[4],2)));
        box_for_Ti6.setText(String.valueOf(round(Ti[5],2)));
        box_for_Ti7.setText(String.valueOf(round(Ti[6],2)));
        box_for_Ti8.setText(String.valueOf(round(Ti[7],2)));

        box_for_T.setText(String.valueOf(round(T,2)));
        Double Ts = 0.;
        for (int i = 0; i < n; i++) {
            Ts += Ti[i];
        }
        box_for_Ts.setText(String.valueOf(round(Ts / 8,2)));
    }

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                       new WorkForm(host,database,userlogin,password).setVisible(true);
                    }
                catch(Exception e){
                }
            }
        });
    }
    
    public ResultSet getResultFromTask() {
        
        ResultSet rs=null;
        
        try{
            rs=stmt.executeQuery("Select * from task");
        
        }
        catch(SQLException e){}
        
        return rs;
        
    }
    
     private MyDBConnection mdbc;
     private java.sql.Statement stmt;
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Description;
    private javax.swing.JTextField box_E_after_ex;
    private javax.swing.JTextField box_M_after_ex;
    private javax.swing.JTextField box_for_R1;
    private javax.swing.JTextField box_for_R2;
    private javax.swing.JTextField box_for_R3;
    private javax.swing.JTextField box_for_R4;
    private javax.swing.JTextField box_for_R5;
    private javax.swing.JTextField box_for_R6;
    private javax.swing.JTextField box_for_R7;
    private javax.swing.JTextField box_for_R8;
    private javax.swing.JTextField box_for_T;
    private javax.swing.JTextField box_for_T1;
    private javax.swing.JTextField box_for_T2;
    private javax.swing.JTextField box_for_T3;
    private javax.swing.JTextField box_for_T4;
    private javax.swing.JTextField box_for_T5;
    private javax.swing.JTextField box_for_T6;
    private javax.swing.JTextField box_for_T7;
    private javax.swing.JTextField box_for_T8;
    private javax.swing.JTextField box_for_T_after_ex;
    private javax.swing.JTextField box_for_Tb;
    private javax.swing.JTextField box_for_Ti1;
    private javax.swing.JTextField box_for_Ti2;
    private javax.swing.JTextField box_for_Ti3;
    private javax.swing.JTextField box_for_Ti4;
    private javax.swing.JTextField box_for_Ti5;
    private javax.swing.JTextField box_for_Ti6;
    private javax.swing.JTextField box_for_Ti7;
    private javax.swing.JTextField box_for_Ti8;
    private javax.swing.JTextField box_for_Tmax;
    private javax.swing.JTextField box_for_Tmin;
    private javax.swing.JTextField box_for_Treq1;
    private javax.swing.JTextField box_for_Treq2;
    private javax.swing.JTextField box_for_Ts;
    private javax.swing.JTextField box_for_Ts1_after_ex;
    private javax.swing.JTextField box_for_Ts2_after_ex;
    private javax.swing.JTextField box_for_Ts3_after_ex;
    private javax.swing.JTextField box_for_Ts4_after_ex;
    private javax.swing.JTextField box_for_Ts5_after_ex;
    private javax.swing.JTextField box_for_Ts6_after_ex;
    private javax.swing.JTextField box_for_Ts7_after_ex;
    private javax.swing.JTextField box_for_Ts8_after_ex;
    private javax.swing.JTextField box_for_Ttop;
    private javax.swing.JTextField box_for_Ty;
    private javax.swing.JTextField box_for_gamma1;
    private javax.swing.JTextField box_for_gamma2;
    private javax.swing.JTextField box_for_n;
    private javax.swing.JTextField box_for_y;
    private javax.swing.JButton btn_execute;
    private javax.swing.JTextField input_box_for_E;
    private javax.swing.JTextField input_box_for_m;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    //заполнение полей из данных в наборе
    private void fill_initial_forms() {
        box_for_n.setText(String.valueOf(n));
        box_for_Treq1.setText(String.valueOf(Treq1));
        box_for_Treq2.setText(String.valueOf(Treq2));
        box_for_y.setText(String.valueOf(gamma));
        box_for_Ty.setText(String.valueOf(Tgamma));

        box_for_R1.setText(String.valueOf(R[0]));
        box_for_R2.setText(String.valueOf(R[1]));
        box_for_R3.setText(String.valueOf(R[2]));
        box_for_R4.setText(String.valueOf(R[3]));
        box_for_R5.setText(String.valueOf(R[4]));
        box_for_R6.setText(String.valueOf(R[5]));
        box_for_R7.setText(String.valueOf(R[6]));
        box_for_R8.setText(String.valueOf(R[7]));

        box_for_T1.setText(String.valueOf(Tsumi[0]));
        box_for_T2.setText(String.valueOf(Tsumi[1]));
        box_for_T3.setText(String.valueOf(Tsumi[2]));
        box_for_T4.setText(String.valueOf(Tsumi[3]));
        box_for_T5.setText(String.valueOf(Tsumi[4]));
        box_for_T6.setText(String.valueOf(Tsumi[5]));
        box_for_T7.setText(String.valueOf(Tsumi[6]));
        box_for_T8.setText(String.valueOf(Tsumi[7])); 
    }

    //заполнение полей из данных в наборе в ручную
    private void fill_initial_hand_forms() {
        n=Integer.parseInt(box_for_n.getText());
        Treq1=Double.parseDouble(box_for_Treq1.getText());
        Treq2=Double.parseDouble(box_for_Treq2.getText());
        gamma=Double.parseDouble(box_for_y.getText());
        Tgamma=Double.parseDouble(box_for_Ty.getText());

        R[0]=Integer.parseInt(box_for_R1.getText());
        R[1]=Integer.parseInt(box_for_R2.getText());
        R[2]=Integer.parseInt(box_for_R3.getText());
        R[3]=Integer.parseInt(box_for_R4.getText());
        R[4]=Integer.parseInt(box_for_R5.getText());
        R[5]=Integer.parseInt(box_for_R6.getText());
        R[6]=Integer.parseInt(box_for_R7.getText());
        R[7]=Integer.parseInt(box_for_R8.getText());

        Tsumi[0]=Integer.parseInt(box_for_T1.getText());
        Tsumi[1]=Integer.parseInt(box_for_T2.getText());
        Tsumi[2]=Integer.parseInt(box_for_T3.getText());
        Tsumi[3]=Integer.parseInt(box_for_T4.getText());
        Tsumi[4]=Integer.parseInt(box_for_T5.getText());
        Tsumi[5]=Integer.parseInt(box_for_T6.getText());
        Tsumi[6]=Integer.parseInt(box_for_T7.getText());
        Tsumi[7]=Integer.parseInt(box_for_T8.getText());
    }
    
    // создание Excel-файла
    private void insert_to_Excel(double mas1[], int mas2[]) {
        // создание самого excel файла в памяти
        HSSFWorkbook workbook = new HSSFWorkbook();
        // создание листа с названием "Лист"
        HSSFSheet sheet = workbook.createSheet("Лист");
        int rowNum = 0;
        Row row = sheet.createRow(rowNum);

        row.createCell(0).setCellValue("Mas1");
        row.createCell(1).setCellValue("Mas2");

        for (rowNum = 1; rowNum < 21; rowNum++) {
            row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(mas1[rowNum - 1]);
            row.createCell(1).setCellValue(mas2[rowNum - 1]);
        }

        String path = new File("").getAbsolutePath() + "Answer.xls";

        // удаляем файл, если он уже создан
        if (!(new File(path).exists())) {
            new File(path).delete();
        }

        // записываем созданный в памяти Excel документ в файл
        try (FileOutputStream out = new FileOutputStream(new File(path))) {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // открываем созданный файл
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.edit(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}



package calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void addNumero(String digito) {
        txtOperacion.setText(txtOperacion.getText() + digito);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_borrUlt = new javax.swing.JButton();
        btn_por = new javax.swing.JButton();
        bnt_div = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_res = new javax.swing.JButton();
        btn_sum = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 610));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(35, 36, 38));
        txtOperacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(35, 36, 38));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 380, 52));

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 58)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(35, 36, 38));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 390, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setBackground(new java.awt.Color(255, 255, 255));
        btn_igual.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setAlignmentY(0.0F);
        btn_igual.setBorder(null);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_igual.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 60, 60));

        btn_borrUlt.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrUlt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_borrUlt.setForeground(new java.awt.Color(35, 36, 38));
        btn_borrUlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_borrUlt.setText("CE");
        btn_borrUlt.setAlignmentY(0.0F);
        btn_borrUlt.setBorder(null);
        btn_borrUlt.setFocusPainted(false);
        btn_borrUlt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrUlt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_borrUlt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_borrUlt.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_borrUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrUltActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrUlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 60, 60));

        btn_por.setBackground(new java.awt.Color(255, 255, 255));
        btn_por.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_por.setForeground(new java.awt.Color(35, 36, 38));
        btn_por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_por.setText("%");
        btn_por.setAlignmentY(0.0F);
        btn_por.setBorder(null);
        btn_por.setFocusPainted(false);
        btn_por.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_por.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_por.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_por.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porActionPerformed(evt);
            }
        });
        jPanel2.add(btn_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 60, 60));

        bnt_div.setBackground(new java.awt.Color(255, 255, 255));
        bnt_div.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        bnt_div.setForeground(new java.awt.Color(35, 36, 38));
        bnt_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        bnt_div.setText("/");
        bnt_div.setAlignmentY(0.0F);
        bnt_div.setBorder(null);
        bnt_div.setFocusPainted(false);
        bnt_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bnt_div.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bnt_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        bnt_div.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        bnt_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_divActionPerformed(evt);
            }
        });
        jPanel2.add(bnt_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 60, 60));

        btn_mul.setBackground(new java.awt.Color(255, 255, 255));
        btn_mul.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_mul.setForeground(new java.awt.Color(35, 36, 38));
        btn_mul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_mul.setText("X");
        btn_mul.setAlignmentY(0.0F);
        btn_mul.setBorder(null);
        btn_mul.setFocusPainted(false);
        btn_mul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mul.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_mul.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_mul.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 60, 60));

        btn_res.setBackground(new java.awt.Color(255, 255, 255));
        btn_res.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_res.setForeground(new java.awt.Color(35, 36, 38));
        btn_res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_res.setText("-");
        btn_res.setAlignmentY(0.0F);
        btn_res.setBorder(null);
        btn_res.setFocusPainted(false);
        btn_res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_res.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_res.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_res.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resActionPerformed(evt);
            }
        });
        jPanel2.add(btn_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 60, 60));

        btn_sum.setBackground(new java.awt.Color(255, 255, 255));
        btn_sum.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_sum.setForeground(new java.awt.Color(35, 36, 38));
        btn_sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_sum.setText("+");
        btn_sum.setAlignmentY(0.0F);
        btn_sum.setBorder(null);
        btn_sum.setFocusPainted(false);
        btn_sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sum.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_sum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_sum.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 60, 60));

        btn_c.setBackground(new java.awt.Color(255, 255, 255));
        btn_c.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(35, 36, 38));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setAlignmentY(0.0F);
        btn_c.setBorder(null);
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_c.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        btn_0.setBackground(new java.awt.Color(255, 255, 255));
        btn_0.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(35, 36, 38));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setAlignmentY(0.0F);
        btn_0.setBorder(null);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_0.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 60, 60));

        btn_punto.setBackground(new java.awt.Color(255, 255, 255));
        btn_punto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(35, 36, 38));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setAlignmentY(0.0F);
        btn_punto.setBorder(null);
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_punto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 60, 60));

        btn_4.setBackground(new java.awt.Color(255, 255, 255));
        btn_4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(35, 36, 38));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setAlignmentY(0.0F);
        btn_4.setBorder(null);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 60));

        btn_5.setBackground(new java.awt.Color(255, 255, 255));
        btn_5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(35, 36, 38));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setAlignmentY(0.0F);
        btn_5.setBorder(null);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 60, 60));

        btn_6.setBackground(new java.awt.Color(255, 255, 255));
        btn_6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(35, 36, 38));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setAlignmentY(0.0F);
        btn_6.setBorder(null);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 60, 60));

        btn_1.setBackground(new java.awt.Color(255, 255, 255));
        btn_1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(35, 36, 38));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setAlignmentY(0.0F);
        btn_1.setBorder(null);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, 60));

        btn_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(35, 36, 38));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setAlignmentY(0.0F);
        btn_2.setBorder(null);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 60, 60));

        btn_3.setBackground(new java.awt.Color(255, 255, 255));
        btn_3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(35, 36, 38));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setAlignmentY(0.0F);
        btn_3.setBorder(null);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 60, 60));

        btn_7.setBackground(new java.awt.Color(255, 255, 255));
        btn_7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(35, 36, 38));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setAlignmentY(0.0F);
        btn_7.setBorder(null);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 60));

        btn_8.setBackground(new java.awt.Color(255, 255, 255));
        btn_8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(35, 36, 38));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setAlignmentY(0.0F);
        btn_8.setBorder(null);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, 60));

        btn_9.setBackground(new java.awt.Color(255, 255, 255));
        btn_9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(35, 36, 38));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setAlignmentY(0.0F);
        btn_9.setBorder(null);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1presion.png"))); // NOI18N
        btn_9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 420, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed

        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {
           // btn_c.doClick();
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_borrUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrUltActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_igual.doClick();
       
    }//GEN-LAST:event_btn_borrUltActionPerformed

    private void btn_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porActionPerformed
        addNumero("%");
       
    }//GEN-LAST:event_btn_porActionPerformed

    private void bnt_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_divActionPerformed
        addNumero("/");
        
    }//GEN-LAST:event_bnt_divActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
        addNumero("*");
        
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resActionPerformed
        addNumero("-");
        
    }//GEN-LAST:event_btn_resActionPerformed

    private void btn_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumActionPerformed
        addNumero("+");
       
    }//GEN-LAST:event_btn_sumActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumero("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed

        addNumero(".");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumero("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumero("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumero("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumero("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumero("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumero("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumero("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumero("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumero("9");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_div;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrUlt;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_por;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_res;
    private javax.swing.JButton btn_sum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}

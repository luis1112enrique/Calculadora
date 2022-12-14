/**
 * Integrantes del equipo de desarrollo:
 *   · Luis Enrique Hernández Torres
 *   · Francisco Ríos Rodríguez
 *   · Emiliano Monroy Cruz
 *   · Paula de la Isla Reyes
 *   · Carlos Huerta Varela
 * 
 * Fecha [última modificación]:
 *   · 21 de septiembre 2022
 * 
 * Proyecto:
 *   · Calculadora básica
 * 
 * Descripción de la clase:
 *   · Esta clase ejecuta la vista de la calculadora para que el usuario pueda
 *     utilizarla.
 */

public class VistaCalculadora extends javax.swing.JFrame {
    private String texto="";
    
    
    public VistaCalculadora() {
        initComponents();
    }
    
    private void setBarra(String esto){
        texto+=esto;
        BarrRes.setText(texto);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        BarrRes = new javax.swing.JTextField();
        MasBT = new javax.swing.JButton();
        MenosBt = new javax.swing.JButton();
        MultiBt = new javax.swing.JButton();
        DivBt = new javax.swing.JButton();
        ParAbiertoBt = new javax.swing.JButton();
        ParCerradoBt = new javax.swing.JButton();
        NueveBt = new javax.swing.JButton();
        OchoBt = new javax.swing.JButton();
        BorrarBt = new javax.swing.JButton();
        SieteBt = new javax.swing.JButton();
        SeisBt = new javax.swing.JButton();
        CincoBt = new javax.swing.JButton();
        CuatroBt = new javax.swing.JButton();
        TresBt = new javax.swing.JButton();
        DosBt = new javax.swing.JButton();
        UnoBt = new javax.swing.JButton();
        CeroBt = new javax.swing.JButton();
        IgualBt = new javax.swing.JButton();
        PuntoBt = new javax.swing.JButton();
        PotenciaBt = new javax.swing.JButton();
        MasMenosBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 32, 32));

        BarrRes.setForeground(new java.awt.Color(102, 102, 102));

        MasBT.setBackground(new java.awt.Color(123, 182, 164));
        MasBT.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        MasBT.setText("+");
        MasBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasBTActionPerformed(evt);
            }
        });

        MenosBt.setBackground(new java.awt.Color(123, 182, 164));
        MenosBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        MenosBt.setText("-");
        MenosBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosBtActionPerformed(evt);
            }
        });

        MultiBt.setBackground(new java.awt.Color(123, 182, 164));
        MultiBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        MultiBt.setText("x");
        MultiBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiBtActionPerformed(evt);
            }
        });

        DivBt.setBackground(new java.awt.Color(123, 182, 164));
        DivBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        DivBt.setText("/");
        DivBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivBtActionPerformed(evt);
            }
        });

        ParAbiertoBt.setBackground(new java.awt.Color(74, 134, 116));
        ParAbiertoBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        ParAbiertoBt.setText("(");
        ParAbiertoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParAbiertoBtActionPerformed(evt);
            }
        });

        ParCerradoBt.setBackground(new java.awt.Color(74, 134, 116));
        ParCerradoBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        ParCerradoBt.setText(")");
        ParCerradoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParCerradoBtActionPerformed(evt);
            }
        });

        NueveBt.setBackground(new java.awt.Color(51, 51, 51));
        NueveBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        NueveBt.setForeground(new java.awt.Color(255, 255, 255));
        NueveBt.setText("9");
        NueveBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveBtActionPerformed(evt);
            }
        });

        OchoBt.setBackground(new java.awt.Color(51, 51, 51));
        OchoBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        OchoBt.setForeground(new java.awt.Color(255, 255, 255));
        OchoBt.setText("8");
        OchoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoBtActionPerformed(evt);
            }
        });

        BorrarBt.setBackground(new java.awt.Color(38, 69, 59));
        BorrarBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        BorrarBt.setForeground(new java.awt.Color(255, 255, 255));
        BorrarBt.setText("C");
        BorrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBtActionPerformed(evt);
            }
        });

        SieteBt.setBackground(new java.awt.Color(51, 51, 51));
        SieteBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        SieteBt.setForeground(new java.awt.Color(255, 255, 255));
        SieteBt.setText("7");
        SieteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SieteBtActionPerformed(evt);
            }
        });

        SeisBt.setBackground(new java.awt.Color(51, 51, 51));
        SeisBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        SeisBt.setForeground(new java.awt.Color(255, 255, 255));
        SeisBt.setText("6");
        SeisBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisBtActionPerformed(evt);
            }
        });

        CincoBt.setBackground(new java.awt.Color(51, 51, 51));
        CincoBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        CincoBt.setForeground(new java.awt.Color(255, 255, 255));
        CincoBt.setText("5");
        CincoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoBtActionPerformed(evt);
            }
        });

        CuatroBt.setBackground(new java.awt.Color(51, 51, 51));
        CuatroBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        CuatroBt.setForeground(new java.awt.Color(255, 255, 255));
        CuatroBt.setText("4");
        CuatroBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroBtActionPerformed(evt);
            }
        });

        TresBt.setBackground(new java.awt.Color(51, 51, 51));
        TresBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        TresBt.setForeground(new java.awt.Color(255, 255, 255));
        TresBt.setText("3");
        TresBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresBtActionPerformed(evt);
            }
        });

        DosBt.setBackground(new java.awt.Color(51, 51, 51));
        DosBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        DosBt.setForeground(new java.awt.Color(255, 255, 255));
        DosBt.setText("2");
        DosBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosBtActionPerformed(evt);
            }
        });

        UnoBt.setBackground(new java.awt.Color(51, 51, 51));
        UnoBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        UnoBt.setForeground(new java.awt.Color(255, 255, 255));
        UnoBt.setText("1");
        UnoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoBtActionPerformed(evt);
            }
        });

        CeroBt.setBackground(new java.awt.Color(51, 51, 51));
        CeroBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        CeroBt.setForeground(new java.awt.Color(255, 255, 255));
        CeroBt.setText("0");
        CeroBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeroBtActionPerformed(evt);
            }
        });

        IgualBt.setBackground(new java.awt.Color(195, 222, 214));
        IgualBt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        IgualBt.setText("=");
        IgualBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualBtActionPerformed(evt);
            }
        });

        PuntoBt.setBackground(new java.awt.Color(51, 51, 51));
        PuntoBt.setForeground(new java.awt.Color(255, 255, 255));
        PuntoBt.setText(".");
        PuntoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoBtActionPerformed(evt);
            }
        });

        PotenciaBt.setBackground(new java.awt.Color(123, 182, 164));
        PotenciaBt.setText("^");
        PotenciaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaBtActionPerformed(evt);
            }
        });

        MasMenosBt.setBackground(new java.awt.Color(74, 134, 116));
        MasMenosBt.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        MasMenosBt.setText("Borrar");
        MasMenosBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasMenosBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UnoBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(CuatroBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SieteBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OchoBt, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(CincoBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DosBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(CeroBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NueveBt, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(TresBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SeisBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PuntoBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(BarrRes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MasBT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(MenosBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MultiBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DivBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PotenciaBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IgualBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorrarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ParCerradoBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MasMenosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ParAbiertoBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BorrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MasMenosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BarrRes))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(OchoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NueveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SieteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SeisBt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CincoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuatroBt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TresBt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ParAbiertoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ParCerradoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MasBT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MenosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MultiBt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DivBt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PotenciaBt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PuntoBt, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(IgualBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CeroBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NueveBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveBtActionPerformed
        // TODO add your handling code here:
        setBarra("9");
    }//GEN-LAST:event_NueveBtActionPerformed

    private void OchoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoBtActionPerformed
        // TODO add your handling code here:
        setBarra("8");
    }//GEN-LAST:event_OchoBtActionPerformed

    private void CincoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoBtActionPerformed
        // TODO add your handling code here:
        setBarra("5");
    }//GEN-LAST:event_CincoBtActionPerformed

    private void SeisBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisBtActionPerformed
        // TODO add your handling code here:
        setBarra("6");
    }//GEN-LAST:event_SeisBtActionPerformed

    private void SieteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SieteBtActionPerformed
        // TODO add your handling code here:
        setBarra("7");
    }//GEN-LAST:event_SieteBtActionPerformed

    private void DosBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosBtActionPerformed
        // TODO add your handling code here:
        setBarra("2");
    }//GEN-LAST:event_DosBtActionPerformed

    private void TresBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresBtActionPerformed
        // TODO add your handling code here:
        setBarra("3");
    }//GEN-LAST:event_TresBtActionPerformed

    private void CuatroBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroBtActionPerformed
        // TODO add your handling code here:
        setBarra("4");
    }//GEN-LAST:event_CuatroBtActionPerformed

    private void UnoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoBtActionPerformed
        // TODO add your handling code here:
        setBarra("1");
    }//GEN-LAST:event_UnoBtActionPerformed

    private void CeroBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeroBtActionPerformed
        // TODO add your handling code here:
        setBarra("0");
    }//GEN-LAST:event_CeroBtActionPerformed

    private void MasBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasBTActionPerformed
        // TODO add your handling code here:
        setBarra("+");
    }//GEN-LAST:event_MasBTActionPerformed

    private void MenosBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosBtActionPerformed
        // TODO add your handling code here:
       setBarra("-");
    }//GEN-LAST:event_MenosBtActionPerformed

    private void MultiBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiBtActionPerformed
        // TODO add your handling code here:
        setBarra("*");
    }//GEN-LAST:event_MultiBtActionPerformed

    private void DivBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivBtActionPerformed
        // TODO add your handling code here:
        setBarra("/");
    }//GEN-LAST:event_DivBtActionPerformed

    private void ParAbiertoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParAbiertoBtActionPerformed
        // TODO add your handling code here:
        setBarra("(");
    }//GEN-LAST:event_ParAbiertoBtActionPerformed

    private void ParCerradoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParCerradoBtActionPerformed
        // TODO add your handling code here:
        setBarra(")");
    }//GEN-LAST:event_ParCerradoBtActionPerformed

    private void IgualBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualBtActionPerformed
        // TODO add your handling code here:
        Calculadora c1=new Calculadora(texto);
        //try{
        texto=" "+c1.procesarExpresion();
        BarrRes.setText(texto);
        //}catch(Exception e){
         //   texto=" ";
        //    BarrRes.setText("SINTAX ERROR");
        //}
    }//GEN-LAST:event_IgualBtActionPerformed

    private void BorrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBtActionPerformed
        // TODO add your handling code here:
        texto="";
        BarrRes.setText(texto);
    }//GEN-LAST:event_BorrarBtActionPerformed

    private void PuntoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoBtActionPerformed
        // TODO add your handling code here:
        setBarra(".");
    }//GEN-LAST:event_PuntoBtActionPerformed

    private void PotenciaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaBtActionPerformed
        // TODO add your handling code here:
        setBarra("^");
    }//GEN-LAST:event_PotenciaBtActionPerformed

    private void MasMenosBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasMenosBtActionPerformed
        // TODO add your handling code here:
            if(texto.length()>0){
                texto=texto.substring(0,texto.length()-1);
                BarrRes.setText(texto);
        }
    }//GEN-LAST:event_MasMenosBtActionPerformed

    
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
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarrRes;
    private javax.swing.JButton BorrarBt;
    private javax.swing.JButton CeroBt;
    private javax.swing.JButton CincoBt;
    private javax.swing.JButton CuatroBt;
    private javax.swing.JButton DivBt;
    private javax.swing.JButton DosBt;
    private javax.swing.JButton IgualBt;
    private javax.swing.JButton MasBT;
    private javax.swing.JButton MasMenosBt;
    private javax.swing.JButton MenosBt;
    private javax.swing.JButton MultiBt;
    private javax.swing.JButton NueveBt;
    private javax.swing.JButton OchoBt;
    private javax.swing.JButton ParAbiertoBt;
    private javax.swing.JButton ParCerradoBt;
    private javax.swing.JButton PotenciaBt;
    private javax.swing.JButton PuntoBt;
    private javax.swing.JButton SeisBt;
    private javax.swing.JButton SieteBt;
    private javax.swing.JButton TresBt;
    private javax.swing.JButton UnoBt;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package calculadora;

/**
 *
 * @author pacot
 */
public class Calcu extends javax.swing.JFrame {
    
    private String texto="";
   
    public Calcu(){
        initComponents();
    }

    
    private void setBarrita(String nuevo){
        texto+=nuevo;
        BarritaRes.setText(texto);
    }
    
    private void initComponents(){
        
        BarritaRes= new javax.swing.JTextField();
        CeroBot=new javax.swing.JButton();
        CincoBot=new javax.swing.JButton();
        CuatroBot=new javax.swing.JButton();
        DivisBot=new javax.swing.JButton();
        DosBot=new javax.swing.JButton();
        IgualBot=new javax.swing.JButton();
        MenosBot=new javax.swing.JButton();
        MultiBot=new javax.swing.JButton();
        NueveBot=new javax.swing.JButton();
        OchoBot=new javax.swing.JButton();
        PareAbierto=new javax.swing.JButton();
        PareCerrado=new javax.swing.JButton();
        ResBoton=new javax.swing.JButton();
        SeisBot=new javax.swing.JButton();
        SieteBot=new javax.swing.JButton();
        SumaBot=new javax.swing.JButton();
        TresBot=new javax.swing.JButton();
        UnoBot=new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        BarritaRes.setFont(new java.awt.Font("Times New Roman",1,25));
        PareAbierto.setFont(new java.awt.Font("Times New Roman",1,25));
        PareAbierto.setText("(");
        PareAbierto.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                PareAbiertoActionPerformed(event);
            }
        });
        
        PareCerrado.setFont(new java.awt.Font("Times New Roman",1,25));
        PareCerrado.setText("(");
        PareCerrado.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                PareCerradoActionPerformed(event);
            }
        });
       
        UnoBot.setFont(new java.awt.Font("Times New Roman",1,25));
        UnoBot.setText("1");
        UnoBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                UnoBotActionPerformed(event);
            }
        });
        
        DosBot.setFont(new java.awt.Font("Times New Roman",1,25));
        DosBot.setText("2");
        DosBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                DosBotActionPerformed(event);
            }
        });
        
        TresBot.setFont(new java.awt.Font("Times New Roman",1,25));
        TresBot.setText("3");
        TresBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                TresBotActionPerformed(event);
            }
        });
        
        CuatroBot.setFont(new java.awt.Font("Times New Roman",1,25));
        CuatroBot.setText("4");
        CuatroBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                CuatroBotActionPerformed(event);
            }
        });
        
        CincoBot.setFont(new java.awt.Font("Times New Roman",1,25));
        CincoBot.setText("5");
        CincoBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                CincoBotActionPerformed(event);
            }
        });
        
        SeisBot.setFont(new java.awt.Font("Times New Roman",1,25));
        SeisBot.setText("6");
        SeisBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                SeisBotActionPerformed(event);
            }
        });
        
        SieteBot.setFont(new java.awt.Font("Times New Roman",1,25));
        SieteBot.setText("7");
        SieteBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                SieteBotActionPerformed(event);
            }
        });
        
        OchoBot.setFont(new java.awt.Font("Times New Roman",1,25));
        OchoBot.setText("8");
        DosBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                OchoBotActionPerformed(event);
            }
        });
        
        NueveBot.setFont(new java.awt.Font("Times New Roman",1,25));
        NueveBot.setText("9");
        NueveBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                NueveBotActionPerformed(event);
            }
        });
        
        DivisBot.setFont(new java.awt.Font("Times New Roman",1,25));
        DivisBot.setText("/");
        DivisBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                DivisBotActionPerformed(event);
            }
        });
          
        IgualBot.setFont(new java.awt.Font("Times New Roman",1,25));
        IgualBot.setText("=");
        IgualBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                IgualBotActionPerformed(event);
            }
        });
        
        SumaBot.setFont(new java.awt.Font("Times New Roman",1,25));
        SumaBot.setText("+");
        SumaBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                SumaBotActionPerformed(event);
            }
        });
        
        MenosBot.setFont(new java.awt.Font("Times New Roman",1,25));
        MenosBot.setText("-");
        MenosBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                MenosBotActionPerformed(event);
            }
        });
        
        CeroBot.setFont(new java.awt.Font("Times New Roman",1,25));
        CeroBot.setText("0");
        CeroBot.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                CeroBotActionPerformed(event);
            }
        });
        
        ResBoton.setFont(new java.awt.Font("Times New Roman",1,25));
        ResBoton.setText(" ");
        ResBoton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent event){
                ResBotonActionPerformed(event);
            }
        });

       
    }
    
     private void PareAbiertoActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("("); 
        }
     private void CeroBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("0"); 
        }
      private void PareCerradoActionPerformed(java.awt.event.ActionEvent event){
           setBarrita(")"); 
        }
      private void UnoBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("1"); 
        }
       private void DosBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("2"); 
        }
        private void TresBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("3"); 
        }
         private void CuatroBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("4"); 
        }
          private void CincoBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("5"); 
        } private void SeisBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("6"); 
        }
         private void SieteBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("7"); 
        } private void OchoBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("8"); 
        }
         private void NueveBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("9"); 
        }
          private void DivisBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("/"); 
        } private void IgualBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("="); 
        }
        private void MenosBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("-"); 
        }private void SumaBotActionPerformed(java.awt.event.ActionEvent event){
           setBarrita("+"); 
        }
        private void ResBotonActionPerformed(java.awt.event.ActionEvent event){
           setBarrita(" "); 
        }
        
        
 public static void main(String args[]){
     
     try{
         for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
            if("Calcu".equals(info.getName())){
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            } 
         }
     }catch (ClassNotFoundException exc){
         java.util.logging.Logger.getLogger(Calcu.class.getName()).log(java.util.logging.Level.SEVERE,null,exc);        
     }catch (InstantiationException exc){
         java.util.logging.Logger.getLogger(Calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, exc);
         
     }
     
     java.awt.EventQueue.invokeLater(new Runnable(){
         public void run(){
             new Calcu().setVisible(true);
             
         }
     });
     
 }
        
        
    
    
    

   
   
    
    
    
    
      
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarritaRes = new javax.swing.JTextField();
        SumaBot = new javax.swing.JButton();
        MenosBot = new javax.swing.JButton();
        MultiBot = new javax.swing.JButton();
        DivisBot = new javax.swing.JButton();
        ResBoton = new javax.swing.JButton();
        NueveBot = new javax.swing.JButton();
        OchoBot = new javax.swing.JButton();
        SieteBot = new javax.swing.JButton();
        SeisBot = new javax.swing.JButton();
        CincoBot = new javax.swing.JButton();
        CuatroBot = new javax.swing.JButton();
        TresBot = new javax.swing.JButton();
        DosBot = new javax.swing.JButton();
        UnoBot = new javax.swing.JButton();
        CeroBot = new javax.swing.JButton();
        PareAbierto = new javax.swing.JButton();
        PareCerrado = new javax.swing.JButton();
        IgualBot = new javax.swing.JButton();

        setBackground(new java.awt.Color(175, 171, 171));

        SumaBot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SumaBot.setText("+");

        MenosBot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MenosBot.setText("-");

        MultiBot.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        MultiBot.setText("X");

        DivisBot.setBackground(new java.awt.Color(255, 255, 255));
        DivisBot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DivisBot.setText("/");

        ResBoton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ResBoton.setText("C");
        ResBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResBotonActionPerformed(evt);
            }
        });

        NueveBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        NueveBot.setText("9");

        OchoBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        OchoBot.setText("8");

        SieteBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        SieteBot.setText("7");

        SeisBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        SeisBot.setText("6");

        CincoBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        CincoBot.setText("5");

        CuatroBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        CuatroBot.setText("4");

        TresBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        TresBot.setText("3");

        DosBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        DosBot.setText("2");

        UnoBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        UnoBot.setText("1");

        CeroBot.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        CeroBot.setText("0");

        PareAbierto.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        PareAbierto.setText("(");

        PareCerrado.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        PareCerrado.setText(")");

        IgualBot.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        IgualBot.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UnoBot, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(CuatroBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CeroBot, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(TresBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NueveBot, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SieteBot, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OchoBot, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(SeisBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DosBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CincoBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(IgualBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(BarritaRes, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MultiBot, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(SumaBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenosBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DivisBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PareAbierto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PareCerrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BarritaRes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(OchoBot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(ResBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NueveBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SieteBot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SeisBot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CincoBot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TresBot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CuatroBot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DosBot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PareAbierto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SumaBot, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MenosBot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(MultiBot, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DivisBot, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CeroBot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UnoBot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PareCerrado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IgualBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ResBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarritaRes;
    private javax.swing.JButton CeroBot;
    private javax.swing.JButton CincoBot;
    private javax.swing.JButton CuatroBot;
    private javax.swing.JButton DivisBot;
    private javax.swing.JButton DosBot;
    private javax.swing.JButton IgualBot;
    private javax.swing.JButton MenosBot;
    private javax.swing.JButton MultiBot;
    private javax.swing.JButton NueveBot;
    private javax.swing.JButton OchoBot;
    private javax.swing.JButton PareAbierto;
    private javax.swing.JButton PareCerrado;
    private javax.swing.JButton ResBoton;
    private javax.swing.JButton SeisBot;
    private javax.swing.JButton SieteBot;
    private javax.swing.JButton SumaBot;
    private javax.swing.JButton TresBot;
    private javax.swing.JButton UnoBot;
    // End of variables declaration//GEN-END:variables
}

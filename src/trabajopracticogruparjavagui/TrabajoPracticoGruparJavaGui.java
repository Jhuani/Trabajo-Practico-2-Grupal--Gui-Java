/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticogruparjavagui;

import javax.swing.JFrame;

/**
 *
 * @author Taigo Capo
 */
public class TrabajoPracticoGruparJavaGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hola, este es el primer comentario del proyecto
        //Hola, este es el segundo comentario del proyecto+++
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
            
            
            
        }catch(Exception e){
            System.out.println("No se pudo cargar Nimbus");
        }
         Jframe jf1 = new Jframe();
         jf1.setVisible(true);
         jf1.setLocationRelativeTo(null);
    }
    
}

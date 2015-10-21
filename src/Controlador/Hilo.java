
package Controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class Hilo extends Thread {
    private JLabel label;
    
    public Hilo(JLabel label){
        this.label = label;
    }
    
    public void run(){
        while(true){
            Date hoy = new Date();
            SimpleDateFormat SF = new SimpleDateFormat("hh:mm:ss");
            label.setText(SF.format(hoy));
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println("Error en el hilo: "+e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
}


package Main;

import Controlador.Control_Form_Register;
import Vista.Register;
public class Principal {

    public static Register Register_ra;
    public static Controlador.Control_Form_Register c_Register_ra;
    public static void main(String[] args) {
        // TODO code application logic here
        Register_ra=new Register();
        Register_ra.setVisible(true);
        Register_ra.setLocationRelativeTo(null);
        
        c_Register_ra=new Control_Form_Register(Register_ra); 
    }
    
}

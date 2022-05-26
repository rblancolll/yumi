
package Controlador;
import Modelo.Alumno;
import Modelo.ListarAlumnos;
import Modelo.Registro;
import Vista.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Control_Form_Register implements ActionListener{
    Register Register_ra; 

    public Control_Form_Register(Register Register_ra) {
        this.Register_ra = Register_ra;
        this.Register_ra.btnguardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Register_ra.btnguardar){
            
            String nombre=Register_ra.txtnom.getText();
            int aleas=Integer.parseInt(Register_ra.txtal.getText());
            String correo=Register_ra.txtcor.getText();
            int telefono=Integer.parseInt(Register_ra.txttel.getText());
            Alumno A=new Alumno(nombre,aleas,correo,telefono);
            Registro R= new Registro();
            R.registrarbd (A);
           
            
            ListarAlumnos la=new ListarAlumnos();
            la.MostrarTable(Register_ra.TABLA_ALUMNO);
            
            limpiarentradas();
        }
    }

    private void limpiarentradas() {
        Register_ra.txtnom.setText("");
        Register_ra.txtal.setText("");
        Register_ra.txtcor.setText("");
        Register_ra.txttel.setText("");
                
    }
    
}

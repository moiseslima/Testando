package utilitarios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
public class data{
    
         
    public int dia, ano,mes, dia_semana;
    public String hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");
    
         public void le_hora(){
             Date horaAtual = new Date();
             hora = horaformatada.format(horaAtual);
         }

    /**
     *
     */
    public void le_data() {
       Calendar c = Calendar.getInstance();
        mes = c.get(Calendar.MONTH)+1;
        dia = c.get(Calendar.DAY_OF_MONTH);
        ano = c.get(Calendar.YEAR);
        dia_semana = c.get(Calendar.DAY_OF_WEEK);
        
            
     }
                    
}
    


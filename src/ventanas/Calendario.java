/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;
import javax.swing.JFormattedTextField.AbstractFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Usuario
 */
class date2{
    static void GUI(){
        UtilDateModel model = new UtilDateModel();
    
//model.setDate(20,04,2014);
// Need this...
Properties prop = new Properties();
prop.put("text.today", "hoy");
prop.put("text.month", "mes");
prop.put("text.year", "dia");
JDatePanelImpl datePanel = new JDatePanelImpl(model,prop);
JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,new Calendario.DateLabelFormatter());

    }
}
public class Calendario {
   public static class DateLabelFormatter extends AbstractFormatter {

    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }

        return "";
    }

} 
}

import java.util.Calendar;
import java.util.GregorianCalendar;

class DiasRestantes {

    public static void main(String[] args) {
    Calendar calendar1 = Calendar.getInstance();
        int currentDayOfYear = calendar1.get(Calendar.DAY_OF_YEAR);
        int year = calendar1.get(Calendar.YEAR);
    
    Calendar calendar2 = new GregorianCalendar(year, 11, 31);
        int dayDecember31 = calendar2.get(Calendar.DAY_OF_YEAR);
        int dias = dayDecember31 - currentDayOfYear;
        System.out.println( "quedan " + dias + " dias hasta el 31 de diciembre");
    }
    
}


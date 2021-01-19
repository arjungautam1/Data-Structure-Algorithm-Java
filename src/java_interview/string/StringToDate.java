/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2021-01-11
 * Time : 06:44
 */
package java_interview.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) {
        SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyyy");
        String dateString="21-Jan-2021";
        try {
            Date date=formatter.parse(dateString);
            System.out.println(date);
            System.out.println(formatter.format(date));
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
}

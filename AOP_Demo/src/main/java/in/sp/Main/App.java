package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Juggler;
import in.sp.beans.Magician;
import in.sp.beans.Singer;
import in.sp.resources.ConfigrationFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(ConfigrationFile.class);
        
        Juggler jug = (Juggler)con.getBean("juggler", 4);
        Magician mag = (Magician)con.getBean("magician", "sagar");
        Singer sing = (Singer)con.getBean("singer", "lalala");
        
        jug.perform();
        mag.perform();
        sing.perform();

    }
}

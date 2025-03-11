package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Book;
import in.sp.resources.ConfigrationFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(ConfigrationFile.class);
        
        Book b1 = (Book)con.getBean(Book.class);
        b1.setNo(30);
        b1.setName("java");
        b1.show();
    }
}

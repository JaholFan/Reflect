import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException; 

public class Reflect{
    public static void main(String[] args){ 
        Class<?> c1 = null;
        Object p1 = null;
        Method m1 = null;
        Method m2 = null;
        Method m3 = null;
        Method m4 = null;

        Constructor<?> con = null;
        Object p2 = null;

        try {
            c1 = Class.forName(args[0]);  //获得class
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            con = c1.getConstructor(String.class,int.class); //获得constructor
        } catch (NoSuchMethodException e){
            System.out.println(e);
        }

        try {
            p1 = c1.newInstance();  //实例化对象
            p2 = con.newInstance("fjh",28); //实例化对象
        } catch(InstantiationException e){
            System.out.println(e);
        } catch(IllegalAccessException e){
            System.out.println(e);
        } catch (InvocationTargetException e){
            System.out.println(e);
        }
        
        try {
            /*通过class,获得方法*/
            m1 = c1.getMethod("setName",String.class);
            m2 = c1.getMethod("setAge",int.class);     
            m3 = c1.getMethod("getName");        
            m4 = c1.getMethod("getAge");     
        } catch(NoSuchMethodException e){
            System.out.println(e);
        }   
        try {
            /*调用方法*/
            m1.invoke(p1,"Jahol");  //第一个对象
            m2.invoke(p1,26);
            System.out.println(""+m3.invoke(p1));
            System.out.println(""+m4.invoke(p1));
            System.out.println(""+m3.invoke(p2));  //第二个对象
            System.out.println(""+m4.invoke(p2));
        } catch (IllegalAccessException e){
            System.out.println(e);
        } catch (InvocationTargetException e){
            System.out.println(e);
        }
    }
}

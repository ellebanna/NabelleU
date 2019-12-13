
package IO;


public class Out {
    
    public static Boolean print(String sms){
        try{
            System.out.println(sms);
            return true;
        }catch(Exception e){
            return false;
        }      
    }
}

import java.util.Random;
public class  Alter
{
   public static void main(String args[])
     {
         int length=10;
         System.out.println("Generating Password using random():");
         System.out.println("Your new pssword is: " + geek_Password(length));
     }
    static char[] geek_Password(int len)
     {
         
         String Capital_letters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
         String Small_letters= "abcdefghijklmnopqrstuvwxyz" ;
         String numbers= "0123456789";
         String symbols= "!@#$%^&*_-=+?/.<>";

         String values= Capital_letters + Small_letters + numbers + symbols;
         Random rndm_method = new Random();
         char[] password = new char[len];

         for (int i=0; i<len; i++)
              password[i]=values.charAt(rndm_method.nextInt(values.length()));
         
         return password;
     }
}
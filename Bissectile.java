import static java.lang.System.out;
public class Bissectile{
    public static void main(String[] args){
       
        int anne = 2024;
        if(anne%4==0 && (anne%100!=0 ||anne%4==0))
        {
            System.out.println(+anne+ " est une année bissectile");

        }else
        {
            System.out.println(+anne+ " n'est pas une année bissectile");
        }

        }
    }

        

   
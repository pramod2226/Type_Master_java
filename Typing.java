import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Typing {

    public static void main(String[] args){
        String line;
        Scanner ts = new Scanner(System.in);
        ArrayList<String>fileLine = new ArrayList<>();

        try{
            BufferedReader fr = new BufferedReader(new FileReader("SSC2MIN.txt"));
            
            while((line = fr.readLine())!= null){
                System.out.println(line);
                fileLine.add(line);
            }
            fr.close();

        }catch(IOException e){
            System.out.println("file not found"+ e.getMessage());
            return;
        }
        System.out.println("start Typing here ......\n");
       
        // try{
        //     if(line.equals(obj)){
        //         System.out.println("Excellent !");
        //     }
            
        // }catch(Exception e){
        //     System.out.println("not match"+e.getMessage());
        // }
        for(int i = 0; i<fileLine.size(); i++){
             String obj = ts.nextLine();
             String originalLine = fileLine.get(i);

             if(originalLine.equals(obj)){
                System.out.println("Excellent ! " +(i+1)+"correct words");
             }else{
                System.out.println("wrong line "+originalLine+"\n");
             }

        }
        System.out.println("close typing ....");
        ts.close();
    
    }
}
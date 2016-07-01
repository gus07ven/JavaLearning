package chapters24HR;

import java.io.*;

public class JavaApplication1 {
       
       public static void main(String[] args) {
           
           String fileName = "expressions.txt";
          double result;   
           // TODO code application logic here
           try {
               FileReader fileReader;
               fileReader = new FileReader(fileName);
               
               BufferedReader bufferedReader = new BufferedReader(fileReader);

                       String line;
                      // List<String> list = new ArrayList<String>();
                       int i = 0;
                  
                while((line = bufferedReader.readLine()) != null) {
                        
                       String[] parts = line.split(" ");
                       i++;
                       String operator = parts[0];
                       String firstDigit = parts[1];
                       String secondDigit = parts[2];
                       
                       if (firstDigit != "" ){
                       double first = Double.parseDouble(firstDigit);
                       }
                       if (secondDigit != ""){
                       double second = Double.parseDouble(secondDigit);
                       }
                       switch (operator) {
                           case "+":
                               result = (first + second);
                               System.out.println( firstDigit + "+" + secondDigit + "=" + result);
                               break;
                           case "*":
                               result = (first + second);
                               System.out.println( firstDigit + "*" + secondDigit + "=" + result);
                               break;
                           case "-":
                               result = (first - second);
                               System.out.println( firstDigit + "-" + secondDigit + "=" + result);
                               break;
                           case "/":
                               if ( secondDigit.equals("0")){
                                   System.out.println("Cannot divide by 0\n");
                               }
                               else{
                                   result = (first / second);
                                   System.out.println( firstDigit + "/" + secondDigit + "=" + result);
                               }  break;
                           default:
                               System.out.println("I dont know what I am doing with my life\n");
                               break;
                       }
                       
                    }
                bufferedReader.close();
                    
           } catch(FileNotFoundException ex) {
               System.out.println("Unable to open file '" + fileName + "'"); 
                   
               }
            catch(IOException ex) {
               System.out.println("Error reading file '" + fileName + "'");                   
     
           }

       }
       
       /** 
        * @param args the command line arguments
        */
    }


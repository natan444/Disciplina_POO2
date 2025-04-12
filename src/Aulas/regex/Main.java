

package Aulas.regex;

 
public class Main {
    public static void main(String[] args) {
        String str="a";// segue o padrao (true ou false)
        String regex="a"; // padrao
        
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
       
         str="aa";
         regex="a"; 
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
        
         str="aaaaaaaa";// segue o padrao (true ou false)
         regex="a+"; // padrao
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
       
         str="aaaaaaaa";// segue o padrao (true ou false)
         regex="a\\+"; // padrao
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
        
         str="abc";// segue o padrao (true ou false)
         regex="[a-z]+"; // padrao
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
        
         str="abcW";// segue o padrao (true ou false)
         regex="[a-z]+"; // padrao
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
       
         str="abc";// segue o padrao (true ou false)
         regex="[a-zA-Z]+"; // padrao
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
        
         str="abcW";
         regex="A+\\d+"; 
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
        
         str="14806355";
         regex="A+\\d+"; 
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
       
         str="14806-355";
         regex="\\d{5}-\\d{3}"; 
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
        
         str="Popolin neto";
         regex="[A-Z][a-z]+\\S+[A-Z][a-z]+"; 
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
       
         str="(16)99605-9464";//telefone
         regex="(\\+\\d{1,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}"; 
        System.out.println( str + "|" + regex + " |" +str.matches(regex));
        
         str="( kljhhsbc             amjksak     aaa";//procura o padrao e substitui
         str=str.replaceAll("\\s{2,}", "");
         System.out.println(str);
         
         str="skdlfdnsmofks jkghsk      kmjghfds  a";
         String [] vetor= str.split("\\s+");
         
         for(String s: vetor){
             System.out.println(s);
         }
        
        
       
    }
}

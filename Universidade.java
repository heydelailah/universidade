//developed by alexsyfk..github,ill db implements mysql
/*up by alexsey 2017 21:40 4/3
 * created in 4/3/17,19:00...
 *   simple app to show functions with db....
 * docents Fred Jarsen
 */
import java.util.Scanner;
import java.sql.*;
public class Universidade{
   
   String url = "jdbc:mysql://localhost:3306/universidade";

    String user =  "root";

    String password = "123456";
    
    
    
    

/*
    try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidade","root","123456");
            System.out.println("success"); 
      //  con.close();
        } 
        
        catch (Exception e) {
          System.out.println("error"); 
          // e.printStackTrace(); 
        }
  */
  
    public static void main(String args[]){
    boolean resp=true;while(resp){    
       System.out.println(" _________________________________"); 
       System.out.println("+\t           \t      \t  +\t   projeto db"); 
       System.out.println("+\t1-consultar\tcriado\t  +\tdocente Fred Jarsen"); 
       System.out.println("+\t2-cadastrar\t por  \t  +        |"); 
       System.out.println("+\t3-remover  \talexsy\t  +        |"); 
       System.out.println("+\t4-atualuzar\t      \t  +        |");
       System.out.println("+\t                   \t  +        ▼"); 
       System.out.println("+\t\t\t    \t  +");Scanner sc = new Scanner(System.in);
       System.out.println("+\t\t\t    \t  +escolha uma das opções..."); 
       System.out.println("+_________________________________+");int i=sc.nextInt();resp=i>4?true:false;
  /*
  switch(){
  case 1:{
      
      break;
  }    
      
    case 2:{
        
        
     break;   
    }  
    
    case 3:{
        
        
        break;
    }
  }
*/
  }





    }
    
    
    
    
    
}

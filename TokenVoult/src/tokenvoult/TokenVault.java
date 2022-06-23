/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenvoult;

import com.safenet.token.SiteBean;
import com.safenet.token.TokenProperty;
import com.safenet.token.TokenService;

/**
 *
 * @author Maciej
 */
public class TokenVault {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        try
        {

        String ToTokenize = "432433423477";
        String dbTable = "Token_Sejf";
        String naeUser = "Token";
        char[] naePswd = "Pass1234".toCharArray();
        String dbUser = "tokenman";
        char[] dbPswd = "Pass1234".toCharArray();
	
        String token = null;

        TokenService ts = new TokenService(naeUser, naePswd, dbUser, dbPswd );          
        token = ts.insert(ToTokenize, dbTable, TokenService.LAST_FOUR_TOKEN, false);
        System.out.println("Token: " + token);
 
               
         String value = ts.get (token, dbTable, 0);
         System.out.println("Wartość: " + value);
        
        
         System.out.println("");
         System.out.println("------------------------------------------------");
         System.out.println("");
         
        ToTokenize = "macko@clico.pl";      
        token = ts.insert(ToTokenize, dbTable, TokenService.EMAIL_ADDRESS_TOKEN, false);
        System.out.println("Token: " + token);

         value = ts.get (token, dbTable, 0);
         System.out.println("Wartość: " + value);
        
        
         System.out.println("");
         
        
        }
        catch (Exception e)
        {
            
            
        }
        
        
    }
    
}

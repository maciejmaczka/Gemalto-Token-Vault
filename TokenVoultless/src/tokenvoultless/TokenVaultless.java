/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package tokenvoultless;


import com.safenet.vaultLessTokenization.TokenSpec;
import com.safenet.vaultLessTokenization.TokenServiceVaultless;



/**
 *
 * @author Maciej
 */
public class TokenVaultless {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        String naeUser = "Token";
        char[] naePswd = "Pass1234".toCharArray();
        String keyName = "Key_Token_Voultless";
        
        String value = "50945093550934905";
        
       try
       {
        
        
           
       TokenServiceVaultless ts = new TokenServiceVaultless(naeUser, naePswd, keyName );
        
       
       TokenSpec token_spec = new TokenSpec();
       token_spec.setFormat(ts.FIRST_TWO_LAST_FOUR_TOKEN);
       token_spec.setClearTextSensitive(false);
       token_spec.setNonIdempotentTokens(false);
       token_spec.setGroupID(1);
       
       String token = ts.tokenize(value, token_spec);
       
       System.out.print("Value: " + value + "\n");
           
       System.out.println("Token: " +  token);
       
       
       
       }
       catch (Exception e)
       {
           
           System.out.println("ERR:" + e.getMessage());
           
           
       }
        
    }
    
}

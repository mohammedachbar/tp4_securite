package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class CryptageTraitement {
	
	public static void traitement(int mode, String cle,String algorithme,String transformation,File fichierEntree,File fichierSortie){
		  try {
		   Key cleSecret = new SecretKeySpec(cle.getBytes(), algorithme);
		   Cipher cipher;
		   cipher = Cipher.getInstance(transformation);
		   cipher.init(mode, cleSecret);
		   FileInputStream inputStream = new FileInputStream(fichierEntree);
		   byte[] inputBytes = new byte[(int) fichierEntree.length()];
		   inputStream.read(inputBytes);

		   byte[] outputBytes = cipher.doFinal(inputBytes);

		   FileOutputStream outputStream = new FileOutputStream(fichierSortie);
		   outputStream.write(outputBytes);

		   inputStream.close();
		   outputStream.close();
		  } catch (Exception ex) {
			  ex.printStackTrace();
		  } 
		  }
		 }

package pack1;

import java.io.File;

import javax.crypto.Cipher;

public class TestCryptage {

	 public static void main(String[] args) {
		  String key = "Clé dee sécurité";
		  String algorithm = "AES";
		  String transformation = "AES";
		  File inputFile = new File("D:\\cryptage\\fichier1.txt");
		  File encryptedFile = new File("D:\\cryptage\\documentCrypte.txt");
		  File decryptedFile = new File("D:\\cryptage\\documentDecrypte.txt");
		  //Opération de chifrement
		 CryptageTraitement.traitement(Cipher.ENCRYPT_MODE, key,algorithm,transformation, inputFile, encryptedFile);
		  //Opération de déchifrement
		 CryptageTraitement.traitement(Cipher.ENCRYPT_MODE, key,algorithm,transformation, encryptedFile, decryptedFile);
		 }

}

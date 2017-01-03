import java.math.BigInteger;

/**
 * Created by thomasd on 03/01/17.
 */
class main {


    public static void main(String[] args){

        BigInteger plainDataA = BigInteger.valueOf(42);
        BigInteger plainDataB = BigInteger.valueOf(1337);

        KeyPairBuilder keygen = new KeyPairBuilder();
        KeyPair keyPair = keygen.generateKeyPair();

        PublicKey publicKey = keyPair.getPublicKey();
        BigInteger ciphertext = publicKey.encrypt(plainDataA);
        System.out.println("encryted data : " + ciphertext);
        BigInteger decryptedData = keyPair.decrypt(ciphertext);

        System.out.println("decrypted data : " + decryptedData);


    }
}

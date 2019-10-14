/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan33.userlogin;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang user login
 */
public class PBO11K10118904Latihan33UserLogin {
    public static Scanner input = new Scanner(System.in);
    public static User user = new User();
    private static String usName;
    private static String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan Username : ");
	usName = input.nextLine();
	System.out.print("Masukan Password : ");
	passWord = input.nextLine();
        System.out.println("");
        user.pengecekanLogin(usName, passWord);
    }
    
}

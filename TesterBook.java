//driver class <termasuk object class

import java.util.Scanner;

public class TesterBook {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Masukkan judul buku: ");
                String judul = scanner.nextLine();
        
                System.out.print("Masukkan tahun terbit: ");
                int tahun = scanner.nextInt();
        
                System.out.print("Masukkan harga: ");
                double harga = scanner.nextDouble();
        
                System.out.print("Jenis buku (Textbook/Novel/Biography): ");
                String jenisBuku = scanner.next();
        
                book buku;
        
                if (jenisBuku.equalsIgnoreCase("Textbook")) {
                    System.out.print("Masukkan subjek: ");
                    String subjek = scanner.next();
                    buku = new Textbook(judul, tahun, harga, subjek);
                } else if (jenisBuku.equalsIgnoreCase("Novel")) {
                } else if (jenisBuku.equalsIgnoreCase("Biography")) {
                } else {
                    System.out.println("Jenis buku tidak valid.");
                    return;
                }
        

            }
        
            
        }

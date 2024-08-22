public class welcome // Definisi kelas
{
    public static void main(String[] args) // Metode utama: titik masuk program
    {
        String greeting = "welcome to core java!"; // Inisialisasi pesan sambutan
        System.out.println(greeting); // Mencetak pesan sambutan ke konsol

        // Loop melalui setiap karakter dalam string greeting
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("="); // Mencetak tanda sama dengan untuk setiap karakter dalam greeting

        System.out.println(); // Pindah ke baris berikutnya setelah mencetak tanda sama dengan
    }
}

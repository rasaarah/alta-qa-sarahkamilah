class hitung{
    int bilangan1;
    int bilangan2;
}

public class OOPKalkulator {
    private static int Penjumlahan(hitung hitung){
        return hitung.bilangan1 + hitung.bilangan2;
    }
    private static int Pengurangan(hitung hitung){
        return hitung.bilangan1-hitung.bilangan2;
    }
    private static int Perkalian(hitung hitung){
        return hitung.bilangan1 * hitung.bilangan2;
    }
    private static int Pembagian(hitung hitung){
        return hitung.bilangan1/ hitung.bilangan2;
    }

    public static void main(String[] args) {
        hitung hitung = new hitung();
        hitung.bilangan1 = 3;
        hitung.bilangan2 = 4;
        System.out.println("Penjumlahan: "+Penjumlahan(hitung));

        hitung.bilangan1 = 15;
        hitung.bilangan2 = 4;
        System.out.println("Pengurangan: "+Pengurangan(hitung));

        hitung.bilangan1 = 10;
        hitung.bilangan2 = 10;
        System.out.println("Perkalian: "+Perkalian(hitung));

        hitung.bilangan1 = 12;
        hitung.bilangan2 = 3;
        System.out.println("Pembagian: "+Pembagian(hitung));
    }
}

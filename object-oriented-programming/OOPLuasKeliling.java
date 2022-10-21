class persegi{
    int sisi;
}

class persegiPanjang{
    int panjang;
    int lebar;
}

class segitiga{
    static int alas;
    static int tinggi;
}

public class OOPLuasKeliling {
    private static int LuasSquare(persegi persegi){
        return persegi.sisi * persegi.sisi;
    }
    private static int KelilingSquare(persegi persegi){
        return persegi.sisi * 4;
    }
    private static int LuasTriangle(segitiga segitiga){
        return (segitiga.alas * segitiga.tinggi)/2;
    }
    private static int KelilingTriangle(segitiga segitiga){
        int x = (int) Math.sqrt(Math.pow(segitiga.alas,2)+Math.pow(segitiga.tinggi,2));
        return x + segitiga.alas + segitiga.tinggi;         //soal tidak detail segitiga apa, 3 itu panjang atau tinggi juga tidak disebutkan
    }
    private static int LuasRectangle(persegiPanjang persegiPanjang){
        return persegiPanjang.panjang * persegiPanjang.lebar;
    }
    private static int KelilingRectangle(persegiPanjang persegiPanjang){
        return 2 * (persegiPanjang.panjang + persegiPanjang.lebar);
    }

    public static void main(String[] args) {
        persegi persegi = new persegi();
        persegi.sisi = 4;

        segitiga segitiga = new segitiga();
        segitiga.alas = 3;
        segitiga.tinggi = 4;

        persegiPanjang persegiPanjang = new persegiPanjang();
        persegiPanjang.lebar = 7;
        persegiPanjang.panjang = 8;

        System.out.println("Luas");
        System.out.println("Persegi: "+LuasSquare(persegi));
        System.out.println("Segitiga: "+LuasTriangle(segitiga));
        System.out.println("Persegi Panjang: "+LuasRectangle(persegiPanjang));
        System.out.println("---------------------------");
        System.out.println("Keliling");
        System.out.println("Persegi: "+KelilingSquare(persegi));
        System.out.println("Segitiga: "+KelilingTriangle(segitiga));
        System.out.println("Persegi Panjang: "+KelilingRectangle(persegiPanjang));
    }
}
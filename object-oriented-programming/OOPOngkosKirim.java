public class OOPOngkosKirim {
    private static void OngkosKirim(item item){
        float volume = item.panjang * item.lebar * item.tinggi;
        float hargaBase = 5000;
        double kelipatan = volume / 50;
        if (kelipatan < item.berat) kelipatan = item.berat;
        kelipatan = Math.ceil(kelipatan);
        int hargaAkhir = (int) (hargaBase*kelipatan);
        System.out.println("Rp "+hargaAkhir);
    }

    public static void main(String[] args) {
        item item = new item();
        item.panjang = 5;
        item.lebar = 2;
        item.tinggi = 11;
        item.berat = 1;
        OngkosKirim(item);
    }
}

class item {
    public int panjang, lebar, tinggi, berat;
}
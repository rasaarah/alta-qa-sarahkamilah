class kubus{
    int sisi;
}

class balok{
    int sisi1;
    int sisi2;
    int sisi3;
}

class tabung{
    int tinggi;
    int diameter;
}

public class OOPVolume {
    private static int volumeKubus(kubus kubus){
        return kubus.sisi * kubus.sisi  * kubus.sisi;
    }

    private static int volumeBalok(balok balok){

        return balok.sisi1*balok.sisi2*balok.sisi3;
    }

    private static int volumeTabung(tabung tabung){
        float volume =  ((22*tabung.tinggi*tabung.tinggi*tabung.diameter)/7);
        return (int) volume;
    }

    public static void main(String[] args) {
        kubus kubus = new kubus();
        kubus.sisi = 10;

        balok balok = new balok();
        balok.sisi1 = 3;
        balok.sisi2 = 6;
        balok.sisi3 = 10;

        tabung tabung = new tabung();
        tabung.tinggi = 7;
        tabung.diameter = 10;

        System.out.println("Volume");
        System.out.println("Kubus: "+volumeKubus(kubus));
        System.out.println("Balok: "+volumeBalok(balok));
        System.out.println("Tabung: "+volumeTabung(tabung));
    }
}

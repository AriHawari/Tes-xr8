public class Buku {
    int id;
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        
        Buku skibidi = new Buku(3, "skibidi", "kai Cenat", 2024);
        Buku rizz = new Buku(5, "rizz", "caseoh", 2022);
        Buku bugatti = new Buku(8, "bugatti", "corbuzier", 1945);
        Buku mewing = new Buku(2, "mewing", "darren", 2021);
        Buku giyat = new Buku(9, "giyat", "fuad", 1970);

        // skibidi

         System.out.println(skibidi.id);
        System.out.println(skibidi.judul);
        System.out.println(skibidi.pengarang);
        System.out.println(skibidi.tahunTerbit);

        // rizz

        System.out.println(rizz.id);
        System.out.println(rizz.judul);
        System.out.println(rizz.pengarang);
        System.out.println(rizz.tahunTerbit);

        // bugatti

        System.out.println(bugatti.id);
        System.out.println(bugatti.judul);
        System.out.println(bugatti.pengarang);
        System.out.println(bugatti.tahunTerbit);

        // mewing

        System.out.println(mewing.id);
        System.out.println(mewing.judul);
        System.out.println(mewing.pengarang);
        System.out.println(mewing.tahunTerbit);

        // giyat

        System.out.println(giyat.id);
        System.out.println(giyat.judul);
        System.out.println(giyat.pengarang);
        System.out.println(giyat.tahunTerbit);







    }



}

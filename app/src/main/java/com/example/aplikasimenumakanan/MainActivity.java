package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private final ArrayList<String> fotoMakanan = new ArrayList<>();
    private final ArrayList<String> namaMakanan = new ArrayList<>();
    private final ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Tahu Gimbal");
        fotoMakanan.add("https://cdnt.orami.co.id/unsafe/468x324/cdn-cas.orami.co.id/parenting/images/tahu-gimbal.width-800.jpg");
        infoMakanan.add("Tahu gimbal adalah makanan khas Semarang yang merupakan campuran dari tahu goreng, tempe, gimbal, irisan kol, dan sambal kacang.           Harga : Rp.24.000");

        namaMakanan.add("Lumpia Semarang");
        fotoMakanan.add("https://cdnt.orami.co.id/unsafe/468x351/cdn-cas.orami.co.id/parenting/images/Lumpia_Semarang.width-800.jpg");
        infoMakanan.add("Berikutnya adalah makanan khas Semarang yang memiliki aroma yang kuat, namanya lumpia. Hal ini dikarenakan jajanan yang satu ini menggunakan rebung sebagai bahan dasarnya.\n" +
                "\n" +
                "Selain rebung, lumpia Semarang terdiri dari udang, telur, dan daging. Umumnya, makanan yang digoreng ini dimakan dengan bumbu khas atau acar.             Harga : Rp.21.000");

        namaMakanan.add("Tahu Petis");
        fotoMakanan.add("https://cdnt.orami.co.id/unsafe/468x264/cdn-cas.orami.co.id/parenting/images/tahu_petis.width-800.jpg");
        infoMakanan.add("Selain tahu gimbal, ada pula tahu petis yang tak kalah terkenal di Semarang. Makanan khas Semarang ini terkenal nikmat dan khas, karena isinya adalah tahu putih yang diisi dengan petis kemudian digoreng.                                                                                  Harga : Rp.26.000");

        namaMakanan.add("Wingko Babat");
        fotoMakanan.add("https://cdnt.orami.co.id/unsafe/468x247/cdn-cas.orami.co.id/parenting/images/Wingko_Babat.width-800.jpg");
        infoMakanan.add("Berikutnya ada wingko babat, makanan khas Semarang rumahan yang terbuat dari beras ketan dan kelapa yang di bakar.                                                                                  Harga : Rp.27.000");

        namaMakanan.add("Pisang Plenet");
        fotoMakanan.add("https://cdnt.orami.co.id/unsafe/468x311/cdn-cas.orami.co.id/parenting/images/kue-wingko-babat-khas-semarang.width-800.jpg");
        infoMakanan.add(" Pisang plenet terbuat dari pisang kepok yang dibakar di atas arang, kemudian ditekan dengan papan kecil sehingga bentuknya menjadi gepeng.\n" +
                "\n                                 Harga : Rp.28.000");

        prosesRecyclerViewAdapter();
    }

}
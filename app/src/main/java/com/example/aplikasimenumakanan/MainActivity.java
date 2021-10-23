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
        namaMakanan.add("orak arik ayam");
        fotoMakanan.add("https://simomot.com/wp-content/uploads/2017/01/Resep-orak-arik-ayam-wortel-ala-Bunda-Mayrine.jpg");
        infoMakanan.add("orak arik ayam adalah nasi putih yang disajikan dengan suiran ayam yang masak dengan bumbu yang khas          Harga : Rp.15.000");

        namaMakanan.add("Magelangan");
        fotoMakanan.add("http://kbu-cdn.com/dk/wp-content/uploads/mie-goreng-magelangan-pedas.jpg");
        infoMakanan.add("Magelangan adaah nasi goreng yang dimasak dengan campuran mie dan bumbu bumbu rempah pilihan Harga : Rp.21.000");

        namaMakanan.add("Es Susu");
        fotoMakanan.add("https://dapurbahari.com/wp-content/uploads/DSCN1200.jpg");
        infoMakanan.add("men berikutnya adalah es Susu yang segar                                                                    Harga : Rp.4.000");

        namaMakanan.add("Es Teh Manis");
        fotoMakanan.add("https://s0-bukalapak-com.cdn.ampproject.org/ii/w180/s/s0.bukalapak.com/img/50209595231/s-194-194/data.png");
        infoMakanan.add("Berikutnya ada Es teh manis yang dapat menyejukkan tenggorokan                                                       Harga : Rp.3.000");

        prosesRecyclerViewAdapter();
    }

}
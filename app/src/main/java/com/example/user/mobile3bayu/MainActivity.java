package com.example.user.mobile3bayu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resep_nama.add("Pecel Sayur");
        resep_detail.add("Pecel Sayur adalah makanan yang menggunakan bumbu sambal kacang sebagai bahan utamanya yang dicampur dengan aneka jenis sayuran");
        resep_ingredients.add("1. 7 batang kacang panjang \n2. 1 buah wortel\n3. 1 buah timun\n4. 3 buah tahu ");
        resep_process.add("1. Siapkan air untuk merebus bahan bahan\n2. Potong potong kacang panjang, cuci bersih sisihkan lalu iris wortel (saya pakai parutan keju yang agak gede) cuci bersih tiriskan, cuci timun potong dadu, sisihkan. Kalo untuk tahu, kebetulan tahu kulit yang udah mateng jd tinggal dipotong dadu saja\n3. Setelah air mendidih masukkan kacang panjang aduk2 jangan terlalu lama setelah matang, tiriskan. Lalu gantian masukkan irisan wortel aduk sebentar setelah matang tiriskan\n4. Untuk bumbu kacang = blender (uleg) semua bahan sampe halus lalu beri air hangat sedikit2,sampai agak encer, koreksi rasa\n5. Pecel sayur & bumbu siap disajikan");
        resep_nama.add("Nasi Goreng");
        resep_detail.add("Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.");
        resep_ingredients.add("1.  sepiring Nasi putih \n2.  Udang segar,sosis,daging,ayam,\n3. Bawang Putih\n4. 1 sdm Mentega\n5. 1 btr Telur ayam dikocok asal saja\n6. 1 sdt Kecap manis");
        resep_process.add("Panaskan mentega,masukan bawang putih,tumis sampai harum,masukan udang segar,daging ayam dan sosis,aduk rata,kemudian masukan kocokan telur dan bumbu dasar Chinese Food,aduk sampai rata,kemudian  masukan nasi putih,aduk secara cepat agar tidak hangus,terahir masukan kecap manis sambil diaduk secara cepat.\n");

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

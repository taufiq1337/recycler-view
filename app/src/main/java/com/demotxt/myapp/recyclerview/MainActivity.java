package com.demotxt.myapp.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Yoshinaya","Categorie Makanan","Nikmati makanan protein dan sayuran yang seimbang di Yoshinoya. Dengan berbagai pilihan mangkuk nasi yang disajikan dengan seporsi sayuran yang berlimpah, pilih dari favorit sepanjang masa seperti Teriyaki Chicken Don dan Beef Don untuk mendapatkan semua kebutuhan gizi Anda. Makan sehat, Makan cepat, Makan segar.",R.drawable.thevigitarian));
        lstBook.add(new Book("Tori Ball","Categorie Makanan","Dihasilkan dari olahan daging dada ayam yang dilapis oleh tepung roti dan dimasak dengan metode Deep Frying Oil",R.drawable.thewildrobot));
        lstBook.add(new Book("Coca Cola","Categorie Makanan","Coca Cola Kaleng",R.drawable.mariasemples));
        lstBook.add(new Book("Nasi","Categorie Makanan","Nasi Dengan Olahan Khas Hokben",R.drawable.themartian));
        lstBook.add(new Book("Paket B","Categorie Makanan","Nasi, Salad, Chicken Yakiniku, 2 pcs Egg Chicken Roll, 1 pc Ebi Furai",R.drawable.hediedwith));
        lstBook.add(new Book("Super Supreme","Categorie Makanan","Daging ayam dan sapi asap, daging sapi cincang, burger sapi, jamur, paprika merah dan paprika hijau",R.drawable.pizza));
        lstBook.add(new Book("Meatballs Beef Mushroom Rice","Categorie Makanan","Nasi dengan bola daging sapi lembut disiram saus daging sapi cincang dan jamur",R.drawable.meat));
        lstBook.add(new Book("Garlic Bread","Categorie Makanan","Roti Panggang dengan bumbu bawang putih",R.drawable.garlic));
        lstBook.add(new Book("Fresh Salad / Buah","Categorie Makanan","Pilih sendiri sayuran segar setiap hari dan tentukan saus pilihanmu sebagai pendampingnya di Salad Bar.",R.drawable.salad));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}

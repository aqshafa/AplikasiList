package com.example.aplikasilist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailGoogle extends AppCompatActivity {

    public static final String KEY_MOVIE = "KEY";

    ImageView gambar;
    TextView tvJudul, tvIsi;
    String idGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_google);
        idGoogle = getIntent().getStringExtra("KEY");
        tvJudul = findViewById(R.id.tvJudul);
        tvIsi = findViewById(R.id.tvIsi);
        gambar = findViewById(R.id.gambar);

        if (idGoogle.equals("Gmail")){
            gambar.setImageResource(R.drawable.gmail);
            tvJudul.setText("Gmail");
            tvIsi.setText("Gmail adalah layanan surel milik Google. Pengguna dapat mengakses Gmail dalam bentuk surat web HTTPS, protokol POP3 atau IMAP4. Gmail diluncurkan dengan sistem undangan dalam bentuk Beta pada 1 April 2004 dan tersedia untuk publik pada 7 Februari 2007 meski masih menyandang status Beta.");
            setTitle("Gmail");
        }else if (idGoogle.equals("Youtube")) {
            gambar.setImageResource(R.drawable.yt);
            tvJudul.setText("YouTube");
            tvIsi.setText("YouTube adalah sebuah situs web berbagi video yang dibuat oleh tiga mantan karyawan PayPal pada Februari 2005. Situs web ini memungkinkan pengguna mengunggah, menonton, dan berbagi video.");
            setTitle("YouTube");
        }else if (idGoogle.equals("G Docs")) {
            setTitle("Google Docs");
            gambar.setImageResource(R.drawable.logodocs);
            tvJudul.setText("Google Docs");
            tvIsi.setText("Google Docs adalah layanan pengolah kata, lembar sebar, presentasi, formulir, dan penyimpanan data berbasis web gratis dari Google. Layanan ini pertama kali diluncurkan pada 10 Oktober 2006 sebagai gabungan dua layanan: Writely dan Spreadsheets.");
        }else if (idGoogle.equals("G Maps")) {
            setTitle("Google Maps");
            gambar.setImageResource(R.drawable.logomaps);
            tvJudul.setText("Google Maps");
            tvIsi.setText("Google Maps adalah layanan pemetaan web yang dikembangkan oleh Google. Layanan ini memberikan citra satelit, peta jalan, panorama 360°, kondisi lalu lintas, dan perencanaan rute untuk bepergian dengan berjalan kaki, mobil, sepeda, atau angkutan umum.");
        }else if (idGoogle.equals("G Drive")) {
            setTitle("Google Drive");
            gambar.setImageResource(R.drawable.logodrive);
            tvJudul.setText("Google Drive");
            tvIsi.setText("Google Drive adalah layanan penyimpanan daring milik Google yang diluncurkan pada 24 April 2012. Layanan ini merupakan ekstensi dari Google Docs dan akan mengganti URL docs.google.com dengan drive.google.com setelah diaktifkan.");
        }else if (idGoogle.equals("G Photo")) {
            setTitle("Google Photo");
            gambar.setImageResource(R.drawable.photo);
            tvJudul.setText("Google Photo");
            tvIsi.setText("Google Foto adalah layanan penyimpanan dan berbagi foto daring dari Google yang diluncurkan pada 28 Mei 2015. Layanan ini merupakan sempalan dari Google+, jejaring sosial dari perusahaan yang sama. Pada saat peluncurannya, peninjau menyatakan bahwa layanan ini adalah yang terbaik pada jenisnya.");
        }else if (idGoogle.equals("G Playstore")) {
            setTitle("Google Play Store");
            gambar.setImageResource(R.drawable.logoplaystore);
            tvJudul.setText("Google Play Store");
            tvIsi.setText("Google Play adalah layanan konten digital milik Google yang melingkupi toko daring untuk produk-produk seperti musik/lagu, buku, aplikasi, permainan, ataupun pemutar media berbasis awan. Layanan ini dapat diakses baik melalui web, aplikasi android, dan Google TV.");
        }else if (idGoogle.equals("G Translate")) {
            setTitle("Google Translate");
            gambar.setImageResource(R.drawable.translate);
            tvJudul.setText("Google Translate");
            tvIsi.setText("Google Terjemahan adalah layanan yang disediakan oleh Google Inc. untuk menerjemahkan bagian teks atau halaman web dalam satu bahasa ke bahasa lain.");
        }else if (idGoogle.equals("G Classroom")) {
            setTitle("Google Classroom");
            gambar.setImageResource(R.drawable.logoclass);
            tvJudul.setText("Google Classroom");
            tvIsi.setText("Google Classroom adalah suatu serambi pembelajaran campuran yang diperuntukkan terhadap setiap ruang lingkup pendidikan yang dimaksudkan untuk menemukan jalan keluar atas kesulitan dalam membuat, membagikan dan menggolong-golongkan setiap penugasan tanpa kertas.");
        }else if (idGoogle.equals("G Hangouts")) {
            setTitle("Google Hangout");
            gambar.setImageResource(R.drawable.logohangout);
            tvJudul.setText("Google Hangout");
            tvIsi.setText("Google Hangouts adalah sebuah platform komunikasi yang dikembangkan oleh Google yang termasuk perpesanan instan, percakapan video, SMS dan fitur VOIP.");
        }
    }
}

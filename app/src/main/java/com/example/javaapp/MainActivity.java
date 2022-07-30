package com.example.javaapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import android.app.WallpaperManager;
import android.app.WallpaperManager;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Number num = 0;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*My app*/
        img = findViewById(R.id.imageView);
        String[] url = { /*set your urls here*/
               "https://i.pinimg.com/originals/89/b9/bb/89b9bb75dd89b176be471b502c56c28a.png",
                "https://i.pinimg.com/736x/a6/1d/ef/a61def44b2004bc20eb9c2a3bfdd2a45.jpg",
                "https://wallpaperaccess.com/full/5919495.jpg",
                "https://wallpaper-mania.com/wp-content/uploads/2018/09/High_resolution_wallpaper_background_ID_77700429765.jpg",
                "https://i.pinimg.com/736x/20/9a/39/209a39b373db6e48cc3f32312868c1a4.jpg",
                "https://i.pinimg.com/originals/5c/18/a3/5c18a30f489cd36ea84120cf2d15eae4.jpg",
                "https://i.pinimg.com/236x/a8/41/73/a84173e7cdb8add7c75af9763d250776.jpg",
                "https://wallpaperaccess.com/full/7254527.jpg",
                "https://img3.wallspic.com/previews/4/5/4/2/5/152454/152454-apple-iphone-macos_big_sur-apples-hnh_nn_ios_14-x750.jpg",
                "https://iphone11papers.com/wp-content/uploads/papers.co-vy71-color-great-yellow-line-pattern-background-41-iphone-wallpaper-240x519.jpg",
                "https://cdn.wallpapersafari.com/79/11/Qzt9fq.jpg",
                "https://wallpaperaccess.com/full/3586413.png",
                "https://cutewallpaper.org/22/android-11-wallpapers/download-funtouch-os-11-stock-wallpapers-fhd-official.jpg",
                "https://cutewallpaper.org/22/android-11-wallpapers/android-11-wallpapers-ytechbcom-google-pixel-wallpaper-android-wallpaper-apple-wallpaper.png",
                "https://cutewallpaper.org/22/android-11-wallpapers/android-11-wallpapers-top-free-android-11-backgrounds-wallpaperaccess.png",
                "https://cutewallpaper.org/22/android-11-wallpapers/download-android-11-wallpapers-hd-wallpapers-cool-tech-biz.png",
                "https://wallpaperaccess.com/full/1345201.png",
                "https://androidgram.com/wp-content/uploads/2020/10/Vivo-V20-Wallpaper-1-YTECHB-461x1024.png",
                "https://i.pinimg.com/originals/bf/70/46/bf704686be33c217ed63ccd5510015e9.jpg",
                "https://i.pinimg.com/originals/f3/a6/2c/f3a62c93c520b5e60e208f53804c152f.png",
                "https://i.pinimg.com/originals/a9/d8/85/a9d8852f106344921246e89eda560fd3.png",
                "https://www.teahub.io/photos/full/78-782327_download-latest-blue-wallpaper-for-android-phone-this.jpg",
                "https://www.fonewalls.com/wp-content/uploads/2019/09/Minimal-Wallpaper-HD-for-Phone-065-300x585.jpg",
                "https://i.pinimg.com/736x/2c/9a/f1/2c9af1d637da127d848c7ab53108eb27.jpg",
                "https://i.pinimg.com/736x/ba/da/cb/badacb0570090e302944e809c3f89648.jpg",
                "https://i.pinimg.com/736x/60/aa/1c/60aa1c8cb0314f33c39f0cfee03b9693.jpg",
                "https://i.pinimg.com/originals/30/76/d7/3076d755b60e6298e3f61b831bb77caf.png",
                "https://i.pinimg.com/originals/dd/eb/89/ddeb89e008f961404c509d8c46efdc56.png",
                "https://uploads-ssl.webflow.com/5cde3e1600aa68110d307811/5f8e35fd4f8f2d1064451fa1_The%20Appreciative%20Minimalist%20Wallpaper%20Color%201.png",
                "https://www.fonewalls.com/wp-content/uploads/2019/09/Minimal-Wallpaper-HD-for-Phone-071-768x1280.jpg",
                "https://i.pinimg.com/736x/bc/3c/9f/bc3c9f796859449a976d34d623c9b973.jpg",
                "https://i.pinimg.com/originals/1a/d2/09/1ad209f4c55c1f44f970689d2adc5fa8.jpg",
                "https://1.bp.blogspot.com/-7DhCqjeGrR0/X4N3YCyThbI/AAAAAAAAbv8/nakNLlegu7QjoyuGegT9Na47s8hnf4WMQCLcBGAsYHQ/w1600/DESERTT-NIGHT-MOBILE-HD.png",
                "https://i.pinimg.com/originals/be/fe/e5/befee5dec916162e3ec26cd36769b812.jpg",
                "https://cutewallpaper.org/22/minimalist-android-4k-wallpapers/2788231367.jpg"

        };
         Picasso.get().load(url[0]).fit()
                 .centerCrop().into(img);
         /*Events*/
        /*Advance button*/
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num = (int)num+1;
                if((int)num> 34){

                    num = 0;
                }
                Picasso.get().load(url[(int) num]).fit()
                        .centerCrop().into(img);
            }
        });
        /*Back button*/
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num = (int)num-1;
                if((int)num<0){
                    num = 34;
                }
                Picasso.get().load(url[(int) num]).fit()
                        .centerCrop().into(img);

            }
        });
        /*Set wallpaper*/

        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Target target = new Target() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        Log.e(TAG, "OnBitmapLoaded");
                        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                        try {
                            wallpaperManager.setBitmap(bitmap);
                            Toast.makeText(getApplicationContext(),"Set successfully", Toast.LENGTH_SHORT).show();

                        } catch (IOException e) {
                            e.printStackTrace();
                            Log.e(TAG, "IOException->" + e.getMessage());
                        }
                    }


                    @Override
                    public void onBitmapFailed(Exception e, Drawable errorDrawable) {
                        Log.e(TAG, "" + e.getMessage());
                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {
                        Log.e(TAG, "OnPrepareLoad");
                    }
                };

                Picasso.get().load(url[(int) num]).into(target);


            }
        });


    }

}
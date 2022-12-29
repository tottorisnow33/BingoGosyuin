package com.makty.bingogosyuin;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.makty.bingogosyuin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Context m_context = null;       /*コンテキスト*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        Log.v("aa", "nekoMainActivity Created");

//        m_context = this.getBaseContext();
//
//        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.navigation_home);
//
//        m_context = fragment.getActivity();
//
//        LinearLayout linearLayout = new LinearLayout(m_context);
//        setContentView(linearLayout);
//
//        ViewGroup.LayoutParams layoutParams  = linearLayout.getLayoutParams();
//        layoutParams.height = 200;
//        layoutParams.width = 200;
//
//        linearLayout.setLayoutParams(layoutParams);


//        m_context. (linearLayout);
        /*ボタン作成*/
//        Button button1 = new Button(this);
//        button1.setText("Button1");
//        linearLayout.addView(button1);



    }

}
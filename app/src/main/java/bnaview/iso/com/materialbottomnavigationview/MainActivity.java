package bnaview.iso.com.materialbottomnavigationview;


import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import bnaview.iso.com.materialbottomnavigationview.fragment.BuscarFragment;
import bnaview.iso.com.materialbottomnavigationview.fragment.CuentaFragment;
import bnaview.iso.com.materialbottomnavigationview.fragment.FavoritosFragment;
import bnaview.iso.com.materialbottomnavigationview.fragment.InicioFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bnview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        cambiarFragment(InicioFragment.newInstance());

        bnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.m_inicio:
                        cambiarFragment(InicioFragment.newInstance());
                        return true;

                    case R.id.m_buscar:
                        cambiarFragment(BuscarFragment.newInstance());
                        return true;

                    case R.id.m_favoritos:
                        cambiarFragment(FavoritosFragment.newInstance());
                        return true;

                    case R.id.m_cuenta:
                        cambiarFragment(CuentaFragment.newInstance());
                        return true;
                }


                return false;
            }
        });
    }

    private void init() {
        this.bnview = findViewById(R.id.bnview);
    }


    private void cambiarFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, fragment);
        transaction.commit();
    }


}

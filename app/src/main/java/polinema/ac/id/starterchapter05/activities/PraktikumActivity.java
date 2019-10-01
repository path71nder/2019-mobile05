package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragment.DipsFragment;
import polinema.ac.id.starterchapter05.fragment.HandstandFragment;
import polinema.ac.id.starterchapter05.fragment.PushUpFragment;

public class PraktikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);
    }

    public void handlerClickLoadPushUpFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new PushUpFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void handlerClickLoadDipsFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new DipsFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void handlerClickLoadHandstandFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new HandstandFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}

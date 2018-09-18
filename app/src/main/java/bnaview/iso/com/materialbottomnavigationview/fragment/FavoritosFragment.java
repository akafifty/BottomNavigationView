package bnaview.iso.com.materialbottomnavigationview.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import bnaview.iso.com.materialbottomnavigationview.R;

public class FavoritosFragment extends Fragment {

    public static FavoritosFragment newInstance() {
        return new FavoritosFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.favoritos_fragment, container, false);

        return view;
    }
}

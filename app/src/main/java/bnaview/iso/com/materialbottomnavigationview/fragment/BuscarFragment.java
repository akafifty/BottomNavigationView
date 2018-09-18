package bnaview.iso.com.materialbottomnavigationview.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import bnaview.iso.com.materialbottomnavigationview.R;

public class BuscarFragment extends Fragment {

    public static BuscarFragment newInstance() {
        return new BuscarFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.buscar_fragment, container, false);

        return view;
    }
}

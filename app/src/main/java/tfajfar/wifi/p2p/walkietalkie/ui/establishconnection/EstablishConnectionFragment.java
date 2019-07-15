package tfajfar.wifi.p2p.walkietalkie.ui.establishconnection;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tfajfar.wifi.p2p.walkietalkie.R;

public class EstablishConnectionFragment extends Fragment {

    private EstablishConnectionViewModel mViewModel;

    public static EstablishConnectionFragment newInstance() {
        return new EstablishConnectionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.establish_connection_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(EstablishConnectionViewModel.class);
        // TODO: Use the ViewModel
    }

}

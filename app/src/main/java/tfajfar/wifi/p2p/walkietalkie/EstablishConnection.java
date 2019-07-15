package tfajfar.wifi.p2p.walkietalkie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import tfajfar.wifi.p2p.walkietalkie.ui.establishconnection.EstablishConnectionFragment;

public class EstablishConnection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.establish_connection_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, EstablishConnectionFragment.newInstance())
                    .commitNow();
        }
    }
}

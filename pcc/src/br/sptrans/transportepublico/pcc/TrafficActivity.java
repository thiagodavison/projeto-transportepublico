package br.sptrans.transportepublico.pcc;

import android.os.Bundle;

/**
 * Created by rreimberg on 10/26/13.
 */
public class TrafficActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
        defaultNavigation();
    }
}
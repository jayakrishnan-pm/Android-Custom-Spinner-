package app.devdeeds.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> spinnerAdapterData = new ArrayList<>();

        String[] spinnerItemsArray = getResources().getStringArray(R.array.items);

        Collections.addAll(spinnerAdapterData, spinnerItemsArray);

        SpinnerAdapter adapter = new SpinnerAdapter(this, R.layout.adapter_spinner, spinnerAdapterData, getResources());


        Spinner itemList = (Spinner) findViewById(R.id.custom_spinner);
        itemList.setAdapter(adapter);

    }
}

package android.dominando.testedeadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvLista;

    List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strings = new ArrayList<>();
        strings.add("Ricardo é um ...");
        strings.add("Hello world");
        strings.add("Padre fabio de melo");
        strings.add("Juquinha");

        lvLista = (ListView)findViewById(R.id.lvLista);
        
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                strings);

        lvLista.setAdapter(adapter);

    }

}

package com.example.erlin.examen01;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ListViewAdapter adapter;

    ListView lista;
    String[] restaurant = new String[]{
            "Anticucho $4.00",
            "Causa $10.00",
            "Rocoto Relleno $10.00",
            "Papa a la Huancaina $5.00",
            "Ceviche $15.00",
            "Lomo Saltado $5.00"
    };
    int[] imagenes = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.miLista);
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurant);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
               //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent ii = new Intent(getApplicationContext(), anticucho.class);
                        startActivity(ii);
                        break;
                    case 1 :
                        Intent iii = new Intent(getApplicationContext(), Causa.class);
                        startActivity(iii);

                        break;
                    case 2:
                        Intent iiii = new Intent(getApplicationContext(), Rocoto.class);
                        startActivity(iiii);

                        break;
                    case 3 :
                        Intent iiiii = new Intent(getApplicationContext(), Papa.class);
                        startActivity(iiiii);

                        break;
                    case 4 :
                        Intent iiiiii = new Intent(getApplicationContext(), Cebiche.class);
                        startActivity(iiiiii);

                        break;
                    case 5 :
                        Intent iiiiiii = new Intent(getApplicationContext(), Saltado.class);
                        startActivity(iiiiiii);

                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final ListView lista = (ListView) findViewById(R.id.miLista);
        adapter = new ListViewAdapter(this, restaurant, imagenes);
        lista.setAdapter(adapter);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Inicio");
        Toast toast10 = Toast.makeText(getApplicationContext(),"Welcome To Tia Veneno Restaurant", Toast.LENGTH_SHORT);
        toast10.show();
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Platos1");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Platos2");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.action_settings:  return true;
            case R.id.reporte:

                return true;
            case R.id.cliente:
                Toast toast1 = Toast.makeText(getApplicationContext(),"Cliente", Toast.LENGTH_SHORT);
                toast1.show();
                return true;
            case R.id.producto:
                Toast toast2 = Toast.makeText(getApplicationContext(),"Producto", Toast.LENGTH_SHORT);
                toast2.show();

                return true;
            case R.id.categoria:
                Toast toast3 = Toast.makeText(getApplicationContext(),"Categoria", Toast.LENGTH_SHORT);
                toast3.show();
                return true;
            case R.id.vendedor:
                Toast toast4 = Toast.makeText(getApplicationContext(),"Vendedor", Toast.LENGTH_SHORT);
                toast4.show();
                return true;
            case R.id.rp:
                Toast toast5 = Toast.makeText(getApplicationContext(),"Reporte Producto", Toast.LENGTH_SHORT);
                toast5.show();
                return true;
            case R.id.rv:
                Toast toast6 = Toast.makeText(getApplicationContext(),"Reporte Ventas", Toast.LENGTH_SHORT);
                toast6.show();

                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
    public void causa (View view) {
        startActivity(new Intent(this, Causa.class));
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
    public void anticucho (View view) {
        startActivity(new Intent(this, anticucho.class));
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
    public void rocoto (View view) {
        startActivity(new Intent(this, Rocoto.class));
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
    public void papa (View view) {
        startActivity(new Intent(this, Papa.class));
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
    public void saltado (View view) {
        startActivity(new Intent(this, Saltado.class));
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
    public void cebiche (View view) {
        startActivity(new Intent(this, Cebiche.class));
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }


}

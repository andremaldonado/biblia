package br.com.jcnaveia.biblia;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class BooksActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        setTitle("Bíblia"); //TODO: Check a better way to set the title

        ListView listViewBooks = (ListView) findViewById(R.id.listViewBooks);
        listViewBooks.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getBooks()));
    }

    //TODO: Move this method to a better place
    private String[] getBooks() {
        return new String[]
                    {
                            "Gênesis",
                            "Êxodo",
                            "Levítico",
                            "Números",
                            "Deuteronômio",
                            "Josué",
                            "Juízes",
                            "Rute",
                            "1 Samuel",
                            "2 Samuel",
                            "1 Reis",
                            "2 Reis",
                            "1 Crônicas",
                            "2 Crônicas",
                            "Esdras",
                            "Neemias",
                            "Ester",
                            "Jó",
                            "Salmos",
                            "Provérbios",
                            "Eclesiastes",
                            "Cânticos",
                            "Isaías",
                            "Jeremias",
                            "Lamentações",
                            "Ezequiel",
                            "Daniel",
                            "Oséias",
                            "Joel",
                            "Amós",
                            "Obadias",
                            "Jonas",
                            "Miquéias",
                            "Naum",
                            "Habacuque",
                            "Sofonias",
                            "Ageu",
                            "Zacarias",
                            "Malaquias",
                            "Mateus",
                            "Marcos",
                            "Lucas",
                            "João",
                            "Atos",
                            "Romanos",
                            "1 Coríntios",
                            "2 Coríntios",
                            "Gálatas",
                            "Efésios",
                            "Filipenses",
                            "Colossenses",
                            "1 Tessalonicenses",
                            "2 Tessalonicenses",
                            "1 Timóteo",
                            "2 Timóteo",
                            "Tito",
                            "Filemom",
                            "Hebreus",
                            "Tiago",
                            "1 Pedro",
                            "2 Pedro",
                            "1 João",
                            "2 João",
                            "3 João",
                            "Judas",
                            "Apocalipse"
                    };
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_books, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

/*
 * This file is part of Biblia.
 *
 * Biblia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Biblia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package br.com.jcnaveia.biblia;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class BooksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books, container, false);

        //Print the list of books
        //TODO: Fix this bug
        //ListView listViewBooks = (ListView) findViewById(R.id.listViewBooks);
        //listViewBooks.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getBooks()));
    }

    //TODO: Move this method to a better place
    /*
     * Return the list of bible books
     */
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

}

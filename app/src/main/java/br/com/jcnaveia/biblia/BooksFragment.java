package br.com.jcnaveia.biblia;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;


import br.com.jcnaveia.biblia.dummy.DummyContent;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Large screen devices (such as tablets) are supported by replacing the ListView
 * with a GridView.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnFragmentInteractionListener}
 * interface.
 */
public class BooksFragment extends Fragment implements AbsListView.OnItemClickListener {

    private OnFragmentInteractionListener mListener;

    /**
     * The Adapter which will be used to populate the ListView/GridView with
     * Views.
     */
    private ListAdapter mAdapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public BooksFragment() {
    }

    //TODO: comment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, getBooks());
    }

    //TODO: comment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_books, container, false);

        // Set the adapter
        AbsListView mListView = (AbsListView) view.findViewById(android.R.id.list);
        (mListView).setAdapter(mAdapter);

        // Set OnItemClickListener so we can be notified on item clicks
        mListView.setOnItemClickListener(this);

        return view;
    }

    //TODO: comment
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    //TODO: comment
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    //TODO: comment
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (null != mListener) {
            // Notify the active callbacks interface (the activity, if the
            // fragment is attached to one) that an item has been selected.
            mListener.onFragmentInteraction(String.valueOf(position));
        }
    }

    //TODO: comment
    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(String id);
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

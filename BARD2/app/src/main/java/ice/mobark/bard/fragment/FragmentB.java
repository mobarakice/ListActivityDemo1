package ice.mobark.bard.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ice.mobark.bard.R;
import ice.mobark.bard.interfaces.Commonicator;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {


    private ListView lvItem2;
    String[] DetailOfBard = {"Founder of BARD", "The Function of the academy",
            "Reserch", "Training", "Action Reserch", "Facilities of BARD", "Facalty"};
    String[] titles;
    ArrayAdapter<String> adapter2;

    private Commonicator commonicator;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        lvItem2 = (ListView) v.findViewById(R.id.lv_list_item2);


        //initialize array..........
        titles = getResources().getStringArray(R.array.titles);

        // initialize adapetr.......
        adapter2 = new ArrayAdapter<>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1, titles);

        lvItem2.setAdapter(adapter2);

        lvItem2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                commonicator.onRespond(position);
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        commonicator = (Commonicator) getActivity();
    }
}

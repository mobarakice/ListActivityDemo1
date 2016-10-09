package ice.mobark.bard.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ice.mobark.bard.R;
import ice.mobark.bard.adapter.ImageAdapter;


public class FragmentC extends Fragment {

    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private ImageAdapter imageAdapter;

    private int[] icons = {R.drawable.home_pic, R.drawable.pic0, R.drawable.sample2, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5, R.drawable.sample6, R.drawable.sample7, R.drawable.sample8,
            R.drawable.sample9, R.drawable.sample10, R.drawable.sample11, R.drawable.sample12, R.drawable.sample13,
            R.drawable.sample14, R.drawable.sample15, R.drawable.sample16, R.drawable.sample17, R.drawable.sample18,
            R.drawable.sample19, R.drawable.sample20, R.drawable.sample21, R.drawable.sample22, R.drawable.sample23,
            R.drawable.sample24, R.drawable.sample25, R.drawable.sample26, R.drawable.sample27, R.drawable.sample28,
            R.drawable.sample29, R.drawable.sample30, R.drawable.sample31, R.drawable.sample32, R.drawable.sample33,
            R.drawable.sample34, R.drawable.sample35, R.drawable.sample36, R.drawable.sample37, R.drawable.sample38,
            R.drawable.sample39, R.drawable.sample40, R.drawable.sample41, R.drawable.sample42, R.drawable.sample43,
            R.drawable.sample44, R.drawable.sample45, R.drawable.sample46, R.drawable.sample47, R.drawable.sample48,
            R.drawable.sample49, R.drawable.sample50, R.drawable.sample51, R.drawable.sample52, R.drawable.sample53,
            R.drawable.sample54, R.drawable.sample55, R.drawable.sample56, R.drawable.sample57, R.drawable.sample58,
            R.drawable.sample59, R.drawable.sample60, R.drawable.sample61, R.drawable.sample62, R.drawable.sample63};


    public FragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_c, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.rv_gallery);
        recyclerView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        imageAdapter = new ImageAdapter(getActivity(), icons);
        recyclerView.setAdapter(imageAdapter);

        return v;
    }

}

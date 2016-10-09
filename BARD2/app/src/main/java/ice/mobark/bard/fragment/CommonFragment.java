package ice.mobark.bard.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import ice.mobark.bard.R;


/**
 * Created by user on 10/6/2015.
 */
public class CommonFragment extends Fragment {


    //    private ImageView imageView;
    private WebView webView;
    private ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.common_layout_for_all_list_fragment, container, false);
        webView = (WebView) v.findViewById(R.id.wv_founder);
        imageView = (ImageView) v.findViewById(R.id.iv_founder_pic);
        return v;
    }

    public void changeData(int position) {

        String[] desprictions = getResources().getStringArray(R.array.descriptionOfBard);
        String htmlText = " %s ";
        webView.loadData(String.format(htmlText, desprictions[position]), "text/html", "utf-8");

    }
}

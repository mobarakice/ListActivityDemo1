package ice.mobark.bard.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import ice.mobark.bard.R;


public class FragmentA extends Fragment {

    //    private ImageView imageView;
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);
//        imageView = (ImageView) v.findViewById(R.id.image1);
        webView = (WebView) v.findViewById(R.id.webView1);
        String htmlText = " %s ";
        webView.loadData(String.format(htmlText, getString(R.string.establishment)), "text/html", "utf-8");
        return v;
    }

}

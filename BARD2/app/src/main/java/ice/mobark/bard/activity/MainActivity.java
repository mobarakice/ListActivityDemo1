package ice.mobark.bard.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;

import ice.mobark.bard.R;
import ice.mobark.bard.adapter.ViewPagerAdapter;
import ice.mobark.bard.fragment.CommonFragment;
import ice.mobark.bard.interfaces.Commonicator;

public class MainActivity extends AppCompatActivity implements Commonicator {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPagerAdapter mAdapter;
    private FragmentManager mManager;

    public static int width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.pager);
        mManager = getSupportFragmentManager();
        mAdapter = new ViewPagerAdapter(mManager);
        viewPager.setAdapter(mAdapter);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        calDim();

    }

    private void calDim() {
        // Calculate screen dimension
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        int height = metrics.heightPixels;
        width = metrics.widthPixels;
//        int dimension = height * width;
    }

    @Override
    public void onRespond(int i) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.frag_layout);
        layout.setVisibility(View.VISIBLE);
        CommonFragment commonFragment = (CommonFragment) mManager.findFragmentById(R.id.fragment_common);
        commonFragment.changeData(i);

    }
}

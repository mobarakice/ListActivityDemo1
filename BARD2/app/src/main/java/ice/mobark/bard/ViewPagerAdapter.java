package ice.mobark.bard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by user on 12/17/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        if (position == 0) {
            f = new FragmentA();
        }
        if (position == 1) {
            f = new FragmentB();
        }
        if (position == 2) {
            f = new FragmentC();
        }
        if (position == 3) {
            f = new FragmentD();
        }
        return f;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title = "";
        if (position == 0) {
            title = "Home";
        }
        if (position == 1) {
            title = "Detail";
        }
        if (position == 2) {
            title = "Gallery";
        }
        if (position == 3) {
            title = "Map";
        }
        return title;
    }
}

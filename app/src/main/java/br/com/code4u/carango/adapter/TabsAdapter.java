package br.com.code4u.carango.adapter;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import br.com.code4u.carango.R;
import br.com.code4u.carango.fragments.CarrosFragment;


/**
 * Created by Felipe on 19/10/2016.
 */
public class TabsAdapter extends FragmentStatePagerAdapter {

    public static final int TOTAL_TABS = 2;

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        if (position == 0) {
            args.putInt("tipo", 1);
        } else if (position == 1) {
            args.putInt("tipo", 2);
        }
        Fragment f = new CarrosFragment();
        f.setArguments(args);
        return f;
    }

    //Retorna o total de tabs que temos criada
    @Override
    public int getCount() {
        return TOTAL_TABS;
    }


}

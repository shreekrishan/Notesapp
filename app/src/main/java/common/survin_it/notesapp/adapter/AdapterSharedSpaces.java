package common.survin_it.notesapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import common.survin_it.notesapp.share.SharedActivity;
import common.survin_it.notesapp.share.SharedEventFragment;
import common.survin_it.notesapp.share.SharedNotesFragment;

public class AdapterSharedSpaces extends FragmentPagerAdapter {
    SharedActivity context;
    int totalTabs;
    public AdapterSharedSpaces(SharedActivity c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SharedEventFragment sharedEventFragment = new SharedEventFragment();
                return sharedEventFragment;
            case 1:
                SharedNotesFragment sharedNotesFragment = new SharedNotesFragment();
                return sharedNotesFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}

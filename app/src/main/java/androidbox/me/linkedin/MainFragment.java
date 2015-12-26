package androidbox.me.linkedin;


import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        TextView tvLevel = (TextView)view.findViewById(R.id.tvLevel);
        CircleImageView circleImageView = (CircleImageView)view.findViewById(R.id.civProfilePic);

        View photoHeader = view.findViewById(R.id.photoHeader);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            photoHeader.setTranslationZ(6);
            photoHeader.invalidate();

  //          circleImageView.setTranslationZ(4);
    //        circleImageView.invalidate();

   //         tvLevel.setTranslationZ(4);
  //          tvLevel.bringToFront();
    //        tvLevel.requestLayout();
    //        tvLevel.invalidate();
        }

/*
        tvLevel.bringToFront();
        tvLevel.requestLayout();
        tvLevel.invalidate();
*/

        return view;
    }

}

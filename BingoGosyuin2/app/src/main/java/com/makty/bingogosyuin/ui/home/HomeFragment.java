package com.makty.bingogosyuin.ui.home;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.makty.bingogosyuin.R;
import com.makty.bingogosyuin.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private Context m_context = null;       /*コンテキスト*/
    private View m_view = null;

    private boolean clicked = false;
    private @ColorInt
    int mBackgroundColor = Color.TRANSPARENT;

    /**画面上のビュー**/
    ScrollView m_scrollView = null;

    Button mButton0_0 = null;
    Button mButton0_1 = null;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        m_context = this.getContext();


        /*バックグラウンドのスクロールビュー取得*/
        m_scrollView = (ScrollView) root.findViewById(R.id.scrollViewHome);

        /*ボタン設置レイアウト作成*/
        LinearLayout layout = new LinearLayout(m_context);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        layout.setGravity(Gravity.CENTER);

        /*ボタン作成*/
        mButton0_0 = new Button(m_context);
        mButton0_0.setBackgroundColor(0xFFee7800);
        mButton0_0.setText("鹿島神社\n(茨城県)");
        layout.addView(mButton0_0);

        mButton0_1 = new Button(m_context);
        mButton0_1.setBackgroundColor(0xFFee7800);
        mButton0_1.setGravity(Gravity.CENTER);
        mButton0_1.setText("鹿島神社\n(茨城県)");
        layout.addView(mButton0_1);

        /*スクロールビューにレイアウトを追加*/
        m_scrollView.addView(layout);

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
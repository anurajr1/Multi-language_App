package com.anu.developers3k.languagechange;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class BottomSheetFragment extends BottomSheetDialogFragment{

    ImageView tickEnglish;
    ImageView tickHindi;
    ImageView tickRussia;
    ImageView tickThai;
    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);

        //Set the custom view
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_bottom_sheet, null);
        dialog.setContentView(view);

        tickEnglish = (ImageView) view.findViewById(R.id.tick_english);
        tickEnglish.setVisibility(View.GONE);

        tickHindi = (ImageView) view.findViewById(R.id.tick_hindi);
        tickHindi.setVisibility(View.GONE);
        tickRussia = (ImageView) view.findViewById(R.id.tick_russia);
        tickRussia.setVisibility(View.GONE);

        tickThai = (ImageView) view.findViewById(R.id.tick_thai);
        tickThai.setVisibility(view.GONE);






        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) ((View) view.getParent()).getLayoutParams();
        final CoordinatorLayout.Behavior behavior = params.getBehavior();

        if (behavior != null && behavior instanceof BottomSheetBehavior) {
            ((BottomSheetBehavior) behavior).setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
                @Override
                public void onStateChanged(@NonNull View bottomSheet, int newState) {
                    String state = "";

                    switch (newState) {
                        case BottomSheetBehavior.STATE_DRAGGING: {
                            state = "DRAGGING";
                            break;
                        }
                        case BottomSheetBehavior.STATE_SETTLING: {
                            state = "SETTLING";
                            break;
                        }
                        case BottomSheetBehavior.STATE_EXPANDED: {
                            state = "EXPANDED";
                            break;
                        }
                        case BottomSheetBehavior.STATE_COLLAPSED: {
                            state = "COLLAPSED";
                            break;
                        }
                        case BottomSheetBehavior.STATE_HIDDEN: {
                            dismiss();
                            state = "HIDDEN";
                            break;
                        }
                    }

//                    Toast.makeText(getContext(), "Bottom Sheet State Changed to: " + state, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                }
            });
        }


        //close icon of bottom sheet
        ImageView imageViewClose = (ImageView) view.findViewById(R.id.imageView);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //to close the bottom sheet
                ((BottomSheetBehavior) behavior).setState(BottomSheetBehavior.STATE_HIDDEN);

            }
        });


        //onclick on english language
        ImageView flagEnglish = (ImageView) view.findViewById(R.id.flagView_english);
        flagEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tickEnglish.setVisibility(View.VISIBLE);
                //to close the bottom sheet
                ((BottomSheetBehavior) behavior).setState(BottomSheetBehavior.STATE_HIDDEN);

            }
        });

    //onclick for hindi flag
        ImageView flagHindi = (ImageView) view.findViewById(R.id.flagView_hindi);
        flagHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tickEnglish.setVisibility(View.VISIBLE);

                //to close the bottom sheet
                ((BottomSheetBehavior) behavior).setState(BottomSheetBehavior.STATE_HIDDEN);

            }
        });

    //onclick for russia flag
        ImageView flagRussia = (ImageView) view.findViewById(R.id.flagView_russsia);
        flagRussia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //to close the bottom sheet
                ((BottomSheetBehavior) behavior).setState(BottomSheetBehavior.STATE_HIDDEN);

            }
        });

    //onlcik for thai flag
        ImageView flagThai = (ImageView) view.findViewById(R.id.flagView_thai);
        flagThai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //to close the bottom sheet
               // ((BottomSheetBehavior) behavior).setState(BottomSheetBehavior.STATE_HIDDEN);

            }
        });



    }
}

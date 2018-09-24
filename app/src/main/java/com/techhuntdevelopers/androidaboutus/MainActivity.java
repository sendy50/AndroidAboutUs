package com.techhuntdevelopers.androidaboutus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.techhuntdevelopers.library.builder.AboutBuilder;
import com.techhuntdevelopers.library.views.AboutView;

public class MainActivity extends AppCompatActivity {

    private FrameLayout about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();

        AboutBuilder builder = AboutBuilder.with(MainActivity.this)
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .setPhoto(R.mipmap.profile_picture)
                .setCover(R.mipmap.profile_cover)
                .setLinksAnimated(true)
                .setDividerDashGap(13)
                .setName("TechHunt Developers")
                .setSubTitle("Android Appilication Developer")
                .setLinksColumnsCount(4)
                .setBrief("Develop Innovatives")
                .addGooglePlayStoreLink("7399966994559253451")
                .addGitHubLink("techhuntdevelopers")
                .addFacebookLink("techhuntdevelopers")
                .addTwitterLink("user")
                .addInstagramLink("techhunt_developers")
                .addGooglePlusLink("user")
                .addYoutubeChannelLink("user")
                .addDribbbleLink("user")
                .addLinkedInLink("user")
                .addEmailLink("techhunt00@gmail.com")
                .addWhatsappLink("Thoriya Prahalad", "+918155851357")
                .addSkypeLink("user")
                .addGoogleLink("user")
                .addAndroidLink("user")
                .addWebsiteLink("site")
                .addFiveStarsAction()
                .addMoreFromMeAction("TechHunt Developers")
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .addUpdateAction()
                .setActionsColumnsCount(2)
                .addFeedbackAction("techhunt00@gmail.com")
                .addIntroduceAction((Intent) null)
                .addHelpAction((Intent) null)
                .addChangeLogAction((Intent) null)
                .addRemoveAdsAction((Intent) null)
                .addDonateAction((Intent) null)
                .setWrapScrollView(true)
                .setShowAsCard(true);

        AboutView view = builder.build();

        about.addView(view);
    }

    private void initView() {
        about = (FrameLayout) findViewById(R.id.about);
    }
}

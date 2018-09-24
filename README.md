<!-- Library Logo -->
<!-- <img src="app/src/main/res/mipmap-xxxhdpi/ic_launcher.png?raw=true" align="left" hspace="1" vspace="1">-->

<!-- Buy me a cup of coffe 
<a href='https://ko-fi.com/A406JCM' style='margin:13px;' target='_blank' align="right"><img align="right" height='36' src='https://az743702.vo.msecnd.net/cdn/kofi4.png?v=f' alt='Buy Me a Coffee at ko-fi.com' /></a>
<a href='https://play.google.com/store/apps/details?id=com.vansuita.materialabout.sample&pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1' target='_blank' align="right"><img align="right" height='36' src='https://s20.postimg.org/muzx3w4jh/google_play_badge.png' alt='Get it on Google Play' /></a>-->

# AndoidAboutUs


This is an [**Android Us**](https://developer.android.com) project. You can buid your own about us screen using this library to make build easily.

</br>

# app
 This library has a lot more customization and features than is able to show here. Please check the sample app.


<!--<img src="images/screenshots/dark.jpg" height='auto' width='270'/><img src="images/screenshots/light.jpg" height='auto' width='270'/><img src="images/screenshots/custom.jpg" height='auto' width='270'/>

[![Appetize.io](https://img.shields.io/badge/Apptize.io-Run%20Now-brightgreen.svg?)](https://appetize.io/embed/3b4dpd5kv90mpa67mp5h8mugc0?device=nexus7&scale=50&autoplay=true&orientation=portrait&deviceColor=black) [![Demo](https://img.shields.io/badge/Demo-Download-blue.svg)](http://apk-dl.com/dl/com.vansuita.materialabout.sample) 
 [![Codacy Badge](https://api.codacy.com/project/badge/Grade/118bb89e3bed43e2b462201654224a60)](https://www.codacy.com/app/jrvansuita/MaterialAbout?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=jrvansuita/MaterialAbout&amp;utm_campaign=Badge_Grade) 
 <a target="_blank" href="https://developer.android.com/reference/android/os/Build.VERSION_CODES.html#GINGERBREAD"><img src="https://img.shields.io/badge/API-9%2B-blue.svg?style=flat" alt="API" /></a> -->


# Setup

This library requires `minSdkVersion` to be set to `14` or above.

#### Step #1. Add the JitPack repository to your build file:

```gradle
allprojects {
    repositories {
	...
	maven { url "https://jitpack.io" }
    }
}
```

#### Step #2. Add the dependency ([See latest release](https://jitpack.io/#jrvansuita/MaterialAbout)).

```groovy
dependencies {
       implementation 'com.github.techhuntdevelopers:AndroidAboutUs:x.y.z'
}
```
# Implementation

Create a **AboutView** instance with **AboutBuilder**.
```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

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
                .setBrief("Develop Innovative")
                .addGooglePlayStoreLink("7399966994559253451")
                .addGitHubLink("techhuntdevelopers")
                .addFacebookLink("techhuntdevelopers")
                .addInstagramLink("techhunt_developers")
                .addEmailLink("techhunt00@gmail.com")
                .addWhatsappLink("Thoriya Prahalad", "+918155851357")
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

     about.addView(view); //about is Layout
}
```


# Additional

### Getting the list of actions or links from AboutBuilder.

```java
AboutBuilder aboutBuilder = AboutBuilder.with(this);

List<Item> actions = aboutBuilder.getActions();
List<Item> links = aboutBuilder.getActions();
```


#### Getting the view instance of any action or link from AboutView?

```java
AboutView view = AboutBuilder.with(this)
                 ...
                 .build();

View lastLinkView = view.findItem(builder.getLastLink());
View lastActionView = view.findItem(builder.getLastAction());
```

<!--# Used libraries

* [com.android.support:appcompat-v7](https://developer.android.com/topic/libraries/support-library/packages.html#v7-appcompat)
* [com.android.support:cardview-v7](https://developer.android.com/topic/libraries/support-library/packages.html#v7-cardview)
* [com.github.jrvansuita:IconHandler](https://github.com/jrvansuita/IconHandler)

#

<a href="https://plus.google.com/+JuniorVansuita" target="_blank">
  <img src="https://s20.postimg.org/59xees8vt/google_plus.png" alt="Google+" witdh="44" height="44" hspace="10">
</a>
<a href="https://www.linkedin.com/in/arleu-cezar-vansuita-júnior-83769271" target="_blank">
  <img src="https://s20.postimg.org/vxoeax4ah/linkedin.png" alt="LinkedIn" witdh="44" height="44" hspace="10">
</a>
<a href="https://www.instagram.com/jnrvans/" target="_blank">
  <img src="https://s20.postimg.org/lyyuap5h5/instagram.png" alt="Instagram" witdh="44" height="44" hspace="10">
</a>
<a href="https://github.com/jrvansuita" target="_blank">
  <img src="https://s20.postimg.org/jf37glhx5/github.png" alt="Github" witdh="44" height="44" hspace="10">
</a>
<a href="https://play.google.com/store/apps/dev?id=8002078663318221363" target="_blank">
  <img src="https://s20.postimg.org/5iuz4plo9/android.png" alt="Google Play Store" witdh="44" height="44" hspace="10">
</a>
<a href="mailto:vansuita.jr@gmail.com" target="_blank" >
  <img src="https://s20.postimg.org/slli3vn5l/email.png" alt="E-mail" witdh="44" height="44" hspace="10">
</a>-->





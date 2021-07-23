package com.example.checkpermission;

import android.app.ActivityGroup;
import android.app.ListActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> dangerousList = new ArrayList<>();
    private int mTargetSDK = 29;
    private String mData = "";
    private String mFacebookID = "";
    private String mPackageName = "";
    private String mFirebaseInstanceIDServiceCompare = "FirebaseInstanceIDService";

    private TextView tvValue1;
    private TextView tvValue2;
    private TextView tvValue3;
    private TextView tvValue4;
    private TextView tvValue5;
    private TextView tvValue6;
    private TextView tvValue7;
    private TextView tvValue9;
    private TextView tvValue10;
    private TextView tvValue11;
    private TextView tvValue12;
    private TextView tvValue13;
    private TextView tvValue14;
    private TextView tvValue15;
    private TextView tvValue16;
    private TextView tvValue17;
    private TextView tvPackagename;
    private TextView tvFacebookID;

    private ImageView imageB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvValue1 = (TextView) findViewById(R.id.tvValue1);
        tvValue2 = (TextView) findViewById(R.id.tvValue2);
        tvValue3 = (TextView) findViewById(R.id.tvValue3);
        tvValue4 = (TextView) findViewById(R.id.tvValue4);
        tvValue5 = (TextView) findViewById(R.id.tvValue5);
        tvValue6 = (TextView) findViewById(R.id.tvValue6);
        tvValue7 = (TextView) findViewById(R.id.tvValue7);
        tvValue9 = (TextView) findViewById(R.id.tvValue9);
        tvValue10 = (TextView) findViewById(R.id.tvValue10);
        tvValue11 = (TextView) findViewById(R.id.tvValue11);
        tvValue12 = (TextView) findViewById(R.id.tvValue12);
        tvValue13 = (TextView) findViewById(R.id.tvValue13);
        tvValue14 = (TextView) findViewById(R.id.tvValue14);
        tvPackagename = (TextView) findViewById(R.id.tvPackagename);
        tvFacebookID = (TextView) findViewById(R.id.tvFacebookID);
        imageB = (ImageView) findViewById(R.id.imageB);
        tvValue15 = (TextView) findViewById(R.id.tvValue15);
        tvValue16 = (TextView) findViewById(R.id.tvValue16);
        tvValue17 = (TextView) findViewById(R.id.tvValue17);


        if (getIntent() != null) {
            mData = getIntent().getStringExtra("mData");
            mFacebookID = getIntent().getStringExtra("mFbID");
            mPackageName = getIntent().getStringExtra("mPackageName");
            String mTarget = getIntent().getStringExtra("mTargetSDK");
            try {
                if (mTarget != null && !mTarget.isEmpty())
                    mTargetSDK = Integer.parseInt(mTarget);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        imageB.setImageDrawable(getResources().getDrawable(R.drawable.ic_777));

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.size();

        genPermission();

        mFacebookID = "1104699649713810";
        mPackageName = "vn.funtap.tuyetthevolam";

        mData = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\" android:versionCode=\"36553\" android:versionName=\"1.1.36553\" android:installLocation=\"preferExternal\" android:compileSdkVersion=\"23\" android:compileSdkVersionCodename=\"6.0-2438415\" package=\"vn.funtap.tuyetthevolam\" platformBuildVersionCode=\"28\" platformBuildVersionName=\"9\">\n" +
                "    <uses-sdk android:minSdkVersion=\"18\" android:targetSdkVersion=\"29\"/>\n" +
                "    <supports-screens android:anyDensity=\"true\" android:smallScreens=\"true\" android:normalScreens=\"true\" android:largeScreens=\"true\" android:xlargeScreens=\"true\"/>\n" +
                "    <application android:theme=\"@style/Theme.AppCompat.Light.NoActionBar\" android:label=\"Giang Hồ Chi Mộng\" android:icon=\"@mipmap/icon\" android:name=\"vn.funtap.tuyetthevolam.MyApplication\" android:debuggable=\"false\" android:allowBackup=\"true\" android:banner=\"@drawable/app_banner\" android:isGame=\"true\" android:networkSecurityConfig=\"@xml/network_security_config\" android:roundIcon=\"@mipmap/icon_round\" android:requestLegacyExternalStorage=\"true\">\n" +
                "        <meta-data android:name=\"android.max_aspect\" android:value=\"2.1\"/>\n" +
                "        <activity android:name=\"com.xingjia.game.QYFirstActivity\" android:launchMode=\"singleTop\" android:screenOrientation=\"sensorLandscape\" android:configChanges=\"keyboardHidden|orientation|screenSize\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.intent.action.MAIN\"/>\n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\"/>\n" +
                "                <category android:name=\"android.intent.category.LEANBACK_LAUNCHER\"/>\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "        <activity android:name=\"com.xingjia.game.SDK_ShouQu_SplashActivity\" android:screenOrientation=\"sensorLandscape\"/>\n" +
                "        <activity android:name=\"com.xingjia.game.SDK_DuoKeMeng_SplashActivity\" android:screenOrientation=\"sensorLandscape\"/>\n" +
                "        <activity android:name=\"com.xingjia.game.QYMainActivity\" android:launchMode=\"singleTask\" android:screenOrientation=\"sensorLandscape\" android:configChanges=\"mcc|mnc|locale|touchscreen|keyboard|keyboardHidden|navigation|orientation|screenLayout|uiMode|screenSize|smallestScreenSize|layoutDirection|fontScale\" android:hardwareAccelerated=\"true\">\n" +
                "            <meta-data android:name=\"unityplayer.UnityActivity\" android:value=\"true\"/>\n" +
                "            <action android:name=\"android.intion.VIEW\"/>\n" +
                "            <category android:name=\"android.intent.category.DEFAULT\"/>\n" +
                "            <category android:name=\"android.intent.category.BROWSABLE\"/>\n" +
                "            <data android:scheme=\"fb1104699649713810\" android:host=\"download\"/>\n" +
                "        </activity>\n" +
                "        <activity android:name=\"com.alipay.sdk.app.H5PayActivity\" android:exported=\"false\" android:screenOrientation=\"behind\" android:configChanges=\"keyboardHidden|navigation|orientation\" android:windowSoftInputMode=\"adjustUnspecified|stateHidden|adjustResize\"/>\n" +
                "        <activity android:theme=\"@style/Theme.Translucent.NoTitleBar\" android:name=\"com.hoolai.sdk.activity.FastAccessLoginActivity\" android:configChanges=\"keyboardHidden|orientation|screenSize\" android:windowSoftInputMode=\"adjustResize\"/>\n" +
                "        <activity android:name=\"com.hoolai.sdk.activity.FastAccessNotifyActivity\" android:screenOrientation=\"sensor\"/>\n" +
                "        <activity android:name=\"com.hoolai.open.fastaccess.channel.impl.fastaccess.FASTACCESSSplashActivity\" android:screenOrientation=\"sensor\"/>\n" +
                "        <meta-data android:name=\"game_package_product_id\" android:value=\"这里填写游戏的productId\"/>\n" +
                "        <activity android:name=\"com.xingjia.game.CrashActivity\" android:screenOrientation=\"sensorLandscape\"/>\n" +
                "        <activity android:theme=\"@style/Theme.Translucent.NoTitleBar\" android:name=\"com.qiyao.webviewsdklib.activity.WebViewActivity\" android:screenOrientation=\"sensorLandscape\" android:configChanges=\"keyboardHidden|orientation|screenSize\"/>\n" +
                "        <activity android:name=\"com.qiyao.webviewsdklib.activity.PayActivity\" android:configChanges=\"keyboardHidden|orientation|screenSize\"/>\n" +
                "        <activity android:name=\"com.alipay.sdk.auth.AuthActivity\" android:exported=\"false\" android:screenOrientation=\"behind\" android:configChanges=\"keyboardHidden|navigation|orientation\"/>\n" +
                "        <activity android:name=\"com.dataeye.tracking.sdk.api.DCMessageReceiver\" android:enabled=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.net.conn.CONNECTIVITY_CHANGE\"/>\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "        <meta-data android:name=\"unity.build-id\" android:value=\"c882aa7e-6dae-47df-b2c4-df1ad11757a0\"/>\n" +
                "        <meta-data android:name=\"unity.splash-mode\" android:value=\"0\"/>\n" +
                "        <meta-data android:name=\"unity.splash-enable\" android:value=\"true\"/>\n" +
                "        <meta-data android:name=\"android.security.net.config\" android:resource=\"@xml/network_security_config\"/>\n" +
                "        <meta-data android:name=\"unityplayer.SkipPermissionsDialog\" android:value=\"true\"/>\n" +
                "        <activity android:theme=\"@style/Theme.AppCompat.Light.NoActionBar\" android:name=\"com.mobgame.gui.MobGameImageGaleryActivity\" android:screenOrientation=\"sensorLandscape\"/>\n" +
                "        <activity android:name=\"com.facebook.CustomTabActivity\" android:exported=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.intent.action.VIEW\"/>\n" +
                "                <category android:name=\"android.intent.category.DEFAULT\"/>\n" +
                "                <category android:name=\"android.intent.category.BROWSABLE\"/>\n" +
                "                <data android:scheme=\"fb1104699649713810\"/>\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "        <meta-data android:name=\"com.facebook.sdk.ApplicationId\" android:value=\"@string/facebook_app_id\"/>\n" +
                "        <provider android:name=\"com.facebook.FacebookContentProvider\" android:exported=\"true\" android:authorities=\"com.facebook.app.FacebookContentProvider1104699649713810\"/>\n" +
                "        <receiver android:name=\"com.appsflyer.MultipleInstallBroadcastReceiver\" android:exported=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"com.android.vending.INSTALL_REFERRER\"/>\n" +
                "            </intent-filter>\n" +
                "        </receiver>\n" +
                "        <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\"/>\n" +
                "        <service android:name=\"com.google.android.gms.analytics.AnalyticsService\" android:enabled=\"true\" android:exported=\"false\"/>\n" +
                "        <service android:name=\"com.google.android.gms.analytics.CampaignTrackingService\"/>\n" +
                "        <receiver android:name=\"com.google.android.gms.analytics.AnalyticsReceiver\" android:enabled=\"true\" android:exported=\"false\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"com.google.android.gms.analytics.ANALYTICS_DISPATCH\"/>\n" +
                "            </intent-filter>\n" +
                "        </receiver>\n" +
                "        <receiver android:name=\"com.google.android.gms.analytics.CampaignTrackingReceiver\" android:exported=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"com.android.vending.INSTALL_REFERRER\"/>\n" +
                "            </intent-filter>\n" +
                "        </receiver>\n" +
                "        <service android:name=\"vn.funtap.tuyetthevolam.FCMMessagingService\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"com.google.firebase.MESSAGING_EVENT\"/>\n" +
                "            </intent-filter>\n" +
                "        </service>\n" +
                "        <meta-data android:name=\"com.google.firebase.messaging.default_notification_channel_id\" android:value=\"@string/default_notification_channel_id\"/>\n" +
                "        <activity android:theme=\"@style/Theme.Translucent.NoTitleBar.Fullscreen\" android:name=\"com.facebook.FacebookActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|screenSize\"/>\n" +
                "        <service android:name=\"com.google.firebase.messaging.FirebaseMessagingService\" android:exported=\"false\" android:directBootAware=\"true\">\n" +
                "            <intent-filter android:priority=\"-500\">\n" +
                "                <action android:name=\"com.google.firebase.MESSAGING_EVENT\"/>\n" +
                "            </intent-filter>\n" +
                "        </service>\n" +
                "        <service android:name=\"com.google.firebase.components.ComponentDiscoveryService\" android:exported=\"false\" android:directBootAware=\"true\">\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.messaging.FirebaseMessagingRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.crashlytics.CrashlyticsRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.perf.FirebasePerfRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.iid.Registrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.remoteconfig.RemoteConfigRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.installations.FirebaseInstallationsRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.datatransport.TransportRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "            <meta-data android:name=\"com.google.firebase.components:com.google.firebase.abt.component.AbtRegistrar\" android:value=\"com.google.firebase.components.ComponentRegistrar\"/>\n" +
                "        </service>\n" +
                "        <activity android:name=\"com.facebook.CustomTabMainActivity\"/>\n" +
                "        <service android:name=\"com.google.android.gms.tagmanager.TagManagerService\" android:enabled=\"true\" android:exported=\"false\"/>\n" +
                "        <activity android:name=\"com.google.android.gms.tagmanager.TagManagerPreviewActivity\" android:exported=\"true\" android:noHistory=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <data android:scheme=\"tagmanager.c.vn.funtap.tuyetthevolam\"/>\n" +
                "                <action android:name=\"android.intent.action.VIEW\"/>\n" +
                "                <category android:name=\"android.intent.category.DEFAULT\"/>\n" +
                "                <category android:name=\"android.intent.category.BROWSABLE\"/>\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "        <provider android:name=\"com.crashlytics.android.CrashlyticsInitProvider\" android:exported=\"false\" android:authorities=\"vn.funtap.tuyetthevolam.crashlyticsinitprovider\" android:initOrder=\"100\"/>\n" +
                "        <provider android:name=\"com.google.firebase.perf.provider.FirebasePerfProvider\" android:exported=\"false\" android:authorities=\"vn.funtap.tuyetthevolam.firebaseperfprovider\" android:initOrder=\"101\"/>\n" +
                "        <activity android:theme=\"@style/Theme.Translucent.NoTitleBar\" android:name=\"com.google.android.gms.auth.api.signin.internal.SignInHubActivity\" android:exported=\"false\" android:excludeFromRecents=\"true\"/>\n" +
                "        <service android:name=\"com.google.android.gms.auth.api.signin.RevocationBoundService\" android:permission=\"com.google.android.gms.auth.api.signin.permission.REVOCATION_NOTIFICATION\" android:exported=\"true\" android:visibleToInstantApps=\"true\"/>\n" +
                "        <service android:name=\"com.google.android.gms.analytics.AnalyticsJobService\" android:permission=\"android.permission.BIND_JOB_SERVICE\" android:enabled=\"true\" android:exported=\"false\"/>\n" +
                "        <receiver android:name=\"com.google.firebase.iid.FirebaseInstanceIdReceiver\" android:permission=\"com.google.android.c2dm.permission.SEND\" android:exported=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"com.google.android.c2dm.intent.RECEIVE\"/>\n" +
                "            </intent-filter>\n" +
                "        </receiver>\n" +
                "        <activity android:theme=\"@style/Theme.Translucent.NoTitleBar\" android:name=\"com.google.android.gms.common.api.GoogleApiActivity\" android:exported=\"false\"/>\n" +
                "        <meta-data android:name=\"com.google.android.play.billingclient.version\" android:value=\"3.0.1\"/>\n" +
                "        <activity android:theme=\"@style/Theme.Translucent.NoTitleBar\" android:name=\"com.android.billingclient.api.ProxyBillingActivity\" android:exported=\"false\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|screenSize\"/>\n" +
                "        <receiver android:name=\"com.google.android.gms.measurement.AppMeasurementReceiver\" android:enabled=\"true\" android:exported=\"false\"/>\n" +
                "        <service android:name=\"com.google.android.gms.measurement.AppMeasurementService\" android:enabled=\"true\" android:exported=\"false\"/>\n" +
                "        <service android:name=\"com.google.android.gms.measurement.AppMeasurementJobService\" android:permission=\"android.permission.BIND_JOB_SERVICE\" android:enabled=\"true\" android:exported=\"false\"/>\n" +
                "        <provider android:name=\"com.google.firebase.provider.FirebaseInitProvider\" android:exported=\"false\" android:authorities=\"vn.funtap.tuyetthevolam.firebaseinitprovider\" android:initOrder=\"100\" android:directBootAware=\"true\"/>\n" +
                "        <provider android:name=\"com.facebook.marketing.internal.MarketingInitProvider\" android:exported=\"false\" android:authorities=\"vn.funtap.tuyetthevolam.MarketingInitProvider\"/>\n" +
                "        <provider android:name=\"com.facebook.internal.FacebookInitProvider\" android:exported=\"false\" android:authorities=\"vn.funtap.tuyetthevolam.FacebookInitProvider\"/>\n" +
                "        <receiver android:name=\"com.facebook.CurrentAccessTokenExpirationBroadcastReceiver\" android:exported=\"false\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED\"/>\n" +
                "            </intent-filter>\n" +
                "        </receiver>\n" +
                "        <service android:name=\"com.google.android.datatransport.runtime.backends.TransportBackendDiscovery\" android:exported=\"false\">\n" +
                "            <meta-data android:name=\"backend:com.google.android.datatransport.cct.CctBackendFactory\" android:value=\"cct\"/>\n" +
                "        </service>\n" +
                "        <service android:name=\"com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService\" android:permission=\"android.permission.BIND_JOB_SERVICE\" android:exported=\"false\"/>\n" +
                "        <receiver android:name=\"com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver\" android:exported=\"false\"/>\n" +
                "    </application>\n" +
                "    <uses-permission android:name=\"android.permission.SYSTEM_ALERT_WINDOW\"/>\n" +
                "    <uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\n" +
                "    <uses-permission android:name=\"com.android.vending.BILLING\"/>\n" +
                "    <uses-permission android:name=\"com.google.android.providers.gsf.permission.READ_GSERVICES\"/>\n" +
                "    <uses-permission android:name=\"com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE\"/>\n" +
                "    <uses-permission android:name=\"com.google.android.c2dm.permission.RECEIVE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.INTERNET\"/>\n" +
                "    <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.READ_EXTERNAL_STORAGE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.MOUNT_UNMOUNT_FILESYSTEMS\"/>\n" +
                "    <uses-permission android:name=\"android.permission.VIBRATE\"/>\n" +
                "    <uses-permission android:name=\"com.android.launcher.permission.READ_SETTINGS\"/>\n" +
                "    <uses-permission android:name=\"android.permission.ACCESS_WIFI_STATE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.BLUETOOTH\"/>\n" +
                "    <uses-permission android:name=\"android.permission.CHANGE_WIFI_STATE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.CHANGE_NETWORK_STATE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.RECORD_AUDIO\"/>\n" +
                "    <uses-permission android:name=\"android.permission.WRITE_SETTINGS\"/>\n" +
                "    <uses-permission android:name=\"android.permission.READ_LOGS\"/>\n" +
                "    <uses-permission android:name=\"android.permission.MODIFY_AUDIO_SETTINGS\"/>\n" +
                "    <uses-permission android:name=\"android.permission.BLUETOOTH_ADMIN\"/>\n" +
                "    <uses-feature android:glEsVersion=\"20000\"/>\n" +
                "    <uses-feature android:name=\"android.hardware.microphone\" android:required=\"false\"/>\n" +
                "    <uses-feature android:name=\"android.hardware.sensor.accelerometer\" android:required=\"false\"/>\n" +
                "    <uses-feature android:name=\"android.hardware.touchscreen\" android:required=\"false\"/>\n" +
                "    <uses-feature android:name=\"android.hardware.touchscreen.multitouch\" android:required=\"false\"/>\n" +
                "    <uses-feature android:name=\"android.hardware.touchscreen.multitouch.distinct\" android:required=\"false\"/>\n" +
                "</manifest>";

        initCheck(mPackageName, mFacebookID, mData);

    }

    void genPermission() {
        getDangerousList("READ_CALENDAR\n" +
                "WRITE_CALENDAR\n" +
                "CAMERA\n" +
                "READ_CONTACTS\n" +
                "WRITE_CONTACTS\n" +
                "GET_ACCOUNTS\n" +
                "ACCESS_FINE_LOCATION\n" +
                "ACCESS_COARSE_LOCATION\n" +
                "RECORD_AUDIO\n" +
                "READ_PHONE_STATE\n" +
                "READ_PHONE_NUMBERS\n" +
                "CALL_PHONE\n" +
                "ANSWER_PHONE_CALLS\n" +
                "READ_CALL_LOG\n" +
                "WRITE_CALL_LOG\n" +
                "ADD_VOICEMAIL\n" +
                "USE_SIP\n" +
                "PROCESS_OUTGOING_CALLS\n" +
                "BODY_SENSORS\n" +
                "SEND_SMS\n" +
                "RECEIVE_SMS\n" +
                "READ_SMS\n" +
                "RECEIVE_WAP_PUSH\n" +
                "RECEIVE_MMS\n" +
                "READ_EXTERNAL_STORAGE\n" +
                "WRITE_EXTERNAL_STORAGE");
    }

    void initCheck(String mPackageName, String facebookId, String data) {
        if (data == null) {
            return;
        }

        data = data.trim();
        List<String> stringList;
        List<String> converted = new ArrayList<>();
        stringList = Arrays.asList(data.split("\n"));
        String mtargetSDK = "";

        boolean bTargetSDK = false;
        boolean bDebuggable = false;
        boolean bFbId = false;
        boolean bFirebaseInstanceIDService = false;
        boolean bFCMMessagingService = false;
        boolean bChannel = false;
        boolean bMultipleInstallBroadcastReceiver = false;
        boolean bNetwork_security_config = false;
        boolean bRoundIcon = false;
        boolean bComGoogleAndroidActions = false;
        boolean bFirebaseInitProvider = false;
        boolean bThemeFacebookActivity = false;
        String mDebuggable = "";
        String mScreenOrientation = "";
        String mFacebookactivity = "";
        String mComGoogleAndroidActions = "";
        String mFirebaseInitProvider = "";
        String mRoundIcon = "";
        String mFireBase = "";
        String mChannel = "";

        tvPackagename.setText("PackageName: " + mPackageName);
        tvFacebookID.setText("FacebookID: " + mFacebookID);

        for (int i = 0; i < stringList.size(); i++) {
            for (int j = 0; j < dangerousList.size(); j++) {
                if (stringList.get(i).toUpperCase().contains(dangerousList.get(j).trim().toUpperCase())) {
                    converted.add("\n" + stringList.get(i).trim());
                }
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("application"))
                if (stringList.get(i).contains("android:requestLegacyExternalStorage"))
                    tvValue15.setText("android:requestLegacyExternalStorage: ");
            if (stringList.get(i).contains("android:requestLegacyExternalStorage=\"true\""))
                tvValue15.append(Html.fromHtml("<b> true <b>"));


        }
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("android:hardwareAccelerated")) {
                tvValue16.setText("android:hardwareAccelerated: ");
                if (stringList.get(i).contains("android:hardwareAccelerated=\"false\""))
                    tvValue16.append(Html.fromHtml("<b> false <b>"));


                if (stringList.get(i).contains("android:hardwareAccelerated=\"true\""))
                    tvValue16.append(Html.fromHtml("<b> true <b>"));


            } else tvValue16.setText("N/A");
        }
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("CHANNEL") && stringList.get(i).contains("Standardalone")) {
                bChannel = true;
                mChannel = mChannel + "\n" + stringList.get(i).trim();
                break;
            }
            else tvValue17.setText("N/A");
        }
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("screenOrientation")) {
                mScreenOrientation = mScreenOrientation + "\n" + stringList.get(i).trim();
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).toUpperCase().contains(mFirebaseInstanceIDServiceCompare.toUpperCase())) {
                bFirebaseInstanceIDService = true;
                mFireBase = mFireBase + "\n" + stringList.get(i).trim();
                break;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (facebookId != null && !facebookId.isEmpty() && stringList.get(i).contains(facebookId)) {
                bFbId = true;
                break;
            } else bFbId = false;
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("android:debuggable=\"true\"")) {
                bDebuggable = true;
                mDebuggable = stringList.get(i);
                break;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("android:targetSdkVersion")) {
                mtargetSDK = stringList.get(i);
                if (mtargetSDK.contains(String.valueOf(mTargetSDK))) {
                    bTargetSDK = true;
                    break;
                } else bTargetSDK = false;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("FacebookActivity")) {
                if (stringList.get(i).contains("Fullscreen")) {
                    bThemeFacebookActivity = true;
                }
                mFacebookactivity = stringList.get(i);
                break;
            }
        }


        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("FCMMessagingService")) {
                bFCMMessagingService = true;
                mFireBase = mFireBase + "\n" + stringList.get(i).trim();
                break;
            }
        }
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("MultipleInstallBroadcastReceiver")) {
                bMultipleInstallBroadcastReceiver = true;
                break;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("network_security_config")) {
                bNetwork_security_config = true;
                break;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("android:roundIcon")) {
                bRoundIcon = true;
                mRoundIcon = stringList.get(i);
                break;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("com.google.android.actions")) {
                bComGoogleAndroidActions = true;
                mComGoogleAndroidActions = stringList.get(i);
                break;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("FirebaseInitProvider")) {
                mFirebaseInitProvider = stringList.get(i);
                if (mPackageName != null && !mPackageName.isEmpty() && stringList.get(i).contains(mPackageName)) {
                    bFirebaseInitProvider = true;
                }
                break;
            }
        }

        String stringPermission = converted.toString().replace("[", "").replace("]", "");

        tvValue1.setText(stringPermission.trim());
        tvValue2.setText(bTargetSDK + "\n" + mtargetSDK.replace("<uses-sdk", "").replace("/>\n", "").replace("/>", "").trim());
        if (bDebuggable)
            tvValue3.setText(bDebuggable + "\n" + mDebuggable.trim());
        else tvValue3.setText(bDebuggable + "");
        tvValue4.setText(bFbId + "");
        tvValue5.setText(mScreenOrientation.trim());
        tvValue6.setText(mFacebookactivity.trim());
        tvValue7.setText(bFirebaseInstanceIDService + "\n" + bFCMMessagingService + "\n" + mFireBase.trim());
        tvValue9.setText(bMultipleInstallBroadcastReceiver + "");
        tvValue10.setText(bNetwork_security_config + "");
        tvValue11.setText(bRoundIcon + "\n" + mRoundIcon.trim());
        tvValue12.setText(bComGoogleAndroidActions + "\n" + mComGoogleAndroidActions.trim());
        tvValue13.setText(bFirebaseInitProvider + "\n" + mFirebaseInitProvider.trim());
        tvValue14.setText(bThemeFacebookActivity + "");
        tvValue17.setText(bChannel + "\n" + mChannel.trim());


        Log.d("AfterCheck", " Result: " +
                "\n" + "Dangrous Permission: " + stringPermission
                + "\n" + "Target SDK: " + mTargetSDK + "\t" + mtargetSDK.replace("<uses-sdk", "").replace("/>\n", "").replace("/>", "") + "\t" + bTargetSDK
                + "\n" + "Debuggable: " + bDebuggable + "\t" + mDebuggable
                + "\n" + "Facebook Id: " + bFbId + "\n"
                + "\n" + "screenOrientation: " + mScreenOrientation
                + "\n" + "FacebookActivity: " + mFacebookactivity
                + "\n" + "FirebaseInstanceIDService: " + bFirebaseInstanceIDService
                + "\n" + "FCMMessagingService: " + bFCMMessagingService + "\t" + mFireBase
                + "\n" + "com.appsflyer.MultipleInstallBroadcastReceiver: " + bMultipleInstallBroadcastReceiver
                + "\n" + "Network_security_config: " + bNetwork_security_config
                + "\n" + "RoundIcon: " + bRoundIcon + "\t" + mRoundIcon
                + "\n" + "com.google.android.actions: " + bComGoogleAndroidActions + "\t" + mComGoogleAndroidActions
                + "\n" + "FirebaseInitProvider: " + bFirebaseInitProvider + "\t" + mFirebaseInitProvider
                + "\n" + "Channel: Standardalone: " + bChannel + "\t" + mChannel
        );


    }

    void getDangerousList(String content) {
        if (content == null || content.isEmpty())
            return;
        content.trim();

        dangerousList = Arrays.asList(content.split("\n"));
        Log.d("TAG", "getDangerousList: " + "vào đây");

    }

    List<String> checkDuplicate(String data) {
        List<String> results = new ArrayList<>();
        if (data != null && !data.isEmpty()) {

            List<String> input = Arrays.asList(data.trim().split("\n"));

            for (int a = 0; a < input.size(); a++)
                input.set(a, input.get(a).substring(input.get(a).indexOf("sendTrackingWithEvent:")).trim().replace("sendTrackingWithEvent:", ""));
            String item = "";
            for (int i = 0; i < input.size(); i++) {
                item = input.get(i);
                if (i < input.size() - 1)
                    if (!item.equalsIgnoreCase(input.get(i + 1)))
                        results.add("\n" + input.get(i));
                    else
                        results.add("\n" + input.get(input.size() - 1));
            }


            Log.d("zxcvbnm,./", "" + results.toString().replace("[", "").replace("]", ""));

            return results;
        }
        return null;
    }

    public class AAA {
        int a[];
        int[] c;
        int[] b = new int[10];

        int g = 5;
        double k = (float) g;

        public AAA(int[] a) {
            this.a = a;


        }
    }

}

package com.anu.developers3k.languagechange;

import android.app.Application;
import android.content.Context;

import com.anu.developers3k.languagechange.helper.LocaleHelper;

public class MainApplication extends Application {
	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
	}
}

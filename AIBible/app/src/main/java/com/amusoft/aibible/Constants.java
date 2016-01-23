package com.amusoft.aibible;
/**
 * Created by marco.granatiero on 03/10/2014.
 */
public final class Constants {

    // Defines a custom Intent action
    public static final String BROADCAST_ACTION_BRAIN_STATUS =
            "com.amusoft.airving.BROADCAST_ACTION_BRAIN_STATUS";
    public static final String BROADCAST_ACTION_BRAIN_ANSWER =
            "com.amusoft.airving.BROADCAST_ACTION_BRAIN_ANSWER";
    public static final String BROADCAST_ACTION_LOGGER =
            "com.amusoft.airving.BROADCAST_ACTION_LOGGER";
    public static final String PREF_SOUND ="svysv";
    public static final String PREFERENCES ="svysv";

    // Defines the key for the status "extra" in an Intent
    public static final String EXTRA_BRAIN_STATUS =
            "com.amusoft.airving.BRAIN_STATUS";
    public static final String EXTRA_BRAIN_ANSWER =
            "com.amusoft.airving.EXTRA_BRAIN_ANSWER";

    public static final int STATUS_BRAIN_LOADING = -1;
    public static final int STATUS_BRAIN_LOADED = 1;

    public static final String EXTENDED_LOGGER_INFO =
            "icom.amusoft.airving.LOGGER_INFO";

}

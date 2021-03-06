package com.frostwire.jlibtorrent.alerts;

import com.frostwire.jlibtorrent.swig.session_stats_alert;

/**
 * The {@link SessionStatsAlert} is posted when the user requests session
 * statistics by calling {@link com.frostwire.jlibtorrent.Session#postSessionStats()}
 * on the session object. Its category is
 * {@link com.frostwire.jlibtorrent.swig.alert.category_t#status_notification},
 * but it is not subject to filtering, since it's only manually posted anyway.
 *
 * @author gubatron
 * @author aldenml
 */
public final class SessionStatsAlert extends AbstractAlert<session_stats_alert> {

    SessionStatsAlert(session_stats_alert alert) {
        super(alert);
    }

    /**
     * The internal values are a mix of counters and gauges, which
     * meanings can be queries via the
     * {@link com.frostwire.jlibtorrent.LibTorrent#sessionStatsMetrics()} function.
     * <p>
     * The mapping from a specific metric to an index into this array is constant for a
     * specific version of libtorrent, but may differ for other versions. The intended
     * usage is to request the mapping, i.e. call
     * {@link com.frostwire.jlibtorrent.LibTorrent#sessionStatsMetrics()}, once
     * on startup, and then use that mapping to interpret these values throughout
     * the process's runtime.
     *
     * @return
     */
    public long value(int index) {
        return alert.get_value(index);
    }
}

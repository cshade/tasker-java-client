package com.shade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.SimpleDateFormat;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reminder {
    private String _id;
    private String remind;
    private Date remindwhen;
    private Boolean remindonce;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

    public Reminder() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Date getRemindwhen() {
        return remindwhen;
    }

    public void setRemindwhen(Date remindwhen) {
        this.remindwhen = remindwhen;
    }

    public Boolean getRemindonce() {
        return remindonce;
    }

    public void setRemindonce(Boolean remindonce) {
        this.remindonce = remindonce;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "_id='" + _id + '\'' +
                ", remind=" + remind + '\'' +
                ", due=" + dateFormat.format(remindwhen) + '\'' +
                ", remind once=" + remindonce +
                '}';
    }
}

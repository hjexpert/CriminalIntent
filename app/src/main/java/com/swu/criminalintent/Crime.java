package com.swu.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSloved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

}

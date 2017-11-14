package main;

import java.util.Date;

/**
 * Created by mahikaw on 14/11/17.
 */
class Slot{
    Date startDate;
    Date endDate;

    public Slot(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
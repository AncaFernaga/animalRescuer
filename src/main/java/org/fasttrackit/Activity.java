package org.fasttrackit;

public class Activity {
    private Owner ownerName;
    private boolean available;
    private String activityName;
    private int duration;
    private String dayOfWeek;

    public Owner getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(Owner ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Activity(Owner ownerName) {
       this.ownerName = ownerName;
     }

     public Activity() {
          this(new Owner());
     }

     public String getActivity() {
          return activityName;
     }

     public void setActivity(String activity) {
          this.activityName = activity;
     }

     public int getDuration() {
          return duration;
     }

     public void setDuration(int duration) {
          this.duration = duration;
     }

     public String getDayOfWeek() {
          return dayOfWeek;
     }

     public void setDayOfWeek(String dayOfWeek) {
          this.dayOfWeek = dayOfWeek;
     }

    public void activityName(String fetch) {
        this.activityName = activityName;
    }
}

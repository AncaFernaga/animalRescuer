package org.fasttrackit;

public class Activity {
     Owner ownerName;
     boolean available;

     public Activity(Owner ownerName) {
       this.ownerName = ownerName;
     }

     public Activity() {
          this(new Owner());
     }

     private String activity;
     private int duration;
     private String dayOfWeek;

     public String getActivity() {
          return activity;
     }

     public void setActivity(String activity) {
          this.activity = activity;
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

}

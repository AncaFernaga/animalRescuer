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

     String activity;
     int duration;
     String dayOfWeek;
}

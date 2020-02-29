package Zajecia7;

import java.time.LocalTime;

public class LocalTimeSamCzas {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime meeting = LocalTime.of(11,30,0);
        System.out.println(meeting);

        LocalTime meetingFinish = meeting.plusHours(3);

        System.out.println(meetingFinish.isAfter(meeting));
    }
}

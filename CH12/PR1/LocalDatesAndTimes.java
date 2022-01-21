package CH12.PR1;

import java.time.LocalDate;

import static java.time.Month.APRIL;
import static java.time.Month.FEBRUARY;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class LocalDatesAndTimes {

    public static void main(String[] args) {

        // Abe Lincoln's Birthday: February 12, 1809, died April 15, 1855
        //   How old when he died?
        //   How many days did he live?
        LocalDate abeBorn = LocalDate.of(1809, FEBRUARY, 12);
        LocalDate abeDies = LocalDate.of(1855, APRIL, 15);
        System.out.println("Abe was " + abeBorn.until(abeDies, YEARS) +
                "when he died.");
        System.out.println("Abe lived for " + abeBorn.until(abeDies, DAYS) + " days.");
        System.out.println("");


        // Bennedict Cumberbatch, July 19, 1976
        //   Born in a leap year?
        //   How many days in the year he was born?
        //   How many decades old is he?
        //   What was the day of the week on his 21st birthday?


        // Train departs Boston at 1:45PM and arrives New York 7:25PM
        //   How many minutes long is the train ride?
        //   If the train was delayed 1 hour 19 minutes, what is the actual arrival time?


        // Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes
        //   When does it arrive in Miami?
        //   When does it arrive if the flight is delays 4 hours 27 minutes?


        // School semester starts the second Tuesday of September of this year.
        //   Hint: Look at the TemporalAdjusters class
        //   What is the date?
        //   School summer vacation starts June 25th
        //   Assuming:
        //     *  Two weeks off in December
        //     *  Two other vacation weeks
        //     *  School is taught Monday - Friday
        //   How many days of school are there?
        //   Hint: keep track of the short weeks also


        // A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.
        //   What is the time of the week's meetings?

    }
}

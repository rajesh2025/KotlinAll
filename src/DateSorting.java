//How to Sort an array of string of dates in ascending order?
//        Eg-  Input: dates[] = {“03 Jan 2018”, “02 Jan 2018”, “04 Jan 2017”}
//        Output:
//        04 Jan 2017
//        02 Jan 2018
//        03 Jan 2018

import kotlin.collections.ArrayDeque;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateSorting {
    public static void main(String[] arg) {
        String dates[] = {"03 Jan 2018", "02 Jan 2018", "04 Jan 2017"};
        ArrayList dateList = new ArrayList<Long>();
        for (int i = 0; i < dates.length; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            try {
                Date dtrSt = sdf.parse(dates[i]);
                dateList.add(dtrSt.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        Collections.sort(dateList);

        for (int i = 0; i < dateList.size(); i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            String orgDte = sdf.format(dateList.get(i));
            System.out.println(orgDte);
        }

    }
}

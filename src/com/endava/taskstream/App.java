package com.endava.taskstream;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Map<String, List<StlSitl>> params = new HashMap<>();
        params.put("SITL",Arrays.asList(new StlSitl(10000, "USD"),new StlSitl(30000, "PEN")));
        params.put("STL",Arrays.asList(new StlSitl(9000, "USD"),new StlSitl(29000, "PEN")));

        params.entrySet()
                .forEach(p-> {
                    System.out.println(p);
                    p.getValue().stream()
                            .forEach(x-> System.out.println(x));
                });


//        System.out.println(ChronoUnit.SECONDS.between(d1,d2));

//        List<String> con = Arrays.asList("CON1","CON2");
//
//        List<String> log = Arrays.asList(
//                "2020-12-01, CON1",
//                "2020-12-01, CON2",
//                "2020-12-01, CON3",
//                "2020-12-02, CON1",
//                "2020-12-02, CON2",
//                "2020-12-02, CON3",
//                "2020-12-03, CON1",
//                "2020-12-03, CON2",
//                "2020-12-03, CON3",
//                "2020-12-04, CON1",
//                "2020-12-04, CON2",
//                "2020-12-04, CON3",
//                "2020-12-05, CON1");
//
//        List<String> result = log.stream()
//                .filter(row -> row.contains("CON1") && row.compareTo("2020-12-05")>0)
////                .sorted(Comparator.reverseOrder())
//                .limit(2)
//                .collect(Collectors.toList());
//        System.out.println(result);
//
//        con.stream()
//                .forEach(x->{
//                    List<String> result2 = log.stream()
//                            .filter(row -> row.contains(x) && row.compareTo("2020-12-02")>0)
//                            .limit(2)
//                            .collect(Collectors.toList());
//                    System.out.println(x+":"+result2.size());
//                });
    }
}

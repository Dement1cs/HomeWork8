package com.company.ex2;

public class GlobalRating {

    static Score[] data;

    static {
        Score s1 = new Score();
        s1.category = "views";
        s1.statistic = new double[]{1.01, 0.66, 1.15, 0.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55};
        data[0] = s1;
    }

    static {
        Score s2 = new Score();
        s2.category = "actions";
        s2.statistic = new double[]{2.01, 0.66, 5.15, 4.86, 2.01, 6.66, 10.01, 12.06, 1.01, 2.15};
        data[1] = s2;
    }

    static {
        Score s3 = new Score();
        s3.category = "sharings";
        s3.statistic = new double[]{1.01, 0.66, 1.15, 0.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55};
        data[2] = s3;
    }

    static {
        Score s4 = new Score();
        s4.category = "buyings";
        s4.statistic = new double[]{4.01, 1.61, 1.15, 4.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55};
        data[3] = s4;
    }
}

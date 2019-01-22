package com.bytedance.android.lesson.restapi.solution.bean;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    private int status;
    private temp temp;
    private static class temp{
        private int min;
        private int max;
    }
    private boolean success;

    //只需要传递url即可
    private String url;

    public String getUrl() {
        return url;
    }
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
}

package com.interview.current.executor_pool;


import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ExecutorCreate {

    /**
     * ThreadPoolExecutor 的构造函数创建
     */
    private static ExecutorService executor = new ThreadPoolExecutor(13, 13,
            60L, TimeUnit.SECONDS,
            new ArrayBlockingQueue(13));
    /**
     * 使用 guava 提供的 ThreadFactoryBuilder 来创建线程池
     */
    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("demo-pool-%d").build();
    private static ExecutorService pool = new ThreadPoolExecutor(5, 200,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        /**
         * ThreadPoolExecutor
         */
        System.out.println(executor);
        /**
         *使用 Executors 创建
         */
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        System.out.println(executorService);
        /**
         *使用开源类库
         */
        System.out.println(pool);
    }
}

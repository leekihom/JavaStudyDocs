package org.example;

import java.util.concurrent.*;

/**
 * @Author leezihong
 * @Date 2023/12/14 23:00
 * @Version 1.0
 * @description TODO
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService threadpool = Executors.newFixedThreadPool(8);
        UserInfoService userInfoService = new UserInfoService();

        long startTime = System.currentTimeMillis();

        FutureTask<UserInfo> userInfoFutureTask = new FutureTask<>(userInfoService::getUserInfo);

        threadpool.submit(userInfoFutureTask);

        Thread.sleep(300);

        FutureTask<String> addressFutureTask = new FutureTask<>(userInfoService::getUserAddress);

        threadpool.submit(addressFutureTask);

        UserInfo userInfo = userInfoFutureTask.get();
        String address = addressFutureTask.get();

        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");

//        //调用用户服务获取用户基本信息
//        CompletableFuture<UserInfo> completableUserInfoFuture = CompletableFuture.supplyAsync(userInfoService::getUserInfo);
//
//        Thread.sleep(300); //模拟主线程其它操作耗时
//
//        CompletableFuture<String> completableMedalInfoFuture = CompletableFuture.supplyAsync(userInfoService::getUserAddress);
//
//        UserInfo userInfo = completableUserInfoFuture.get();
//        String address = completableMedalInfoFuture.get();
//        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");

        threadpool.shutdown();
    }
}
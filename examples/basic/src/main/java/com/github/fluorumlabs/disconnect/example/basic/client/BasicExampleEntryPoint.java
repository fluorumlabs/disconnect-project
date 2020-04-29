package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;


@EntryPoint
@Slf4j
public class BasicExampleEntryPoint implements Runnable {
    @Resource
    private BackgroundService backgroundService;

    @Override
    public void run() {
        log.debug(backgroundService.testSomething().get(0).toString());
    }

}

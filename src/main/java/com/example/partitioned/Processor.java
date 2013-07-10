package com.example.partitioned;

import org.springframework.batch.item.ItemProcessor;

/**
 */
public class Processor implements ItemProcessor<InputVO, InputVO> {

    @Override
    public InputVO process(InputVO item) throws Exception {
        item.setId(item.getId() + "-processed by "
                + Thread.currentThread().getName()
                + " at "
                + this.toString());

        Thread.sleep(10);

        return item;
    }
}

package com.topera.hello;

import java.util.List;

public class ParallelCPUTest extends BaseTest {

    @Override
    protected void printTestInfo() {
        System.out.println("\nRunning ParallelCPUTest");
    }

    @Override
    protected void processUsers(List<User> users) {
        users.parallelStream().forEach(this::processUser);
    }

    @Override
    protected long countKids(List<User> users) {
        return users.parallelStream().filter(User::isKid).count();
    }

}
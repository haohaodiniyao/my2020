package com.example.my2020.design.model;

public abstract class AbstractSettleExecutor {
    protected abstract void execute();
    protected abstract boolean isMatch(SettleContext settleContext);
}

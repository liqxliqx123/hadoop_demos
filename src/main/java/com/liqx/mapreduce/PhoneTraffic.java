package com.liqx.mapreduce;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class PhoneTraffic implements Writable {

    private long up;
    private long down;
    private long sum;

    public PhoneTraffic(){}

    public PhoneTraffic(long up, long down, long sum) {
        this.up = up;
        this.down = down;
        this.sum = sum;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(up);
        dataOutput.writeLong(down);
        dataOutput.writeLong(sum);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.up = dataInput.readLong();
        this.down = dataInput.readLong();
        this.sum = dataInput.readLong();
    }

    public long getUp() {
        return this.up;
    }

    public long getDown() {
        return this.down;
    }

    public long getSum() {
        return this.sum;
    }
}
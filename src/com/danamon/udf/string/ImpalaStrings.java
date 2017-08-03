package com.danamon.udf.string;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.IntWritable;

public class ImpalaStrings extends UDF{
    public ImpalaStrings() {

    }

    public IntWritable evaluate(String str) {
        if (StringUtils.isBlank(str)){
            return  new IntWritable(0);
        }
        else {
            try {
                new IntWritable(str.trim().length());
            } catch (Exception e) {
                return new IntWritable(0);
            }
        }
		return new IntWritable(0);
    }
}
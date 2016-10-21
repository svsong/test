package soo.test;

import org.apache.spark.api.java.function.FlatMapFunction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

/**
 * Created by asunsoo on 2016/10/20 0020.
 */
public class SimpleFlatMapFunction implements FlatMapFunction<String,String>{

  private static final Pattern SPACE = Pattern.compile(" ");
  @Override
  public Iterator call(String s) throws Exception {
    return Arrays.asList(SPACE.split(s)).iterator();
  }
}

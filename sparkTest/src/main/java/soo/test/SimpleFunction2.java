package soo.test;

import org.apache.spark.api.java.function.Function2;

/**
 * Created by asunsoo on 2016/10/20 0020.
 */
public class SimpleFunction2 implements Function2<Integer,Integer,Integer> {
  @Override
  public Integer call(Integer i1, Integer i2) {
    return i1 + i2;
  }
}

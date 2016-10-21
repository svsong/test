package soo.test;

import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

/**
 * Created by asunsoo on 2016/10/20 0020.
 */
public class SimplePairFunction implements PairFunction<String,String,Integer> {
  @Override
  public Tuple2 call(String s) throws Exception {
    return new Tuple2<>(s, 1);
  }
}

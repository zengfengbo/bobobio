package quickstart;

import com.google.common.collect.Lists;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static quickstart.io.FileDemo.getCwd;

/**
 * Created by fb on 16/3/19.
 */
public class LamabdaDemo {
    public static void main(String [] args) {
        lambdaDemo();
    }

    public static void lambdaDemo() {
        File cwd = getCwd();
        Arrays.stream(cwd.listFiles()).
                map(f -> f.getName()).
                forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5);
        List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("sum is:"+ nums.stream().
                filter(num -> num != null).
                distinct().
                mapToInt(num -> num * 2).
                peek(System.out::println).
                skip(2).
                limit(4).
                sum());

        Stream.generate(Math::random).limit(10).forEach(e -> System.out.print(e+","));
        System.out.printf("\n");
        Stream.iterate(1, item -> item + 1).limit(10).forEach(e -> System.out.print(e+","));
    }
}

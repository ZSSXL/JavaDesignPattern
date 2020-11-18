import com.zss.builder.entity.Enterprise;

/**
 * @author ZSS
 * @date 2019/11/28 15:47
 * @desc 测试
 */
public class Test {

    public static void main(String[] args) {
        Enterprise build = Enterprise.builder()
                .enterpriseId("10001")
                .enterpriseName("阿狸麻麻")
                .address("浙江杭州")
                .email("123456@qq.com")
                .number("13899998888")
                .website("www.alimama.com")
                .build();
        System.out.println(build);
    }

}

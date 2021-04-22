package com.deserts.oos;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OosApplicationTests {

    @Test
    void contextLoads() {
        String endpoint = "https://oss-cn-shenzhen.aliyuncs.com";
        String accessKeyId = "LTAI5tJ1LNWDaEBf84qZMjQG";
        String accessKeySecret = "iboaUVdqdNZZNsURN40DJ49wgFh0kv";
        OSS oss = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        System.out.println(oss);

        oss.shutdown();
    }

}

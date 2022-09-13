
import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.Test;


public class CodeGenerator {
    private static final String CODE_PATH = "/Users/huaihkiss/vscode/simple-tcc-demo/%s-demo/%s-service/src/main/java/";
    private static final String MAPPER_PATH = "/Users/huaihkiss/vscode/simple-tcc-demo/%s-demo/%s-service/src/main/resources/mybatis/mapper";
    
    @Test
    public void test(){
        String applicationName = "account";
        System.out.println("ok");
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/tcc_demo?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8", "root", "123456")
            .globalConfig(builder -> {
                builder.author("huaihkiss") // 设置作者
                    .fileOverride() // 覆盖已生成文件
                    .outputDir(String.format(CODE_PATH, applicationName, applicationName)); // 指定输出目录
            })
            .packageConfig(builder -> {
                builder.parent("com.huaihkiss.tcc") // 设置父包名
                    .moduleName(applicationName) // 设置父包模块名
                    .pathInfo(Collections.singletonMap(OutputFile.xml, String.format(MAPPER_PATH, applicationName, applicationName))); // 设置mapperXml生成路径
            })
            .strategyConfig(builder -> {
                builder.addInclude("user_account"); // 设置需要生成的表名
            })
            .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
            .execute();
    }
}

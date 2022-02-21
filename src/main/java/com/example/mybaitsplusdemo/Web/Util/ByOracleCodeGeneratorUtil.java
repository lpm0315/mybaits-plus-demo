package com.example.mybaitsplusdemo.Web.Util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

public class ByOracleCodeGeneratorUtil {
    public static final String DB_URL ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
    public static final String DB_DRIVER_NAME = "oracle.jdbc.OracleDriver";
    public static final String BASE_PACKAGE_PATH = "";
    public static String scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要生成代码的表名!");
        if (scanner.hasNext()){
            String ipt = scanner.next();
            if(StringUtils.isNotEmpty(ipt)){
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的表名！");
    }
    public static void execute(){
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java/");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("liupm");// 作者
        gc.setOpen(false);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.ORACLE);
        dsc.setDriverName(ByOracleCodeGeneratorUtil.DB_DRIVER_NAME);
        dsc.setUsername("realtypricinghn");
        dsc.setPassword("tz");
        dsc.setUrl(ByOracleCodeGeneratorUtil.DB_URL);
        mpg.setDataSource(dsc);
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(new String[] { "t_bd_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(scanner()); // 需要生成的表
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
        mpg.setStrategy(strategy);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.mybaitsplusdemo.Web");
        pc.setController("Controller");
        pc.setService("Service");
        pc.setServiceImpl("ServiceImpl");
        pc.setMapper("Mapper");
        pc.setEntity("Entity");
        pc.setXml("Mapper");
        mpg.setPackageInfo(pc);
        // 执行生成
        mpg.execute();

    }

    public static void main(String[] args) {
        execute();
    }

}

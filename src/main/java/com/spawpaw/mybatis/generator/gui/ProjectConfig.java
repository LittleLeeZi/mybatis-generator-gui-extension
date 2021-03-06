package com.spawpaw.mybatis.generator.gui;

import com.google.common.base.CaseFormat;
import com.spawpaw.mybatis.generator.gui.annotations.*;
import com.spawpaw.mybatis.generator.gui.enums.DeclaredPlugins;
import com.spawpaw.mybatis.generator.gui.util.Constants;
import com.spawpaw.mybatis.generator.gui.util.Constants.tabs;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import static com.spawpaw.mybatis.generator.gui.util.Constants.tabs.DATA_ACCESS_OBJECT;
import static com.spawpaw.mybatis.generator.gui.util.Constants.tabs.DOMAIN_OBJECT;

/**
 * Created By spawpaw@hotmail.com 2018.1.20
 * Description:
 * 默认的MBG配置
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public class ProjectConfig {
    public StringProperty selectedTable = new SimpleStringProperty("");
    /****基本配置******************************************************************************************************/
    @ExportToTab(tabName = tabs.BASIC_SETTINGS, index = 1)
    @Config(bundle = "project.savedName", helpText = "保存的名称")
    public SimpleStringProperty savedName = new SimpleStringProperty("untitled");
    @Config(bundle = "project.projectDir", type = ConfigType.DirChooser)
    public SimpleStringProperty projectDir = new SimpleStringProperty("");
    @Config(bundle = "project.basePackage")
    public SimpleStringProperty basePackage = new SimpleStringProperty("");
    @Config(bundle = "project.reduceTablePrefix")
    public SimpleStringProperty reduceTablePrefix = new SimpleStringProperty("t_");
    @AdvancedConfig
    @Config(bundle = "project.daoObjSuffix")
    public SimpleStringProperty daoObjSuffix = new SimpleStringProperty("Mapper");
    @AdvancedConfig
    @Config(bundle = "project.daoPackageSuffix")
    public SimpleStringProperty daoPackageSuffix = new SimpleStringProperty("dao");
    @AdvancedConfig
    @Config(bundle = "project.entityObjSuffix")
    public SimpleStringProperty entityObjSuffix = new SimpleStringProperty("");
    @AdvancedConfig
    @Config(bundle = "project.exampleObjSuffix")
    public SimpleStringProperty exampleObjSuffix = new SimpleStringProperty("Example");
    @AdvancedConfig
    @Config(bundle = "project.entityPackageSuffix")
    public SimpleStringProperty entityPackageSuffix = new SimpleStringProperty("entity");

    /****DAO层配置******************************************************************************************************/
    @ExportToTab(tabName = DATA_ACCESS_OBJECT, index = 1)
    @Config(bundle = "project.javaClientMapperType", type = ConfigType.ChoiceBox, testRegex = "ANNOTATEDMAPPER|MIXEDMAPPER|XMLMAPPER")
    public SimpleStringProperty javaClientMapperType = new SimpleStringProperty("XMLMAPPER");
    @Config(bundle = "project.mapperDir", type = ConfigType.TextField)
    public SimpleStringProperty mapperDir = new SimpleStringProperty("src/main/resources");
    @Config(bundle = "project.mapperPackage", type = ConfigType.TextField)
    public SimpleStringProperty mapperPackage = new SimpleStringProperty("mapper");
    @Config(bundle = "project.daoDir", type = ConfigType.TextField)
    public SimpleStringProperty daoDir = new SimpleStringProperty("src/main/java");
    @Config(bundle = "project.daoPackage", type = ConfigType.TextField)
    public SimpleStringProperty daoPackage = new SimpleStringProperty("");
    @Config(bundle = "project.daoObjName", type = ConfigType.TextField)
    public SimpleStringProperty daoObjName = new SimpleStringProperty("");
    @Config(bundle = "project.enablePagePlugin", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enablePagePlugin = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableInsert", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableInsert = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableSelectByPrimaryKey", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableSelectByPrimaryKey = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableSelectByExample", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableSelectByExample = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableUpdateByPrimaryKey", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableUpdateByPrimaryKey = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableDeleteByPrimaryKey", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableDeleteByPrimaryKey = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableDeleteByExample", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableDeleteByExample = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableCountByExample", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableCountByExample = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.enableUpdateByExample", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableUpdateByExample = new SimpleBooleanProperty(true);
    @AdvancedConfig
    @Config(bundle = "project.selectByPrimaryKeyQueryId", type = ConfigType.CheckableTextField)
    public SimpleStringProperty selectByPrimaryKeyQueryId = new SimpleStringProperty("");
    @AdvancedConfig
    @Config(bundle = "project.selectByExampleQueryId", type = ConfigType.CheckableTextField)
    public SimpleStringProperty selectByExampleQueryId = new SimpleStringProperty("");


    /****Entity层配置***************************************************************************************************/
    @ExportToTab(tabName = DOMAIN_OBJECT, index = 1)
    @Config(bundle = "project.defaultModelType", type = ConfigType.ChoiceBox, testRegex = "conditional|flat|hierarchical")
    public StringProperty defaultModelType = new SimpleStringProperty("conditional");
    @Config(bundle = "project.entityDir", type = ConfigType.TextField)
    public SimpleStringProperty entityDir = new SimpleStringProperty("src/main/java");
    @Config(bundle = "project.entityPackage", type = ConfigType.TextField)
    public SimpleStringProperty entityPackage = new SimpleStringProperty("entity");
    @Config(bundle = "project.entityObjName", type = ConfigType.TextField)
    public SimpleStringProperty entityObjName = new SimpleStringProperty("");
    @Config(bundle = "project.exampleObjName", type = ConfigType.TextField)
    public SimpleStringProperty exampleObjName = new SimpleStringProperty("");
    @Config(bundle = "project.primaryKey", type = ConfigType.CheckableTextField)
    public SimpleStringProperty primaryKey = new SimpleStringProperty("");

    @EnablePlugin(DeclaredPlugins.FluentBuilderMethodsPlugin)
    @Config(bundle = "project.enableFluentBuilderMethodsPlugin", type = ConfigType.CheckBox)
    public SimpleBooleanProperty enableFluentBuilderMethodsPlugin = new SimpleBooleanProperty(true);
    @EnablePlugin(DeclaredPlugins.ToStringPlugin)
    @Config(bundle = "project.generateToString", type = ConfigType.CheckBox)
    public SimpleBooleanProperty generateToString = new SimpleBooleanProperty(true);
    @EnablePlugin(DeclaredPlugins.EqualsHashCodePlugin)
    @Config(bundle = "project.generateHashcodeEquals", type = ConfigType.CheckBox)
    public SimpleBooleanProperty generateHashcodeEquals = new SimpleBooleanProperty(true);
    @EnablePlugin(DeclaredPlugins.SerializablePlugin)
    @Config(bundle = "project.implementsSerializable", type = ConfigType.CheckBox)
    public SimpleBooleanProperty implementsSerializable = new SimpleBooleanProperty(true);
    @ExportToPlugin(plugin = DeclaredPlugins.CommentPlugin)
    @Config(bundle = "project.generateJPA", type = ConfigType.CheckBox)
    public SimpleBooleanProperty generateJPA = new SimpleBooleanProperty(false);
    @Config(bundle = "project.useActualColumnNames", type = ConfigType.CheckBox)
    public SimpleBooleanProperty useActualColumnNames = new SimpleBooleanProperty(true);



    @ExportToTab(tabName = tabs.COMMENT)
    @Config(bundle = "project.enableComment", type = ConfigType.CheckBox)
    public BooleanProperty enableComment = new SimpleBooleanProperty(true);
    @ExportToPlugin(plugin = DeclaredPlugins.CommentPlugin)
    @Config(bundle = "project.fileHeader", type = ConfigType.TextArea)
    public SimpleStringProperty fileHeader = new SimpleStringProperty("/**\n" +
            " * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension\n" +
            " * Description:\n * ${tableComment}\n *\n * @author \n */");



//    /****Service层配置**************************************************************************************************/
//    @ExportToTab(tabName = tabs.SERVICE)
//    @EnablePlugin(plugins.SerializablePlugin)
//    public String enableRestServicePlugin ="";
//
//    public String serviceDir ="";
//    public String servicePackage ="";
//
//    @ExportToPlugin(plugin = plugins.DemoServicePlugin, key = "restServiceDir")
//    public String getServiceDir() {
//        return projectDir.getValue() + serviceDir.getValue();
//    }


    /*===方法s========================================================================================================*/

    /**
     * 初始化
     * 绑定Property，在初始化控件完成之后，为控件的值添加监听
     */
    public void initialize() {
        reduceTablePrefix.addListener(((observable, oldValue, newValue) -> updateClassName()));
        daoObjSuffix.addListener(((observable, oldValue, newValue) -> updateClassName()));
        entityObjSuffix.addListener(((observable, oldValue, newValue) -> updateClassName()));

        basePackage.addListener(((observable, oldValue, newValue) -> updatePackageName()));
        daoPackageSuffix.addListener(((observable, oldValue, newValue) -> updatePackageName()));
        entityPackageSuffix.addListener(((observable, oldValue, newValue) -> updatePackageName()));
    }

    /**
     * 当所选表名/表名过滤器的值发生变化时，更新Ui中的对象名
     */
    public void updateClassName() {
        daoObjName.setValue(String.format("%s%s", getUpperCamelTableName(), daoObjSuffix.getValue()));
        entityObjName.setValue(String.format("%s%s", getUpperCamelTableName(), entityObjSuffix.getValue()));
        exampleObjName.setValue(String.format("%s%s", getUpperCamelTableName(), exampleObjSuffix.getValue()));
    }

    /**
     * 当BasePackage的包名发生过变化时，更新各层的包名
     */
    private void updatePackageName() {
        daoPackage.setValue(String.format("%s.%s", basePackage.getValue(), daoPackageSuffix.getValue()));
        entityPackage.setValue(String.format("%s.%s", basePackage.getValue(), entityPackageSuffix.getValue()));
    }


    /**
     * @return 表名的大骆驼峰形式
     */
    private String getUpperCamelTableName() {
        String rawTableName = selectedTable.getValue();
        return getUpperCamel(rawTableName.replaceAll(String.format("^(%s)", reduceTablePrefix.getValue()), ""));
    }

    /**
     * 将lower_snake转换成大骆驼峰
     */
    private String getUpperCamel(String s) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, s);
    }


}

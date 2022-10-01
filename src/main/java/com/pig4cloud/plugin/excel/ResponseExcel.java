package com.pig4cloud.plugin.excel;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface ResponseExcel {
    String sheetName() default "default";

    String title() default "";

    String[] columnNames() default {};
    String[] classFieldNames();
    String fileName() default "";
    String fileSuffix() default ".xlsx";
}

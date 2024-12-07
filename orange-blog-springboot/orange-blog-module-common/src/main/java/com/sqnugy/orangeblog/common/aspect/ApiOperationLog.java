package com.sqnugy.orangeblog.common.aspect;

import java.lang.annotation.*;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ApiOperationLog
 * @description 自定义注解 {@code ApiOperationLog} 用于记录API操作日志。
 * 注意：此注解仅适用于方法，并且它的保留策略是运行时（RUNTIME），这意味着它可以在程序运行期间通过反射机制读取。
 * @date 2024-12-07
 */

//@Retention(RetentionPolicy.RUNTIME)： 这个元注解用于指定注解的保留策略，即注解在何时生效。RetentionPolicy.RUNTIME 表示该注解将在运行时保留，这意味着它可以通过反射在运行时被访问和解析。
@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})：这个元注解用于指定注解的目标元素，即可以在哪些地方使用这个注解。ElementType.METHOD 表示该注解只能用于方法上。这意味着您只能在方法上使用这个特定的注解。
@Target({ElementType.METHOD})
//@Documented： 这个元注解用于指定被注解的元素是否会出现在生成的Java文档中。如果一个注解使用了 @Documented，那么在生成文档时，被注解的元素及其注解信息会被包含在文档中。这可以帮助文档生成工具（如 JavaDoc）在生成文档时展示关于注解的信息。
@Documented
public @interface ApiOperationLog {

    /**
     * 获取API功能的简短描述。
     * <p>
     * 这个描述应该清晰地说明API的主要用途或功能，以便于维护人员和其他开发者了解其作用。
     * 如果没有提供具体描述，则默认为空字符串 ("")。
     *
     * @return API 功能描述
     */
    String description() default "";

}
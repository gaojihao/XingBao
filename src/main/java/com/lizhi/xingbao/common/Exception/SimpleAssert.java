package com.lizhi.xingbao.common.Exception;

/**
 * 参数校验工具类
 */
public class SimpleAssert {

    /**
     * 校验参数的合法性
     * @param paramName 参数名称
     * @param legal 参数合法性 true:合法  false:不合法
     * @param mustBe 参数合法性要求描述
     * @throws IllegalParameterException
     */
    public static void assertThat(String paramName, boolean legal, String mustBe) throws IllegalParameterException {
        if (!legal){
            throw new IllegalParameterException(String.format("the parameter[%s] is illegal,it must be %s",paramName,mustBe));
        }
    }

    /**
     * 要求参数非空
     * @param paramName 参数名称
     * @param paraValue 参数值
     * @throws IllegalParameterException
     */
    public static void notNull(String paramName, Object paraValue) throws IllegalParameterException {
        assertThat(paramName,paraValue != null, "not null");
    }

    /**
     * 要求参数字符串非空白字符串
     * @param paramName 参数名称
     * @param paraValue 参数值
     * @throws IllegalParameterException
     */
    public static void notBlank(String paramName, String paraValue) throws IllegalParameterException {
        boolean legal = paraValue != null && !"".equals(paraValue.trim());
        assertThat(paramName,legal, "not blank");
    }

    public static String buildPara(String parent,String para) {
        if (parent == null || !"".equals(para.trim())){
            return para;
        }else {
            return parent + "." + para;
        }
    }

}

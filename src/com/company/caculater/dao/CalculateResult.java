package com.company.caculater.dao;

import java.util.List;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-26 10:46
 **/
public interface CalculateResult {
    /**
     *
     * @param suffixList
     * @return result
     */
    public double calculate(List<String> suffixList);
}

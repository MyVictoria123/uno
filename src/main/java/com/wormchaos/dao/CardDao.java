/**
 * FileName: CardDao.java
 * Author:   wormchaos
 * Date:     2014-9-17 上午11:13:50
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.wormchaos.dao;

import com.wormchaos.beans.entity.Card;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author wormchaos
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface CardDao {
    
    /**
     * 
     * 功能描述: <br>
     * 〈功能详细描述〉
     *
     * @param card
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    void insertCard(Card card);
    
    /**
     * 
     * 功能描述: <br>
     * 〈功能详细描述〉
     *
     * @param card
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    void deleteCard(Card card);

}

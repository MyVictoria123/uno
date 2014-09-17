/**
 * FileName: GameDaoImpl.java
 * Author:   wormchaos
 * Date:     2014-8-8 下午5:36:46
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.wormchaos.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wormchaos.beans.entity.Game;
import com.wormchaos.dao.GameDao;
import com.wormchaos.util.jdbc.JdbcClient;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * 
 * @author wormchaos
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public class GameDaoImpl implements GameDao {

    @Autowired
    JdbcClient jdbcClient;

    private static final String DB_NAME = "uno_game";

    /*
     * (non-Javadoc)
     * @see com.wormchaos.dao.GameDao#createGame()
     */
    public Long createGame(Long roomId, Integer playerNum) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("roomId", roomId);
        params.put("palyerNum", playerNum);
        params.put("currentDttm", new java.util.Date());
        return jdbcClient.insertByMap(DB_NAME, params, Game.class);
    }

}

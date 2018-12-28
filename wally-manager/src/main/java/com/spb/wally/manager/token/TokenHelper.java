//package com.spb.wally.manager.token;
//
//
//import com.cloudm.sign.token.DefaultTokenHelper;
//import com.spb.wally.manager.context.ContextHolder;
//import com.spb.wally.manager.context.SessionContext;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//
///**
// * @author Jay
// * @version v1.0
// * @description token相关操作
// * @date 2018-11-26 20:08
// */
//@Slf4j
//@Component
//public class TokenHelper extends DefaultTokenHelper<SessionContext> {
//
//    /**
//     * 注入需要的对象
//     *
//     * @param redisTemplate
//     * @param contextHolder
//     */
//    @Autowired
//    public TokenHelper(RedisTemplate redisTemplate, ContextHolder contextHolder) {
//        super(redisTemplate, contextHolder);
//    }
//
//    /**
//     * 校验token是否有效
//     *
//     * @param token
//     */
//    @Override
//    public Boolean verifyToken(String token) {
//        return super.verifyToken(token);
//    }
//
//    /**
//     * 获取存入redis的路径，如果子类不重写该方法则选用默认路径 {@link com.cloudm.sign.constant.Constants}的USER_KEY
//     *
//     * @return 建议格式为 "项目名称:str:user_key:"
//     */
//    @Override
//    protected String getRedisSavePath() {
//        return "carry:str:user_key:";
//    }
//
//    /**
//     * token存入redis的路径，如果子类不重写该方法则选用默认路径 {@link com.cloudm.sign.constant.Constants}的TOKEN_KEY
//     *
//     * @return 建议格式为 "项目名称:str:token_key:"
//     */
//    @Override
//    protected String getRedisTokenPath() {
//        return "carry:str:token_key";
//    }
//}

/*
 * MIT License
 *
 * Copyright (c) 2020 邓军
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package cn.coolwang.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Restful控制器单元测试
 *
 * @author 邓军
 * @version 1.0
 * @e-mail dengjun@coolwang.cn
 * @date 2020年06月24日17:48:08
 */
@SpringBootTest(classes = cn.coolwang.demo.RestfulApplication.class)
//自动注入一个MockMvc
@AutoConfigureMockMvc
public class RestfulControllerTest {


    @Autowired
    private MockMvc mockMvc;

    /**
     * 测试Get Method Request
     *
     * @throws Exception
     */
    @Test
    public void testGetMethod() throws Exception {
        String responseString = mockMvc
                .perform(get("/restful") //请求地址
                ).andExpect(status().isOk()) //返回状态是200
//                .andDo(print()) //打印请求和响应的内容
                .andReturn().getResponse().getContentAsString();  //以字符串接收内容

        //断言响应数据是否一致
        Assert.assertEquals(responseString,"This is Get Method Request");
    }

    /**
     * 测试Post Method Request
     *
     * @throws Exception
     */
    @Test
    public void testPostMethod() throws Exception {
        String responseString = mockMvc
                .perform(post("/restful") //请求地址
                ).andExpect(status().isOk()) //返回状态是200
//                .andDo(print()) //打印请求和响应的内容
                .andReturn().getResponse().getContentAsString();  //以字符串接收内容

        //断言响应数据是否一致
        Assert.assertEquals(responseString,"This is Post Method Request");
    }


    /**
     * 测试Delete Method Request
     *
     * @throws Exception
     */
    @Test
    public void testDeleteMethod() throws Exception {
        String responseString = mockMvc
                .perform(delete("/restful") //请求地址
                ).andExpect(status().isOk()) //返回状态是200
//                .andDo(print()) //打印请求和响应的内容
                .andReturn().getResponse().getContentAsString();  //以字符串接收内容

        //断言响应数据是否一致
        Assert.assertEquals(responseString,"This is Delete Method Request");
    }

    /**
     * 测试Put Method Request
     *
     * @throws Exception
     */
    @Test
    public void testPutMethod() throws Exception {
        String responseString = mockMvc
                .perform(put("/restful") //请求地址
                ).andExpect(status().isOk()) //返回状态是200
//                .andDo(print()) //打印请求和响应的内容
                .andReturn().getResponse().getContentAsString();  //以字符串接收内容

        //断言响应数据是否一致
        Assert.assertEquals(responseString,"This is Put Method Request");
    }
}

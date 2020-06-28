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
package cn.coolwang.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Restful 接口控制器实现方式
 *
 *
 *
 * @author 邓军
 * @e-mail dengjun@coolwang.cn
 * @date 2020年06月24日16:23:27
 * @version 1.0
 */
@RestController
//@Controller
//@ResponseBody
public class RestfulController {

    /**
     * Get 方法获取信息
     *
     *
     * @return
     */
    @GetMapping("/restful")
    //@RequestMapping(method = RequestMethod.GET)
    public String getMethod(){
        return "This is Get Method Request";
    }

    /**
     * Post 方法获取信息
     * @return
     */
    @PostMapping("/restful")
    public String postMethod(){
        return "This is Post Method Request";
    }

    /**
     * Delete 方法获取信息
     * @return
     */
    @DeleteMapping("/restful")
    public String deleteMethod(){
        return "This is Delete Method Request";
    }

    /**
     * Put 方法获取信息
     * @return
     */
    @PutMapping("/restful")
    public String putMethod(){
        return "This is Put Method Request";
    }

}

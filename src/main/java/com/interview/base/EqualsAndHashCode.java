package com.interview.base;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCode {
    private String name;// 姓名
    private String sex;// 性别
    private String age;// 年龄
    private float weight;// 体重
    private String addr;// 地址

    public EqualsAndHashCode(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // 重写hashcode方法
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 17 * result + sex.hashCode();
        result = 17 * result + age.hashCode();
        return result;
    }

    // 重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EqualsAndHashCode)) {
            // instanceof 已经处理了obj = null的情况
            return false;
        }
        EqualsAndHashCode stuObj = (EqualsAndHashCode) obj;
        // 地址相等
        if (this == stuObj) {
            return true;
        }
        // 如果两个对象姓名、年龄、性别相等，我们认为两个对象相等
        if (stuObj.name.equals(this.name) && stuObj.sex.equals(this.sex) && stuObj.age.equals(this.age)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Map<EqualsAndHashCode, String> m = new HashMap<>();
//        EqualsAndHashCode equalsAndHashCode = new EqualsAndHashCode(21, 37, 3245);
        m.put(new EqualsAndHashCode("lt", "男", "25"), "xiaobai");
        System.out.println(m.get(new EqualsAndHashCode("lt", "男", "25")));//输出：null
    }
}

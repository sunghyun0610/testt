package com.grepp.test;

public class User {
    //필수
    private final String name;
    private final int age;
//선택
    private final String email;
    private final String phone;

    private User(Builder builder){
        name=builder.name;
        age=builder.age;
        email=builder.email;
        phone=builder.phone;
    }

    public static class Builder{
        private final String name;
        private final int age;

        private  String email=null;
        private  String phone=null;

        public Builder(String name, int age){
            this.name=name;
            this.age=age;
        }

        // 선택적 필드를 설정하는 메서드
        public Builder email(String email) {
            this.email = email;
            return this; // return this;는 현재 객체 자신을 반환하는 것을 의미합니다. 즉, 메서드를 호출한 인스턴스(객체) 자신을 반환하게 됩니다.


        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        // 최종 User 객체 생성
        public User build() {
            return new User(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

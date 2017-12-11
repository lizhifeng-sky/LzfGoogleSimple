package com.google.simple.model;

/**
 *
 * @author lizhifeng
 * @date 2017/12/1 0001
 */

public class UserInfo{
    private String name;
    private String age;
    private String avator;

    public UserInfo(String name, String age, String avator) {
        this.name = name;
        this.age = age;
        this.avator = avator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

//    @BindingAdapter("avator")
//    public static void setUserInfoAvtor(ImageView imageView, String avator) {
//        Glide.with(imageView.getContext()).load(avator).into(imageView);
//    }
//
//    public void clickParent(View view) {
//        Toast.makeText(view.getContext(), "福步距", Toast.LENGTH_SHORT).show();
//    }
//
//    public void clickImage(View view) {
//        Toast.makeText(view.getContext(), "ImageView", Toast.LENGTH_SHORT).show();
//    }
}

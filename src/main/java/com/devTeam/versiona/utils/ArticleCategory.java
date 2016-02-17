package com.devTeam.versiona.utils;

public enum ArticleCategory {

    // need to sync database ENUM category.
    ALL("��� ��ƼŬ"), GETSTARTED("Get Started"), DEVSTORY("������ �̾߱�"), TIPNTECH("��&��ũ"), ETC("��Ÿ");

    private String name;

    private ArticleCategory(String categoryName) {

        this.name = categoryName;

    }
    
    public String getName() {
        
        return this.name;
        
    }

}

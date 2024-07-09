package enumeration.test;

public enum AuthGrade {

    GUEST(1,"손님", new String[] {"메뉴 화면"})
    , LOGIN(2, "로그인 회원",new String[] {"메뉴 화면","이메일 관리 화면"})
    , ADMIN(3,"관리자", new String[] {"메뉴 화면, 이메일 관리 화면, 관리자 화면"});

    int level;

    String description;

    String[] menuAuth;

    AuthGrade(int level, String description, String[] menuAuth) {
        this.level = level;
        this.description = description;
        this.menuAuth = menuAuth;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMenuAuth() {
        return menuAuth;
    }
}

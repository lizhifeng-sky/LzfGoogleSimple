package lzf.common.bean;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class UserBean {
    private boolean albumComplete;
    private String alipayAccount;
    private String alipayName;
    private String created;
    private String email;
    private int id;
    private String name;
    private String nick;
    private String avatar;
    private boolean isAlipayBind;
    private boolean isPayPassSet;
    private String mobile;
    private String rongyunToken;
    private String token;
    private String type;
    private String updated;
    private Double walletAmount;
    private Double walletExpense;
    private Double walletIncome;
    private Double walletWithdraw;
    private boolean isPasswordSet;
    private String payType;
    private String registrationId;
    private String alias;
    private int sex;
    private int fansCount;
    private int favouriteCount;
    private int studentCount;
    private int timelineCount;
    private  boolean favour;
    private  boolean favourite;
    private String className;
    private String code;

    public boolean isAlbumComplete() {
        return albumComplete;
    }

    public void setAlbumComplete(boolean albumComplete) {
        this.albumComplete = albumComplete;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getAlipayName() {
        return alipayName;
    }

    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isAlipayBind() {
        return isAlipayBind;
    }

    public void setAlipayBind(boolean alipayBind) {
        isAlipayBind = alipayBind;
    }

    public boolean isPayPassSet() {
        return isPayPassSet;
    }

    public void setPayPassSet(boolean payPassSet) {
        isPayPassSet = payPassSet;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRongyunToken() {
        return rongyunToken;
    }

    public void setRongyunToken(String rongyunToken) {
        this.rongyunToken = rongyunToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(Double walletAmount) {
        this.walletAmount = walletAmount;
    }

    public Double getWalletExpense() {
        return walletExpense;
    }

    public void setWalletExpense(Double walletExpense) {
        this.walletExpense = walletExpense;
    }

    public Double getWalletIncome() {
        return walletIncome;
    }

    public void setWalletIncome(Double walletIncome) {
        this.walletIncome = walletIncome;
    }

    public Double getWalletWithdraw() {
        return walletWithdraw;
    }

    public void setWalletWithdraw(Double walletWithdraw) {
        this.walletWithdraw = walletWithdraw;
    }

    public boolean isPasswordSet() {
        return isPasswordSet;
    }

    public void setPasswordSet(boolean passwordSet) {
        isPasswordSet = passwordSet;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }

    public int getFavouriteCount() {
        return favouriteCount;
    }

    public void setFavouriteCount(int favouriteCount) {
        this.favouriteCount = favouriteCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getTimelineCount() {
        return timelineCount;
    }

    public void setTimelineCount(int timelineCount) {
        this.timelineCount = timelineCount;
    }

    public boolean isFavour() {
        return favour;
    }

    public void setFavour(boolean favour) {
        this.favour = favour;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "albumComplete=" + albumComplete +
                ", alipayAccount='" + alipayAccount + '\'' +
                ", alipayName='" + alipayName + '\'' +
                ", created='" + created + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", avatar='" + avatar + '\'' +
                ", isAlipayBind=" + isAlipayBind +
                ", isPayPassSet=" + isPayPassSet +
                ", mobile='" + mobile + '\'' +
                ", rongyunToken='" + rongyunToken + '\'' +
                ", token='" + token + '\'' +
                ", type='" + type + '\'' +
                ", updated='" + updated + '\'' +
                ", walletAmount=" + walletAmount +
                ", walletExpense=" + walletExpense +
                ", walletIncome=" + walletIncome +
                ", walletWithdraw=" + walletWithdraw +
                ", isPasswordSet=" + isPasswordSet +
                ", payType='" + payType + '\'' +
                ", registrationId='" + registrationId + '\'' +
                ", alias='" + alias + '\'' +
                ", sex=" + sex +
                ", fansCount=" + fansCount +
                ", favouriteCount=" + favouriteCount +
                ", studentCount=" + studentCount +
                ", timelineCount=" + timelineCount +
                ", favour=" + favour +
                ", favourite=" + favourite +
                ", className='" + className + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

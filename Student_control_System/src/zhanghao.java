public class zhanghao {
    String phoneNumber;
    String  idNumber;
    String  passWorld;
    String userName;

    public zhanghao() {
    }

    public zhanghao(String phoneNumber, String idNumber, String passWorld, String userName) {
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.passWorld = passWorld;
        this.userName = userName;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取
     * @return passWorld
     */
    public String getPassWorld() {
        return passWorld;
    }

    /**
     * 设置
     * @param passWorld
     */
    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString() {
        return "zhanghao{phoneNumber = " + phoneNumber + ", idNumber = " + idNumber + ", passWorld = " + passWorld + ", userName = " + userName + "}";
    }
}

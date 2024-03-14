public class string {
    int length;
    //快捷方式:ctrl+shift+,快捷创建类的空参构造和有参构造以及GET和SET方法

    public string() {
    }

    public string(int length) {
        this.length = length;
    }

    /**
     * 获取
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return "string{length = " + length + "}";
    }
}

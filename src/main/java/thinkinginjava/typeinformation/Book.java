package thinkinginjava.typeinformation;

import java.io.Serializable;

/**
 * 如要想要序列化对象必须实现接口java.io.Serializable
 *
 * 当一个类型要被序列化时，它内部所有的属性都应该能被序列化
 */
public class Book implements Serializable {
    private int no;
    private String name;
    private int borrowTimes;
    private boolean borrowed;

    public Book() {
    }

    public Book(int no, String name, int borrowTimes, boolean borrowed) {
        this.no = no;
        this.name = name;
        this.borrowTimes = borrowTimes;
        this.borrowed = borrowed;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorrowTimes() {
        return borrowTimes;
    }

    public void setBorrowTimes(int borrowTimes) {
        this.borrowTimes = borrowTimes;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", borrowTimes=" + borrowTimes +
                ", borrowed=" + borrowed +
                '}';
    }

}

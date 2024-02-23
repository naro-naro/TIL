package dailyquiz.Feb14;

// 자식 제네릭 클래스
public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}

public class ThuKy implements IDoSomething {
    private String name;
    private GiamDoc giamDoc;

    public ThuKy(GiamDoc giamDoc) {
        this.giamDoc = giamDoc;
    }

    public ThuKy(String name, GiamDoc giamDoc) {
        this.name = name;
        this.giamDoc = giamDoc;
    }

    @Override
    public void thucthi() {
        if (name.equals("truong"))
        giamDoc.thucthi();
        else throw new RuntimeException("Khong hop le");
    }
}

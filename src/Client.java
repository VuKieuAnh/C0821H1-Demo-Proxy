public class Client {
    public static void main(String[] args) {
        GiamDoc toan = new GiamDoc();
        ThuKy truong = new ThuKy("truong",toan);
        ThuKy tuan = new ThuKy("tuan",toan);
        tuan.thucthi();
    }
}
